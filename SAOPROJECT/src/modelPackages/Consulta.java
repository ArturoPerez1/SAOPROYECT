package modelPackages;

public class Consulta {
    private String _razonConsulta;
    private String _historiaMedica;
    private String _fechaAgendado;
    private String _fechaReagendado;

    public Consulta(String razon, String  historia, String agendado, String reagendado) {
        this._razonConsulta = razon;
        this._historiaMedica = historia;
        this._fechaAgendado = agendado;
        this._fechaReagendado = reagendado;             
    }

    public String getRazonConsulta() {
        return _razonConsulta;
    }

    public void setRazonConsulta(String razonConsulta) {
        this._razonConsulta = razonConsulta;
    }

    public String getHistoriaMedica() {
        return _historiaMedica;
    }

    public void setHistoriaMedica(String historiaMedica) {
        this._historiaMedica = historiaMedica;
    }

    public String getFechaAgendado() {
        return _fechaAgendado;
    }

    public void setFechaAgendado(String fechaAgendado) {
        this._fechaAgendado = fechaAgendado;
    }

    public String getFechaReagendado() {
        return _fechaReagendado;
    }

    public void setFechaReagendado(String fechaReagendado) {
        this._fechaReagendado = fechaReagendado;
    }
    
    
    
}
