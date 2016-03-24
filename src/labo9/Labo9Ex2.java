/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo9;
import java.util.Scanner;
/**
 * Proposez un programme qui commence par demander à l’utilisateur combien il a
 * de notes à saisir. Le programme crée ensuite un tableau de la taille
 * nécessaire pour stocker toutes les notes. Le programme va ensuite lire au
 * clavier les notes et les ranger dans le tableau. Les notes sont comprises
 * entre 0 et 100. Après la saisie des notes, le programme doit :  Afficher
 * toutes les notes comprises entre 60 et 100 inclusivement ;  Calculer et
 * afficher la moyenne des notes du tableau ;  Rechercher la meilleure note
 * dans le tableau et l’afficher ;
 *
 * @author jason
 */
public class Labo9Ex2 {
    
    static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args){
        int nombreNote;
        double[] tableauNote;
        double maxNote=0, moyenneNote=0, sommeNote=0;
        String passNote="";

        nombreNote = saisirInt("saisir nombre de note:");
        tableauNote = new double[nombreNote];
        for (int i = 0; i < tableauNote.length; i++) {
            tableauNote[i] = saisirDouble("Saisir Note" + (i+1) + ":");
            sommeNote += tableauNote[i];
            if(tableauNote[i]  > maxNote) { maxNote = tableauNote[i] ;}
            if(tableauNote[i] >=60)  { passNote += tableauNote[i] + " ; " ;}           
            
            
        }
        moyenneNote = sommeNote/nombreNote;
        System.out.println("pass note:" + passNote);
        System.out.println("moyeene note:" + moyenneNote);
        System.out.println("meilleur note:" + maxNote);
        
    
         
        
    }
    public static int  saisirInt(String s) {
        //Scanner clavier = new Scanner(System.in);
        System.out.print(s);
        while (! clavier.hasNextInt()){
            clavier.nextLine();
            System.out.print("S.V.P! saisir int:");      
  
        }
        return clavier.nextInt();
    }
    
    public static double saisirDouble(String s) {
        System.out.print(s);
        while(!clavier.hasNextDouble()){
            clavier.nextLine();
            System.out.println("S.V.P! un double:");
        }
        return clavier.nextDouble();

        
        
        
    }

}
