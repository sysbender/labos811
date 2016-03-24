/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo10;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Proposez un programme qui commence par demander à l’utilisateur combien il a
 * de notes à saisir. Le programme crée ensuite un tableau de la taille
 * nécessaire pour stocker toutes les notes. Le programme va ensuite lire au
 * clavier les notes et les ranger dans le tableau. Les notes sont comprises
 * entre 0 et 100. Après la saisie des notes, le programme doit : 1. Rechercher
 * la deuxième meilleure note dans le tableau et l’afficher ; 2. Trier le
 * tableau par ordre croissant des notes puis l’afficher.
 *
 * @author jason
 */
public class Labo10Ex1 {

    static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {
        int nombreNote;
        double[] tableauNote;
        double maxNote = 0, moyenneNote = 0, sommeNote = 0;
        String passNote = "";
        
        //saisir combien

        nombreNote = saisirInt("saisir nombre de note:");
        // creer des tableau
        tableauNote = new double[nombreNote];
        // trier le tableau
        for (int i = 0; i < tableauNote.length; i++) {
            tableauNote[i] = saisirDouble("Saisir Note" + (i + 1) + ":");
        }
        
        trierTableau(tableauNote);
        if (tableauNote.length >1){
            System.out.println(" le deuximem meilleur note: "+ tableauNote[tableauNote.length-2]);
        }
    }

    public static int saisirInt(String s) {
        //Scanner clavier = new Scanner(System.in);
        System.out.print(s);
        while (!clavier.hasNextInt()) {
            clavier.nextLine();
            System.out.print("S.V.P! saisir int:");

        }
        return clavier.nextInt();
    }

    public static double saisirDouble(String s) {
        System.out.print(s);
        while (!clavier.hasNextDouble()) {
            clavier.nextLine();
            System.out.println("S.V.P! un double:");
        }
        return clavier.nextDouble();

    }
    
    public static void trierTableau(double[] tDouble) {
        
        int taille;
        double temp;
     
        //boucle i
        for (int i = 0; i < tDouble.length-1; i++) {
            //boucle j
            for (int j = i+1 ; j < tDouble.length; j++) {
                if(tDouble[i] > tDouble[j]){
                    temp = tDouble[i];
                    tDouble[i] = tDouble[j];
                    tDouble[j] = temp;
                    System.out.println(Arrays.toString(tDouble));
                }
            
            }
       
        }
    
    }

}
