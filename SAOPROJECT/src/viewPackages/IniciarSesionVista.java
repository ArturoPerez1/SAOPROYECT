package viewPackages;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class IniciarSesionVista extends javax.swing.JFrame {

    public IniciarSesionVista() {
        initComponents();
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _panelContenedor = new javax.swing.JPanel();
        panelInicioSesion = new javax.swing.JPanel();
        LogoSesion = new javax.swing.JLabel();
        iniciarSesionText = new javax.swing.JLabel();
        usuarioText = new javax.swing.JLabel();
        usuarioInputText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passwordText = new javax.swing.JLabel();
        passwordInputText = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        botonEntrar = new javax.swing.JButton();
        registraseBoton = new javax.swing.JButton();
        logoProyecto = new javax.swing.JLabel();
        projectName = new javax.swing.JLabel();
        startupNAme = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        _panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
        _panelContenedor.setLayout(null);

        panelInicioSesion.setBackground(new java.awt.Color(0, 0, 255));
        panelInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoSesion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wjose\\OneDrive\\Documents\\SAOPROJECT\\SAOPROYECT\\SAOPROJECT\\assest\\descarga (1).png")); // NOI18N
        panelInicioSesion.add(LogoSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 220, 180));

        iniciarSesionText.setFont(new java.awt.Font("Metropolis Black", 1, 36)); // NOI18N
        iniciarSesionText.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesionText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iniciarSesionText.setText("INICIAR SESIÓN");
        panelInicioSesion.add(iniciarSesionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 350, 30));

        usuarioText.setBackground(new java.awt.Color(204, 255, 255));
        usuarioText.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(255, 255, 255));
        usuarioText.setText("USUARIO :");
        panelInicioSesion.add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, 30));

        usuarioInputText.setFont(new java.awt.Font("Metropolis Black", 1, 15)); // NOI18N
        panelInicioSesion.add(usuarioInputText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 320, 40));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        panelInicioSesion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 442, 360, 10));

        passwordText.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setText("CONTRASEÑA :");
        panelInicioSesion.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 160, 30));

        passwordInputText.setFont(new java.awt.Font("Metropolis Black", 1, 15)); // NOI18N
        passwordInputText.setEchoChar('*');
        panelInicioSesion.add(passwordInputText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 320, 40));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        panelInicioSesion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 592, 370, 10));

        botonEntrar.setBackground(new java.awt.Color(255, 255, 255));
        botonEntrar.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        botonEntrar.setForeground(new java.awt.Color(153, 153, 153));
        botonEntrar.setText("Entrar");
        botonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelInicioSesion.add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 700, 170, 40));

        registraseBoton.setBackground(new java.awt.Color(0, 0, 255));
        registraseBoton.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        registraseBoton.setForeground(new java.awt.Color(255, 255, 255));
        registraseBoton.setText("¿DESEA REGISTRARSE?");
        registraseBoton.setBorder(null);
        registraseBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelInicioSesion.add(registraseBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 830, 390, -1));

        _panelContenedor.add(panelInicioSesion);
        panelInicioSesion.setBounds(0, 0, 560, 1000);

        logoProyecto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wjose\\OneDrive\\Documents\\SAOPROJECT\\SAOPROYECT\\SAOPROJECT\\assest\\0f1f99b40c76ee889ea6cc6960862e43-logotipo-de-mono-mono.png")); // NOI18N
        _panelContenedor.add(logoProyecto);
        logoProyecto.setBounds(1070, 100, 490, 420);

        projectName.setFont(new java.awt.Font("Metropolis Black", 1, 48)); // NOI18N
        projectName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectName.setText("SAOPROJECT");
        _panelContenedor.add(projectName);
        projectName.setBounds(1110, 560, 440, 50);

        startupNAme.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        startupNAme.setForeground(new java.awt.Color(204, 204, 204));
        startupNAme.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        startupNAme.setText("BY MONKEYDAY");
        _panelContenedor.add(startupNAme);
        startupNAme.setBounds(1720, 940, 180, 40);

        getContentPane().add(_panelContenedor);
        _panelContenedor.setBounds(0, 0, 1920, 1000);

        setBounds(0, 0, 1937, 1046);
    }// </editor-fold>//GEN-END:initComponents
    
    public void ActioListenerBotonEntrar(ActionListener listener){
        botonEntrar.addActionListener(listener);
        registraseBoton.addActionListener(listener);
    }
    
    public void MostrarVistaInicial(){
        _panelContenedor.removeAll();       
        initComponents();
        _panelContenedor.revalidate();
        _panelContenedor.repaint();
    }
    

    private PanelRegistrarse _panelRegistrarse;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoSesion;
    private javax.swing.JPanel _panelContenedor;
    private javax.swing.JButton botonEntrar;
    private javax.swing.JLabel iniciarSesionText;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoProyecto;
    private javax.swing.JPanel panelInicioSesion;
    private javax.swing.JPasswordField passwordInputText;
    private javax.swing.JLabel passwordText;
    private javax.swing.JLabel projectName;
    private javax.swing.JButton registraseBoton;
    private javax.swing.JLabel startupNAme;
    private javax.swing.JTextField usuarioInputText;
    private javax.swing.JLabel usuarioText;
    // End of variables declaration//GEN-END:variables
    //variable defined for me
   
    public JButton getBotonEntrar() {
        return botonEntrar;
    }

    public void setBotonEntrar(JButton botonEntrar) {
        this.botonEntrar = botonEntrar;
    }

    public JPasswordField getPasswordInputText() {
        return passwordInputText;
    }

    public void setPasswordInputText(JPasswordField passwordInputText) {
        this.passwordInputText = passwordInputText;
    }

    public JTextField getUsuarioInputText() {
        return usuarioInputText;
    }

    public void setUsuarioInputText(JTextField usuarioInputText) {
        this.usuarioInputText = usuarioInputText;
    }

    public JPanel getPanelInicioSesion() {
        return panelInicioSesion;
    }

    public void setPanelInicioSesion(JPanel panelInicioSesion) {
        this.panelInicioSesion = panelInicioSesion;
    }

    public JButton getRegistraseBoton() {
        return registraseBoton;
    }

    public void setRegistraseBoton(JButton registraseBoton) {
        this.registraseBoton = registraseBoton;
    }
                 
    public void MostrarPanelRegistrarse(){
        _panelRegistrarse = new PanelRegistrarse();
        _panelRegistrarse.setSize(2010, 1080);
        _panelRegistrarse.setLocation(0, 0);
        _panelContenedor.removeAll();
        _panelContenedor.add(_panelRegistrarse, BorderLayout.CENTER);
        _panelContenedor.revalidate();
        _panelContenedor.repaint();  
    } 
    
    public PanelRegistrarse getPanelRegistrarse1() {
        return _panelRegistrarse;
    }
    
        public void setPanelRegistrarse1(PanelRegistrarse _panelRegistrarse) {
        this._panelRegistrarse = _panelRegistrarse;
    }
}

