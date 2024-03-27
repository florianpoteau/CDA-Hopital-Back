package co.simplon.cdahopitalback.business.dto;

import co.simplon.cdahopitalback.persistance.entity.Patient;
import co.simplon.cdahopitalback.persistance.entity.Service;
import co.simplon.cdahopitalback.persistance.entity.Bedroom;

public class BedDTO {

    private int id;
    private Bedroom bedroomId;
    private Service serviceId;
    private Patient patientId;

    /**
     * 
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return the bedroom
     */
    public Bedroom getBedroomId() {
        return bedroomId;
    }

    /**
     * 
     * @param bedroomId the bedroom to set
     */
    public void setBedroomId(Bedroom bedroomId) {
        this.bedroomId = bedroomId;
    }

    /**
     * 
     * @return the service
     */
    public Service getServiceId() {
        return serviceId;
    }

    /**
     * 
     * @param serviceId the service to set
     */
    public void setServiceId(Service serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * 
     * @return the patient
     */
    public Patient getPatientId() {
        return patientId;
    }

    /**
     * 
     * @param patientId the patient to set
     */
    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }
}
