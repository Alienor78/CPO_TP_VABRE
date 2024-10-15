/*
 * TP2
 * Aliénor VABRE
 * 15/10/2024
 */
package tp2_manip_vabre;

/**
 *
 * @author alien
 */
public class TP2_manip_VABRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        
        Tartiflette assiette3 = assiette2 ; 
        //2 Tartiflettes ont été crées et assiette2 et assiette3 référence la même tartiflette.
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbcalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbcalories) ;
        
        // Q6 : la ligne 1 est correcte, la 2e ne convient pas car moussaka =/ Tartiflette.
        //NON
         Moussaka[] moussakas = new Moussaka[10];
         for (int i = 0; i < moussakas.length; i++) {
            moussakas[i] = new Moussaka(200 + (i * 100));
         }
        for (int i = 0; i < moussakas.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " : " + moussakas[i].nbcalories + " calories.");
        }
    }
    
}
