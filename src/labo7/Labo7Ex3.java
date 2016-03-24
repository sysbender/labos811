/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo7;

import java.util.Scanner;

/**
 * Proposez un programme/algorithme qui permet de lire au clavier les notes d’un
 * groupe de plusieurs étudiants jusqu’à ce que l’utilisateur décide d’arrêter.
 * Les notes sont des nombres réels compris entre 0 et 100. À la fin de la
 * saisie des notes, le programme/algorithme doit afficher :  La meilleure note
 * ;  La plus faible note ;  La moyenne du groupe ;  Le nombre d’étudiants
 * qui ont réussi (qui ont une note supérieure ou égale à 60) ;  Le nombre
 * d’étudiants dans le groupe.
 *
 * @author jason
 */
public class Labo7Ex3 {

    static double laMeilleure = -1, laPlusFaible = 101, laMoyenne = 0, laSomme = 0;
    static int nombreReussi = 0, nombreEtudiant = 0;

    public static void main(String[] args) {
        saisirNotes();
        afficherStat();

    }

    public static void afficherStat() {
        System.out.println("----------------statistiques--------------------");
        if (nombreEtudiant >= 1) {
            System.out.println("la Meilleur Note    : " + laMeilleure);
            System.out.println("la Plus Faible note : " + laPlusFaible);
            System.out.println("La moyenne du groupe: " + laSomme / nombreEtudiant);
            System.out.println("le nombre Reussi    : " + nombreReussi);
            System.out.println("le nombre Etudiant  : " + nombreEtudiant);
        }

    }

    public static void saisirNotes() {
        double note;
        while (true) {
            note = saisirDouble("saisir note (-1 pour quitter) :");
            if (note == -1) {
                return;
            } else if (note >= 0 && note <= 100) {
                traiterNote(note);

            } else {
                System.out.println(note + ": le note n'est pas valide!");
            }

        }
    }

    public static void traiterNote(double note) {
        if (laMeilleure < note) {
            laMeilleure = note;
        }
        if (laPlusFaible > note) {
            laPlusFaible = note;
        }
        laSomme += note;
        nombreEtudiant += 1;
        if (note >= 60) {
            nombreReussi += 1;
        }

    }

    public static double saisirDouble(String s) {
        Scanner clavier = new Scanner(System.in);
        System.out.print(s);
        while (!clavier.hasNextDouble()) {
            clavier.next();
            System.out.print(s);
        }
        return clavier.nextDouble();
    }

}
