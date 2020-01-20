/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScholenToewijzen;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ilesire
 */
public class DBSchool {
    
    public static void createTable() throws DBException, SQLException
    {
       Connection con = DBConnector.Connect();
       Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
       String sql = "CREATE TABLE IF NOT EXISTS `School` (\n" +
        "  `Naam` varchar(100) NOT NULL DEFAULT '',\n" +
        "  `Aantal_plaatsen` int(4) NOT NULL,\n" +
        "  `Straat_adres` varchar(50) NOT NULL,\n" +
        "  `Gemeente_adres` varchar(50) NOT NULL,\n" +
        "  `Wachtwoord_school` varchar(20) NOT NULL,\n" +
        "  `Telefoonnummer` char(12) NOT NULL,\n" +
        "  `Website` varchar(100) NOT NULL,\n" +
        "  PRIMARY KEY (`Naam`)\n" +")";
       stmt.executeUpdate(sql);
       DBConnector.closeConnection();
       
    }
    public static boolean loginSchool(String naam, String ww) throws SQLException, DBException {
        Connection con = DBConnector.Connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

        String sql = "SELECT Naam, Wachtwoord_school "
                + "FROM School "
                + "WHERE Naam = '" + naam + "'"
                + "AND Wachtwoord_school = '" + ww + "'";

        ResultSet srs = stmt.executeQuery(sql);
        if (srs.next()) {
            DBConnector.closeConnection();
            return true;// ga naar beginscherm
        } else {
            DBConnector.closeConnection();
            return false;// foutmelding
        }
    }
    
    public static int zoekAantalPlaatsenSchool(String naam) throws DBException, SQLException
    {
        Connection con = DBConnector.Connect();
	Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = "SELECT Aantal_plaatsen FROM School "
                + "WHERE Naam ='" + naam + "'";
                
	ResultSet srs = stmt.executeQuery(sql); 
        int aantal_plaatsen = 0;
        if(srs.next())
            aantal_plaatsen = srs.getInt("Aantal_plaatsen");
        return aantal_plaatsen;
    }
    public static ArrayList<School> neemAlleScholen() throws SQLException, DBException
    {
        Connection con = DBConnector.Connect();
	Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = "SELECT * FROM School";
	ResultSet srs = stmt.executeQuery(sql);
	ArrayList<School> alleScholen = new ArrayList<School>();
        String naam = "", voornaam = "", straatadres = "", gemeenteadres = "", telefoonnummer = "", website = "";
        int Aantalplaatsen = 0;
	while (srs.next())
        {
                naam = srs.getString("Naam");
                Aantalplaatsen = srs.getInt("Aantal_plaatsen");
                straatadres = srs.getString("Straat_adres");
                gemeenteadres = srs.getString("Gemeente_adres");
                School dezeSchool = new School(naam, Aantalplaatsen, straatadres, gemeenteadres, telefoonnummer, website);
                alleScholen.add(dezeSchool);
        }

	DBConnector.closeConnection();
	return alleScholen;
    }
    
    public static ArrayList<String> neemAlleSchoolNamen() throws DBException, SQLException
    {
        Connection con = DBConnector.Connect();
	Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = "SELECT Naam FROM School";
	ResultSet srs = stmt.executeQuery(sql);
        String naam;
        ArrayList<String> alleSchoolNamen = new ArrayList<String>();
        while(srs.next())
        {
           naam = srs.getString("Naam");
           alleSchoolNamen.add(naam);
        }
        DBConnector.closeConnection();
        return alleSchoolNamen;
    }
    
    public static ArrayList<School> VrijeScholenOphalen() throws SQLException, DBException{
        ArrayList <School> VrijeScholen = new ArrayList <School>();
        String schoolQuery = "SELECT * FROM School "
                            + "WHERE Aantal_plaatsen >0";
        Connection con = DBConnector.Connect();
        
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery(schoolQuery);
            
            String Naam; 
            int AantalPlaatsen=0; 
            String GemeenteAdres;
            String StraatAdres; 
            String wachtwoordSchool; 
            String telefoonNummer;
            String website;
            
            while (rs.next()){
                
            School school =new School();
            school.setNaamSchool(rs.getString("Naam"));
            school.setAantalPlaatsen(rs.getInt("Aantal_plaatsen"));
            school.setGemeenteAdres(rs.getString("Gemeente_adres"));
            school.setStraatAdres(rs.getString("Straat_adres"));
            school.setWachtwoord(rs.getString("Wachtwoord_school"));
            school.setTelefoonnummer(rs.getString("Telefoonnummer"));
            school.setWebsite(rs.getString("Website"));
            VrijeScholen.add(school);
            }
            DBConnector.closeConnection();
            return VrijeScholen;
        }
        
}
