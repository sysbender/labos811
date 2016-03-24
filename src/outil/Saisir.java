/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outil;

import java.util.Scanner;

/**
 *
 * @author 1695201
 */
public class Saisir {
        /**
     * saisir int
     *
     * @param msg
     * @return int
     */
    public static int saisirInt(String msg) {
        // instantier Scanner
        Scanner clavier = new Scanner(System.in);
        //affircher message
        System.out.print(msg);
        //boucle jusqu'a un entier
        while (!clavier.hasNextInt()) {
            clavier.nextLine();
            // pas entier, afficher erreur , resaisir
            System.out.print("***SVP! un entier :");
        }
        return clavier.nextInt();
    }
    
    
    public static String saisirString(String msg){
        Scanner clavier = new Scanner(System.in);
        
        System.out.print(msg);
        return clavier.nextLine();
        //while(!clavier.hasNextLine()){}
        
    }
    
    
       public static int menu(String[] msg) {
        //declaration
        int choix = 0;
        boolean arret = false;
        String errMsg = "*****SVP! int entre 0 -"+ (msg.length-1) + "!****** ";
        String menuMsg = "=============================\n";
//        menuMsg += "1. Conversion binaire-decimal\n";
//        menuMsg += "2. Conversion decimal-binaire\n";
//        menuMsg += "3. Quitter                   \n";
           for (int i = 0; i < msg.length; i++) {
               menuMsg += msg[i];
               menuMsg += "\n";
               
           }
        menuMsg += "==========choisir: ";

        do {
            choix = saisirInt(menuMsg);
            if (choix<0 || choix >= msg.length) {
                // mauvais choix , afficher erreur
                System.out.println(errMsg);
            } else {
                // bon choix, arreter boucle
                arret = true;
            }

        } while (!arret);

        return choix;

    }

}
