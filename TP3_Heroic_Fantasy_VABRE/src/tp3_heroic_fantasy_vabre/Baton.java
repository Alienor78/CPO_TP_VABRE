/*
 * TP3
 * Aliénor VABRE
 * 15/10/2024
 */
package tp3_heroic_fantasy_vabre;

/**
 *
 * @author alien
 */
public class Baton extends Arme{
    int age;

    public Baton(String nom, int niveau, int age) {
        super(nom, niveau);
        this.age = age;
    }
    @Override
    public String toString (){
        String Epee;
        return Epee = "l'arme est " + nom + ", est de niveau " + niveau + " et a " + age + " ans";
}
}
