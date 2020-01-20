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
import java.util.ArrayList;

/**
 *
 * @author ilesire
 */
public class DBStudent {
    
    public static void createTable() throws SQLException, DBException
    {
        Connection con = DBConnector.Connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String tabel = "CREATE TABLE IF NOT EXISTS `Student` (\n" +
            "  `Rijksregisternummer` char(11) NOT NULL,\n" +
            "  `Voornaam` varchar(30) NOT NULL,\n" +
            "  `Familienaam` varchar(50) NOT NULL,\n" +
            "  `Telefoonnummer` char(12) NOT NULL,\n" +
            "  `Mailadres_Ouder` varchar(50) NOT NULL,\n" +
            "  PRIMARY KEY (`Rijksregisternummer`),\n" +
            "  KEY `Mailadres_Ouder` (`Mailadres_Ouder`)\n" + ")";
        
       stmt.executeUpdate(tabel);
       String relaties = "ALTER TABLE `Student`\n" +
        "  ADD CONSTRAINT `Student_ibfk_2` FOREIGN KEY (`Mailadres_Ouder`) "
        + "REFERENCES `Ouder` (`Mailadres`) ON UPDATE CASCADE;";
       stmt.executeUpdate(relaties);
       DBConnector.closeConnection();
    }
  
   public static Student zoekStudent(String rijksregisternummer) throws SQLException {
        Connection con = DBConnector.getConnection();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = "SELECT * FROM Student "
                + "WHERE Rijksregisternummer = '" + rijksregisternummer + "'";
        ResultSet srs = stmt.executeQuery(sql);
        String voornaam, familienaam, telefoonnummer, mailadresOuder;
        Student dezeStudent = null;
        if (srs.next()) {
            voornaam = srs.getString("Voornaam");
            familienaam = srs.getString("Familienaam");
            telefoonnummer = srs.getString("Telefoonnummer");
            mailadresOuder = srs.getString("Mailadres_Ouder");
            dezeStudent = new Student(rijksregisternummer, voornaam, familienaam, 
                    telefoonnummer, mailadresOuder);
        }
        return dezeStudent;

    }

    public static ArrayList<Student> zoekStudentenVanOuder(String mailadresOuder) throws SQLException, DBException {
        Connection con = DBConnector.Connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = "SELECT * FROM Student "
                + "WHERE Mailadres_Ouder = '" + mailadresOuder + "'";
        ResultSet srs = stmt.executeQuery(sql);
        ArrayList<Student> kinderen = new ArrayList<Student>();
        while (srs.next()) {
            Student newStudent = new Student(
                    srs.getString("Rijksregisternummer"),
                    srs.getString("Voornaam"),
                    srs.getString("Familienaam"),
                    srs.getString("Telefoonnummer"),
                    srs.getString("Mailadres_Ouder"));
            kinderen.add(newStudent);
        }
        DBConnector.closeConnection();
        return kinderen;
    }
}
