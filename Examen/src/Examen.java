/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
import java.util.Scanner;

/**
 *
 * @author ousmane
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a ;
     do {
         System.out.print("Entrer un entier strictement positif \n");
           a = sc.nextInt();
        } while (a <= 0);
     int compteur = 0;
     for(int i= 1 ; i<=a ;i++){
         if(a % i == 0){
              compteur = compteur + 1;
          }
     }
     if(compteur == 2){
         System.out.println(+a+ " est un nombre premier");
      }else{
          System.out.println(+a+ " n'est pas un nombre premier");
      }
      System.out.println("les diviseurs de " + a + " sont :");
      for(int i= 1 ; i<=a ;i++){
          if(a % i == 0){
              System.out.print(+i+",\t");
             System.out.print (",.");
         }
    }
      sc.close();
       
        
        
/*
        Terrain t1 = new Terrain(12.6,4.7,"bye","Yoff",true);
        Terrain t2 = new Terrain(26.3,2.9,"foncier","Pikine",false);
        
        
        Personne p1 = new Personne("23455cd","Omar","Diop",9.6);
        Personne p2 = new Personne("23675cd","Oumou","Dia",9.2);
        
        */
        
    }
    
}
