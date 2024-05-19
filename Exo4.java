package Primalite;

import java.util.Scanner;
public class Exo4{
	public static void main(String[] args) {
        Scanner scre = new Scanner(System.in);
        int nbre ; int i ;
        do{
            System.out.println("Entrer un entier strictement positif");
            nbre = scre.nextInt();
        }while(nbre<=0);
        	for(i = 2; i <= nbre/2; i++) {
            if(nbre %i != 0){
                System.out.println("Le nombre" + nbre + " est premier");
            
                break;
            }

                else {
            
                    System.out.println("Le nombre"  + nbre + " n'est pas premier") ;
                    break;
                
            }
        }
    
                for(i =1;i<=nbre;i++){
            if( nbre% i ==0){
            
            	System.out.println("les diviseurs de " +  nbre + " sont: " +i);
            }

                
                }            
            
    
   
}       
}  
}

