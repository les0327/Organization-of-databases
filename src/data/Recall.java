package data;

import java.util.Date;

/**
 * Created on 13.11.2016
 *
 * @author Les
 * @version 1.0
 */
public class Recall {

    private float mark;
    private String description;
    private Date date;
    private Profile author;
    private Action context;

    /**
     *
     * @param mark        - mark of recall
     * @param description - description of recall
     * @param date        - date when recall was created
     * @param author      - author of recall
     * @param context     - action that author recalled
     */
    public Recall(float mark, String description, Date date, Profile author, Action context) {
        this.mark = mark;
        this.description = description;
        this.date = date;
        this.author = author;
        this.context = context;
    }

    /**
     * Empty constructor
     */
    public Recall(){

    }

    /**
     * Getter for field mark
     *
     * @return float value of field mark
     */
    public float getMark() {
        return mark;
    }

    /**
     * Setter for field mark
     *
     * @param mark - new value for field mark
     */
    public void setMark(float mark) {
        this.mark = mark;
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
     * Getter for field context
     *
     * @return data.Action value of field context
     */
    public Action getContext() {
        return context;
    }

    /**
     * Setter for field context
     *
     * @param context - new value for field context
     */
    public void setContext(Action context) {
        this.context = context;
    }
}
