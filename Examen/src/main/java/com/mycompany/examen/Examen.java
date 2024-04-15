/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Examen {

    public static void main(String[] args) {
        
        
        //Exercice 3

        Scanner nb = new Scanner(System.in); // pour la lecture des donnees
        int nombre ; // pour le nombre a verifier s'il s'agit d'un nombre premier ou pas
        int compteur = 0; //le compteur des diviseurs initialiser a zero



        //lecture de la variable nombre
        do {
            System.out.println("Entrer un entier strictement positif: ");
            nombre = nb.nextInt();
        }while(nombre <= 0);

        int[] tabDiviseurs = new int[nombre+1];

        // on compte a present le nombre de diviseur
        for(int i=1 ; i<= nombre; i++) {
            if (nombre % i == 0) {
                compteur = compteur +1;
                tabDiviseurs[i] = i;
            }
        }

        int[] tabDiviseurs2 = new int[compteur];

        if(compteur == 2) {
            System.out.println(nombre+ " est un nombre premier");
        }else {
            System.out.println(nombre+" n'est pas un nombre premier");
        }

        System.out.println("Les diviseurs de "+ nombre+ " sont: ");

        for(int i = 0; i < tabDiviseurs.length; i++){

            if(tabDiviseurs[i] != 0) {

                for(int j=0; j<tabDiviseurs2.length; j++){
                    if(tabDiviseurs2[j] == 0){
                        tabDiviseurs2[j] = tabDiviseurs[i];
                        break;
                    }
                }
            }
        }


        for(int i = 0; i<tabDiviseurs2.length; i++){

            if(i < tabDiviseurs2.length-1){

                System.out.print(tabDiviseurs2[i]+" , ");

            }
            else{
                System.out.print(tabDiviseurs2[i]);
            }

        }
        
        /*        
        
        Vous mettez le code de l'exercice ici, Vous compiler vous tester jusqu'à ce que ça marche
        
        Apré vous le commenter
                
        */
        
        
        //Exercice 4
        
        /*
        
        Aprés avoir créer les classes demanddées dans l'exercice
        
        Pour répondre aux questions de la Partie C: le test
        
        Vous mettez ici le code ça sous entend que vous allez créer les objets et faire 
        
        les appels de méthodes et autres ici. Aprés avoir terminer les test vous pouvez le commenter
        
        
        
        */
        
                
    }
}
