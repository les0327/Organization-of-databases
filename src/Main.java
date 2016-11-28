import DAO.DaoFactory;
import DAO.MySQLDaoFactory;
import DAO.ProfileDAO;
import data.Profile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * Created on 24.11.2016
 *
 * @author Les
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        DaoFactory factory = new MySQLDaoFactory();

        ProfileDAO profileDAO = null;

        try {
            profileDAO = factory.getProfileDao(factory.getConnection());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {

            System.out.println("Get all profiles from data base");
            Arrays.asList(profileDAO.getAll()).forEach(System.out::println);

            System.out.println("\nGet profile with key 2");
            Profile profile2 = profileDAO.getByKey(2);
            System.out.println(profile2);

            System.out.println("\nGet profile with key 4");
            Profile profile4 = profileDAO.getByKey(4);
            System.out.println(profile4);

            System.out.println("\nCreate new profile and save it to data base");
            Profile profile5 = new Profile(5, "Les", "les@gmail.com", "+380936645127", "male", "les", "moderator");
            profileDAO.create(profile5);

            Arrays.asList(profileDAO.getAll()).forEach(System.out::println);

            profile5.setName("Vova");
            profile5.setPermission("user");

            profileDAO.update(profile5);

            System.out.println("\nDelete from data base from data base profile with id 5");
            profileDAO.delete(5);

            System.out.println("Get all profiles from data base");
            Arrays.asList(profileDAO.getAll()).forEach(System.out::println);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
