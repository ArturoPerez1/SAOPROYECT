package mainPackages;

import controllerPackages.ControladorInicioBotones;
import modelPackages.IniciarSesion;
import viewPackages.IniciarSesionVista;

public class MainClass {

    public static void main(String[] args) {
        IniciarSesionVista sesionVista = new IniciarSesionVista();
        ControladorInicioBotones controladorInicioB = new ControladorInicioBotones(sesionVista);
        
        sesionVista.setVisible(true);
        
    }
    
}
