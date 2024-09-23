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
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur : ");
        a = sc.nextDouble();
        System.out.println("saisissez la conversion que vous souhaitez effectuer :" + "\n" + "1) De Celcius vers Kelvin" + "\n" + "2) de Kelvin vers Celcius" + "\n" + "3) de Celcius vers Farenheit" + "\n" + "4) de Farenheit vers Celcius" + "\n" + "5) de Kelvin vers Farenheit" + "\n" + "6) de Farenheit vers Kelvin");
        b = sc.nextDouble();
        if (b==1){
            CelciusVersKelvin(a);
            System.out.println(a + "degre Celcius est egal a " + CelciusVersKelvin(a) + "degre Kelvin.");
        }
        if (b==2){
            KelvinVersCelcius(a);
            System.out.println(a + "degre Kelvin est egal a " + KelvinVersCelcius(a) + "degre Celcius.");
        }
        if (b==3){
            CelciusVersFarenheit(a);
            System.out.println(a + "degre Celcius est egal a " + CelciusVersFarenheit(a) + "degre Farenheit.");
        }
        if (b==4){
            FarenheitVersCelcius(a);
            System.out.println(a + "degre Farenheit est egal a " + FarenheitVersCelcius(a) + "degre Celcius.");
        }
        if (b==5){
            KelvinVersFarenheit(a);
            System.out.println(a + "degre Kelvin est egal a " + KelvinVersFarenheit(a) + "degre Farenheit.");
        }
        if (b==6){
            FarenheitVersKelvin(a);
            System.out.println(a + "degre Farenheit est egal a " + FarenheitVersKelvin(a) + "degre Kelvin.");
        }
    }
    
    public static double CelciusVersKelvin(double tCelcius){
        tCelcius +=273;
        return(tCelcius);
   
}
    public static double KelvinVersCelcius(double tKC){
        tKC -= 273;
        return(tKC);
    }
    public static double CelciusVersFarenheit(double tCF){
        tCF = (tCF*9/5 +32);
        return(tCF);
    }
    public static double FarenheitVersCelcius(double tFC){
        tFC = ((tFC - 32)*5/9);
        return (tFC);
    }
    public static double KelvinVersFarenheit(double tKF){
        tKF = (KelvinVersCelcius(tKF)*9/5)+32;
        return tKF;
    }
    public static double FarenheitVersKelvin(double tFK){
       tFK = FarenheitVersCelcius(tFK) + 273;
       return tFK;
        
    }
    
}
