/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo6;

import java.util.Scanner;

/**
Proposez un programme/algorithme qui demande à l’utilisateur un nombre entier n et qui
produit à l’écran la forme suivante de taille n :
+*+
+**+
+***+
+****+
+*****+
+******+
+*******+
+********+
+*********+
+**********+
* @author jason
 */
public class Labo6Ex7 {

    public static void main(String[] args) {
        int nombre;
        nombre = saisirInt("saisir entier:");
        afficherForme(nombre);
    }

    public static void afficherForme(int i) {
        String s;

        for (int j = 0; j < i; j++) {

            System.out.println(produireLigne(j+1));

        }
    }

    public static String produireLigne(int i) {
        final String SETOILE = "*";
        final String SPLUS = "+";

        String result = "+";
        for (int j = 0; j < i; j++) {

            result = result + SETOILE;

        }
        return result + "+";
    }

    public static int saisirInt(String s) {
        Scanner clavier = new Scanner(System.in);
        System.out.print(s);
        while (!clavier.hasNextInt()) {
            clavier.next();
            System.out.print(s);
        }
        return clavier.nextInt();
    }
}
