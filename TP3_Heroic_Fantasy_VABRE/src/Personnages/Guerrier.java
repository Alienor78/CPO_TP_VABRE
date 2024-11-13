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
public class Guerrier extends Personnages {
    
    Boolean cheval;
    
    public Guerrier(String nom, int vie, Boolean cheval) {
        super(nom, vie);
        this.cheval = cheval;
    }

    public void setCheval(Boolean cheval) {
        this.cheval = cheval;
    }
    
    
}
