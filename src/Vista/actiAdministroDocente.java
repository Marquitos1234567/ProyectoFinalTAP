package Vista;

import Controlador.documento;
import Modelo.consultas;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.IOException;

public class actiAdministroDocente extends javax.swing.JFrame {

    private consultas consultar;
    private login metodo;
    private documento documento;

    public actiAdministroDocente() {
        initComponents();
        setLocationRelativeTo(null);
        consultar = new consultas();
        documento = new documento();
        consultar.mostrarActividadesDocente(actividades, metodo.ncontrol);
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
        btnEvaluarAlumnos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        actividades = new rojerusan.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();
        btnDescargarLista = new javax.swing.JLabel();
        volver3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACTIVIDADES A MI CARGO");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 948, 73));

        volver.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        volver.setForeground(new java.awt.Color(0, 0, 153));
        volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volver.setText("VOLVER");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverMouseExited(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 60, -1));

        btnEvaluarAlumnos.setBackground(new java.awt.Color(51, 51, 255));
        btnEvaluarAlumnos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEvaluarAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluarAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEvaluarAlumnos.setText("EVALUAR ALUMNOS");
        btnEvaluarAlumnos.setOpaque(true);
        btnEvaluarAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEvaluarAlumnosMouseClicked(evt);
            }
        });
        jPanel1.add(btnEvaluarAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 180, 40));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        actividades.setForeground(new java.awt.Color(51, 51, 51));
        actividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE DE LA ACTIVIDAD", "CREDITOS", "CLAVE DE GRUPO", "HORARIO", "LUGARES DISPONIBLES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            actividades.getColumnModel().getColumn(0).setPreferredWidth(150);
            actividades.getColumnModel().getColumn(1).setResizable(false);
            actividades.getColumnModel().getColumn(1).setPreferredWidth(5);
            actividades.getColumnModel().getColumn(2).setResizable(false);
            actividades.getColumnModel().getColumn(2).setPreferredWidth(20);
            actividades.getColumnModel().getColumn(3).setPreferredWidth(30);
            actividades.getColumnModel().getColumn(4).setResizable(false);
            actividades.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 900, 240));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("PARA REALIZAR CAMBIOS SOBRE CUALQUIERA DE LAS ACTIVIDADES A SU CRAGO, HAGA CLICK SOBRE LA ACTIVIDAD Y DESPUES ELIJA LA OPCIÓN.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnDescargarLista.setBackground(new java.awt.Color(51, 51, 255));
        btnDescargarLista.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnDescargarLista.setForeground(new java.awt.Color(255, 255, 255));
        btnDescargarLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDescargarLista.setText("DESCARGAR LISTA DE ASISTENCIA");
        btnDescargarLista.setOpaque(true);
        btnDescargarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDescargarListaMouseClicked(evt);
            }
        });
        jPanel1.add(btnDescargarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 240, 40));

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
        jPanel1.add(volver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        menuDocente ventanaD = new menuDocente();
        ventanaD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverMouseClicked

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setFont(new Font("Roboto", Font.PLAIN, 14));
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setFont(new Font("Roboto", Font.PLAIN, 12));
    }//GEN-LAST:event_volverMouseExited

    private void btnEvaluarAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEvaluarAlumnosMouseClicked
        if (clave_grupo == null || clave_grupo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un grupo.");
            return;
        }
        
        List<String> studentDetails = consultar.detallesEstudiantesXgrupo2(clave_grupo);        
        if (studentDetails.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay alumnos inscritos en este grupo.");
        }else{
        EvaluarDocente ventana = new EvaluarDocente(clave_grupo);
        ventana.cargarDatosAlumnos(clave_grupo);
        ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnEvaluarAlumnosMouseClicked

        String clave_grupo;
    private void actividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actividadesMouseClicked
        int fila = actividades.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó actividad.");
        } else {
            clave_grupo = (String) actividades.getValueAt(fila, 2).toString();
        }
    }//GEN-LAST:event_actividadesMouseClicked

    private void btnDescargarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescargarListaMouseClicked
        String userHome = System.getProperty("user.home");
        if (clave_grupo == null || clave_grupo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un grupo.");
            return;
        }

        consultas consultas = new consultas();
        String[] actividadDocente = consultas.actividadNombreDocente(clave_grupo);
        if (actividadDocente[0] == null | actividadDocente[1] == null) {
            JOptionPane.showMessageDialog(null, "No se encontró información de la actividad o del docente.");
            return;
        }
        String[] result = new String[4];
        result=consultar.actividadNombreDocente2(clave_grupo);
        List<String> studentDetails = consultas.detallesEstudiantesXgrupo2(clave_grupo);
        documento.generarListaAlumnos(userHome+"/Downloads/Lista de Alumnos-"+clave_grupo+".pdf", studentDetails,result[1],clave_grupo,result[2],result[0]);
        
        if (studentDetails.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay alumnos inscritos en este grupo.");
            return;
        }
        JOptionPane.showMessageDialog(null, "Se descargo la lista de asistencia .");
    }//GEN-LAST:event_btnDescargarListaMouseClicked

    private void volver3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver3MouseClicked
        menuAlumno ventana  = new menuAlumno();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volver3MouseClicked

    private void volver3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver3MouseEntered
        volver.setFont(new Font("Roboto", Font.PLAIN, 14));
    }//GEN-LAST:event_volver3MouseEntered

    private void volver3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver3MouseExited
        volver.setFont(new Font("Roboto", Font.PLAIN, 12));
    }//GEN-LAST:event_volver3MouseExited

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
                java.util.logging.Logger.getLogger(actiAdministroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(actiAdministroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(actiAdministroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(actiAdministroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new actiAdministroDocente().setVisible(true);
                }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro actividades;
    private javax.swing.JLabel btnDescargarLista;
    private javax.swing.JLabel btnEvaluarAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel volver;
    private javax.swing.JLabel volver3;
    // End of variables declaration//GEN-END:variables
}
