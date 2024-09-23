/*
 * TDB
 * VABRE Aliénor
 * 23 septembre
 */
package tp1_convertisseur_vabre;

import java.util.Scanner;

/**
 *
 * @author alien
 */
public class TP1_convertisseur_VABRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir une valeur de temperature en degre celsius : ");
        a = sc.nextDouble();
        
        a = a + 273;
        System.out.println("Voici la temperature en degre Kelvin : "+ a + " K");
        
    }
    
}
