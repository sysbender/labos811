/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo13;

import outil.*;

/**
 *
 * @author 1695201
 */
public class Labo13Ex3 {

    public static void main(String[] args) {

        String[] menuMsg = {"0 - quitter", "1 - Fibonacci", "2 - renverser une chaine"};
        int choix = Saisir.menu(menuMsg);
        switch (choix) {
            case 0:
                break;
            case 1:
                int m = Saisir.saisirInt("saisir int:");
                for (int i = 0; i < m; i++) {
                    System.out.println(Labo13Ex1.fm(i));

                }
                break;
            case 2:
                String s = Saisir.saisirString("saisir une chaine:");
                System.out.println("enver = " + Labo13Ex2.renverser(s));
                break;
            default:
                System.out.println("mauvais choix!");
                break;

        }

    }

}
