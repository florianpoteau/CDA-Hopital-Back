package co.simplon.cdahopitalback.persistance.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private int id;

    @Column(name = "name_patient", length = 50)
    private String name;

    @Column(name = "firstname_patient", length = 50)
    private String firstname;

    @Temporal(TemporalType.DATE)
    @Column(name = "datebirth_patient")
    private Date datebirth;

    @Column(name = "sexe_patient", length = 20)
    private String sexe;

    @Column(name = "notel_patient")
    private int notel;

    @Column(name = "nosecu_patient")
    private int nosecu;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datearrivee_patient")
    private Date datearrivee;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datesortie_patient")
    private Date datesortie;

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
     * @return the dateBirth
     */
    public Date getDatebirth() {
        return datebirth;
    }

    /**
     * 
     * @param datebirth the datebirth to set
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
     * @return the date of arrival
     */
    public Date getDatearrivee() {
        return datearrivee;
    }

    /**
     * 
     * @param datearrivee the date of arrival to set
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
}
