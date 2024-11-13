/*
 * TP3
 * Aliénor VABRE
 * 13/11/2024
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author alien
 */
public abstract class Personnages {
    int vie =0;
    String nom;
    
        public Personnages( String nom, int vie){
        this.nom = nom;
        this.vie = vie;
    }
    
        ArrayList<Arme> sacados = new ArrayList<Arme>();
        
        public void Ajout(Arme){
            int a = sacados.size();
            if (a<6);
            sacados.add(Arme);
            
        }
        
            
    
    @Override
    public String toString (){
        String personne;
        return personne = "Le personnage s'appelle " + nom + " et a " + vie + " de vie." + "/n";
    }
}
