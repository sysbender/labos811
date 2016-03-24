/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo7;

import java.util.Scanner;

/**
 * Ecrire un programme qui affiche un menu avec 3 options de votre choix et un
 * choix Quitter. Pour chacune des 3 options, le programme affiche un message
 * différent. Après chaque affichage du menu, le programme doit lire au clavier
 * l’option choisie par l’utilisateur et afficher le message correspondant à
 * l’option. Lorsque l’utilisateur choisit une option invalide, votre programme
 * doit afficher un message d’erreur. Le programme doit refaire le cycle
 * (affichage du menu→lecture du choix→affichage du message) jusqu’à ce que
 * l’utilisateur choisisse l’option Quitter.
 *
 * @author jason
 */
public class Labo7Ex2 {

    static String[] menu = {"Pomme", "1 - Orange", "2 - Banana", "3 - Quiter"};
    static String ERREUR = "***ERREUR***, enter un entier 0-3:";

    public static void main(String[] args) {

        while (true) {
            int choix = -1;
            afficherMenu();
            choix = saisirChoix();
            if (choix == 3) {
                break;
            } else {
                System.out.println(menu[choix]);
            }

        }

    }

    public static void afficherMenu() {
        System.out.println(" -----===choisir====-------");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);

        }
        System.out.println(" -----====--------====-------");

    }

    public static int saisirChoix() {
        int c = -1;
        boolean bonChoix = false;
        do {
            c = saisirInt();
            if (c < 0 || c >= menu.length) {
                System.out.println(ERREUR);
            } else {
                bonChoix = true;
            }

        } while (!bonChoix);

        return c;
    }

    public static int saisirInt() {
        Scanner clavier = new Scanner(System.in);

        while (!clavier.hasNextInt()) {
            clavier.next();
            System.out.print(ERREUR);
        }
        return clavier.nextInt();
    }
}
