package data;

/**
 * Created on 13.11.2016
 *
 * @author Les
 * @version 1.0
 */
public class WayPoint {

    private int ID;
    private WayPoint prev;
    private Point point;
    private WayPoint next;

    /**
     * Constructor for way point entity
     * @param ID    - id of way point
     * @param prev  - previous way point
     * @param point - point of this way point
     * @param next  - next way point
     */
    public WayPoint(int ID, WayPoint prev, Point point, WayPoint next) {
        this.ID = ID;
        this.prev = prev;
        this.point = point;
        this.next = next;
    }

    /**
     * Empty constructor
     */
    public WayPoint() {

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
     * Getter for field prev
     *
     * @return data.WayPoint value of field prev
     */
    public WayPoint getPrev() {
        return prev;
    }

    /**
     * Setter for field prev
     *
     * @param prev - new value for field prev
     */
    public void setPrev(WayPoint prev) {
        this.prev = prev;
    }

    /**
     * Getter for field point
     *
     * @return data.Point value of field point
     */
    public Point getPoint() {
        return point;
    }

    /**
     * Setter for field point
     *
     * @param point - new value for field point
     */
    public void setPoint(Point point) {
        this.point = point;
    }

    /**
     * Getter for field next
     *
     * @return data.WayPoint value of field next
     */
    public WayPoint getNext() {
        return next;
    }

    /**
     * Setter for field next
     *
     * @param next - new value for field next
     */
    public void setNext(WayPoint next) {
        this.next = next;
    }
}
