package tp2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1695201
 */
public class Tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaration
        int choix, entier;
        String chaineBinaire;
        boolean boucle = true;

        // boucle
        while (boucle) {
            //afficher le menu
            choix = Convertisseur.menu();
            
            //traiter le choix
            switch (choix) {
                case 1:
                    chaineBinaire = Convertisseur.getChaineBinaire("saisir chaine de binaire:");
                    System.out.println(chaineBinaire + " => " + Convertisseur.binaireDecimal(chaineBinaire));
                    break;
                case 2:
                    entier = Convertisseur.getEntierPositif("saisir entier positif:");
                    System.out.println(entier + " => " + Convertisseur.decimalBinaire(entier));
                    break;
                case 3:
                    System.out.println("-------  Au revoir !!!!!!!!!");
                    boucle = false;
                    break;
                default:
                    System.out.println("mauvais choix");
            }
        }


    }

}
