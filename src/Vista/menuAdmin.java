/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.consultas;
import javax.swing.JOptionPane;


public class menuAdmin extends javax.swing.JFrame {

    private consultas consultar;
    private login metodo;

    
    public menuAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        consultar = new consultas();
        metodo = new login();
        consultar.saludo(metodo.ncontrol, metodo.usuario, lblsaludo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        cambiarContra = new javax.swing.JMenuItem();
        cerrarSesion = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        perfil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblsaludo = new javax.swing.JLabel();
        gestionarAlumnos = new javax.swing.JPanel();
        cccc1 = new javax.swing.JLabel();
        gestionarActividades = new javax.swing.JPanel();
        bbb = new javax.swing.JLabel();
        bbb1 = new javax.swing.JLabel();
        gestionarDocentes = new javax.swing.JPanel();
        cccc = new javax.swing.JLabel();

        cambiarContra.setText("CAMBIAR CONTRASEÑA");
        cambiarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContraActionPerformed(evt);
            }
        });
        jPopupMenu1.add(cambiarContra);

        cerrarSesion.setText("CERRAR SESIÓN");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        jPopupMenu1.add(cerrarSesion);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        perfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                perfilMouseEntered(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENÚ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblsaludo.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        lblsaludo.setForeground(new java.awt.Color(51, 51, 51));
        lblsaludo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblsaludo.setText("!¡");

        gestionarAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        gestionarAlumnos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        gestionarAlumnos.setForeground(new java.awt.Color(51, 51, 51));
        gestionarAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarAlumnosMouseClicked(evt);
            }
        });

        cccc1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        cccc1.setForeground(new java.awt.Color(51, 51, 51));
        cccc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cccc1.setText("ALUMNOS");

        javax.swing.GroupLayout gestionarAlumnosLayout = new javax.swing.GroupLayout(gestionarAlumnos);
        gestionarAlumnos.setLayout(gestionarAlumnosLayout);
        gestionarAlumnosLayout.setHorizontalGroup(
            gestionarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cccc1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        gestionarAlumnosLayout.setVerticalGroup(
            gestionarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarAlumnosLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(cccc1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        gestionarActividades.setBackground(new java.awt.Color(255, 255, 255));
        gestionarActividades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        gestionarActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarActividadesMouseClicked(evt);
            }
        });

        bbb.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        bbb.setForeground(new java.awt.Color(51, 51, 51));
        bbb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bbb.setText("ACTIVIDADES");

        bbb1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        bbb1.setForeground(new java.awt.Color(51, 51, 51));
        bbb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bbb1.setText("COMPLEMENTARIAS");

        javax.swing.GroupLayout gestionarActividadesLayout = new javax.swing.GroupLayout(gestionarActividades);
        gestionarActividades.setLayout(gestionarActividadesLayout);
        gestionarActividadesLayout.setHorizontalGroup(
            gestionarActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarActividadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gestionarActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bbb1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(bbb, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                .addContainerGap())
        );
        gestionarActividadesLayout.setVerticalGroup(
            gestionarActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarActividadesLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(bbb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bbb1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        gestionarDocentes.setBackground(new java.awt.Color(255, 255, 255));
        gestionarDocentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        gestionarDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarDocentesMouseClicked(evt);
            }
        });

        cccc.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        cccc.setForeground(new java.awt.Color(51, 51, 51));
        cccc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cccc.setText("DOCENTES");

        javax.swing.GroupLayout gestionarDocentesLayout = new javax.swing.GroupLayout(gestionarDocentes);
        gestionarDocentes.setLayout(gestionarDocentesLayout);
        gestionarDocentesLayout.setHorizontalGroup(
            gestionarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarDocentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cccc, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        gestionarDocentesLayout.setVerticalGroup(
            gestionarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarDocentesLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(cccc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(lblsaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addComponent(perfil)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gestionarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gestionarActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gestionarDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perfil)
                            .addComponent(lblsaludo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gestionarActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestionarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestionarDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContraActionPerformed
        cambiarContrase ventana  = new cambiarContrase();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cambiarContraActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        login ventana  = new login();
        ventana.setVisible(true);
        this.dispose();
        metodo.usuario="alumno";
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void perfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilMouseEntered
        jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
    }//GEN-LAST:event_perfilMouseEntered

    private void gestionarAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarAlumnosMouseClicked
        gestionarAlumnos ventana  = new gestionarAlumnos();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gestionarAlumnosMouseClicked

    private void gestionarActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarActividadesMouseClicked
        gestionarActividades ventana  = new gestionarActividades();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gestionarActividadesMouseClicked

    private void gestionarDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarDocentesMouseClicked
        gestionarDocentes ventana  = new gestionarDocentes();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gestionarDocentesMouseClicked

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
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bbb;
    private javax.swing.JLabel bbb1;
    private javax.swing.JMenuItem cambiarContra;
    private javax.swing.JLabel cccc;
    private javax.swing.JLabel cccc1;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JPanel gestionarActividades;
    private javax.swing.JPanel gestionarAlumnos;
    private javax.swing.JPanel gestionarDocentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblsaludo;
    private javax.swing.JLabel perfil;
    // End of variables declaration//GEN-END:variables
}
