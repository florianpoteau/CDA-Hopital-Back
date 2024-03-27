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
    @Column(name = "datebortie_patient")
    private Date datesortie;

}
