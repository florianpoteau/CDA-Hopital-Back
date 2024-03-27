package co.simplon.cdahopitalback.business.dto;

import java.util.Date;

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
