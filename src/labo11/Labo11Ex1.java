/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo11;

/**
 * Proposez une méthode add() qui reçoit 2 nombres réels et qui retourne leur
 * somme et une méthode mult() qui reçoit 2 nombres réels et qui retourne leur
 * produit.
 *
 * @author 1695201
 */
public class Labo11Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" 2345 + 10000 = " + add(2345, 10000));

        System.out.println(" 2345 X 10000 = " + mult(2345, 10000));
        System.out.println("1 estPositif : " +estPositif(1));
        System.out.println("2 estPair : " + estPair(2));
        System.out.println(" 3 estPlusGrandQue 2 : " + estPlusGrandQue(3,2));
        System.out.println("PlusGrandDe 2 3 : " + plusGrandDe(2,3));
        System.out.println("somDesCarre 2,3 : " + somDesCarre(2,3));
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double mult(double x, double y) {
        return x * y;
    }

    public static boolean estPositif(double reel) {
        return (reel >= 0);
    }

    public static boolean estPair(int entier) {
        return entier % 2 == 0;
    }
    
    public static boolean estPlusGrandQue(double x, double y){
        return (x>y);
    }
    
    public static double plusGrandDe(double x, double y){
        return x>y ? x:y;
        
    }
    
    public static double somDesCarre(double x, double y){
        return add(mult(x,x), mult(y,y));
    }

}
