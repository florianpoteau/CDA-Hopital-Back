package co.simplon.cdahopitalback.business.dto;

import co.simplon.cdahopitalback.persistance.entity.Patient;
import co.simplon.cdahopitalback.persistance.entity.Service;
import co.simplon.cdahopitalback.persistance.entity.Bedroom;

public class BedDTO {

    private int id;
    private Bedroom bedroomId;
    private Service serviceId;
    private Patient patientId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bedroom getBedroomId() {
        return bedroomId;
    }

    public void setBedroomId(Bedroom bedroomId) {
        this.bedroomId = bedroomId;
    }

    public Service getServiceId() {
        return serviceId;
    }

    public void setServiceId(Service serviceId) {
        this.serviceId = serviceId;
    }

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }
}
