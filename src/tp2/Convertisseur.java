package tp2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 * un convertisseur binaire-décimal et décimal-binaire
 *
 * @author 1695201
 * @version 2016-03-04
 */
public class Convertisseur {

    /**
     * vérification de chaînes binaires
     *
     * @param chaine input string
     * @return true/false - si chaine est binaire
     */
    public static boolean estUneChaineBinaire(String chaine) {
        //declaration result=true si chaine n'est pas vide
        boolean result = (chaine.length() > 0);
        //boucle - verifier chacun char
        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.charAt(i) != '0' && chaine.charAt(i) != '1') {
                result = false;
                return result;
            }
        }
        return result;
    }

    /**
     * lecture de chaînes binaires
     *
     * @param msg afficher le message
     * @return une valide chaine de binaire
     */
    public static String getChaineBinaire(String msg) {
        String chaine = "";
        // instantier scanner
        Scanner clavier = new Scanner(System.in);
        // boucle -saisir chaine de binaire
        System.out.print(msg);
        while (clavier.hasNextLine()) {
            chaine = clavier.nextLine();
            if (!estUneChaineBinaire(chaine)) {
                // n'est pas binaire, resaisir
                System.out.print(msg);
            } else {
                // est binaire, cesser saisir
                break;
            }
        }
        return chaine;
    }

    /**
     * lecture d’entiers positifs
     *
     * @param msg afficher un message
     * @return un entier positif
     */
    public static int getEntierPositif(String msg) {
        int entier = 0;
        // instantier scanner
        Scanner clavier = new Scanner(System.in);
        // flag de boucle
        boolean boucle = true;
        // boucle - saisir un entier positif
        do {
            System.out.print(msg);
            while (!clavier.hasNextInt()) {
                System.out.print(msg);
                clavier.next();
            }
            entier = clavier.nextInt();
        } while (entier <= 0);
        return entier;
    }


    /**
     * conversion binaire-décimal
     *
     * @param binaire afficher un message
     * @return decimal
     */
    public static int binaireDecimal(String binaire) {
        //declaration
        int decimal = 0;    //decimal
        int taille = binaire.length();  // taille de chaine de binaire
        int valeurDePosition = 1;
        // boucle sur chaine de binaire : de droite a gauche
        for (int i = taille - 1; i >= 0; i--) {
            //ajouter Valeur de Position si "1" est dans cette position
            if (binaire.charAt(i) == '1') {
                decimal += valeurDePosition;
            }
            valeurDePosition *= 2;

        }
        return decimal;
    }

    /**
     * conversion décimal-binaire
     *
     * @param entier decimal
     * @return binaire
     */
    public static String decimalBinaire(int entier) {
        String binaire = "";
        // calcule binaire pour entier
        do {
            binaire = entier % 2 + binaire;
            entier /= 2;
        } while (entier > 0);
        return binaire;
    }

    /**
     * afficher le menu
     *
     * @return choix
     */
    public static int menu() {
        //declaration
        int choix = 0;
        boolean arret = false;
        String errMsg = "*****SVP! 1, 2 ou 3!****** ";
        String menuMsg = "=============================\n";
        menuMsg += "1. Conversion binaire-decimal\n";
        menuMsg += "2. Conversion decimal-binaire\n";
        menuMsg += "3. Quitter                   \n";
        menuMsg += "==========choisir entre 1 2 3: ";

        do {
            choix = saisirInt(menuMsg);
            if (choix != 1 && choix != 2 && choix != 3) {
                // mauvais choix , afficher erreur
                System.out.println(errMsg);
            } else {
                // bon choix, arreter boucle
                arret = true;
            }

        } while (!arret);

        return choix;

    }

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

}
