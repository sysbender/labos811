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

public class Labo13Ex1 {
    
    public static void main(String[] args){
    
        for (int i = 0; i < 10; i++) {
            System.out.println(fm(i)); 
            
        }
    
    }
   
    
    //fibonacci
    public static long fm(int m){
        long resultat ;
   
        switch (m){
            case 0:
                resultat = 0;
                break;
            case 1:
                resultat =1;
                break;
            default:
                 resultat = fm(m-1) +  fm(m-2) ;
                 break;
        
        }
        return resultat;
    }
    
}
