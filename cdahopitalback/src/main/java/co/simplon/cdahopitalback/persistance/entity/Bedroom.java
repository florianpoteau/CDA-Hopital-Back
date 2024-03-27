package co.simplon.cdahopitalback.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bedroom")
public class Bedroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bedroom")
    private int id;

    @Column(name = "no_bedroom")
    private int numeroChambre;

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
     * @return the room number
     */
    public int geNumerobedroom() {
        return numeroChambre;
    }

    /**
     * 
     * @param numeroChambre the room number to set
     */
    public void setBedroom(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

}
