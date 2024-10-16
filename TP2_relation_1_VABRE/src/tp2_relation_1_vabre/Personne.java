/*
 * TP2
 * Aliénor VABRE
 * 15/10/2024
 */
package tp2_relation_1_vabre;

/**
 *
 * @author alien
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture [] liste_voiture;
    
    public Personne(String unnom, String unprenom){
        this.nom = unnom;
        this.prenom = unprenom;
        this.liste_voiture = new Voiture[3];
        this.nbVoitures = 0;
        
    }
    @Override
    public String toString (){
        String identite;
        return identite = "La personne se nomme : " + prenom + " " + nom ;
    }
    
}
