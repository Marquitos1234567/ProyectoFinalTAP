/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.consultas;
import java.awt.Font;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class gestionarActividades extends javax.swing.JFrame {

    private consultas consultar;
    private login metodo;
    public static String clave,nombre,horario,requisitos,lugar,cupo,docente,departamento,creditos,accion,aux;
    
    
    public gestionarActividades() {
        initComponents();
        setLocationRelativeTo(null);
        consultar = new consultas();
        cargarDatos();
    }
    
    public void cargarDatos() {
        List<String[]> detallesDocentes = consultar.actividadesAdministrador();

        DefaultTableModel model = (DefaultTableModel) actividades.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar los datos

        for (String[] details : detallesDocentes) {
            model.addRow(new Object[]{details[0], details[1], details[2],details[3],details[4],details[5],details[6],details[7],details[8]}); // Número de control, nombre, estatus vacío
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        volver = new javax.swing.JLabel();
        volver1 = new javax.swing.JLabel();
        eliminar = new javax.swing.JLabel();
        agregar = new javax.swing.JLabel();
        modificar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        actividades = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GESTIONAR ACTIVIDADES");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 1030, 50));

        volver.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        volver.setForeground(new java.awt.Color(0, 0, 153));
        volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));

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
        jPanel1.add(volver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 60, -1));

        eliminar.setBackground(new java.awt.Color(51, 51, 255));
        eliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminar.setText("ELIMINAR");
        eliminar.setOpaque(true);
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, 120, 40));

        agregar.setBackground(new java.awt.Color(51, 51, 255));
        agregar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregar.setText("AGREGAR");
        agregar.setOpaque(true);
        agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMouseClicked(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 120, 40));

        modificar.setBackground(new java.awt.Color(51, 51, 255));
        modificar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificar.setText("MODIFICAR");
        modificar.setOpaque(true);
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMouseClicked(evt);
            }
        });
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 120, 40));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        actividades.setBackground(new java.awt.Color(255, 255, 255));
        actividades.setForeground(new java.awt.Color(51, 51, 51));
        actividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CLAVE DE GRUPO", "NOMBRE DE LA ACTIVIDAD", "HORARIO", "ID DOCENTE", "ID DEPARTAMENTO", "CREDITOS", "REQUISITOS", "LUGAR", "CUPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        actividades.setAltoHead(30);
        actividades.setColorBackgoundHead(new java.awt.Color(255, 255, 255));
        actividades.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        actividades.setColorBordeHead(new java.awt.Color(255, 255, 255));
        actividades.setColorFilasBackgound2(new java.awt.Color(204, 204, 255));
        actividades.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        actividades.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        actividades.setColorForegroundHead(new java.awt.Color(51, 51, 51));
        actividades.setColorSelBackgound(new java.awt.Color(0, 102, 255));
        actividades.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        actividades.setFuenteFilas(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        actividades.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        actividades.setFuenteHead(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        actividades.setGridColor(new java.awt.Color(51, 51, 51));
        actividades.setGrosorBordeFilas(0);
        actividades.setGrosorBordeHead(0);
        actividades.setRowHeight(30);
        actividades.getTableHeader().setResizingAllowed(false);
        actividades.getTableHeader().setReorderingAllowed(false);
        actividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actividadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(actividades);
        if (actividades.getColumnModel().getColumnCount() > 0) {
            actividades.getColumnModel().getColumn(0).setResizable(false);
            actividades.getColumnModel().getColumn(0).setPreferredWidth(90);
            actividades.getColumnModel().getColumn(1).setResizable(false);
            actividades.getColumnModel().getColumn(1).setPreferredWidth(280);
            actividades.getColumnModel().getColumn(2).setPreferredWidth(250);
            actividades.getColumnModel().getColumn(3).setResizable(false);
            actividades.getColumnModel().getColumn(3).setPreferredWidth(80);
            actividades.getColumnModel().getColumn(4).setResizable(false);
            actividades.getColumnModel().getColumn(4).setPreferredWidth(50);
            actividades.getColumnModel().getColumn(5).setResizable(false);
            actividades.getColumnModel().getColumn(5).setPreferredWidth(10);
            actividades.getColumnModel().getColumn(7).setResizable(false);
            actividades.getColumnModel().getColumn(7).setPreferredWidth(20);
            actividades.getColumnModel().getColumn(8).setResizable(false);
            actividades.getColumnModel().getColumn(8).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 304, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 790, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        menuAdmin ventana  = new menuAdmin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverMouseClicked

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        try {
            consultar.eliminarActividad(aux,actividades);
            cargarDatos();
        } catch (SQLException ex) {
            Logger.getLogger(gestionarActividades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarMouseClicked

    private void actividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actividadesMouseClicked
        int fila = actividades.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "No se seleccionó actividad.");
        } else {
            aux = (String) actividades.getValueAt(fila,0) ;
            clave = (String) actividades.getValueAt(fila,0);
            nombre = (String) actividades.getValueAt(fila,1);
            horario = (String) actividades.getValueAt(fila,2);
            docente = ""+Integer.parseInt((String) actividades.getValueAt(fila,3) .toString());
            departamento = ""+Integer.parseInt((String) actividades.getValueAt(fila,4) .toString());
            creditos = ""+Integer.parseInt((String) actividades.getValueAt(fila,5) .toString());
            requisitos = (String) actividades.getValueAt(fila,6);
            lugar = (String) actividades.getValueAt(fila,7);
            cupo = ""+Integer.parseInt((String) actividades.getValueAt(fila,8) .toString());
        }
    }//GEN-LAST:event_actividadesMouseClicked

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
        accion="agregar";
        aux = "";
        cupo= "";
        clave="";
        nombre="";
        horario="";
        docente="";
        departamento="";
        creditos="";
        requisitos="";
        lugar="";
        agregarActividad ventana  = new agregarActividad(clave,nombre,horario,requisitos,lugar, cupo,docente,departamento,creditos,aux);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarMouseClicked

    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked
        int fila = actividades.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "No se seleccionó actividad.");
        } else {
            accion="modificar";
            agregarActividad ventana  = new agregarActividad(clave,nombre,horario,requisitos,lugar, cupo,docente,departamento,creditos,aux);
            ventana.setVisible(true);
            this.dispose();}
    }//GEN-LAST:event_modificarMouseClicked

    private void volver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseClicked
        menuAdmin ventana  = new menuAdmin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volver1MouseClicked

    private void volver1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseEntered
        volver.setFont(new Font("Roboto", Font.PLAIN, 14));
    }//GEN-LAST:event_volver1MouseEntered

    private void volver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseExited
        volver.setFont(new Font("Roboto", Font.PLAIN, 12));
    }//GEN-LAST:event_volver1MouseExited

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gestionarActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionarActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionarActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionarActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionarActividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro actividades;
    private javax.swing.JLabel agregar;
    private javax.swing.JLabel eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel modificar;
    private javax.swing.JLabel volver;
    private javax.swing.JLabel volver1;
    // End of variables declaration//GEN-END:variables
}