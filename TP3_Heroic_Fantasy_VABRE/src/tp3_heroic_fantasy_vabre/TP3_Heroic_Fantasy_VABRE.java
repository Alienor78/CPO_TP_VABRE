/*
 * TP3
 * Aliénor VABRE
 * 15/10/2024
 */
package tp3_heroic_fantasy_vabre;

import Personnages.Personnages;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author alien
 */
public class TP3_Heroic_Fantasy_VABRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee1 = new Epee("Excalibur", 7 , 5);
        Epee epee2 = new Epee("Durandal", 4 , 7);
        
        Baton baton1 = new Baton("Chene", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 4);
        
        
        ArrayList<Arme> A = new ArrayList<Arme>();
        A.add(epee1);
        A.add(epee2);
        A.add(baton1);
        A.add(baton2);
        
        System.out.print(A);
        
        Magicien Gan = new Magicien("Gandalf", 65, true);
        Magicien Gar = new Magicien("Garcimore", 44, false);
        Guerrier Con = new Guerrier("Conan", 78, false);
        Guerrier Lan = new Guerrier("Lannister", 45, true);
        
        ArrayList<Personnages> P = new ArrayList<Personnages>();
        P.add(Gan);
        P.add(Gar);
        P.add(Con);
        P.add(Lan);
        
        System.out.println(P);
        
        
        
        
    }
    
}
