package examen;
import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
	
		/*
		//Exo 3 :
		
		//----------------------

		// 1) Primalite:
		
		int x = 0;
		int i;
		 while(x<=0){
			 System.out.println("Entrer un entier strictement positif");
			 Scanner nombre = new Scanner(System.in);
			 int nbre = nombre.nextInt(); 
			 x= nbre;
		 }		
		 int j = 0;
		 
		 for(i=1; i<10; i++){
			 if(x%i==0) {
				 j++;
			 }
		 }
		 if(j == 1) {
			 System.out.println(x +" est un nombre premier");
		 }else {
			 System.out.println(x +" n'est pas un nombre premier");
		 }
		 
		 //----------------------
		 // 2) Diviseur:
		 
		 System.out.println("Les diviseurs de "+x+" sont:");
		 for(i=x;i>=1; i-- ) {
			 if(x%i == 0) {
				 j = x/i;
				 System.out.print(j);
				 if (j!=x) {
					 System.out.print(" , ");
				 }
			 }
		 }
		 */

		Terrain terrain1 = new Terrain( 15 , 15 , "foncier", "Rufisque", false);
		Terrain terrain2 = new Terrain( 30 , 25 , "bye", "Sebikotane", true);
		
		Personne personne1 = new Personne("782606653", "Mouhamad", "BA", 100);
		Personne personne2 = new Personne("771688845", "Cheikh", "Yoro", 250);

		
		terrain1.allouer(personne2);
		System.out.println("La surface qui vous ai allouee est de : "+ terrain1.calculerSurface()  );
		
		System.out.println("-------------------------------");
		terrain2.allouer(personne1);
		System.out.println("La surface qui vous ai allouee est de : "+ terrain2.calculerSurface() );

	}
	
	

}
