/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtracteurDeMots;

import java.util.List;

/**
 *
 * @author Antoine
 */
public class Extracteur implements IntExtracteur {
    
    List<MotExtrait> texte;
    
    public Extracteur(String Fichier){
        
    }
    
    @Override
    public MotExtrait motSuivant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
