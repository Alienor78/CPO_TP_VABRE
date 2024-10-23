/*
 * TP2
 * Aliénor VABRE
 * 15/10/2024
 */
package tp3_heroic_fantasy_vabre;

/**
 *
 * @author alien
 */
public abstract class Arme {
    String nom;
    int niveau = 0;
    
    public Arme( String nom, int niveau){
        this.nom = nom;
        
        if (niveau < 0) {
            
        }else{
        this.niveau = niveau;
        }
    }
    @Override
    public String toString (){
        String arme;
        return arme = "l'arme est " + nom + " et est de niveau " + niveau;
    }
}
