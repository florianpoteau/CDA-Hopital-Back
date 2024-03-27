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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(Date datebirth) {
        this.datebirth = datebirth;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getNotel() {
        return notel;
    }

    public void setNotel(int notel) {
        this.notel = notel;
    }

    public int getNosecu() {
        return nosecu;
    }

    public void setNosecu(int nosecu) {
        this.nosecu = nosecu;
    }

    public Date getDatearrivee() {
        return datearrivee;
    }

    public void setDatearrivee(Date datearrivee) {
        this.datearrivee = datearrivee;
    }

    public Date getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(Date datesortie) {
        this.datesortie = datesortie;
    }
}
