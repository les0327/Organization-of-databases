package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created on 28.11.2016
 *
 * @author Les
 * @version 1.0
 */
public class MySQLDaoFactory implements DaoFactory {

    /**
     * Constructor for MySQLDaoFactory
     */
    public MySQLDaoFactory() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Return connection to data base
     *
     * @return - connection to data base
     */
    @Override
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/hhh(db)", "root", "root");
    }

    /**
     * Return profileDao object to manage profiles objects
     *
     * @param connection - connection to data base
     * @return - profileDao object
     */
    @Override
    public ProfileDAO getProfileDao(Connection connection) {
        return new ProfileDAO(connection);
    }
}
