/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo12;

import java.util.Arrays;

/**
 * Proposez une méthode trier() qui reçoit un tableau de nombres réels et qui le
 * trie par ordre croissant. Proposez un programme de démonstration de votre
 * méthode trier().
 *
 * @author jason
 */
public class Labo12Ex3 {

    public static void main(String[] args) {

        double[] t = {5, 3, 6, 9, 1};
        System.out.println(Arrays.toString(t));
        tirer(t);
        System.out.println(Arrays.toString(t));

    }

    public static void tirer(double[] tableau) {
        double temp;

        for (int i = 0; i < tableau.length - 1; i++) {

            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[i] > tableau[j]) {
                    temp = tableau[i];
                    tableau[i] = tableau[j];
                    tableau[j] = temp;
                }

            }

        }

    }

}
