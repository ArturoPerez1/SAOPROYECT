/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Wjose
 */
public class windows extends javax.swing.JFrame { 
           
    public windows() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        logoProyecto = new javax.swing.JLabel();
        projectName = new javax.swing.JLabel();
        byMonkey = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        logoSesion = new javax.swing.JLabel();
        sesionText = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        jSeparator = new javax.swing.JSeparator();
        userText = new javax.swing.JTextField();
        userName = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        registrar = new javax.swing.JLabel();
        recuperarContraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2000, 1050));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(2000, 950));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoProyecto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wjose\\OneDrive\\Documents\\SAOPROJECT\\SAOPROYECT\\SAOPROYECTBYMONKEYDAY\\assets\\0f1f99b40c76ee889ea6cc6960862e43-logotipo-de-mono-mono.png")); // NOI18N
        panelPrincipal.add(logoProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 150, 540, 470));

        projectName.setFont(new java.awt.Font("Metropolis", 1, 60)); // NOI18N
        projectName.setForeground(new java.awt.Color(0, 0, 0));
        projectName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectName.setText("SAO PROJECT");
        panelPrincipal.add(projectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 670, 760, 80));

        byMonkey.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        byMonkey.setForeground(new java.awt.Color(204, 204, 204));
        byMonkey.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        byMonkey.setText("BY MOKEYDAY");
        panelPrincipal.add(byMonkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 940, 180, 60));

        panel1.setBackground(new java.awt.Color(0, 51, 204));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoSesion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wjose\\OneDrive\\Documents\\SAOPROJECT\\SAOPROYECT\\SAOPROYECTBYMONKEYDAY\\assets\\descarga (1).png")); // NOI18N
        logoSesion.setText("jLabel1");
        panel1.add(logoSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 220, 160));

        sesionText.setBackground(new java.awt.Color(204, 204, 255));
        sesionText.setFont(new java.awt.Font("Lucida Fax", 1, 48)); // NOI18N
        sesionText.setForeground(new java.awt.Color(204, 204, 255));
        sesionText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesionText.setText("INICIAR SESIÓN");
        panel1.add(sesionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 400, 70));

        passwordText.setBackground(new java.awt.Color(255, 255, 255));
        passwordText.setForeground(new java.awt.Color(102, 102, 102));
        passwordText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        panel1.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 700, 370, 40));

        jSeparator.setBackground(new java.awt.Color(153, 153, 153));
        panel1.add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 410, 20));

        userText.setBackground(new java.awt.Color(255, 255, 255));
        userText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });
        panel1.add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 370, 40));

        userName.setBackground(new java.awt.Color(255, 255, 255));
        userName.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(204, 204, 255));
        userName.setText("USUARIO");
        panel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 90, 40));

        password.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 255));
        password.setText("CONTRASEÑA");
        panel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 160, 40));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 410, 20));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 780, 420, 20));

        registrar.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(204, 204, 255));
        registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrar.setText("¿DESEA REGISTRARSE?");
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 910, 480, 40));

        recuperarContraseña.setFont(new java.awt.Font("Metropolis Black", 0, 18)); // NOI18N
        recuperarContraseña.setForeground(new java.awt.Color(204, 204, 255));
        recuperarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recuperarContraseña.setText("¿OLVIDASTE TU CONTRASEÑA?");
        recuperarContraseña.setToolTipText("");
        recuperarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1.add(recuperarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 850, 390, 40));

        panelPrincipal.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 1000));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1000));
        panelPrincipal.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextActionPerformed
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel byMonkey;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoProyecto;
    private javax.swing.JLabel logoSesion;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel projectName;
    private javax.swing.JLabel recuperarContraseña;
    private javax.swing.JLabel registrar;
    private javax.swing.JLabel sesionText;
    private javax.swing.JLabel userName;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables

}
