/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author yo
 */
public class documento {
      
    public void generar_horario(String nombre,String nControl,String alumno,String apellidoP,String apellidoM,String carrera,int semestre,int creditos,String act,String grupo,String resp,String hora){
        Document documento =new Document();
        try {
         LocalDateTime hoy = LocalDateTime.now(); 
         String fecha=""+hoy.getDayOfMonth()+" de "+ hoy.getMonth()+ " del " +hoy.getYear();
         PdfWriter.getInstance(documento, new FileOutputStream(nombre ) );
         documento.open();
         
         Image imagen = Image.getInstance("imagenes/logos.jpg");
         documento.add(imagen);
         Font font = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL);
         Image imagen2 = Image.getInstance("imagenes/Div.jpg");
         imagen2.setAbsolutePosition(350, 650);
         imagen2.scaleToFit(200, 200);
         documento.add(imagen2);
         Paragraph paragraph = new Paragraph();
         paragraph.setAlignment(Element.ALIGN_LEFT);
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("FECHA: "+fecha+"                              ",font));
         paragraph.add(new Phrase("PERIODO ESCOLAR: ENERO-JUNIO 2024"+ "\n",font));
         paragraph.add(new Phrase("NUMERO DE CONTROL: "+ nControl+ "                          "+"      CREDITOS: "+creditos+ "\n",font));
         paragraph.add(new Phrase("ALUMNO: "+alumno+" "+apellidoP+" "+apellidoM+"      ",font));
         paragraph.add(new Phrase("                SEMESTRE: "+semestre+ "\n",font));
         paragraph.add(new Phrase("CARRERA: "+carrera+ "\n",font));
         paragraph.add(new Phrase("ACTIVIDAD: ",font));
         paragraph.add(new Phrase(act+ "\n",font));
         paragraph.add(new Phrase("GRUPO: "+grupo,font));
         paragraph.add(new Phrase("             RESPONSABLE: "+resp+ "\n",font)); 
         paragraph.add(new Phrase("HORARIO:"+ "\n",font));
         paragraph.add(new Phrase(hora,font));
         paragraph.add(new Phrase("\n"+"\n"+"\n"));
         paragraph.add(new Phrase("    ____________________________",font));
         paragraph.add(new Phrase("                              ____________________________\n",font));
         paragraph.add(new Phrase("COORDINACION DE ACTIVIDADES"));
         paragraph.add(new Phrase("                           "+alumno+" "+apellidoP+" "+apellidoM+"\n",font));
         paragraph.add(new Phrase("COMPLEMENTARIAS"));
         
         documento.add(paragraph);
         documento.close();
        }catch(Exception e){
          e.printStackTrace();
        }
     
     
 } 

    public void generarListaAlumnos(String nombre,List<String> studentDetails,String resp,String grupo,String hora,String act){
      Document documento =new Document();
      LocalDateTime hoy = LocalDateTime.now(); 
      String fecha=""+hoy.getDayOfMonth()+" de "+ hoy.getMonth()+ " del " +hoy.getYear();
      try{
       PdfWriter.getInstance(documento, new FileOutputStream(nombre ) );
       documento.open();   
         Image imagen = Image.getInstance("imagenes/logos.jpg");
         documento.add(imagen);
         Font font = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL);
         Image imagen2 = Image.getInstance("imagenes/Div.jpg");
         imagen2.setAbsolutePosition(350, 650);
         imagen2.scaleToFit(200, 200);
         documento.add(imagen2);
         
         Paragraph paragraph = new Paragraph();
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.setAlignment(Element.ALIGN_LEFT);
         paragraph.add(new Phrase("FECHA: "+fecha+"                              ",font));
         paragraph.add(new Phrase("PERIODO ESCOLAR: ENERO-JUNIO 2024"+ "\n",font));
         paragraph.add(new Phrase("ACTIVIDAD: "+act+"\n",font));
         paragraph.add(new Phrase("RESPONSABLE: "+resp+"        ",font));
         paragraph.add(new Phrase("               GRUPO: "+grupo+"\n",font));
         paragraph.add(new Phrase("HORARIO:"+ "\n",font));
         paragraph.add(new Phrase(hora+"\n",font));
         
         PdfPTable tabla = new PdfPTable(6);
         tabla.setSpacingBefore(10f);
         documento.add(new Paragraph("\n\n\n\n"));
         tabla.addCell("Número de Control");
         tabla.addCell("Nombre(s)");
         tabla.addCell("Apellido Paterno");
         tabla.addCell("Apellido Materno");
         tabla.addCell("Semestre");
         tabla.addCell("Asistencia");
         int x=5;
         for (int i = 0; i < studentDetails.size(); i++) {
	  
           tabla.addCell(studentDetails.get(i)); 
         }
         
       documento.add(paragraph);
       documento.add(tabla);  
       
       documento.close();
      }catch(Exception e){
       e.printStackTrace();
      }  
    }
    
    public void generarConstancia(String nombre,String alumno,String ncontrol,String carrera,String credito,String nombre_actividad,String periodo){
    Document documento =new Document();
      LocalDateTime hoy = LocalDateTime.now(); 
      String fecha=""+hoy.getDayOfMonth()+" de "+ hoy.getMonth()+ " del " +hoy.getYear();
      try{
       PdfWriter.getInstance(documento, new FileOutputStream(nombre ) );
       documento.open();   
         Image imagen = Image.getInstance("imagenes/logos.jpg");
         documento.add(imagen);
         Font font = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL);
         Image imagen2 = Image.getInstance("imagenes/Div.jpg");
         imagen2.setAbsolutePosition(350, 650);
         imagen2.scaleToFit(200, 200);
         documento.add(imagen2);
         
         Paragraph paragraph = new Paragraph();
         paragraph.setAlignment(Element.ALIGN_LEFT);
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("CONSTANCIA DE CUMPLIMIENTO DE ACTIVIDAD"+"\n"));
         
         paragraph.add(new Phrase("Huitzili Díaz Jaimes"));
         paragraph.add(new Phrase("Jefa de Departamento de Servicios Escolares"+"\n"));
         paragraph.add(new Phrase("PRESENTE"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("El que suscribe PROF. E.F. LUIS REY LUNA DÍAZ, por este medio se permite hacer de su \n"));
         paragraph.add(new Phrase("conocimiento que el estudiante "+alumno+" con número de control "+ncontrol+"\n"));
         paragraph.add(new Phrase("de la carrera de "+carrera+ " ha cumplido su actividad complementaria "+nombre_actividad+""));
         paragraph.add(new Phrase(" con un nivel de desempeño NOTABLE durante el periodo escolar "));
         paragraph.add(new Phrase(periodo+" con un valor de "+credito+" créditos."));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         
         paragraph.add(new Phrase("Se extiende la presente en la Cuidad de Oaxaca de Juárez, OAX., a "+fecha));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("\n"));
         paragraph.add(new Phrase("LUIS REY LUNA DÍAZ            "));
         paragraph.add(new Phrase("                             LUIS REY LUNA DÍAZ"+"\n"));
         paragraph.add(new Phrase("COORDINADOR DE ASIGNATURAS MOCC      "));
         paragraph.add(new Phrase("JEFE DE DEPARTAMENTO DE ACTIVIDADES EXTRAESCOLARES"));
         documento.add(paragraph);
         documento.close();
         
      }catch(Exception e){
      
      }   
    }
}
