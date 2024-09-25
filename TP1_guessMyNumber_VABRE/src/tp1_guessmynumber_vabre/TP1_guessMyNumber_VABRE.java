/*
 * TDB
 * VABRE Aliénor
 * 23   Septembre
 */
package tp1_guessmynumber_vabre;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alien
 */
public class TP1_guessMyNumber_VABRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int a = generateurAleat.nextInt(100);
        int b =0;
        
        Scanner sc = new Scanner(System.in);
       
        while (a!=b){ 
        System.out.println("choisissez un nombre entre 0 et 100 :");
        b = sc.nextInt();
        if (a<b){
            System.out.println("Trop grand");
        }
        if (a>b){
            System.out.println("Trop petit");
        }
    }
     System.out.println("Bien joue !");
    }
}
