/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;

import java.util.Scanner;

/**
 * Elaborer l’algorithme qui permet de produire une table de multiplication d’un
 * nombre n saisi au clavier. L’algorithme commence par demander à l’utilisateur
 * la valeur de n, ensuite il produit la table de multiplication de n.
 *
 * @author jason
 */
public class Labo5Ex6 {

    public static void main(String[] args) {
        int nombre, k = 1;

        nombre = saisirInt("saisir n: ");
        System.out.println("la table de multiplication de " + nombre);
        while (k <= 12) {
            System.out.println(produireMulti(nombre, k));
            k++;
        }
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

    public static String produireMulti(int i, int j) {
        return String.format("%d * %d = %d", i, j, i * j);
    }

}
