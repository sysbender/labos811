/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo7;

import java.util.Scanner;

/**
 *Proposez un programme/algorithme qui permet de lire au clavier 10 nombres entiers. Il doit
ensuite afficher combien sont pairs et combien sont impairs.
 * @author jason
 */
public class Labo7Ex1 {
    public static void main(String[] args){
        final int NUM_ENTIER=10;
        int entier, nombrePaire=0, nombreImpaire=0;
        
        for (int i = 0; i < NUM_ENTIER; i++) {
            entier =saisirInt("Saisir entier " + (i+1) + ":");
            if (entier %2 ==0) {
                nombrePaire++;
            } else {
                nombreImpaire++;
            }
            
        }
        
        System.out.println("nombre de    Paire: " + nombrePaire);
        System.out.println("nombre de Impaire : " + nombreImpaire);
        
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
