package mainPackages;

import controllerPackages.ControladorInicioBotones;
import viewPackages.IniciarSesionVista;

public class MainClass {

    public static void main(String[] args) {
        IniciarSesionVista sesionVista = new IniciarSesionVista();
        ControladorInicioBotones controladorInicioB = new ControladorInicioBotones();
        
        controladorInicioB.ControladorInicioBotones(sesionVista);
        
        sesionVista.setVisible(true);
        
    }
    
}
