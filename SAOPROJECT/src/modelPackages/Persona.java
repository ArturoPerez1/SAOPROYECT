package modelPackages;

public class Persona {
    private String _nombres;
    private String _apellidos;
    private String _numeroTelefono;
    private String _correoElectronico;
    private String _profesionPersona;
    
    
    public Persona(String nombres, String apellidos, String telefono, String correo, String profesion ) {
        this._nombres = nombres;
        this._apellidos = apellidos;
        this._numeroTelefono = telefono;
        this._correoElectronico = correo;
        this._profesionPersona = profesion;
    }

    public String getNombres() {
        return _nombres;
    }

    public void setNombres(String nombres) {
        this._nombres = nombres;
    }

    public String getApellidos() {
        return _apellidos;
    }

    public void setApellidos(String apellidos) {
        this._apellidos = apellidos;
    }

    public String getNumeroTelefono() {
        return _numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this._numeroTelefono = numeroTelefono;
    }

    public String getProfesionPersona() {
        return _profesionPersona;
    }

    public void setProfesionPersona(String profesionPersona) {
        this._profesionPersona = profesionPersona;
    }
    
    
}
