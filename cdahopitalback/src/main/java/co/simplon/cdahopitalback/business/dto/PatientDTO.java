package co.simplon.cdahopitalback.business.dto;

import java.sql.Timestamp;
import java.util.Date;

public class PatientDTO {

    private int id;
    private String name;
    private String username;
    private Date datebirth;
    private String sexe;
    private int notel;
    private int nosecu;
    private Timestamp datearrivee;
    private Timestamp datesortie;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Timestamp getDatearrivee() {
        return datearrivee;
    }

    public void setDatearrivee(Timestamp datearrivee) {
        this.datearrivee = datearrivee;
    }

    public Timestamp getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(Timestamp datesortie) {
        this.datesortie = datesortie;
    }

}
