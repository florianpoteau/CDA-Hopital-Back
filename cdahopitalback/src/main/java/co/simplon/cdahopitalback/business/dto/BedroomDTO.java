package co.simplon.cdahopitalback.business.dto;

public class BedroomDTO {

    private int id;
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
    public int getNumeroChambre() {
        return numeroChambre;
    }

    /**
     * 
     * @param numeroChambre the room number to set
     */
    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

}
