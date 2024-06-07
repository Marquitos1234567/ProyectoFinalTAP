/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.consultas;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author itzim
 */
public class estadisticasDocente extends javax.swing.JFrame {

   
    public estadisticasDocente(){
        String[] options = {
            "Departamento de actividades extraescolares",
            "Departamento de ingeniería electrónica",
            "Departamento de sistemas y computacion",
            "Departamento de ingeniería química y bioquímica",
            "Centro de informacióm",
            "Departamento de ingeniería eléctrica",
            "Departamento de ciencias económico administrativas",
            "Departamento de metal mecánica",
            "Departamento de ingeniería industrial",
            "Departamento de ciencias de la tierra",
            "Departamento de ciencias básicas"
        };

        // Ordenar las opciones alfabéticamente
        //Arrays.sort(options);

        // Crear un JComboBox con las opciones ordenadas
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Mostrar el JComboBox en un diálogo de entrada
        int option = JOptionPane.showConfirmDialog(null, comboBox, "Seleccione un departamento:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        // Si se ha seleccionado una opción, guardarla en una variable
        int selectedDepartment = 0;
        if (option == JOptionPane.OK_OPTION) {
            selectedDepartment = comboBox.getSelectedIndex()+1;
        }
       
        setLocationRelativeTo(null);
        initComponents();
        consultas consultar=new consultas();
        int array[]=new int[4];
        int menos,mas,c1,c2;
        
        try {
            array=consultar.estadisticas2();
            menos=array[0];//semestre menos inscritos
            c1=array[1];//cantidad
            mas=array[2];//semestre más inscritos
            c2=array[3];
            DefaultCategoryDataset datos= new DefaultCategoryDataset();
            datos.setValue(c1, "Alumnos menos Inscritos", "Semestre "+menos);
            datos.setValue(c2, "Alumnos más Inscritos", "Semestre "+mas);
            JFreeChart grafico= ChartFactory.createBarChart3D(
            "ALUMNOS MAS Y MENOS INSCRITOS POR SEMESTRE", //Título del gráfico
            "","Alumnos",datos,PlotOrientation.VERTICAL,true,true,false
            );
            // Configurar el eje y para que muestre solo enteros
            CategoryPlot plot = grafico.getCategoryPlot();
            NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
            rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

            ChartPanel panel= new ChartPanel(grafico);
            panel.setMouseWheelEnabled(true);
            panel.setPreferredSize(new Dimension(300,400));
            jPanel1.setLayout(new BorderLayout());
            jPanel1.add(panel,BorderLayout.CENTER);
            
            
            Object[]ay=new Object[5];
            ay=consultar.alumnosXdepartamentoID(selectedDepartment);
            DefaultCategoryDataset datos2= new DefaultCategoryDataset();
            datos2.setValue((int)ay[4], "Actividad con menos Inscritos", ""+ay[3]);
            datos2.setValue((int)ay[1], "Actividad con más Inscritos", " "+ay[0]);
            JFreeChart grafico2= ChartFactory.createBarChart3D(
            "ALUMNOS INSCRITOS POR DEPARTAMENTO", //Título del gráfico
            ""+ay[2],"Alumnos",datos2,PlotOrientation.VERTICAL,true,true,false
            );   
            CategoryPlot plot2 = grafico2.getCategoryPlot();
            NumberAxis rangeAxis2 = (NumberAxis) plot2.getRangeAxis();
            rangeAxis2.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
            ChartPanel panel2= new ChartPanel(grafico2);
            panel2.setMouseWheelEnabled(true);
            panel2.setPreferredSize(new Dimension(600,400));
            jPanel2.setLayout(new BorderLayout());
            jPanel2.add(panel2,BorderLayout.CENTER);
            
        } catch (SQLException ex) {
            Logger.getLogger(menuDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        volver1 = new javax.swing.JLabel();
        volver3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ESTADISTICAS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        volver1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        volver1.setForeground(new java.awt.Color(0, 0, 153));
        volver1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volver1.setText("VOLVER");
        volver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volver1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volver1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volver1MouseExited(evt);
            }
        });

        volver3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        volver3.setForeground(new java.awt.Color(0, 0, 153));
        volver3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volver3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        volver3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volver3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volver3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volver3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(volver3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(volver1)
                            .addComponent(volver3))))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseClicked
        menuDocente ventanaD = new menuDocente();
        ventanaD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volver1MouseClicked

    private void volver1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseEntered
        volver1.setFont(new Font("Roboto", Font.PLAIN, 14));
    }//GEN-LAST:event_volver1MouseEntered

    private void volver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseExited
        volver1.setFont(new Font("Roboto", Font.PLAIN, 12));
    }//GEN-LAST:event_volver1MouseExited

    private void volver3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver3MouseClicked
        menuDocente ventana  = new menuDocente();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volver3MouseClicked

    private void volver3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver3MouseEntered
        volver3.setFont(new Font("Roboto", Font.PLAIN, 14));
    }//GEN-LAST:event_volver3MouseEntered

    private void volver3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver3MouseExited
        volver3.setFont(new Font("Roboto", Font.PLAIN, 12));
    }//GEN-LAST:event_volver3MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               estadisticasDocente ventana = new estadisticasDocente();
           
               ventana.setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel volver1;
    private javax.swing.JLabel volver3;
    // End of variables declaration//GEN-END:variables
}
