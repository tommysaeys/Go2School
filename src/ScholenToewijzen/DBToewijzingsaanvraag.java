
package ScholenToewijzen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ilesire
 */
public class DBToewijzingsaanvraag {
    
    public static void createTable() throws SQLException, DBException
    {
        Connection con = DBConnector.Connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql ="CREATE TABLE IF NOT EXISTS `Toewijzingsaanvraag` (\n" +
            "  `Student_rijksregisternummer` char(11) NOT NULL,\n" +
            "  `Toewijzingsaanvraagnummer` int(11) NOT NULL AUTO_INCREMENT,\n" +
            "  `School_keuze1` varchar(100) NOT NULL,\n" +
            "  `School_keuze2` varchar(100) DEFAULT NULL,\n" +
            "  `Afstand_school2` int(11) NOT NULL,\n" +
            "  `Broers_zussen_school2` tinyint(1) NOT NULL,\n" +
            "  `Score_school2` int(11) DEFAULT NULL,\n" +
            "  `School_keuze3` varchar(100) DEFAULT NULL,\n" +
            "  `Afstand_school3` int(11) NOT NULL,\n" +
            "  `Broers_zussen_school3` tinyint(1) NOT NULL,\n" +
            "  `Score_school3` int(11) DEFAULT NULL,\n" +
            "  `Toegekende_school` varchar(100) DEFAULT NULL,\n" +
            "  PRIMARY KEY (`Toewijzingsaanvraagnummer`),\n" +
            "  KEY `School_keuze1` (`School_keuze1`),\n" +
            "  KEY `School_keuze2` (`School_keuze2`),\n" +
            "  KEY `School_keuze3` (`School_keuze3`),\n" +
            "  KEY `Toegekende_school` (`Toegekende_school`),\n" +
            "  KEY `Student_rijksregisternummer` (`Student_rijksregisternummer`)\n" +")";
        
       stmt.executeUpdate(sql);
       
       String relaties = "ALTER TABLE `Toewijzingsaanvraag`\n" +
        "  ADD CONSTRAINT `Toewijzingsaanvraag_ibfk_1` "
        + "FOREIGN KEY (`Student_rijksregisternummer`) REFERENCES `Student` (`Rijksregisternummer`),\n" 
        + "  ADD CONSTRAINT `Toewijzingsaanvraag_ibfk_5` FOREIGN KEY (`School_keuze1`) "
        + "REFERENCES `School` (`Naam`) ON UPDATE CASCADE,\n" 
        + "  ADD CONSTRAINT `Toewijzingsaanvraag_ibfk_6` FOREIGN KEY (`School_keuze2`) "
        + "REFERENCES `School` (`Naam`) ON UPDATE CASCADE,\n" 
        + "  ADD CONSTRAINT `Toewijzingsaanvraag_ibfk_7` FOREIGN KEY (`School_keuze3`) "
        + "REFERENCES `School` (`Naam`) ON UPDATE CASCADE,\n" 
        +"  ADD CONSTRAINT `Toewijzingsaanvraag_ibfk_8` FOREIGN KEY (`Toegekende_school`) "
        + "REFERENCES `School` (`Naam`) ON UPDATE CASCADE;";
       
       stmt.executeUpdate(relaties);
       DBConnector.closeConnection();
    }
    public static Toewijzingsaanvraag zoekAanvraag(String rijksregisternummer) throws SQLException, DBException {
        Connection con = DBConnector.Connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = "SELECT * FROM Toewijzingsaanvraag "
                + "WHERE Student_rijksregisternummer = '" + rijksregisternummer + "'";
        ResultSet srs = stmt.executeQuery(sql);
        Toewijzingsaanvraag dezeAanvraag;
        if (srs.next()) {
           dezeAanvraag = new Toewijzingsaanvraag(
                    srs.getString("Student_rijksregisternummer"),
                    srs.getString("School_keuze1"),
                    srs.getString("School_keuze2"),
                    srs.getInt("Afstand_school2"),
                    srs.getBoolean("Broers_zussen_school2"),
                    srs.getString("School_keuze3"),
                    srs.getInt("Afstand_school3"),
                    srs.getBoolean("Broers_zussen_school3"),
                    srs.getString("Toegekende_school"));
           DBConnector.closeConnection();
           return dezeAanvraag;
           
        }
        else
        {
            DBConnector.closeConnection();
            return null;
        }
    }
    
    public static void maakAanvraag(Toewijzingsaanvraag nieuweAanvraag) throws DBException, SQLException
    {
        Connection con = DBConnector.Connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = "INSERT into Toewijzingsaanvraag "
		+ "(Student_rijksregisternummer, School_keuze1, School_keuze2, Afstand_school2, Broers_zussen_school2, Score_school2, School_keuze3, "
                + "Afstand_school3, Broers_zussen_school3, Score_school3) "
                + "VALUES ('" + nieuweAanvraag.getRijksregisternummerStudent()+ "' "
                + ", '" + nieuweAanvraag.getNaamSchoolKeuze1() + "' "
                + (nieuweAanvraag.getNaamSchoolKeuze2() == null ? ", NULL " : ", '" + nieuweAanvraag.getNaamSchoolKeuze2() + "' ")
                + ", '" + nieuweAanvraag.getAfstandTotSchool2() + "' "
                + ", '" + boolToInt(nieuweAanvraag.isGezinInSchool2()) + "' "
                + ", '" + nieuweAanvraag.getScoreSchool2() + "' "
                + (nieuweAanvraag.getNaamSchoolKeuze3() == null ? ", NULL " : ", '" + nieuweAanvraag.getNaamSchoolKeuze3() + "' ")
                + ", '" + nieuweAanvraag.getAfstandTotSchool3()+ "' "
                + ", '" + boolToInt(nieuweAanvraag.isGezinInSchool3()) + "' "
                + ", '" + nieuweAanvraag.getScoreSchool3() + "')";
        
	stmt.executeUpdate(sql);
        DBConnector.closeConnection(); 
    }
    
  public static void wijzigAanvraag(Toewijzingsaanvraag nieuweAanvraag) throws DBException, SQLException
    {
        Connection con = DBConnector.Connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = "UPDATE Toewijzingsaanvraag "
		+ "SET School_keuze1= '" + nieuweAanvraag.getNaamSchoolKeuze1() + "' "
                + ", School_keuze2= " + (nieuweAanvraag.getNaamSchoolKeuze2() == null ? " NULL " : "'" + nieuweAanvraag.getNaamSchoolKeuze2() + "' ") 
                + ", Afstand_school2= '" +  nieuweAanvraag.getAfstandTotSchool2() + "' "
                + ", Broers_zussen_school2= '"+ boolToInt(nieuweAanvraag.isGezinInSchool2()) + "' "
                 +", School_keuze3= " + (nieuweAanvraag.getNaamSchoolKeuze3() == null ? " NULL " : "'" + nieuweAanvraag.getNaamSchoolKeuze3() + "' ")
                + ", Afstand_school3= '" + nieuweAanvraag.getAfstandTotSchool3()+ "' "
                + ", Broers_zussen_school3= '" + boolToInt(nieuweAanvraag.isGezinInSchool3())+ "' "
                + " WHERE Student_rijksregisternummer= '" + nieuweAanvraag.getRijksregisternummerStudent() + "' ";
        stmt.executeUpdate(sql);
        DBConnector.closeConnection(); 
    }  
  public static int boolToInt( boolean b ){
    if ( b )
        return 1;
    else
        return 0;
  }
  
  public static ArrayList<Toewijzingsaanvraag> neemAlleVrijeAanvragenMetSchoolAlsIdeKeuze(String naamSchool, int iteratie) throws DBException, SQLException
    {
        Connection con = DBConnector.Connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = "";
        switch(iteratie)
        {
            case 1:
                sql = 
                 "SELECT * FROM Toewijzingsaanvraag "
                + "WHERE Toegekende_school IS NULL "
                + "AND School_keuze1 = '" + naamSchool + "'";
                break;
            case 2:
                sql = 
                 "SELECT * FROM Toewijzingsaanvraag "
                + "WHERE Toegekende_school IS NULL "
                + "AND School_keuze2 = '" + naamSchool + "' "
                + "ORDER BY Score_school2 DESC ";
                break;
            case 3:
                sql = 
                 "SELECT * FROM Toewijzingsaanvraag "
                + "WHERE Toegekende_school IS NULL "
                + "AND School_keuze3 = '" + naamSchool + "' "
                + "ORDER BY Score_school3 DESC ";
                break;
         
        }
        ResultSet srs = stmt.executeQuery(sql); 
        ArrayList<Toewijzingsaanvraag> vrijeAanvragenMetIdeKeuzeSchool = new ArrayList<Toewijzingsaanvraag>();
        String rijksregisternummerStudent, naamSchoolKeuze1, naamSchoolKeuze2,naamSchoolKeuze3, toegewezenSchool;
        int afstandTotSchool2,afstandTotSchool3;
        boolean gezinInSchool2,gezinInSchool3;
        
        while(srs.next())
        {
           rijksregisternummerStudent = srs.getString("Student_rijksregisternummer");
           naamSchoolKeuze1 = srs.getString("School_keuze1");
           naamSchoolKeuze2 = srs.getString("School_keuze2");
           afstandTotSchool2 = srs.getInt("Afstand_school2");
           gezinInSchool2 = srs.getBoolean("Broers_zussen_school2");
           naamSchoolKeuze3 = srs.getString("School_keuze3");
           afstandTotSchool3 = srs.getInt("Afstand_school3");
           gezinInSchool3 = srs.getBoolean("Broers_zussen_school3");
           toegewezenSchool = srs.getString("Toegekende_school");
           Toewijzingsaanvraag dezeAanvraag = new Toewijzingsaanvraag(rijksregisternummerStudent, naamSchoolKeuze1,
           naamSchoolKeuze2, afstandTotSchool2, gezinInSchool2, naamSchoolKeuze3, afstandTotSchool3,
                   gezinInSchool3, toegewezenSchool);
           vrijeAanvragenMetIdeKeuzeSchool.add(dezeAanvraag);
        }
        
        DBConnector.closeConnection();
        return vrijeAanvragenMetIdeKeuzeSchool;
    }

     public static void toewijzenVoorkeur(School School, Toewijzingsaanvraag t) throws DBException, SQLException{
        Connection con = DBConnector.Connect();
        String RRNStudent=t.getRijksregisternummerStudent();
        String naamSchool= School.getNaamSchool();
        String toewijsQuery= "UPDATE Toewijzingsaanvraag, "
                + "School SET Toewijzingsaanvraag.Toegekende_school= '" + naamSchool
                + "',School.Aantal_plaatsen= Aantal_plaatsen -1 "
                + "where Toewijzingsaanvraag.Student_rijksregisternummer='"+RRNStudent
                + "' and School.Naam='"+ naamSchool +"'";
        
        PreparedStatement preparedStmt = con.prepareStatement(toewijsQuery);
        preparedStmt.executeUpdate();
        DBConnector.closeConnection();
     
    }
     
     public static ArrayList<Student> zoekAanvragenMetToegekendeSchool(String naamSchool) throws DBException, SQLException
     {
       Connection con = DBConnector.Connect();
       Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
       String sql = 
                "SELECT Rijksregisternummer, Voornaam, Familienaam, Telefoonnummer, Mailadres_Ouder "
               + "FROM `Student` "
               + "INNER JOIN Toewijzingsaanvraag "
               + "ON Student.Rijksregisternummer = Toewijzingsaanvraag.Student_rijksregisternummer "
               + "WHERE Toewijzingsaanvraag.Toegekende_school = '" + naamSchool + "'";

       
       ResultSet srs = stmt.executeQuery(sql); 
       ArrayList<Student> studentenVanSchool = new ArrayList<Student>();
       String RRNStudent, voornaam, familienaam, telefoonnummer, mailadresOuder;
       while(srs.next())
       {
         RRNStudent = srs.getString("Rijksregisternummer");
         voornaam = srs.getString("Voornaam");
         familienaam = srs.getString("Familienaam");
         telefoonnummer = srs.getString("Telefoonnummer");
         mailadresOuder = srs.getString("Mailadres_Ouder");
         Student dezeStudent = new Student(RRNStudent, voornaam, familienaam, telefoonnummer, mailadresOuder);
         studentenVanSchool.add(dezeStudent);
       }
        DBConnector.closeConnection();
        return studentenVanSchool;
      

     }
     
public static School geefToegekendeSchool(String rijksregisternummer) throws DBException, SQLException
{
    Connection con = DBConnector.Connect();
    Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
    String sql =  "SELECT Naam, Straat_adres, Gemeente_adres, Telefoonnummer, Website "
               + "FROM `School` "
               + "INNER JOIN Toewijzingsaanvraag "
               + "ON School.Naam = Toewijzingsaanvraag.Toegekende_school "
               + "WHERE Toewijzingsaanvraag.Student_rijksregisternummer = '" + rijksregisternummer + "'";
    ResultSet srs = stmt.executeQuery(sql); 
    School dezeSchool;
    String naam = "", straat_adres = "", gemeente_adres = "", telefoonnummer = "", website = "", wachtwoord;
    int aantalplaatsen = 0;
    if(srs.next())
    {
        naam = srs.getString("Naam");
        straat_adres = srs.getString("Straat_adres");
        gemeente_adres = srs.getString("Gemeente_adres");
        telefoonnummer = srs.getString("Telefoonnummer");
        website = srs.getString("Website");  
    }
    dezeSchool = new School(naam, aantalplaatsen, straat_adres, gemeente_adres, telefoonnummer, website);
        
    DBConnector.closeConnection();

    return dezeSchool;

}

     
     
}
