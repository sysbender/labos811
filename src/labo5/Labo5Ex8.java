/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;

import java.util.Scanner;

/**
 * Proposez un programme/algorithme qui calcule la somme d’un certain nombre
 * d’entiers lus au clavier. Le nombre d’entiers à additionner est lu au début
 * de programme/algorithme.
 *
 * @author jason
 */
public class Labo5Ex8 {

    public static void main(String[] args) {
        int nombre, somme = 0, k = 1;
        nombre = saisirInt("saisir nombre d'entier:");
        while (k <= nombre) {
            somme = somme + saisirInt("saisir entier " + k + " :");
            k++;

        }
        System.out.println("la somme de " + k + " entier est :" + somme);

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
