package DAO;

import data.Profile;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created on 24.11.2016
 *
 * @author Les
 * @version 1.0
 */
public class ProfileDAO implements GenericDAO<Profile, Integer> {

    private Connection connection;

    /**
     * Constructor for ProfileDAO object
     * @param connection - connection to data base
     */
    public ProfileDAO(Connection connection){
        this.connection = connection;
    }

    /**
     * Allows to get all profiles from data base
     *
     * @return array with all entities
     * @throws SQLException on data base errors
     */
    @Override
    public Profile[] getAll() throws SQLException {
        ArrayList<Profile> profiles = new ArrayList<>();

        String query = "SELECT profile.id, profile.name, profile.email, profile.phone, gender.gender, profile.password, permission.permission\n" +
                "FROM profile\n" +
                "JOIN gender ON profile.gender_id = gender.id\n" +
                "JOIN permission ON profile.permission_id = permission.id;";

        try(Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query)){

            while(rs.next()){
                profiles.add(new Profile(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("password"),
                        rs.getString("permission")
                        ));
            }
        }

        return profiles.toArray(new Profile[profiles.size()]);
    }

    /**
     * Allows to get entity by key
     *
     * @param key - primary key of entity
     * @return entity with current key
     * @throws SQLException on data base errors
     */
    @Override
    public Profile getByKey(Integer key) throws SQLException {

        String query = "SELECT profile.id, profile.name, profile.email, profile.phone, gender.gender, profile.password, permission.permission\n" +
                "FROM profile\n" +
                "JOIN gender ON profile.gender_id = gender.id\n" +
                "JOIN permission ON profile.permission_id = permission.id\n" +
                "WHERE profile.id=?;";

        Profile profile = null;

        try(PreparedStatement statement = connection.prepareStatement(query);){

            statement.setInt(1, key);

            try(ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    profile = new Profile(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("phone"),
                            rs.getString("gender"),
                            rs.getString("password"),
                            rs.getString("permission")
                    );
                }
            }
        }
        return profile;
    }

    /**
     * Save entity to data base
     *
     * @param entity - entity that we want to save
     * @throws SQLException on data base errors
     */
    @Override
    public void create(Profile entity) throws SQLException {
        String query = "INSERT INTO profile VALUES (?, ?, ?, ?, ?, ?, ?);";

        try(PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, entity.getID());
            statement.setString(2, entity.getName());
            statement.setString(3, entity.getEmail());
            statement.setString(4, entity.getPhoneNumber());
            statement.setInt(5, entity.getGender().equals("male")? 1 : 2);
            statement.setString(6, entity.getPassword());
            statement.setInt(7, entity.getPermission().equals("user")? 1 : 2);

            statement.executeUpdate();
        }
    }

    /**
     * Update entity from data base
     *
     * @param entity - entity that we want to update
     * @throws SQLException on data base errors
     */
    @Override
    public void update(Profile entity) throws SQLException {

    }

    /**
     * Delete entity from data base
     *
     * @param key - primary key of entity
     * @throws SQLException on data base errors
     */
    @Override
    public void delete(Integer key) throws SQLException {
        String query = "DELETE FROM profile WHERE id = ?";

        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1, key);
            ps.executeUpdate();
        }
    }
}
