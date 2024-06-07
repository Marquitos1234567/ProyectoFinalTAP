
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class consultas {
    public boolean valid;
    public static boolean inscrito;

    Conexion con1 =new Conexion();
    Connection conet;
    Statement st;
    ResultSet rs;
    String columna;
    DefaultTableModel modelo;
    public static String clave_grupoD;
    
    //Método para validar la contraseña al ingresar
    public void validarContraseña(String usu,String contra,String usuari) throws SQLException {          
        if("alumno".equals(usuari)){
            columna="numeroControl";}
        if("docente".equals(usuari)){
            columna="ID_profesor";        }
        if("administrador".equals(usuari)){
            columna="idadmin";}
        String sql = "select * from "+usuari+" where "+columna+"="+usu;
        try {
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            valid = rs.getString("password").equals(contra);
        } catch (Exception e) {
            System.out.println("error "+e);
        }        
    }
    
    //Método para obtener los datos para generar un saludo en el menu
    public void saludo(String usu,String usuari,JLabel saludo ){
        if("alumno".equals(usuari)){
            columna="numeroControl";}
        if("docente".equals(usuari)){
            columna="ID_profesor";} 
        if("administrador".equals(usuari)){
            columna="idadmin";}
        System.out.println(""+usuari+" "+columna+" "+usu);
        String sql = "select * from "+usuari+" where "+columna+"="+usu;
        try {
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            saludo.setText("Buen dia "+rs.getString("nombre"));
        } catch (Exception e) {
            System.out.println("error "+e);
        }        
    }
    
    //Método para saber si un alumno está inscrito a una actividad
    public void comprobarInscrito(String usu){
        String sql = "select actividad_complementaria.nombre_actividad,\n" +
        "actividad_complementaria.horario,actividad_complementaria.creditos,\n" +
        "docente.nombre,docente.apellidoP,docente.apellidoM,inscripcion.estatus\n" +
        "from inscripcion \n" +
        "inner join actividad_complementaria on inscripcion.clave_grupo = actividad_complementaria.clave_grupo\n" +
        "inner join docente on actividad_complementaria.id_profesor = docente.id_profesor\n" +
        "where numero_control="+usu+" and estatus='CURSANDO';";
        String aux="";
        try {
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                inscrito = true;
            }else{
                inscrito= false;
            }    
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }
    
    //Método para mostrar los detalles de inscripcion de un alumno
    public void actividadActual(JTable Tabla,String usu){
        String sql = "select actividad_complementaria.nombre_actividad,\n" +
        "actividad_complementaria.horario,actividad_complementaria.creditos,\n" +
        "docente.nombre,docente.apellidoP,docente.apellidoM\n" +
        "from inscripcion \n" +
        "inner join actividad_complementaria on inscripcion.clave_grupo = actividad_complementaria.clave_grupo\n" +
        "inner join docente on actividad_complementaria.id_profesor = docente.id_profesor\n" +
        "where numero_control="+usu+" and estatus='cursando'";
        DefaultTableModel modelo;
        try {
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] actual =new Object[4];
            modelo = (DefaultTableModel) Tabla.getModel();
            while (rs.next()) {
                actual [0] = rs.getString("nombre_actividad");
                actual [1] = rs.getString("horario");
                actual [2] = rs.getInt("creditos");
                actual [3] = rs.getString("nombre")+" "+rs.getString("apellidoP")+" "+rs.getString("apellidoM");
                modelo.addRow(actual);
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            System.out.println("error "+e);
        }
    }
 
    //Método para mostrar todas las actividades disponibles
    public void mostrarActividades(JTable Tabla){
        String sql ="select actividad_complementaria.nombre_actividad,actividad_complementaria.creditos,\n" +
                    "actividad_complementaria.clave_grupo ,actividad_complementaria.horario,\n" +
                    "concat(docente.nombre,' ',docente.apellidoP,' ',docente.apellidoM) as docente,\n" +
                    "actividad_complementaria.requisitos, actividad_complementaria.cupo\n" +
                    "from actividad_complementaria\n" +
                    "inner join docente on actividad_complementaria.id_profesor = docente.id_profesor;";
        DefaultTableModel modelo;
        try {
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] actual =new Object[7];
            modelo = (DefaultTableModel) Tabla.getModel();
            while (rs.next()) {
                actual [0] = rs.getString("nombre_actividad");
                actual [1] = rs.getInt("creditos");
                actual [2] = rs.getString("clave_grupo");
                actual [3] = rs.getString("horario");
                actual [4] = rs.getString("docente");               
                actual [5] = rs.getString("requisitos");
                actual [6] = rs.getInt("cupo");   
                if(rs.getInt("cupo")==0){}
                else{
                modelo.addRow(actual);}
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            System.out.println("error "+e);
        }
    }
    
    //Método para que un alumno se inscriba a una actividad
    public void inscribirse(String usu,String clave_grupo){
        try {
            String sql = "insert into inscripcion values ("+usu+",'"+clave_grupo+"','ENERO - JUNIO 2024','CURSANDO');";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            cupoMenos(clave_grupo);
            JOptionPane.showMessageDialog(null, "Te haz inscrito a una actividad.");
        } catch (SQLException ex) {
            Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para restarle un cupo a un grupo despues de que un alumno se ha inscrito
    public void cupoMenos(String clave_grupo){
        try {
            String sql = "update actividad_complementaria set cupo=cupo-1 where clave_grupo='"+clave_grupo+"';";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para que el alumno se dé de baja en la actividad que esta inscrito
    public void bajaActividad(String usu){
        try {
            System.out.println(""+usu);
            String sql = "SELECT * FROM inscripcion;";
            conet = con1.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            String clave_grupo=rs.getString("clave_grupo");
            
            System.out.println("ttttttt");
            
            String sql1 = "delete from inscripcion where numero_control="+usu+";";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql1);
            
            cupoMas(clave_grupo);
            
            JOptionPane.showMessageDialog(null, "Te haz dado de baja a la actividad que estabas inscrito.");
            inscrito=false;
        } catch (Exception e) {
            System.out.println(""+e);
        }
    }
    
    //Método para agregar un cupo a un grupo despues de que un alumno se ha dado de baja en el
    public void cupoMas(String clave_grupo){
        try {
            String sql = "update actividad_complementaria set cupo=cupo+1 where clave_grupo='"+clave_grupo+"';";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para que un alumno se resgistre
    public boolean registrarAlumno(String ncontrol,String nombre,String apem,String apep,String carre,int semestre,String correo,String contra){
        boolean es=false;
        try {
            String sql2="select alumno.numeroControl,alumno.nombre,alumno.apellidoP,alumno.apellidoM from alumno where numeroControl="+ncontrol;
            String[] array=new String[4];
            conet = con1.getConnection();
            st = conet.createStatement();
            rs=st.executeQuery(sql2);
            while (rs.next()){
                array[0]=rs.getString("numeroControl");
                array[1]=rs.getString("nombre");
                array[2]=rs.getString("apellidoP");
                array[3]=rs.getString("apellidoM");
                if(array[0].equals(ncontrol)||array[1].equals(nombre)& array[2].equals(apem) &array[3].equals(apep)){
                JOptionPane.showMessageDialog(null, "Este alumno(a) ya se encuentra registrado.");
                return es;
            }} 
            String sql = "insert into alumno values ("+ncontrol+",'"+nombre+"','"+apep+"','"+apem+"','"+carre+"','"+correo+"','"+contra+"',"+semestre+");";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);  
            es=true;
        } catch (Exception e) {
            System.out.println(""+e);
        }
        return es;
        }
    
    //Método para que cualquier usuario pueda cambiar su propia contraseña
    public void cambioPassword(String usu,String usuari,String nueva){
        System.out.println("cambiando");
        if(usuari=="alumno"){
            columna="numeroControl";}
        if(usuari=="docente"){
            columna="ID_profesor";}
        try {
            String sql="update "+usuari+" set password='"+nueva+"' where "+columna+"="+usu;
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se ha cambiado la contraseña.");
        } catch (Exception e) {
        System.out.println("error "+e);}
    }
    
    //Método para obtener ciertos datos sobre el alumno y poder generar el horario que se envia a su correo
    public String[] seleccionarAlumno(String nControl){
        String [] array = new String [6];
        try {
            String sql="SELECT nombre,apellidoP,apellidoM,carrera,semestre,correo FROM alumno WHERE numeroControl = "+nControl; 
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
              for(int x=0; x<array.length; x++){
                 array[x]=rs.getString(x+1);
              }  
            }
        } catch (Exception e) {
        System.out.println("error "+e);}   
      return array;
    }
    
    //Método para obtener ciertos datos sobre la actividad a la que se ha inscrito el alumno
    //y poder generar el horario que se envia a su correo
    public String[] actividadActual2(String usu){
        String[] actual =new String[6];
        String sql = "select actividad_complementaria.nombre_actividad,\n" +
        "actividad_complementaria.horario,actividad_complementaria.creditos,\n" +
        "docente.nombre,docente.apellidoP,docente.apellidoM,actividad_complementaria.clave_grupo \n" +
        "from inscripcion \n" +
        "inner join actividad_complementaria on inscripcion.clave_grupo = actividad_complementaria.clave_grupo\n" +
        "inner join docente on actividad_complementaria.id_profesor = docente.id_profesor\n" +
        "where numero_control="+usu;
        try {
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                actual [0] = rs.getString("nombre_actividad");
                actual [1] = rs.getString("horario");
                actual [2] = rs.getInt("creditos")+"";
                actual [3] = rs.getString("nombre")+" "+rs.getString("apellidoP")+" "+rs.getString("apellidoM");
                actual [4]=  rs.getString("clave_grupo");
            }
            
        } catch (Exception e) {
            System.out.println("error "+e);
        }
      return actual;  
    }
    
    //Método para obtener los datos necesarios para generar y descargar
    //una constancia de una actividad aprobada  
    public String[] constancia(String ncontrol,String clave_grupo) {
        String[] result = new String[6];
        String sql = "SELECT alumno.numeroControl,actividad_complementaria.nombre_actividad, alumno.nombre, alumno.apellidoP, alumno.apellidoM, alumno.carrera, actividad_complementaria.creditos,inscripcion.periodo\n" +
                    "FROM inscripcion\n" +
                    "INNER JOIN alumno ON inscripcion.numero_control = alumno.numeroControl\n" +
                    "INNER JOIN actividad_complementaria ON inscripcion.clave_grupo = actividad_complementaria.clave_grupo\n" +
                    "WHERE alumno.numeroControl = "+ncontrol+" and inscripcion.clave_grupo='"+clave_grupo+"';";
        try {
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                result[0] = rs.getString("numeroControl");
                result[1] = rs.getString("nombre") + " " + rs.getString("apellidoP") + " " + rs.getString("apellidoM");
                result[2] = rs.getString("carrera");
                result[3] = rs.getString("creditos");
                result[4] = rs.getString("nombre_actividad");
                result[5] = rs.getString("periodo");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return result;
    }
    
    //Método para mostrar los datos de actividades que se cursaron y se aprobaron 
    //para descargar las constancias correspondientes
    public void mostrarConstancias(JTable Tabla,String usu){
        String sql ="select inscripcion.clave_grupo,inscripcion.numero_control,actividad_complementaria.nombre_actividad,actividad_complementaria.creditos,inscripcion.periodo,inscripcion.estatus\n" +
                    "from inscripcion\n" +
                    "inner join actividad_complementaria on inscripcion.clave_grupo = actividad_complementaria.clave_grupo\n" +
                    "where numero_control="+usu+";";
        DefaultTableModel modelo;
        try {
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] actual =new Object[4];
            modelo = (DefaultTableModel) Tabla.getModel();
        
            while (rs.next()) {
                actual [0] = rs.getString("nombre_actividad");
                actual [1] = rs.getString("clave_grupo");
                actual [2] = rs.getInt("creditos");
                actual[3] = rs.getString("periodo");
                if("APROBADO".equals(rs.getString("estatus"))){
                    System.out.println("agrgado");
                modelo.addRow(actual);}}
            
            Tabla.setModel(modelo);
        } catch (Exception e) {
            System.out.println("error "+e);
        }
    }
    
    //MÉTODOS PARA PROFESOR
    //Método para mostrar las activividades que imparte un docente
    public void mostrarActividadesDocente(JTable Tabla, String IDprofesor) {
        String sql = "select actividad_complementaria.nombre_actividad,actividad_complementaria.creditos,\n"
                + "                    actividad_complementaria.clave_grupo ,actividad_complementaria.horario,\n"
                + "                    actividad_complementaria.requisitos, actividad_complementaria.cupo\n"
                + "                    from actividad_complementaria\n"
                + "                    inner join docente on actividad_complementaria.id_profesor = docente.id_profesor\n"
                + "                    where docente.ID_profesor=" + IDprofesor + ";";
        DefaultTableModel modelo;
        try {
            conet = con1.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] actual = new Object[8];
            modelo = (DefaultTableModel) Tabla.getModel();
            while (rs.next()) {
                actual[0] = rs.getString("nombre_actividad");
                actual[1] = rs.getInt("creditos");
                actual[2] = rs.getString("clave_grupo");
                actual[3] = rs.getString("horario");
                actual[4] = rs.getInt("cupo");
                if (rs.getInt("cupo") == 0) {
                } else {
                    modelo.addRow(actual);
                }
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

    // Nuevo método para obtener nombres completos de los alumnos
    public List<String> getStudentNamesByControlNumbers(List<String> controlNumbers) {

        List<String> studentNames = new ArrayList<>();
        if (controlNumbers.isEmpty()) {
            return studentNames;
        }
        StringBuilder sb = new StringBuilder();
        for (String controlNumber : controlNumbers) {
            sb.append("'").append(controlNumber).append("',");
        }
        String controlNumbersStr = sb.toString().substring(0, sb.length() - 1); // Eliminar la última coma
        String sql = "SELECT nombre, apellidoP, apellidoM FROM alumno WHERE numeroControl IN (" + controlNumbersStr + ")";
        try {
            conet = con1.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String fullName = rs.getString("nombre") + " " + rs.getString("apellidoP") + " " + rs.getString("apellidoM");
                studentNames.add(fullName);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return studentNames;

    }
    
    // Método para obtener el nombre de la actividad y el nombre del docente
    public String[] actividadNombreDocente(String claveGrupo) {
        String[] result = new String[2];
        String sql = "SELECT actividad_complementaria.nombre_actividad, "
                + "concat(docente.nombre, ' ', docente.apellidoP, ' ', docente.apellidoM) as nombre_docente "
                + "FROM actividad_complementaria "
                + "INNER JOIN docente ON actividad_complementaria.id_profesor = docente.id_profesor "
                + "WHERE actividad_complementaria.clave_grupo = ?";
        try {
            conet = con1.getConnection();
            PreparedStatement ps = conet.prepareStatement(sql);
            ps.setString(1, claveGrupo);
            rs = ps.executeQuery();
            if (rs.next()) {
                result[0] = rs.getString("nombre_actividad");
                result[1] = rs.getString("nombre_docente");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return result;
    }

    // Método para obtener los detalles de los alumnos inscritos
    public List<String[]> detallesEstudiantesXgrupo(String claveGrupo) {
        List<String[]> studentDetails = new ArrayList<>();
        String sql = "SELECT alumno.numeroControl, alumno.nombre, alumno.apellidoP, alumno.apellidoM, alumno.semestre,inscripcion.estatus "
                + "FROM inscripcion "
                + "INNER JOIN alumno ON inscripcion.numero_control = alumno.numeroControl "
                + "WHERE inscripcion.clave_grupo = ?";
        try {
            conet = con1.getConnection();
            PreparedStatement ps = conet.prepareStatement(sql);
            ps.setString(1, claveGrupo);
            rs = ps.executeQuery();
            while (rs.next()) {
                String[] details = new String[4];
                details[0] = rs.getString("numeroControl");
                details[1] = rs.getString("nombre") + " " + rs.getString("apellidoP") + " " + rs.getString("apellidoM");
                details[2] = rs.getString("semestre");
                details[3] = "Días a especificar"; // Esto debe ser ajustado si tienes datos específicos para los días
                
                if("CURSANDO".equals(rs.getString("estatus"))){
                studentDetails.add(details);}
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return studentDetails;
    }

    // Método para actualizar el estatus del alumno cuando lo evalua el profesor
    public void actualizarEstatusAlumno(String numeroControl, String claveGrupo, String estatus) {
        String sql = "UPDATE inscripcion SET estatus = ? WHERE numero_control = ? AND clave_grupo = ?";
        try {
            conet = con1.getConnection();
            PreparedStatement ps = conet.prepareStatement(sql);
            ps.setString(1, estatus);
            ps.setString(2, numeroControl);
            ps.setString(3, claveGrupo);

            System.out.println("Ejecutando actualización: " + ps.toString()); // Mensaje de depuración
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Actualización exitosa para número de control: " + numeroControl);
            } else {
                System.out.println("No se encontró el registro para actualizar con número de control: " + numeroControl);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }

    // Método para obtener los detalles de los alumnos inscritos y evaluarlos o descargar una lista de ellos
    public List<String> detallesEstudiantesXgrupo2(String claveGrupo) {
        List<String> studentDetails = new ArrayList<>();
        String sql = "SELECT alumno.numeroControl, alumno.nombre, alumno.apellidoP, alumno.apellidoM, alumno.semestre "
                + "FROM inscripcion "
                + "INNER JOIN alumno ON inscripcion.numero_control = alumno.numeroControl "
                + "WHERE inscripcion.clave_grupo = ?";
        try {
            conet = con1.getConnection();
            PreparedStatement ps = conet.prepareStatement(sql);
            ps.setString(1, claveGrupo);
            rs = ps.executeQuery();
            while (rs.next()) {
                studentDetails.add(rs.getString("numeroControl"));
                studentDetails.add(rs.getString("nombre"));
                studentDetails.add(rs.getString("apellidoP"));
                studentDetails.add(rs.getString("apellidoM"));
                studentDetails.add(rs.getString("semestre"));
                studentDetails.add("");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return studentDetails;
    }
    
    // Método para obtener el nombre de la actividad, el nombre del docente y el horario
    public String[] actividadNombreDocente2(String claveGrupo) {
        String[] result = new String[5];
        String sql = "SELECT actividad_complementaria.nombre_actividad, actividad_complementaria.horario, "
                + "concat(docente.nombre, ' ', docente.apellidoP, ' ', docente.apellidoM) as nombre_docente "
                + "FROM actividad_complementaria "
                + "INNER JOIN docente ON actividad_complementaria.id_profesor = docente.id_profesor "
                + "WHERE actividad_complementaria.clave_grupo = ?";
        try {
            conet = con1.getConnection();
            PreparedStatement ps = conet.prepareStatement(sql);
            ps.setString(1, claveGrupo);
            rs = ps.executeQuery();
            if (rs.next()) {
                result[0] = rs.getString("nombre_actividad");
                result[1] = rs.getString("nombre_docente");
                result[2] = rs.getString("horario");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return result;
    }
    
    //MÉTODOS DE ADMINISTRADOR
    //Método que muestra todas las actividades en una tabla para despues editarlas
    public List<String[]>  actividadesAdministrador(){
        String sql ="SELECT * FROM actividad_complementaria;";
        List<String[]> listaActividades = new ArrayList<>();
        try {
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String[] detalles = new String[9];
                detalles [0] = rs.getString("clave_grupo");
                detalles [1] = rs.getString("nombre_actividad");
                detalles [2] = rs.getString("horario");
                detalles [3] = rs.getString("id_profesor");               
                detalles [4] = rs.getString("id_departamento");
                detalles [5] = rs.getString("creditos");   
                detalles [6] = rs.getString("requisitos");   
                detalles [7] = rs.getString("lugar");   
                detalles [8] = rs.getString("cupo");   
                listaActividades.add(detalles);
            }
        } catch (Exception e) {
            System.out.println("error "+e);
        }
        return listaActividades;
    }
    
    //Método para que el administrador agregue una actividad
    public void agregarActividad(String clave,String nombre,String horario,String requisitos,String lugar,String cupo,String docente,String departamento,String creditos) throws SQLException{
        String sql = "insert into actividad_complementaria values ('"+clave+"','"+nombre+"','"+horario+"',"+docente+","+departamento+","+creditos+",'"+requisitos+"','"+lugar+"',"+cupo+");";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Actividad Agregada");
            //limpiarTabla(tabla);
    }
    
    //Método para que el administrador modifique una actividad
    public void modificarActividad(String aux,String clave,String nombre,String horario,String requisitos,String lugar,String cupo,String docente,String departamento,String creditos) throws SQLException{
        String sql = "update actividad_complementaria set clave_grupo='"+clave+"',nombre_actividad='"+nombre+"',\n" +
                    "horario = '"+horario+"', id_profesor="+docente+",id_departamento="+departamento+",creditos="+creditos+",requisitos='"+requisitos+"',lugar='"+lugar+"',cupo="+cupo+" \n" +
                    "where clave_grupo='"+aux+"';";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Actividad Modificada");
            //limpiarTabla(tabla);
    }
    
    //Método para que el administrador elimine una actividad
    public void eliminarActividad(String aux,JTable tabla) throws SQLException{
        String sql = "delete from actividad_complementaria where clave_grupo='"+aux+"';";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Actividad Eliminada");
            limpiarTabla(tabla);
    }
    
    //Método que muestra todos los alumnos en una tabla para despues editarlas
    public List<String[]> alumnosAdministrador(){
        List<String[]> listaAlumnos = new ArrayList<>();
        String sql ="SELECT * FROM alumno;";
        try {
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String[] detalles = new String[8];
                detalles [0] = rs.getString("numeroControl");
                detalles [1] = rs.getString("nombre");
                detalles [2] = rs.getString("apellidoP");
                detalles [3] = rs.getString("apellidoM");
                detalles [4] = rs.getString("carrera");               
                detalles [5] = rs.getString("correo");
                detalles [6] = rs.getString("password");   
                detalles [7] = rs.getString("semestre");  
                listaAlumnos.add(detalles);
            }
        } catch (Exception e) {
            System.out.println("error "+e);
        }
        return listaAlumnos;
    }
    
    //Método para que el administrador agregue un alumno
    public void agregarAlumno(String numero,String nombre,String paterno,String materno,String carrera,String correo,String contraseña,String semestre) throws SQLException{
        String sql = "insert into alumno values ("+numero+",'"+nombre+"','"+paterno+"','"+materno+"','"+carrera+"','"+correo+"','"+contraseña+"',"+semestre+");";
        conet = con1.getConnection();
        st = conet.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Alumno Agregado");
        //limpiarTabla(tabla);
    }
    
    //Método para que el administrador modifique un alumno
    public void modificarAlumno(String aux,String numero,String nombre,String paterno,String materno,String carrera,String correo,String contraseña,String semestre) throws SQLException{
        String sql = "update alumno set numeroControl="+numero+",nombre='"+nombre+"',apellidoP='"+paterno+"',apellidoM='"+materno+"',carrera='"+carrera+"',correo='"+correo+"',\n" +
                    "password='"+contraseña+"',semestre="+semestre+"\n" +
                    "where numeroControl="+aux+";";
        conet = con1.getConnection();
        st = conet.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Alumno Modificado");
        //limpiarTabla(tabla);
    }
    
    //Método para que el administrador elimine un alumno
    public void eliminarAlumno(String aux,JTable tabla) throws SQLException{
        String sql = "delete from alumno where numeroControl="+aux+";";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Alumno Eliminado");
            limpiarTabla(tabla);
    }
    
    //Método que muestra todos los docentes en una tabla para despues editarlas
    public List<String[]>  docentesAdministrador(){
        List<String[]> listaDocentes = new ArrayList<>();
        String sql ="SELECT * FROM docente;";
        try {
            conet = con1.getConnection();            
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String[] detalles = new String[7];
                detalles [0] = rs.getString("id_profesor");
                detalles [1] = rs.getString("nombre");
                detalles [2] = rs.getString("apellidoP");
                detalles [3] = rs.getString("apellidoM");
                detalles [4] = rs.getString("clave_departamento");               
                detalles [5] = rs.getString("correo");
                detalles [6] = rs.getString("password");   
                listaDocentes.add(detalles);
            }
        } catch (Exception e) {
            System.out.println("error "+e);
        }
        return listaDocentes;
    }
    
    //Método para que el administrador agregue un docente
    public void agregarDocente(String id,String nombre,String paterno,String materno,String departamento,String correo,String password) throws SQLException{
        String sql = "insert into docente values ("+id+",'"+nombre+"','"+paterno+"','"+materno+"',"+departamento+",'"+correo+"','"+password+"');";
        conet = con1.getConnection();
        st = conet.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Docente Agregado");
    }
    
    //Método para que el administrador modifique un docente
    public void modificarDocente(String aux,String id,String nombre,String paterno,String materno,String departamento,String correo,String password) throws SQLException{
        String sql = "update docente set ID_profesor="+id+",nombre='"+nombre+"',apellidoP='"+paterno+"',apellidoM='"+materno+"',\n" +
                    "clave_departamento='"+departamento+"',correo='"+correo+"',password='"+password+"' \n" +
                    "where ID_profesor="+aux+";";
        conet = con1.getConnection();
        st = conet.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Docente Modificado");
    }
    
    //Método para que el administrador elimine un docente
    public void eliminarDocente(String aux,JTable tabla) throws SQLException{
        String sql = "delete from docente where ID_profesor="+aux+";";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Docente Eliminado");
            limpiarTabla(tabla);
    }
    
    //Método que limpia la tabla que recibe para actulizar sus datos 
    public void limpiarTabla(JTable actividades){
        DefaultTableModel nuevo=(DefaultTableModel) actividades.getModel();
        for (int i = 0; i < actividades.getRowCount(); i++){
            nuevo.removeRow(i);
            i = i - 1;
        }        
    }
    
    public int[] estadisticas2() throws SQLException {
        String sql = "SELECT a.semestre FROM inscripcion INNER JOIN alumno a ON inscripcion.numero_control = a.numeroControl";
        int array[]=new int[4];
        // Inicializa los contadores de semestres
        int[] semestreCounts = new int[12];

        // Conectar a la base de datos
        conet = con1.getConnection();
        st = conet.createStatement();
        rs = st.executeQuery(sql);

        // Almacenar los resultados y contar los semestres
        while (rs.next()) {
            int semestre = rs.getInt("semestre");
            if (semestre >= 1 && semestre <= 12) {
                semestreCounts[semestre - 1]++;
            }
        }

        // Encuentra el semestre con el máximo número de estudiantes
        int maxCount = 0;
        int maxSemestre = 0;
        for (int i = 0; i < semestreCounts.length; i++) {
            if (semestreCounts[i] > maxCount) {
                maxCount = semestreCounts[i];
                maxSemestre = i + 1;
            }
        }

        int minCount = Integer.MAX_VALUE;
        int minSemestre = 0;
        for (int i = 0; i < semestreCounts.length; i++) {
            if (semestreCounts[i] < minCount && semestreCounts[i] > 0) {
                minCount = semestreCounts[i];
                minSemestre = i + 1;
            }
        }
        // Imprime el semestre con el mayor número de estudiantes
        System.out.println("El semestre con el menor número de estudiantes es: " + minSemestre + " con " + minCount + " estudiantes.");
        System.out.println("El semestre con el mayor número de estudiantes es: " + maxSemestre + " con " + maxCount + " estudiantes.");
        array[0]=minSemestre;
        array[2]=maxSemestre;
        array[3]=maxCount;
        array[1]=minCount;
        return array; 
    } 
    
    public Object[] alumnosXdepartamentoID(int id) throws SQLException{
    String sql=" SELECT ac.nombre_actividad AS Actividad,ac.horario AS Horario,ac.lugar AS Lugar,ac.creditos AS Creditos,COUNT(ins.numero_control) AS Alumnos_Inscritos,\n" +
    "d.nombre_departamento AS Departamento FROM actividad_complementaria ac JOIN inscripcion ins ON ac.clave_grupo = ins.clave_grupo JOIN departamento d ON ac.id_departamento = d.ID_departamento\n" +
    "WHERE d.ID_departamento = "+id+" GROUP BY ac.nombre_actividad,ac.horario,ac.lugar,ac.creditos,d.nombre_departamento;"; 
    Object[]ay=new Object[5];
    int max=0;
    int min=Integer.MAX_VALUE;;
    // Conectar a la base de datos
    conet = con1.getConnection();
    st = conet.createStatement();
    rs = st.executeQuery(sql);
    while(rs.next()){
    int cantidad=rs.getInt("Alumnos_Inscritos");
    if(cantidad>max){
        ay[0]=rs.getString("Actividad");
        ay[1]=rs.getInt("Alumnos_Inscritos");
        ay[2]=rs.getString("Departamento");
        max=cantidad;
    } else if(cantidad<min){
        ay[3]=rs.getString("Actividad");
        ay[4]=rs.getInt("Alumnos_Inscritos");
        //ay[5]=rs.getString("Departamento");  
        min=cantidad;
        }
    }
    return ay; 
    }
}
