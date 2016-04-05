/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ejerciciofase2.EjercicioFase2;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        Bperfil = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Mtareas = new javax.swing.JMenu();
        MIpartes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        Bperfil.setText("Perfil");
        Bperfil.setFocusable(false);
        Bperfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bperfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Bperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BperfilActionPerformed(evt);
            }
        });
        jToolBar1.add(Bperfil);

        Bsalir.setText("Salir");
        Bsalir.setFocusable(false);
        Bsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });
        jToolBar1.add(Bsalir);

        Mtareas.setText("Tareas");
        Mtareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MtareasActionPerformed(evt);
            }
        });

        MIpartes.setText("Partes");
        MIpartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIpartesActionPerformed(evt);
            }
        });
        Mtareas.add(MIpartes);

        jMenuBar1.add(Mtareas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 253, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BsalirActionPerformed

    private void BperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BperfilActionPerformed
        // TODO add your handling code here:
        EjercicioFase2.cerrarMenu();
        EjercicioFase2.mostrarCambio();
    }//GEN-LAST:event_BperfilActionPerformed

    private void MtareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MtareasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MtareasActionPerformed

    private void MIpartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIpartesActionPerformed
        // TODO add your handling code here:
        EjercicioFase2.cerrarMenu();
        EjercicioFase2.crearParte();
    }//GEN-LAST:event_MIpartesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bperfil;
    private javax.swing.JButton Bsalir;
    private javax.swing.JMenuItem MIpartes;
    private javax.swing.JMenu Mtareas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
