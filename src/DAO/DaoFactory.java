package DAO;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created on 27.11.2016
 *
 * @author Les
 * @version 1.0
 */
public interface DaoFactory {

    /**
     * Return connection to data base
     * @return - connection to data base
     * @throws SQLException on data base errors
     */
    Connection getConnection() throws SQLException;

    /**
     * Return profileDao object to manage profiles objects
     * @param connection - connection to data base
     * @return - profileDao object
     */
    ProfileDAO getProfileDao(Connection connection);
}
