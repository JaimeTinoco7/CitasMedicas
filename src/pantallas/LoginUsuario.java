/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

import entidades.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jaime
 */
public class LoginUsuario extends javax.swing.JFrame {

    /**
     * Creates new form InicioPantalla
     */
    public LoginUsuario() {
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
        txtCorreo = new javax.swing.JTextField();
        lblCorreoF = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblCorreo = new javax.swing.JLabel();
        lblPasswordF = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblIniciarSesion = new javax.swing.JLabel();
        lblOlvidasteContraseña = new javax.swing.JLabel();
        lblRegistrarse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCentral.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Medicina_logo2.png"))); // NOI18N
        pnlCentral.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 210, 220));

        lblMediPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MediPlus+ (1).png"))); // NOI18N
        pnlCentral.add(lblMediPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 250, 40));

        lblAutomanager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/A U T O M A N A G E R (1).png"))); // NOI18N
        pnlCentral.add(lblAutomanager, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 320, 30));

        txtCorreo.setBackground(new java.awt.Color(217, 217, 217));
        txtCorreo.setBorder(null);
        pnlCentral.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 210, -1));

        lblCorreoF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        pnlCentral.add(lblCorreoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 230, -1));

        txtPassword.setBackground(new java.awt.Color(217, 217, 217));
        txtPassword.setBorder(null);
        pnlCentral.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 200, -1));

        lblCorreo.setText("Correo");
        pnlCentral.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        lblPasswordF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        pnlCentral.add(lblPasswordF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 230, -1));

        lblPassword.setText("Contraseña:");
        pnlCentral.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        lblIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnLogin.png"))); // NOI18N
        lblIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIniciarSesion.setFocusable(false);
        lblIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniciarSesionMouseClicked(evt);
            }
        });
        pnlCentral.add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, -1, 40));

        lblOlvidasteContraseña.setText("¿Olvidaste tu contraseña?");
        lblOlvidasteContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOlvidasteContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOlvidasteContraseñaMouseClicked(evt);
            }
        });
        pnlCentral.add(lblOlvidasteContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 150, -1));

        lblRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/No tienes cuenta_ Registrate ahora.png"))); // NOI18N
        lblRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseClicked(evt);
            }
        });
        pnlCentral.add(lblRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 270, 20));

        getContentPane().add(pnlCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 440, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarSesionMouseClicked
        String correo = txtCorreo.getText();
        String contraseña = txtPassword.getText();

        if (!correo.isEmpty() && !contraseña.isEmpty()) {
            boolean usuarioEncontrado = false;
            Usuario usuarioAutenticado = null;
            boolean correoExistente = false;

            try (Scanner scanner = 
                    new Scanner(new File("usuarios.txt"))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] userData = line.split(",");
                    if (userData.length >= 5 && correo.equals(userData[3])
                            && contraseña.equals(userData[4])) {
                        usuarioAutenticado = new Usuario(userData[0],
                                userData[1], userData[2], userData[3]);
                        usuarioEncontrado = true;
                        break;
                    } else if (userData.length >= 5 &&
                            correo.equals(userData[3])) {
                        correoExistente = true;
                        break;
                    }
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(LoginUsuario.this,
                        "Error al abrir el archivo de usuarios.", 
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            if (usuarioEncontrado && usuarioAutenticado != null) {
                // Lógica para iniciar sesión
            } else if (correoExistente) {
                JOptionPane.showMessageDialog(LoginUsuario.this,
                        "El correo ya está registrado."
                        + " Intente con otro correo.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                // Lógica para registrar un nuevo usuario
                try (PrintWriter writer
                        = new PrintWriter(new FileWriter("usuarios.txt", 
                                true))) {
                    writer.println("Datos del nuevo usuario");
                    JOptionPane.showMessageDialog(LoginUsuario.this,
                            "Usuario registrado con éxito.", 
                            "Registro exitoso",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(LoginUsuario.this,
                            "Error al registrar el usuario.", 
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(LoginUsuario.this,
                    "Completa los campos de correo y contraseña.", 
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_lblIniciarSesionMouseClicked

    private void lblRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseClicked
        RegisterUsuario pantalla = new RegisterUsuario();
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_lblRegistrarseMouseClicked

    private void lblOlvidasteContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlvidasteContraseñaMouseClicked
        RecuperarContra pantalla = new RecuperarContra();
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblOlvidasteContraseñaMouseClicked

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
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new LoginUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAutomanager;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreoF;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblMediPlus;
    private javax.swing.JLabel lblOlvidasteContraseña;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordF;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
