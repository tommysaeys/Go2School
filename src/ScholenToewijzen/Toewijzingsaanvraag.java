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
public class Toewijzingsaanvraag {
    private String rijksregisternummerStudent;
    private int toewijzingsaanvraagnummer;
    private String naamSchoolKeuze1;
    private String naamSchoolKeuze2;
    private int afstandTotSchool2;
    private boolean gezinInSchool2;
    private String naamSchoolKeuze3;
    private int afstandTotSchool3;
    private boolean gezinInSchool3;
    private int scoreSchool2;
    private int scoreSchool3;
    private String toegekendeSchool;

    public Toewijzingsaanvraag(String rijksregisternummerStudent, String naamSchoolKeuze1, 
            String naamSchoolKeuze2, int afstandTotSchool2, boolean gezinInSchool2,  
            String naamSchoolKeuze3, int afstandTotSchool3, boolean gezinInSchool3, 
            String toegekendeSchool) {
        this.rijksregisternummerStudent = rijksregisternummerStudent;
        this.naamSchoolKeuze1 = naamSchoolKeuze1;
        this.naamSchoolKeuze2 = naamSchoolKeuze2;
        if (naamSchoolKeuze2 != null)
            scoreSchool2 = berekenScore(afstandTotSchool2, gezinInSchool2);
        this.afstandTotSchool2 = afstandTotSchool2;
        this.gezinInSchool2 = gezinInSchool2;       
        this.naamSchoolKeuze3 = naamSchoolKeuze3;
        this.afstandTotSchool3 = afstandTotSchool3;
        if(naamSchoolKeuze3 != null)
            scoreSchool3 = berekenScore(afstandTotSchool3, gezinInSchool3);
        this.gezinInSchool3 = gezinInSchool3;
            
        this.toegekendeSchool = toegekendeSchool;
    }
    public static int berekenScore(int afstand, boolean broersOfZussen)
    {
        int scoreBroersOfZussen;
        int scoreAfstand;
        
        scoreBroersOfZussen = (broersOfZussen? 1:0); 
        
        switch(afstand)
        {
            case 1: // minder dan 1 km
                scoreAfstand = 3;
                break;
            case 2: // tussen 1 en 5 km
                scoreAfstand = 2;
                break;
            case 3: // tussen 5 en 10km
                scoreAfstand = 1;
            default: // niets ingevuld of meer dan 10 km
                scoreAfstand = 0;
        }
        
        int score = scoreBroersOfZussen*4 + scoreAfstand;
        return score;
    }
    public String getRijksregisternummerStudent() {
        return rijksregisternummerStudent;
    }

    public int getToewijzingsaanvraagnummer() {
        return toewijzingsaanvraagnummer;
    }


    public String getNaamSchoolKeuze1() {
        return naamSchoolKeuze1;
    }

    public String getNaamSchoolKeuze2() {
        return naamSchoolKeuze2;
    }

    public int getAfstandTotSchool2() {
        return afstandTotSchool2;
    }

    public boolean isGezinInSchool2() {
        return gezinInSchool2;
    }

    public String getNaamSchoolKeuze3() {
        return naamSchoolKeuze3;
    }

    public int getAfstandTotSchool3() {
        return afstandTotSchool3;
    }

    public boolean isGezinInSchool3() {
        return gezinInSchool3;
    }

    public int getScoreSchool2() {
        return scoreSchool2;
    }

    public int getScoreSchool3() {
        return scoreSchool3;
    }

    public String getToegekendeSchool() {
        return toegekendeSchool;
    }

    public void setRijksregisternummerStudent(String rijksregisternummerStudent) {
        this.rijksregisternummerStudent = rijksregisternummerStudent;
    }

    public void setToewijzingsaanvraagnummer(int toewijzingsaanvraagnummer) {
        this.toewijzingsaanvraagnummer = toewijzingsaanvraagnummer;
    }

    public void setNaamSchoolKeuze1(String naamSchoolKeuze1) {
        this.naamSchoolKeuze1 = naamSchoolKeuze1;
    }

    public void setNaamSchoolKeuze2(String naamSchoolKeuze2) {
        this.naamSchoolKeuze2 = naamSchoolKeuze2;
    }

    public void setAfstandTotSchool2(int afstandTotSchool2) {
        this.afstandTotSchool2 = afstandTotSchool2;
    }

    public void setGezinInSchool2(boolean gezinInSchool2) {
        this.gezinInSchool2 = gezinInSchool2;
    }

    public void setNaamSchoolKeuze3(String naamSchoolKeuze3) {
        this.naamSchoolKeuze3 = naamSchoolKeuze3;
    }

    public void setAfstandTotSchool3(int afstandTotSchool3) {
        this.afstandTotSchool3 = afstandTotSchool3;
    }

    public void setGezinInSchool3(boolean gezinInSchool3) {
        this.gezinInSchool3 = gezinInSchool3;
    }

    public void setScoreSchool2(int scoreSchool2) {
        this.scoreSchool2 = scoreSchool2;
    }

    public void setScoreSchool3(int scoreSchool3) {
        this.scoreSchool3 = scoreSchool3;
    }

    public void setToegekendeSchool(String toegekendeSchool) {
        this.toegekendeSchool = toegekendeSchool;
    }

}
