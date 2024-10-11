/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    public void decapsuler(){
        if (!ouverte){
            ouverte = true;
            System.out.println("La biere" + nom + "est maintenant ouverte.");
        return true;
        }
        else{
            System.out.println("Erreur: biere deja ouverte");
        return false;
        }
    }
    
    
}
