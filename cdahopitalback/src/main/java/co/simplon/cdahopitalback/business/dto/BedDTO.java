package co.simplon.cdahopitalback.business.dto;

public class BedDTO {

    private int id;
    private int bedroomId;
    private int serviceId;
    private int patientId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBedroomId() {
        return bedroomId;
    }

    public void setBedroomId(int bedroomId) {
        this.bedroomId = bedroomId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
