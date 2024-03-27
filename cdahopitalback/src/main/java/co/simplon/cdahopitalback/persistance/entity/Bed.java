package co.simplon.cdahopitalback.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bed")
public class Bed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bed")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_bedroom")
    private Bedroom bedroom;

    @ManyToOne
    @JoinColumn(name = "id_service")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "id_patient")
    private Patient patient;

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
    public Bedroom getbedroom() {
        return bedroom;
    }

    /**
     * 
     * @param bedroom the bedroom to set
     */
    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    /**
     * 
     * @return the service
     */
    public Service getService() {
        return service;
    }

    /**
     * 
     * @param service the service to set
     */
    public void setService(Service service) {
        this.service = service;
    }

    /**
     * 
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * 
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

}
