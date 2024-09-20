/*
 * TP0 Calculette
 * Vabre
 * Septembre 20
 * TDC
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author alien
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        System.out.println("Please enter the operator:" + "\n" + "1) add" + "\n" + "2) substract" +"\n" + "3) multiply" +"\n"+ "4) divide" + "\n" + "5) modulo");
        
String operateur;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer l'operateur choisi :");
operateur = sc.nextLine(); 

Int operande1;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
operande1 = sc.nextLine(); 
    }
}
    

