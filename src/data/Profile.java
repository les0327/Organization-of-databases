package data;

/**
 * Created on 13.11.2016
 *
 * @author Les
 * @version 1.0
 */
public class Profile {

    private int ID;
    private String name;
    private String email;
    private String phoneNumber;
    private String gender;
    private String password;
    private String permission;

    /**
     * Constructor for profile entity
     * @param ID          - profile ID
     * @param name        - user name
     * @param email       - email of user
     * @param phoneNumber - phone number of user
     * @param gender      - user gender
     * @param password    - profile password
     * @param permission  - profile access rights
     */
    public Profile(int ID, String name, String email, String phoneNumber,
                   String gender, String password, String permission) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.password = password;
        this.permission = permission;
    }

    /**
     * Empty Constructor for profile entity
     */
    public Profile(){

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
     * Getter for field email
     *
     * @return java.lang.String value of field email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for field email
     *
     * @param email - new value for field email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for field phoneNumber
     *
     * @return java.lang.String value of field phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for field phoneNumber
     *
     * @param phoneNumber - new value for field phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for field gender
     *
     * @return java.lang.String value of field gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setter for field gender
     *
     * @param gender - new value for field gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter for field password
     *
     * @return java.lang.String value of field password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter for field password
     *
     * @param password - new value for field password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for field permission
     *
     * @return java.lang.String value of field permission
     */
    public String getPermission() {
        return permission;
    }

    /**
     * Setter for field permission
     *
     * @param permission - new value for field permission
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * Returns a string representation of the profile
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return String.format(
                "Profile: id - %d, name - %s, email - %s, password - %s, phone - %s, gender - %s, permission - %s.",
                getID(), getName(), getEmail(), getPassword(), getPhoneNumber(), getGender(), getPermission()
        );
    }
}
