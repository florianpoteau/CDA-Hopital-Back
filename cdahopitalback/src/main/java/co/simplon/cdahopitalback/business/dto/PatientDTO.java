package co.simplon.cdahopitalback.business.dto;

import java.util.Date;

import co.simplon.cdahopitalback.persistance.entity.Bed;
import co.simplon.cdahopitalback.persistance.entity.Service;

/**
 * Entity class representing a patientDTO in the hospital.
 */
public class PatientDTO {

    private int id;
    private String name;
    private String firstname;
    private Date datebirth;
    private String sexe;
    private int notel;
    private int nosecu;
    private Date datearrivee;
    private Date datesortie;
    private Service serviceId;
    private Bed bedId;

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * 
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * 
     * @return the birth date
     */
    public Date getDatebirth() {
        return datebirth;
    }

    /**
     * 
     * @param datebirth the birthdate to set
     */
    public void setDatebirth(Date datebirth) {
        this.datebirth = datebirth;
    }

    /**
     * 
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * 
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * 
     * @return the phone number
     */
    public int getNotel() {
        return notel;
    }

    /**
     * 
     * @param notel the phone number to set
     */
    public void setNotel(int notel) {
        this.notel = notel;
    }

    /**
     * 
     * @return the social security number
     */
    public int getNosecu() {
        return nosecu;
    }

    /**
     * 
     * @param nosecu the social security number to set
     */
    public void setNosecu(int nosecu) {
        this.nosecu = nosecu;
    }

    /**
     * 
     * @return Date of arrival
     */
    public Date getDatearrivee() {
        return datearrivee;
    }

    /**
     * 
     * @param datearrivee Date of arrival to set
     */
    public void setDatearrivee(Date datearrivee) {
        this.datearrivee = datearrivee;
    }

    /**
     * 
     * @return the release date
     */
    public Date getDatesortie() {
        return datesortie;
    }

    /**
     * 
     * @param datesortie the release date to set
     */
    public void setDatesortie(Date datesortie) {
        this.datesortie = datesortie;
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
     * @return the bed
     */
    public Bed getBedId() {
        return bedId;
    }

    /**
     * 
     * @param bedId the bed to set
     */
    public void setBedId(Bed bedId) {
        this.bedId = bedId;
    }

}
