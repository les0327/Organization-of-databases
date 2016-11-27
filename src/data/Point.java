package data;

/**
 * Created on 13.11.2016
 *
 * @author Les
 * @version 1.0
 */
public class Point {

    private int ID;
    private String name;

    /**
     * Constructor for point entity
     * @param ID   - point id
     * @param name - point name
     */
    public Point(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    /**
     * Empty constructor
     */
    public Point(){

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
}
