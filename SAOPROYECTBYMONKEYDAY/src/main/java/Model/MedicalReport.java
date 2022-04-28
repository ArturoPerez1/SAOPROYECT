package Model;

/**
 *
 * @author Wjose
 */
public class MedicalReport {
    private String systemic_disease;
    private String disease_respiratory;
    private String disease_cardiac;
    private String disease_digestive;
    private String disease_nervous;
    private String other_disease;

    public String getSystemic_disease() {
        return systemic_disease;
    }

    public void setSystemic_disease(String systemic_disease) {
        this.systemic_disease = systemic_disease;
    }

    public String getDisease_respiratory() {
        return disease_respiratory;
    }

    public void setDisease_respiratory(String disease_respiratory) {
        this.disease_respiratory = disease_respiratory;
    }

    public String getDisease_cardiac() {
        return disease_cardiac;
    }

    public void setDisease_cardiac(String disease_cardiac) {
        this.disease_cardiac = disease_cardiac;
    }

    public String getDisease_digestive() {
        return disease_digestive;
    }

    public void setDisease_digestive(String disease_digestive) {
        this.disease_digestive = disease_digestive;
    }

    public String getDisease_nervous() {
        return disease_nervous;
    }

    public void setDisease_nervous(String disease_nervous) {
        this.disease_nervous = disease_nervous;
    }

    public String getOther_disease() {
        return other_disease;
    }

    public void setOther_disease(String other_disease) {
        this.other_disease = other_disease;
    }
}
