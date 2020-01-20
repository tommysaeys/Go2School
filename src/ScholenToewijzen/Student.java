/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScholenToewijzen;

import java.util.logging.Logger;

/**
 *
 * @author ilesire
 */
public class Student {
    private String rijksregisternummer;
    private String voornaam;
    private String familienaam;
    private String telefoonnummer;
    private String mailadresOuder;

    public Student(String rijksregisternummer, String voornaam, String familienaam, String telefoonnummer, String mailadresOuder) {
        this.rijksregisternummer = rijksregisternummer;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.telefoonnummer = telefoonnummer;
        this.mailadresOuder = mailadresOuder;
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

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public String getMailadres() {
        return mailadresOuder;
    }
}