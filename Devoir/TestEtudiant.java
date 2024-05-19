package Devoir;
import java.util.Scanner;


public class TestEtudiant {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
			Etudiant Etud1 = new Etudiant("202209M9K", "Abdou","Diop");
			
			System.out.println("saisir la moyenne de l'etudiant: ");
			
			double moy = scanner.nextDouble();
			Etud1.SetMoyenne(moy);
			
			
			 Etud1.affichage();
		}

	}


