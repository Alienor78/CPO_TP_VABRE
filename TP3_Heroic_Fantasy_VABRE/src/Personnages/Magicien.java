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
public class Magicien extends Personnages {
    
    Boolean confirme;
    
    public Magicien(String nom, int vie, Boolean confirme) {
        super(nom, vie);
        this.confirme = confirme;
        
    }

    public void setConfirme(Boolean confirme) {
        this.confirme = confirme;
    }
    
    
}
