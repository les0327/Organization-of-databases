package data;

import java.util.Date;

/**
 * Created on 13.11.2016
 *
 * @author Les
 * @version 1.0
 */
public class Advert {

    private int ID;
    private String name;
    private String description;
    private String type;
    private Date creation;
    private Date end;
    private int seatNumber;
    private WayPoint start;

    /**
     * Constructor for advert entity
     * @param ID          - advert id
     * @param name        - advert name
     * @param description - advert description
     * @param type        - type of advert
     * @param creation    - date when advert was created
     * @param end         - date when advert become irrelevant
     * @param seatNumber  - max count of companions
     * @param start       - start way point
     */
    public Advert(int ID, String name, String description, String type, Date creation, Date end, int seatNumber, WayPoint start) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.type = type;
        this.creation = creation;
        this.end = end;
        this.seatNumber = seatNumber;
        this.start = start;
    }

    /**
     * Empty constructor
     */
    public Advert(){

    }

    /**
     * Getter for field ID
     *
     * @return int value of field ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Setter for field ID
     *
     * @param ID - new value for field ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Getter for field name
     *
     * @return java.lang.String value of field name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for field name
     *
     * @param name - new value for field name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for field description
     *
     * @return java.lang.String value of field description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for field description
     *
     * @param description - new value for field description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for field type
     *
     * @return java.lang.String value of field type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for field type
     *
     * @param type - new value for field type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for field creation
     *
     * @return java.util.Date value of field creation
     */
    public Date getCreation() {
        return creation;
    }

    /**
     * Setter for field creation
     *
     * @param creation - new value for field creation
     */
    public void setCreation(Date creation) {
        this.creation = creation;
    }

    /**
     * Getter for field end
     *
     * @return java.util.Date value of field end
     */
    public Date getEnd() {
        return end;
    }

    /**
     * Setter for field end
     *
     * @param end - new value for field end
     */
    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * Getter for field seatNumber
     *
     * @return int value of field seatNumber
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     * Setter for field seatNumber
     *
     * @param seatNumber - new value for field seatNumber
     */
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * Getter for field start
     *
     * @return data.WayPoint value of field start
     */
    public WayPoint getStart() {
        return start;
    }

    /**
     * Setter for field start
     *
     * @param start - new value for field start
     */
    public void setStart(WayPoint start) {
        this.start = start;
    }
}
