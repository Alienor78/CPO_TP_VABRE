/*
 * TP3
 * Aliénor VABRE
 * 13/11/2024
 */
package Personnages;

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
    
    
    @Override
    public String toString (){
        String personne;
        return personne = "Le personnage s'appelle " + nom + " et a " + vie + " de vie." + "/n";
    }
}
