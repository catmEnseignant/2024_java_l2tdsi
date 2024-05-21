package exo3;

public class EntrepriseTest {
    public static void main(String[] args) {
        Personnel personnel = new Personnel();

        // Ajout d'employés
        Employe e1 = new Employe("Jean", "123", 1.5);
        Employe e2 = new Employe("Emma", "456", 2.0);
        Commercial c1 = new Commercial("Alice", "789", 2.5);

        personnel.ajouterEmploye(e1);
        personnel.ajouterEmploye(e2);
        personnel.ajouterEmploye(c1);

        // Test des fonctionnalités
        e1.afficherCaracteristiques();
        System.out.println("Salaire : " + e1.calculerSalaire());

        c1.setVentesMois(5000);
        System.out.println("Salaire de " + c1.calculerSalaire() + " euros pour " + c1.getNom());

        // Exemple de responsables
        Responsable r1 = new Responsable("Marc", "101", 3.0);
        Responsable r2 = new Responsable("Sophie", "202", 4.0);

        r1.ajouterSubordonne(e1);
        r1.ajouterSubordonne(e2);
        r2.ajouterSubordonne(c1);

        r1.afficherSubordonnesDirects();
        r2.afficherTousSubordonnes();
    }
}

