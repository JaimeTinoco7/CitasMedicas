/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

/**
 *
 * @author jaime
 */
public class ListaDeDoctores4 extends javax.swing.JFrame {

    /**
     * Creates new form InicioPantalla
     */
    public ListaDeDoctores4() {
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
        pnlColor = new javax.swing.JPanel();
        lblRegreso = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblDoctores = new javax.swing.JLabel();
        lblPerfil1 = new javax.swing.JLabel();
        lblSacarCita1 = new javax.swing.JLabel();
        lblVerPerfil1 = new javax.swing.JLabel();
        txtDoctor1 = new javax.swing.JTextField();
        lblPerfil2 = new javax.swing.JLabel();
        lblSacarCita2 = new javax.swing.JLabel();
        lblVerPerfil2 = new javax.swing.JLabel();
        txtDoctor2 = new javax.swing.JTextField();
        cbxDoctores = new javax.swing.JComboBox<>();
        lblSiguiente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCentral.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlColor.setBackground(new java.awt.Color(13, 143, 131));
        pnlColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Atraas.png"))); // NOI18N
        pnlColor.add(lblRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 50));

        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lista de Doctores.png"))); // NOI18N
        pnlColor.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, 220, 40));

        pnlCentral.add(pnlColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 65));

        lblDoctores.setText("Doctores:");
        pnlCentral.add(lblDoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblPerfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dra.png"))); // NOI18N
        pnlCentral.add(lblPerfil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 360, 140));

        lblSacarCita1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnCitaaa.png"))); // NOI18N
        pnlCentral.add(lblSacarCita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 110, 60));

        lblVerPerfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnVeeer.png"))); // NOI18N
        pnlCentral.add(lblVerPerfil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 120, 60));

        txtDoctor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDoctor1.setFocusable(false);
        pnlCentral.add(txtDoctor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 370, 200));

        lblPerfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DrJuan.png"))); // NOI18N
        pnlCentral.add(lblPerfil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 360, 140));

        lblSacarCita2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnCitaaa.png"))); // NOI18N
        pnlCentral.add(lblSacarCita2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 110, 60));

        lblVerPerfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnVeeer.png"))); // NOI18N
        pnlCentral.add(lblVerPerfil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 120, 60));

        txtDoctor2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDoctor2.setFocusable(false);
        pnlCentral.add(txtDoctor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 370, 200));

        cbxDoctores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlCentral.add(cbxDoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 82, 250, 30));

        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSiguiente.png"))); // NOI18N
        pnlCentral.add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 110, 50));

        getContentPane().add(pnlCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ListaDeDoctores4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeDoctores4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeDoctores4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeDoctores4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeDoctores4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxDoctores;
    private javax.swing.JLabel lblDoctores;
    private javax.swing.JLabel lblPerfil1;
    private javax.swing.JLabel lblPerfil2;
    private javax.swing.JLabel lblRegreso;
    private javax.swing.JLabel lblSacarCita1;
    private javax.swing.JLabel lblSacarCita2;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVerPerfil1;
    private javax.swing.JLabel lblVerPerfil2;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlColor;
    private javax.swing.JTextField txtDoctor1;
    private javax.swing.JTextField txtDoctor2;
    // End of variables declaration//GEN-END:variables
}
