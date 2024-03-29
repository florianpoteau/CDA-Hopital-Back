package co.simplon.cdahopitalback.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Entity class representing a bed in the hospital.
 */
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

}
