/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewPackages;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Wjose
 */
public class PanelRegistrarse extends javax.swing.JPanel {

    public PanelRegistrarse() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistrarPrincipal = new javax.swing.JPanel();
        panelRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordInput = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        confirmarPassword = new javax.swing.JLabel();
        confirmarPasswordInput = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        startUPName = new javax.swing.JLabel();
        logoProject = new javax.swing.JLabel();
        projectName = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        panelRegistrarPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistrarPrincipal.setLayout(null);

        panelRegistro.setBackground(new java.awt.Color(0, 0, 255));
        panelRegistro.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wjose\\OneDrive\\Documents\\SAOPROJECT\\SAOPROYECT\\SAOPROJECT\\assest\\descarga (1).png")); // NOI18N
        jLabel1.setText("jLabel1");
        panelRegistro.add(jLabel1);
        jLabel1.setBounds(220, 30, 220, 180);

        jLabel2.setFont(new java.awt.Font("Metropolis Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRARSE");
        panelRegistro.add(jLabel2);
        jLabel2.setBounds(190, 240, 280, 40);

        userName.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("NOMBRRE/USUARIO:");
        panelRegistro.add(userName);
        userName.setBounds(20, 400, 170, 40);

        userInput.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        panelRegistro.add(userInput);
        userInput.setBounds(260, 400, 400, 40);

        password.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("CONTRASEÑA:");
        panelRegistro.add(password);
        password.setBounds(20, 560, 130, 30);

        passwordInput.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        panelRegistro.add(passwordInput);
        passwordInput.setBounds(260, 550, 400, 40);

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        panelRegistro.add(jSeparator1);
        jSeparator1.setBounds(230, 500, 420, 10);

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        panelRegistro.add(jSeparator2);
        jSeparator2.setBounds(230, 640, 420, 20);

        confirmarPassword.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        confirmarPassword.setForeground(new java.awt.Color(255, 255, 255));
        confirmarPassword.setText("CONFIRMAR CONTRASEÑA:");
        panelRegistro.add(confirmarPassword);
        confirmarPassword.setBounds(20, 720, 210, 30);

        confirmarPasswordInput.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        panelRegistro.add(confirmarPasswordInput);
        confirmarPasswordInput.setBounds(260, 710, 400, 40);

        botonRegistrar.setBackground(new java.awt.Color(0, 0, 204));
        botonRegistrar.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(153, 153, 153));
        botonRegistrar.setText("REGISTRAR");
        panelRegistro.add(botonRegistrar);
        botonRegistrar.setBounds(250, 850, 160, 40);

        panelRegistrarPrincipal.add(panelRegistro);
        panelRegistro.setBounds(0, 0, 680, 1080);

        startUPName.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        startUPName.setForeground(new java.awt.Color(102, 102, 102));
        startUPName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        startUPName.setText("BY MONKEYDAY");
        panelRegistrarPrincipal.add(startUPName);
        startUPName.setBounds(1750, 960, 160, 30);

        logoProject.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wjose\\OneDrive\\Documents\\SAOPROJECT\\SAOPROYECT\\SAOPROJECT\\assest\\0f1f99b40c76ee889ea6cc6960862e43-logotipo-de-mono-mono.png")); // NOI18N
        panelRegistrarPrincipal.add(logoProject);
        logoProject.setBounds(1030, 230, 540, 460);

        projectName.setFont(new java.awt.Font("Metropolis Black", 1, 48)); // NOI18N
        projectName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectName.setText("SAOPROJECT");
        panelRegistrarPrincipal.add(projectName);
        projectName.setBounds(1090, 740, 440, 50);

        botonVolver.setBackground(new java.awt.Color(204, 204, 255));
        botonVolver.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(102, 102, 102));
        botonVolver.setText("VOLVER");
        botonVolver.setBorder(null);
        botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistrarPrincipal.add(botonVolver);
        botonVolver.setBounds(1820, 0, 100, 40);

        add(panelRegistrarPrincipal);
        panelRegistrarPrincipal.setBounds(0, 0, 1920, 1000);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBotonRegistrar() {
        return botonRegistrar;
    }

    public void setBotonRegistrar(JButton botonRegistrar) {
        this.botonRegistrar = botonRegistrar;
    }

    public JButton getBotonVolver() {
        return botonVolver;
    }

    public void setBotonVolver(JButton botonVolver) {
        this.botonVolver = botonVolver;
    }
    
    public void ActionListnerBotonRegistrar(ActionListener listener){
        botonRegistrar.addActionListener(listener);
    }
    
    public void ActionLsitenerBotonVolver(ActionListener listener){
        botonVolver.addActionListener(listener);
    }

      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel confirmarPassword;
    private javax.swing.JTextField confirmarPasswordInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoProject;
    private javax.swing.JPanel panelRegistrarPrincipal;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JLabel password;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JLabel projectName;
    private javax.swing.JLabel startUPName;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables


}
