package Exercice3;

public class Entreprise {

	public static void main(String[] args) {
		 // Création de quelques employés
        Employe e1 = new Employe("Cheikh", 4, 19);
        Employe e2 = new Employe("Moussa", 6, 18);

        // Création de responsables
        Responsable r1 = new Responsable("Ndoumbe", 3, 24);
        r1.ajouterInferieur(e1);
        r1.ajouterInferieur(e2);

        // Création de commerciaux
        Commercial c1 = new Commercial("Samba", 6, 8, 0.1);
        c1.mettreAJourVentes(6000);

        // Création du personnel
        Personnel personnel = new Personnel();
        personnel.ajouterEmploye(e1);
        personnel.ajouterEmploye(e2);
        personnel.ajouterEmploye(r1);
        personnel.ajouterEmploye(c1);

        // Affichage des employés et de leurs salaires
        personnel.afficherPersonnel();

        // Affichage des inférieurs directs et indirects
        r1.afficherInferieursDirects();
        r1.afficherTousInferieurs();

        // Calcul de la somme des salaires
        System.out.println("Somme des salaires: " + personnel.calculerSommeSalaires());
	}

}
