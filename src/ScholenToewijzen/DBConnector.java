/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScholenToewijzen;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBConnector {

    private static final String DB_NAME = "BINFG27";
    private static final String DB_PASS = "xLweiZjs";

    public static Connection conn = null;

    public static Connection Connect() throws DBException {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            String protocol = "jdbc";
            String subProtocol = "mysql";
            String subName = "//mysqlha2.ugent.be/" + DB_NAME + "?user=" + DB_NAME + "&password=" + DB_PASS;
            String URL = protocol + ":" + subProtocol + ":" + subName;
            String myDatabase = "//mysqlha2.ugent.be/" + DB_NAME;
            String URL2 = protocol + ":" + subProtocol + ":" + myDatabase;

            //con = DriverManager.getConnection(URL);
            conn = DriverManager.getConnection(URL2, DB_NAME, DB_PASS);
            return conn;
        } catch (SQLException sqle) {
            sqle.printStackTrace(); // toont waar je zat in programma, usefull to diagnoze exception
            closeConnection();
            throw new DBException(sqle);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
            closeConnection();
            throw new DBException(cnfe);
        } catch (Exception ex) {
            ex.printStackTrace();
            closeConnection();
            throw new DBException(ex);
        }
    }

    public static void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqle) {
        }
    }

    static Connection getConnection() {
        return conn;
    }

}
