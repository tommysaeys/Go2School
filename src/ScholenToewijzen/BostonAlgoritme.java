/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScholenToewijzen;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mvnijver
 */
public class BostonAlgoritme {

    public static void main(String[] args) throws SQLException, DBException {

        for (int i = 1; i < 4; i++) { // we overlopen iteratie 1, 2 en 3
            for (School s : DBSchool.VrijeScholenOphalen()) { // we halen alle vrije scholen op en overlopen deze lijst
                String School = s.getNaamSchool();
                ArrayList<Toewijzingsaanvraag> aanvragen = DBToewijzingsaanvraag.neemAlleVrijeAanvragenMetSchoolAlsIdeKeuze(School, i);
                
                if (i == 1) // in de eerste iteratie gaan we random toewijzen
                {
                    Collections.shuffle(aanvragen); 
                    for (int j = 0; j < Math.min(s.getAantalPlaatsen(), aanvragen.size()); j++) {
                    // we wijzen de aanvragen toe, zolang er nog plaatsen in de school zijn, of zolang er aanvragen zijn
                        Toewijzingsaanvraag randomPick = aanvragen.get(j);
                        DBToewijzingsaanvraag.toewijzenVoorkeur(s, randomPick);
                    }
                } else //iteratie 2 of 3, we wijzen toe op basis van score 
                //(arraylist aanvragen is al gesorteerd obv score in klasse DBToewijzingsaanvraag!)
                {
                    for (int j = 0; j < Math.min(s.getAantalPlaatsen(), aanvragen.size()); j++) {
                        Toewijzingsaanvraag hoogsteScore = aanvragen.get(j);
                        DBToewijzingsaanvraag.toewijzenVoorkeur(s, hoogsteScore);
                    }
                }
            }

        }
    }
}
