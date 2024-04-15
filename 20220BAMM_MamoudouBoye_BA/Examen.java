/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

/**
 *
 * @author flexTech
 */
import java.util.Scanner;
public class Examen {
    //EXERCICE 1
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = saisirEntierPositif(scanner);
        if (estNombrePremier(nombre)) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }
        scanner.close();
    }
    private static int saisirEntierPositif(Scanner scanner) {
        int nombre;
        do {
            System.out.print("Veuillez saisir un entier strictement positif : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre entier valide.");
                scanner.next(); 
            }
            nombre = scanner.nextInt();
        } while (nombre <= 0);
        return nombre;
    }
    private static boolean estNombrePremier(int nombre) {
        if (nombre <= 1) {
            return false;
            }
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }
}
   
    
    
    
    
    
  
    //EXERCICE 2
/*
   
     public static void main(String[] args) {
         Terrain terrain1 = new Terrain(5.0, 6.0, "bye", "Medina", true);
         Terrain terrain2= new Terrain(6.0, 5.0, "deliberation", "ville", false);
         
         Personne personne1 = new Personne("20220BAMM", "Mamoudou", "ba");
         Personne personne2 = new Personne("20220BASM", "Malick", "Aw");
    System.out.println(personne1);
         System.out.println(personne2);
         System.out.println(terrain1);
         System.out.println(terrain2);
             
     }
}
*/
         
       /* terrain1.allouer(personne1);
        terrain2.allouer(personne2);
j'ai fait erreur sur allouer ce n'est pas la peinne de le decocommenter mais le reste fonction bien*/
        
        
         
         


