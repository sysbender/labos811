/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo13;

/**
 *
 * @author 1695201
 */
public class Labo13Ex2 {

    public static void main(String[] args) {

        String t = "abcde";
        System.out.println(t + " > " + renverser(t));

    }

    /**
     * renverser une chaine de caractere
     * @param s
     * @return
     */
    public static String renverser(String s) {
        //System.out.println(s.substring(0, s.length() - 2));
        switch (s.length()) {

            case 1:
                return s;
           // case 2:
           //     return s.substring(1) + s.substring(0, 1);
                
            default:
                return s.substring(s.length() - 1) + renverser(s.substring(0, s.length() - 1));
        }

    }

}


