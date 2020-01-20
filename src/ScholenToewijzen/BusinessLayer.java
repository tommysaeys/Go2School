/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScholenToewijzen;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class BusinessLayer {
    
    private static int jaar = 2018;
    private static Month maand = Month.DECEMBER;
    private static int dag = 20;
    private static int uur = 19;
    private static int minuten = 24;
    public static LocalDateTime deadline = LocalDateTime.of(jaar, maand, dag, uur, minuten);
    public static void main(String[] args) throws Exception {
            
            try{
                GuiLogin newLogin = new GuiLogin(new BusinessLayer());
                newLogin.setVisible(true);
                newLogin.setLocationRelativeTo(null);
                DBOuder.createTable();
                DBSchool.createTable();
                DBStudent.createTable();
                DBToewijzingsaanvraag.createTable();
            }
            finally{DBConnector.closeConnection();}
       
    }  
    public boolean loginOuder(String mailadres, String ww) throws SQLException, DBException
    {
        return DBOuder.loginOuder(mailadres, ww);  
    }
    
    public boolean loginSchool(String naam, String ww) throws SQLException, DBException
    {
        return DBSchool.loginSchool(naam, ww);
    }
    
    public Ouder getOuder(String mailadres) throws DBException, SQLException
    {
        return DBOuder.getOuder(mailadres);
    }
    
    public ArrayList<Student> getStudenten(String mailadresOuder) throws SQLException, DBException
    {
        return DBStudent.zoekStudentenVanOuder(mailadresOuder);
    }
    
    public Toewijzingsaanvraag zoekAanvraag(String rijksregisternummer) throws SQLException, DBException
    {
        return DBToewijzingsaanvraag.zoekAanvraag(rijksregisternummer);
    }
    
    public void maakAanvraag(Toewijzingsaanvraag nieuweAanvraag) throws DBException, SQLException
    {
        DBToewijzingsaanvraag.maakAanvraag(nieuweAanvraag);
    }
    
    public void wijzigAanvraag(Toewijzingsaanvraag nieuweAanvraag) throws DBException, SQLException
    {
        DBToewijzingsaanvraag.wijzigAanvraag(nieuweAanvraag);
    }
    
    public ArrayList<Toewijzingsaanvraag> neemAlleVrijeAanvragenMetSchoolAlsIdeKeuze(String naamSchool, int iteratie) throws DBException, SQLException
    {
        return DBToewijzingsaanvraag.neemAlleVrijeAanvragenMetSchoolAlsIdeKeuze(naamSchool, iteratie);
    }
    
    public ArrayList<School> neemAlleScholen() throws SQLException, DBException
    {
        return DBSchool.neemAlleScholen();
    }
    
    public ArrayList<School>  neemAlleVrijeScholen() throws SQLException, DBException
    {
        return DBSchool.VrijeScholenOphalen();
    }
    public int zoekAantalPlaatsenSchool(String naam) throws DBException, SQLException
    {
        return DBSchool.zoekAantalPlaatsenSchool(naam);
    }
    
    public ArrayList<String> neemAlleSchoolNamen() throws DBException, SQLException
    {
        return DBSchool.neemAlleSchoolNamen();
    }
    
    public ArrayList<Student> zoekAanvragenMetToegekendeSchool(String naamSchool) throws DBException, SQLException
    {
        return DBToewijzingsaanvraag.zoekAanvragenMetToegekendeSchool(naamSchool);
    }
    public School geefToegekendeSchool(String rijksregisternummer) throws DBException, SQLException
    {
        return DBToewijzingsaanvraag.geefToegekendeSchool(rijksregisternummer);
    }
    }
    
   



