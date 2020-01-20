/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScholenToewijzen;

/**
 *
 * @author ilesire
 */
public class Ouder {
    private String mailadres;
    private String rijksregisternummer;
    private String voornaam, familienaam;
    private String straatAdres, gemeenteAdres;
    private String wachtwoord;

    public Ouder(String mailadres, String rijksregisternummer, String voornaam, String familienaam, String straatAdres, String gemeenteAdres, String wachtwoord) {
        this.mailadres = mailadres;
        this.rijksregisternummer = rijksregisternummer;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.straatAdres = straatAdres;
        this.gemeenteAdres = gemeenteAdres;
        this.wachtwoord = wachtwoord;
    }

    public String getMailadres() {
        return mailadres;
    }

    public String getRijksregisternummer() {
        return rijksregisternummer;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public String getStraatAdres() {
        return straatAdres;
    }

    public String getGemeenteAdres() {
        return gemeenteAdres;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setMailadres(String mailadres) {
        this.mailadres = mailadres;
    }

    public void setRijksregisternummer(String rijksregisternummer) {
        this.rijksregisternummer = rijksregisternummer;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setFamilienaam(String familienaam) {
        this.familienaam = familienaam;
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
    
    
}
