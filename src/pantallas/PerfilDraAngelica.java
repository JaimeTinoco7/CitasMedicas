/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

/**
 *
 * @author anghy
 */
public class PerfilDraAngelica extends javax.swing.JFrame {

    /**
     * Creates new form PerfilDraAngelica
     */
    public PerfilDraAngelica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCentral = new javax.swing.JPanel();
        lblDraAngelica = new javax.swing.JLabel();
        pnlColor = new javax.swing.JPanel();
        lblRegreso = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDraAngelica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PerfilDraAngelica.png"))); // NOI18N
        pnlCentral.add(lblDraAngelica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 430, 690));

        pnlColor.setBackground(new java.awt.Color(13, 143, 131));
        pnlColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Atraas.png"))); // NOI18N
        lblRegreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresoMouseClicked(evt);
            }
        });
        pnlColor.add(lblRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 50));

        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lista de Doctores.png"))); // NOI18N
        pnlColor.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, 220, 40));

        pnlCentral.add(pnlColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 65));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresoMouseClicked
       ListaDeDoctores3 pantalla = new ListaDeDoctores3();
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_lblRegresoMouseClicked

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
            java.util.logging.Logger.getLogger(PerfilDraAngelica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilDraAngelica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilDraAngelica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilDraAngelica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilDraAngelica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDraAngelica;
    private javax.swing.JLabel lblRegreso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlColor;
    // End of variables declaration//GEN-END:variables
}
