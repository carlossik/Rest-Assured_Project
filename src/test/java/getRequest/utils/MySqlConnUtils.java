package getRequest.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class MySqlConnUtils {

    public static Connection getMYSQLConnection()
            throws ClassNotFoundException, SQLException {
        String hostName = "proteus.burt.tel-dev.io";
        String dbName = "dspe";
        String userName = "root";
        String password = "password";
        return getMYSQLConnection();

    }
}
