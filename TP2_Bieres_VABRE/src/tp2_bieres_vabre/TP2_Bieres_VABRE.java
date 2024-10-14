/*
 * VABRE
 * Aliénor
 * 11/10/2024
 */
package tp2_bieres_vabre;

/**
 *
 * @author alien
 */
public class TP2_Bieres_VABRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0 ,"Dubuisson") ;
        System.out.println(uneBiere);
        uneBiere.decapsuler();
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();
        
        BouteilleBiere TroisiemeBiere = new BouteilleBiere("Goudale", 7.2 , "Brasserie Goudale");
        TroisiemeBiere.lireEtiquette();
        
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Desperados", 5.9 , "Alken-Maes") ;
        quatriemeBiere.decapsuler();
        System.out.println(quatriemeBiere);
        
        
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Tripel Karmeliet",9.2, "Bosteels" );
        cinquiemeBiere.lireEtiquette();
        
        }
    }
    

