/*
 * TP1
 * VABRE
 * 27 Septembre
 */
package tp1_stats_vabre;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author alien
 */
public class TP1_stats_VABRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int m=0;
int [] tab = new int[6];

Scanner sc = new Scanner(System.in);
System.out.println("Saisir un nombre m :");
m=sc.nextInt();

Random generateurAleat = new Random();

for (int i=0; i<m ; i++){
    int a = generateurAleat.nextInt(5);
    tab[a]+= 1;
}
for (int i=0; i<6; i++){
    System.out.println( tab[i]);
}
    }
}
