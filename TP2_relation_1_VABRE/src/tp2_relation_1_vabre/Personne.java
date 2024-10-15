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
    
    public String Personne(String unnom, String unprenom){
        unnom = nom;
        unprenom = prenom;
    }
    @Override
    public String toString (){
        String identite;
        return identite = "La personne se nomme : " + prenom + " " + nom ;
    }
        
}
