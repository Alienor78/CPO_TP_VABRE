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
public class TP2_relation_1_VABRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        //System.out.println("liste des voitures disponibles : " + "\n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        //bob.liste_voiture[0] = uneClio ;
        //bob.nbVoitures = 2 ;
        //uneClio.Propriétaire = bob ;
        //une2008.Propriétaire = bob ;
        //System.out.println("la premiere voiture de Bob est : " + "\n" + bob.liste_voiture[0] + "\n" + "Et sa deuxieme est : " + "\n" + bob.liste_voiture[1]) ;
        
        //reno.liste_voiture[0] = uneAutreClio ;
        //reno.liste_voiture[1] = uneMicra;
        //reno.nbVoitures = 2 ;
        //uneAutreClio.Propriétaire = reno ;
        //uneMicra.Propriétaire = reno ;
        //System.out.println("la premiere voiture de Reno est : " + "\n" + reno.liste_voiture[0] + "\n" + "Et sa deuxieme est : " + "\n" + reno.liste_voiture[1]) ;
        
        reno.ajouter_voiture(uneAutreClio);
        bob.ajouter_voiture(uneClio);
        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneMicra);
        bob.ajouter_voiture(uneMicra);
        System.out.println( "Alors, Reno possede " + reno.nbVoitures + " voitures. " + "\n" + "Et Bob possede " + bob.nbVoitures + " voitures.");
    }
    
}
