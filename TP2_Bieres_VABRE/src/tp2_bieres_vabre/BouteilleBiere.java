/*
 * TP2
 * Aliénor
 * 11/10/2024
 */
package tp2_bieres_vabre;

/**
 *
 * @author alien
 */
public class BouteilleBiere{

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public BouteilleBiere( String unNom, double unDegre, String uneBrasserie) {
    
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" \n" + degreAlcool + " degres " + "\n" + "Brasserie : " + brasserie ) ;

}
    public boolean decapsuler(){
        if (!ouverte){
            ouverte = true;
            System.out.println("La biere" + nom + " est maintenant ouverte.");
        return true;
        }
        else{
            System.out.println("Erreur: biere deja ouverte");
        return false;
        }
    }
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés )" + " est ouverte ? : " ;
    if (ouverte == true ){
        chaine_a_retourner += "oui" ;
    }
    else{
        chaine_a_retourner += "non" ;
    }
    return chaine_a_retourner ;
}
    
}
