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
    public boolean ajouter_voiture(Voiture voiture_a_ajouter){
        if (voiture_a_ajouter.Propriétaire != null){
            System.out.println( "La voiture appartient deja a quelqu'un !! ");
            return false;
        }
        if (nbVoitures >=3){
            System.out.println("Le proprietaire a trop de voitures. ");
            return false;
        }
        liste_voiture[nbVoitures] = voiture_a_ajouter;  
        voiture_a_ajouter.Propriétaire = this; 
        nbVoitures++;  
        System.out.println("La voiture a ete ajoutee avec succes !");
        return true;
    }
}
