/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScholenToewijzen;

public class School {

    private String naamSchool;
    private int aantalPlaatsen;
    private String straatAdres;
    private String gemeenteAdres;
    private String wachtwoord;
    private String telefoonnummer;
    private String website;

    public School(String naamSchool, int aantalPlaatsen, String straatAdres, String gemeenteAdres, String telefoonnummer, String website) {
        this.naamSchool = naamSchool;
        this.aantalPlaatsen = aantalPlaatsen;
        this.straatAdres = straatAdres;
        this.gemeenteAdres = gemeenteAdres;
        this.telefoonnummer = telefoonnummer;
        this.website = website;
    }
    
    public School()
    {     
    }

    public String getNaamSchool() {
        return naamSchool;
    }

    public int getAantalPlaatsen() {
        return aantalPlaatsen;
    }

    public String getStraatAdres() {
        return straatAdres;
    }

    public String getGemeenteAdres() {
        return gemeenteAdres;
    }

    public void setNaamSchool(String naamSchool) {
        this.naamSchool = naamSchool;
    }

    public void setAantalPlaatsen(int aantalPlaatsen) {
        this.aantalPlaatsen = aantalPlaatsen;
    }

    public void setStraatAdres(String straatAdres) {
        this.straatAdres = straatAdres;
    }

    public void setGemeenteAdres(String gemeenteAdres) {
        this.gemeenteAdres = gemeenteAdres;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public String getWebsite() {
        return website;
    }

}
