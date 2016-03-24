/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;

import java.util.Scanner;

/**
 * Proposez un programme/algorithme qui calcule la somme d’une série de nombres
 * entiers lus au clavier. La lecture du nombre 0 signifiera la fin de la série.
 *
 * @author jason
 */
public class Labo5Ex9 {

    public static void main(String[] args) {
        int somme = 0, k;
        do {
            k = saisirInt("saisir entier:");
            somme = somme + k;
        } while (k != 0);

        System.out.println("la somme est : " + somme);
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
