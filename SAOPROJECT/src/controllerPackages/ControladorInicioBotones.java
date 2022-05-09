package controllerPackages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewPackages.IniciarSesionVista;
import viewPackages.PanelRegistrarse;

public class ControladorInicioBotones {
    private IniciarSesionVista _sesionVista;
    private PanelRegistrarse _panelRegistrarse;
    
    
    public void ControladorInicioBotones(IniciarSesionVista sesionVista) {
        this._sesionVista = sesionVista;
        _sesionVista.ActioListenerBotonEntrar(new listenersInicio());
    }
    
    public class listenersInicio implements ActionListener{
        public void actionPerformed(ActionEvent eventoSesionVista) {

            try {
                if(eventoSesionVista.getSource() == _sesionVista.getBotonEntrar()){
                    System.out.println("hola");
                }else if(eventoSesionVista.getSource() == _sesionVista.getRegistraseBoton()){
                     _sesionVista.MostrarPanelRegistrarse();
                     _panelRegistrarse = _sesionVista.getPanelRegistrarse1();
                     _panelRegistrarse.ActionListnerBotonRegistrar(new listenersInicio());
                     _panelRegistrarse.ActionLsitenerBotonVolver(new listenersInicio());
                }else if(eventoSesionVista.getSource() == _panelRegistrarse.getBotonRegistrar()){
                   _sesionVista.MostrarVistaInicial();
                   ControladorInicioBotones(_sesionVista);
                }else if(eventoSesionVista.getSource() == _panelRegistrarse.getBotonVolver()){
                    _sesionVista.MostrarVistaInicial();
                    ControladorInicioBotones(_sesionVista);
                }
            }catch (Error e) {
		System.out.println("Error" + e);
            }
        }
    }
   
}
