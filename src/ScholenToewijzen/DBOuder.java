/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScholenToewijzen;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOuder {

    public static void createTable() throws DBException, SQLException {
        Connection con = DBConnector.Connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String tabel = "CREATE TABLE IF NOT EXISTS `Ouder` (\n"
                + "  `Rijksregisternummer` char(11) NOT NULL,\n"
                + "  `Voornaam` varchar(30) NOT NULL,\n"
                + "  `Familienaam` varchar(50) NOT NULL,\n"
                + "  `Straat_adres` varchar(50) NOT NULL,\n"
                + "  `Gemeente_adres` varchar(50) NOT NULL,\n"
                + "  `Mailadres` varchar(50) NOT NULL,\n"
                + "  `Wachtwoord_ouder` varchar(20) NOT NULL,\n"
                + "  PRIMARY KEY (`Mailadres`)\n" + ") ";
        stmt.executeUpdate(tabel);
        DBConnector.closeConnection();
    }

    public static Ouder getOuder(String mailadres) throws DBException, SQLException {
        try {
            Connection con = DBConnector.Connect();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * FROM Ouder "
                    + "WHERE Mailadres = '" + mailadres + "'";

            ResultSet srs = stmt.executeQuery(sql);
            String rijksregisternummer, voornaam, familienaam, straatadres, gemeenteadres, wachtwoord;
            if (srs.next()) {
                rijksregisternummer = srs.getString("Rijksregisternummer");
                voornaam = srs.getString("Voornaam");
                familienaam = srs.getString("Familienaam");
                straatadres = srs.getString("Straat_adres");
                gemeenteadres = srs.getString("Gemeente_adres");
                wachtwoord = srs.getString("Wachtwoord_ouder");
            } else {
                DBConnector.closeConnection();
                return null;
            }

            Ouder ouder = new Ouder(mailadres, rijksregisternummer, voornaam, familienaam, straatadres, gemeenteadres, wachtwoord);
            DBConnector.closeConnection();
            return ouder;
        } catch (Exception ex) {
            ex.printStackTrace();
            DBConnector.closeConnection();
            throw new DBException(ex);
        }
    }

    public static boolean loginOuder(String mailadres, String ww) throws SQLException, DBException {
        Connection con = DBConnector.Connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

        String sql = "SELECT Mailadres, Wachtwoord_ouder "
                + "FROM Ouder "
                + "WHERE Mailadres = '" + mailadres + "'"
                + "AND Wachtwoord_ouder = '" + ww + "'";

        ResultSet srs = stmt.executeQuery(sql);
        if (srs.next()) {
            DBConnector.closeConnection();
            return true;// ga naar beginscherm
        } else {
            DBConnector.closeConnection();
            return false;// foutmelding
        }
    }

}
