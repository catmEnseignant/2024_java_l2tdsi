package Exo3;

public class TestEntreprise {
    public static void main(String args[]) {
        
        Entreprise entreprise = new Entreprise();
        
        Employer emp1 = new Employer("Alice", "E001", 1.5);
        Employer emp2 = new Employer("Bob", "E002", 2.0);
        Employer emp3 = new Employer("Charlie", "E003", 1.8);
        Commerciaux commercial1 = new Commerciaux("David", "C001", 1.6);
        Commerciaux commercial2 = new Commerciaux("Eve", "C002", 1.7);
        Responsable responsable1 = new Responsable("Frank", "R001", 2.5);
        Responsable responsable2 = new Responsable("Gina", "R002", 2.8);
        
        entreprise.ajouterEmploye(emp1);
        entreprise.ajouterEmploye(emp2);
        entreprise.ajouterEmploye(emp3);
        entreprise.ajouterEmploye(commercial1);
        entreprise.ajouterEmploye(commercial2);
        entreprise.ajouterEmploye(responsable1);
        entreprise.ajouterEmploye(responsable2);
        
        responsable1.ajouterSubordonne(emp1);
        responsable1.ajouterSubordonne(emp2);
        responsable2.ajouterSubordonne(emp3);
        responsable2.ajouterSubordonne(commercial1);
        responsable2.ajouterSubordonne(commercial2);

        System.out.println("Affichage des subordonnés directs des responsables :");
        responsable1.afficherSubordonnesDirects();
        responsable2.afficherSubordonnesDirects();
    }
}
