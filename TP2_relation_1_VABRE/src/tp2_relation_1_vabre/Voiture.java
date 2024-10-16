/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_vabre;

/**
 *
 * @author alien
 */
public class Voiture {
    String modèle;
    String marque;
    int puissanceCV;
    
    Personne Propriétaire = null;
    
    public  Voiture(String unmodele, String unemarque, int unepuissance){
        this.modèle = unmodele;      
        this.marque = unemarque;     
        this.puissanceCV = unepuissance;
    }
    @Override
    public String toString (){
    String voiture_a_retourner;
    return voiture_a_retourner = "Modele : " + modèle + "\n" + "Marque : " + marque + "\n" + "Puissance : " + puissanceCV ;
    
    }
    
   
}

