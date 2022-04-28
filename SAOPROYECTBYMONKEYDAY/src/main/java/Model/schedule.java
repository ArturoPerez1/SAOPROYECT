package Model;

/**
 *
 * @author Wjose
 */
public class schedule {
    private String day;
    private String hour;
    private String availableAppointment;
    private String rescheduled;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getAvailableAppointment() {
        return availableAppointment;
    }

    public void setAvailableAppointment(String availableAppointment) {
        this.availableAppointment = availableAppointment;
    }

    public String getRescheduled() {
        return rescheduled;
    }

    public void setRescheduled(String rescheduled) {
        this.rescheduled = rescheduled;
    }
    
    
}
