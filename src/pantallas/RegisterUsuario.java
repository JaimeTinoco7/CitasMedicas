/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author jaime
 */
public class RegisterUsuario extends javax.swing.JFrame {

    /**
     * Creates new form InicioPantalla
     */
    public RegisterUsuario() {
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
        txtNombre = new javax.swing.JTextField();
        lblNombreF = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblMediPlus = new javax.swing.JLabel();
        lblAutomanager = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblApellidoF = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JComboBox<>();
        lblGeneroF = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblCorreoF = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblCorreo = new javax.swing.JLabel();
        lblPasswordF = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        txtPregunta = new javax.swing.JComboBox<>();
        lblPreguntaF = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        lblRespuestaF = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JLabel();
        lblRegistrarse = new javax.swing.JLabel();
        lblYaTengoCuenta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCentral.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(217, 217, 217));
        txtNombre.setBorder(null);
        pnlCentral.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 210, 20));

        lblNombreF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        pnlCentral.add(lblNombreF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 230, 40));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Medicina_logo 4.png"))); // NOI18N
        pnlCentral.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 210, 220));

        lblMediPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MediPlus+ (1).png"))); // NOI18N
        pnlCentral.add(lblMediPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 250, 40));

        lblAutomanager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/A U T O M A N A G E R (1).png"))); // NOI18N
        pnlCentral.add(lblAutomanager, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 320, 30));

        lblNombre.setText("Nombre:");
        pnlCentral.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txtApellido.setBackground(new java.awt.Color(217, 217, 217));
        txtApellido.setBorder(null);
        pnlCentral.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 210, 20));

        lblApellidoF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        pnlCentral.add(lblApellidoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 230, 40));

        lblApellido.setText("Apellidos:");
        pnlCentral.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        lblGenero.setText("Genero:");
        pnlCentral.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        txtGenero.setBackground(new java.awt.Color(217, 217, 217));
        txtGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Prefiero no decirlo", " " }));
        txtGenero.setBorder(null);
        txtGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCentral.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 210, -1));

        lblGeneroF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        pnlCentral.add(lblGeneroF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 230, 40));

        txtCorreo.setBackground(new java.awt.Color(217, 217, 217));
        txtCorreo.setBorder(null);
        pnlCentral.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 210, 20));

        lblCorreoF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        pnlCentral.add(lblCorreoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 230, 40));

        txtPassword.setBackground(new java.awt.Color(217, 217, 217));
        txtPassword.setBorder(null);
        pnlCentral.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 200, 20));

        lblCorreo.setText("Correo");
        pnlCentral.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        lblPasswordF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        pnlCentral.add(lblPasswordF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 230, 40));

        lblContraseña.setText("Contraseña:");
        pnlCentral.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        lblPregunta.setText("Pregunta de Seguridad:");
        pnlCentral.add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        txtPregunta.setBackground(new java.awt.Color(217, 217, 217));
        txtPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuál es tu nik de jugador?", "¿En qué ciudad naciste?", "¿Cuál es tu película o libro favorito?", "¿Cuál es el nombre de tu abuelo materno?" }));
        txtPregunta.setBorder(null);
        txtPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCentral.add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 210, -1));

        lblPreguntaF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        pnlCentral.add(lblPreguntaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 230, 40));

        txtRespuesta.setBackground(new java.awt.Color(217, 217, 217));
        txtRespuesta.setBorder(null);
        pnlCentral.add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 210, 20));

        lblRespuestaF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txtLogin.png"))); // NOI18N
        pnlCentral.add(lblRespuestaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 230, 40));

        lblRespuesta.setText("Respuesta:");
        pnlCentral.add(lblRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        lblRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnRegister.png"))); // NOI18N
        lblRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarse.setFocusable(false);
        lblRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseClicked(evt);
            }
        });
        pnlCentral.add(lblRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, -1, 40));

        lblYaTengoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ya tengo cuenta. Iniciar Sesión.png"))); // NOI18N
        lblYaTengoCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblYaTengoCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblYaTengoCuentaMouseClicked(evt);
            }
        });
        pnlCentral.add(lblYaTengoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 680, 220, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Direccion.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        pnlCentral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 40));

        getContentPane().add(pnlCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 440, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseClicked
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String genero = (String) txtGenero.getSelectedItem();
        String correo = txtCorreo.getText();
        String contraseña = txtPassword.getText();
        String preguntaSeguridad = (String) txtPregunta.getSelectedItem();
        String respuestaSeguridad = txtRespuesta.getText();

        if (!nombre.isEmpty() && !apellido.isEmpty() && !correo.isEmpty()
                && !contraseña.isEmpty() && !respuestaSeguridad.isEmpty()) {
            // Validación de la contraseña
            if (contraseña.length() >= 12 && contieneSimbolo(contraseña)) {
                try {
                    FileWriter fileWriter
                            = new FileWriter("usuarios.txt", true);
                    PrintWriter printWriter
                            = new PrintWriter(fileWriter);

                    printWriter.println(nombre + "," + apellido + "," + genero
                            + "," + correo + "," + contraseña + ","
                            + preguntaSeguridad + "," + respuestaSeguridad);

                    printWriter.close();

                    JOptionPane.showMessageDialog(this,
                            "Cuenta creada exitosamente", "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);

                    LoginUsuario pantalla = new LoginUsuario();
                    pantalla.setLocationRelativeTo(this);
                    pantalla.setVisible(true);
                    this.setVisible(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Error al crear la cuenta. Inténtalo de nuevo.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "La contraseña debe tener al menos 12"
                        + " caracteres y al menos 1 símbolo.",
                        "Error en la contraseña",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Completa todos los campos obligatorios",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblRegistrarseMouseClicked

    private void lblYaTengoCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYaTengoCuentaMouseClicked

        LoginUsuario pantalla = new LoginUsuario();
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblYaTengoCuentaMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        InicioPantalla pantalla = new InicioPantalla();
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private boolean contieneSimbolo(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(RegisterUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellidoF;
    private javax.swing.JLabel lblAutomanager;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreoF;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGeneroF;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMediPlus;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreF;
    private javax.swing.JLabel lblPasswordF;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblPreguntaF;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblRespuestaF;
    private javax.swing.JLabel lblYaTengoCuenta;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JComboBox<String> txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JComboBox<String> txtPregunta;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
