/*
 * TP3
 * Aliénor VABRE
 * 15/10/2024
 */
package Armes;

import Armes.Arme;

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
   
}
