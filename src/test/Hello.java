/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


/**
 *
 * @author 1695201
 */
public class Hello {
    public static void main(String[] args){
        int[] tab = null;
        int[] tab2 = {1,2};
        int[] tab3 = {2,3,4};
        tab2 = tab3;
        tab2[0] =2;
        // int[] t = new Array();

        //tab2 = {2,3,4};       
        tab = getT(5);
        tab2 = getT(6);
        
    
    }
    
    public static int[] getT(int taille) {
        int[] t= new int[taille];
        for (int i = 0; i < t.length; i++) {
            t[i] = taille;
            
        }
        
        return t;
    }
        
    
}
