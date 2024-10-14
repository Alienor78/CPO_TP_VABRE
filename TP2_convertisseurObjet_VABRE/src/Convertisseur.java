/*
 * TP2
 * Aliénor VABRE
 * 14/10/2024
 */

/**
 *
 * @author alien
 */
public class Convertisseur {
    int nbConversions = 0;
    double CelciusVersKelvin;
    double KelvinVersCelcius;
    double CelciusVersFarenheit;
    double FarenheitVersCelcius;
    double KelvinVersFarenheit;
    double FarenheitVersKelvin;
    
    public static double CelciusVersKelvin(double tCelcius){
        tCelcius +=273;
        return(tCelcius);
   
}
    public double KelvinVersCelcius(double tKC){
        tKC -= 273;
        return(tKC);
    }
    public double CelciusVersFarenheit(double tCF){
        tCF = (tCF*9/5 +32);
        return(tCF);
    }
    public double FarenheitVersCelcius(double tFC){
        tFC = ((tFC - 32)*5/9);
        return (tFC);
    }
    public double KelvinVersFarenheit(double tKF){
        tKF = (KelvinVersCelcius(tKF)*9/5)+32;
        return tKF;
    }
    public double FarenheitVersKelvin(double tFK){
       tFK = FarenheitVersCelcius(tFK) + 273;
       return tFK;
    }
    
}
