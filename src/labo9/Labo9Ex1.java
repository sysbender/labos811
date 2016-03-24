/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo9;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Proposez un programme qui commence par demander à l’utilisateur combien il a
 * d’entiers à saisir. Le programme crée ensuite un tableau de la taille
 * nécessaire pour stocker tous les entiers. Le programme va ensuite lire au
 * clavier les entiers et les ranger dans le tableau. Après la saisie des
 * entiers, le programme doit successivement : 1. Calculer et afficher le nombre
 * d’entiers pairs et le nombre d’entiers impairs ; 2. Créer un autre tableau
 * ayant la même taille et y copier tous les entiers mais dans l’ordre inverse.
 * Ce deuxième tableau sera ensuite affiché à l’écran ;
 *
 * @author jason
 */
public class Labo9Ex1 {
    
    public static void main(String[] args){
       // System.out.println("");
       int nombre;
       int[] tableau , tableauInverse;
       int nombrePair=0, nombreImpair=0;
       //saisir nombre d"entier
       nombre = saisirInt("le nombre d'entier:");
       
       //instantier deux tableux de nombre
       tableau = new int[nombre];
       tableauInverse = new int[nombre];
       //saisir entier
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = saisirInt("saisir entier " +(i+1) +":");
            tableauInverse[nombre-i-1] = tableau[i];
            if(tableau[i]%2 == 0) {nombrePair ++;}
            else{nombreImpair ++;}
            
        }
        
        System.out.println("tableau inverse :" + Arrays.toString(tableauInverse));
    }
    public static int  saisirInt(String s) {
        Scanner clavier = new Scanner(System.in);
        System.out.print(s);
        while (! clavier.hasNextInt()){
            clavier.nextLine();
            System.out.print("S.V.P! saisir int:");      
  
        }
        return clavier.nextInt();
    }

}
