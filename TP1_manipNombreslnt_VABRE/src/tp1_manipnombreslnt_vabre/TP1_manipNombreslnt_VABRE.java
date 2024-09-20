/*
 * TP1
 * Vabre
 * Septembre 20
 */
package tp1_manipnombreslnt_vabre;

import java.util.Scanner;

/**
 *
 * @author alien
 */
public class TP1_manipNombreslnt_VABRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int a;
int b;
Scanner sc = new Scanner(System.in);
System.out.println("choisir un premier entier :");
a = sc.nextInt();
System.out.println("choisir un deuxieme entier :");
b = sc.nextInt();

System.out.println("Operateurs de a et b : " + "\n" + "Somme : " + (a+b) + "\n" + "Difference : " + (a-b) + "\n" + "Produit : " + (a*b));
System.out.println("Quotient : " + (a/b) + "\n" + "Reste division Euclidienne : " + (a%b));
    }
    
}
