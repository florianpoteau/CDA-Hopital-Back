package co.simplon.cdahopitalback.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service")
    private int id;

    @Column(name = "name_service", length = 50)
    private String name;

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
}
