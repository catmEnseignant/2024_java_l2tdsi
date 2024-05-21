package Exercice3;

public class Entreprise {

	public static void main(String[] args) {
		Employe EM1 = new Employe("Moussa", 101, 1.5);
        Employe EM2 = new Employe("Aissatou", 102, 1.8);
        Responsable Salia = new Responsable("Mouhamed amina", 103, 2.0);
        Commercial Ayo = new Commercial("Sarata", 104, 1.3, 20000);

     
        Salia.ajouterSubordonne(EM1);
        Salia.ajouterSubordonne( Ayo);

    
        Personnel personnel = new Personnel();
        personnel.ajouterEmploye(EM1);
        personnel.ajouterEmploye( EM2);
        personnel.ajouterEmploye( Salia);
        personnel.ajouterEmploye( Ayo);

        personnel.afficherTousLesEmployes();

       
        System.out.println("Somme des salaires: " + personnel.calculerSommeSalaires());

        Salia.afficherSubordonnesDirects();
        Salia.afficherSubordonnesIndirects();
    }

	}


