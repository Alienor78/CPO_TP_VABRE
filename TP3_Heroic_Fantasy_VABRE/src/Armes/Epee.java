/*
 * TP3
 * Aliénor VABRE
 * 15/10/2024
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author alien
 */
public class Epee extends Arme{
    int indiceFinesse;

    /**
     *
     * @param nom
     * @param niveau : niveau de l'épée
     * @param indiceFinesse 
     */
    public Epee(String nom , int niveau, int indiceFinesse) {
        super(nom, niveau);
        this.indiceFinesse = indiceFinesse;
    }
  
}
    
    

