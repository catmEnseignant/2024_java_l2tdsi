package exercice3;

public class Entreprise {

    public static void main(String[] args) {
        // Create some employees
        Employe employe1 = new Employe("Zahra Niass", 12345, 1.2);
        Employe employe2 = new Employe("Eric Diack", 12578, 1.5);
        Responsable responsable1 = new Responsable("Bachir Fall", 54321, 1.6, new Employe[]{employe1});
        Responsable responsable2 = new Responsable("Dave Niass", 45321, 1.3, new Employe[]{employe2});
        Commercial commercial1 = new Commercial("Fatima Diongue", 98765, 1.3, 10000, 5000);
        

        // Test employee methods
        System.out.println("Employé 1:");
        System.out.println("- Nom: " + employe1.getNom());
        System.out.println("- Matricule: " + employe1.getMatricule());
        System.out.println("- Indice salarial: " + employe1.getIndiceSalarial());
        System.out.println("- Salaire: " + employe1.calculerSalaire());

        // Test responsable methods
        System.out.println("\nResponsable 1:");
        System.out.println("- Nom: " + responsable1.getNom());
        System.out.println("- Matricule: " + responsable1.getMatricule());
        System.out.println("- Indice salarial: " + responsable1.getIndiceSalarial());
        System.out.println("- Salaire: " + responsable1.calculerSalaire());
        responsable1.afficherSubordonnesDirects();
        responsable2.afficherSubordonnesDirects();
        


        // Test commercial methods
        System.out.println("\nCommercial 1:");
        System.out.println("- Nom: " + commercial1.getNom());
        System.out.println("- Matricule: " + commercial1.getMatricule());
        System.out.println("- Indice salarial: " + commercial1.getIndiceSalarial());
        System.out.println("- Salaire: " + commercial1.calculerSalaire());
        commercial1.mettreAJourVentes(15000); // Update sales
        System.out.println("- Nouveau salaire après mise à jour des ventes: " + commercial1.calculerSalaire());
        double sommeSalaires = employe1.calculerSommeSalaire();
        System.out.println("La somme des salaires a verser est de : " + sommeSalaires);
    }
}
