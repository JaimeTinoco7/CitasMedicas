/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

/**
 *
 * @author jaime
 */
public class InicioPantalla extends javax.swing.JFrame {

    /**
     * Creates new form InicioPantalla
     */
    public InicioPantalla() {
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
        lblImagen = new javax.swing.JLabel();
        lblMediPlus = new javax.swing.JLabel();
        lblAutomanager = new javax.swing.JLabel();
        lblLema = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCentral.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MediPlus_logo1.png"))); // NOI18N
        pnlCentral.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 270, 270));

        lblMediPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MediPlus+.png"))); // NOI18N
        pnlCentral.add(lblMediPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 330, 60));

        lblAutomanager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/A U T O M A N A G E R.png"))); // NOI18N
        pnlCentral.add(lblAutomanager, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 310, 30));

        lblLema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/_Brindando Cuidado y Salud de Calidad_ Mediplus, su Clínica de Confianza_.png"))); // NOI18N
        pnlCentral.add(lblLema, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 340, 90));

        lblDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnDoctorr.png"))); // NOI18N
        lblDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDoctorMouseClicked(evt);
            }
        });
        pnlCentral.add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 160, 50));

        lblPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnPacient.png"))); // NOI18N
        lblPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPacienteMouseClicked(evt);
            }
        });
        pnlCentral.add(lblPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 150, 50));

        getContentPane().add(pnlCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 440, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPacienteMouseClicked
        RegisterUsuario pantalla = new  RegisterUsuario();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(this);
        this.setVisible(false);
    }//GEN-LAST:event_lblPacienteMouseClicked

    private void lblDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoctorMouseClicked
        LoginDoctor pantalla = new  LoginDoctor();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(this);
        this.setVisible(false);
        //
    }//GEN-LAST:event_lblDoctorMouseClicked

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
            java.util.logging.Logger.getLogger(InicioPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAutomanager;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLema;
    private javax.swing.JLabel lblMediPlus;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JPanel pnlCentral;
    // End of variables declaration//GEN-END:variables
}
