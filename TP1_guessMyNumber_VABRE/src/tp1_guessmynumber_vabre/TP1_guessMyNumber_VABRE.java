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
        int compteur=0;
        int compteur1=0;
        int difficulte=0;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quelle difficulte choisis tu entre 1 et 3 ?");
        difficulte = sc.nextInt();
       
            
            while (a!=b && compteur1<4){
            System.out.println("choisissez un nombre entre 0 et 100 :");
            b = sc.nextInt();
            if (difficulte==1){
                if (a<b){
                System.out.println("Trop grand");
        }
                if ((a-b)>10){
                System.out.println("Beaucoup trop petit !");
                }
                
                if (a>b){
                System.out.println("Trop petit");
                }
                if ((a-b) < -10){
                System.out.println("Beaucoup trop grand !");
                }
                
           
            }
            if (difficulte==2){
                if (a<b){
                System.out.println("Trop grand");
                }
                
                if (a>b){
                System.out.println("Trop petit");
                
                
        }
            }
            if (difficulte==3){
                if (a<b){
                System.out.println("Trop grand");
                }
                
                if (a>b){
                System.out.println("Trop petit");
                }
                compteur1+=1;
                if (compteur1==4){
                System.out.println("Perdu! Le nombre de tentative a depasse 4 ");
                }
            }
               
        compteur +=1;
       
    }
     if (difficulte ==1 || difficulte ==2){
        System.out.println("Bien joue !, tu as trouve en " + compteur + " tentatives!");
              }
     }
    }
