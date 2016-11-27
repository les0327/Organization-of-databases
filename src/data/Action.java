package data;

import java.util.Date;

/**
 * Created on 13.11.2016
 *
 * @author Les
 * @version 1.0
 */
public class Action {

    private int ID;
    private ActionType type;
    private Date date;
    private Profile author;
    private Profile actor;
    private Advert advert;

    /**
     * Constructor for action entity
     * @param ID     - action id
     * @param type   - type of action
     * @param date   - date when action happened
     * @param author - author of action
     * @param actor  - actor of action
     * @param advert - advert which connected with this action
     */
    public Action(int ID, ActionType type, Date date, Profile author, Profile actor, Advert advert) {
        this.ID = ID;
        this.type = type;
        this.date = date;
        this.author = author;
        this.actor = actor;
        this.advert = advert;
    }

    /**
     * Empty constructor for action entity
     */
    public Action(){

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
     * Getter for field type
     *
     * @return data.ActionType value of field type
     */
    public ActionType getType() {
        return type;
    }

    /**
     * Setter for field type
     *
     * @param type - new value for field type
     */
    public void setType(ActionType type) {
        this.type = type;
    }

    /**
     * Getter for field date
     *
     * @return java.util.Date value of field date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter for field date
     *
     * @param date - new value for field date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Getter for field author
     *
     * @return data.Profile value of field author
     */
    public Profile getAuthor() {
        return author;
    }

    /**
     * Setter for field author
     *
     * @param author - new value for field author
     */
    public void setAuthor(Profile author) {
        this.author = author;
    }

    /**
     * Getter for field actor
     *
     * @return data.Profile value of field actor
     */
    public Profile getActor() {
        return actor;
    }

    /**
     * Setter for field actor
     *
     * @param actor - new value for field actor
     */
    public void setActor(Profile actor) {
        this.actor = actor;
    }

    /**
     * Getter for field advert
     *
     * @return data.Advert value of field advert
     */
    public Advert getAdvert() {
        return advert;
    }

    /**
     * Setter for field advert
     *
     * @param advert - new value for field advert
     */
    public void setAdvert(Advert advert) {
        this.advert = advert;
    }
}
