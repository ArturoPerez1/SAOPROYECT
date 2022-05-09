package controllerPackages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewPackages.IniciarSesionVista;

public class ControladorInicioBotones {
    private IniciarSesionVista _sesionVista;
    public ControladorInicioBotones(IniciarSesionVista sesionVista) {
        this._sesionVista = sesionVista;
        _sesionVista.ActioListenerBotonEntrar(new listenersInicio());
    }
    
    public class listenersInicio implements ActionListener{
        public void actionPerformed(ActionEvent eventoSesionVista) {

            try {
                if(eventoSesionVista.getSource() == _sesionVista.getBotonEntrar()){
                    System.out.println("hola");
                }else if(eventoSesionVista.getSource() == _sesionVista.getRegistraseBoton()){
                     System.out.println("hola hermano");
                }
            }catch (Error e) {
		System.out.println("Error" + e);
            }
        }
    }
   
}
