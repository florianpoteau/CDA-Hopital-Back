package co.simplon.cdahopitalback.persistance.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

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

    @Column(name = "dateBirth_patient")
    private Date datebirth;

    @Column(name = "sexe_patient", length = 20)
    private String sexe;

    @Column(name = "notel_patient")
    private int notel;

    @Column(name = "nosecu_patient")
    private int nosecu;

    @Column(name = "dateArrivee_patient")
    private Date dateArrivee;

    @Column(name = "dateSortie_patient")
    private Date dateSortie;

    @ManyToOne
    @JoinColumn(name = "id_service")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "id_bed")
    private Bed bed;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

}
