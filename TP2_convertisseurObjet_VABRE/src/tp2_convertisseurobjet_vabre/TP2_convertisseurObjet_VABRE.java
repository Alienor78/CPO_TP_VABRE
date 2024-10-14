/*
 * TP2
 * Aliénor VABRE
 * 14/10/2024
 */
package tp2_convertisseurobjet_vabre;

/**
 *
 * @author alien
 */
public class TP2_convertisseurObjet_VABRE {

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
    }
    
}
