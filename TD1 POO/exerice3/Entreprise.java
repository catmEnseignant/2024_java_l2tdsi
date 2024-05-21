public class Entreprise {
    public static void main(String[] args) {
        // Création du personnel
        Personnel personnel = new Personnel();

        // Création des employés
        Employe emp1 = new Employe("Alice", "E001", 1.2);
        Employe emp2 = new Employe("Bob", "E002", 1.0);
        Employe emp3 = new Employe("Charlie", "E003", 1.1);

        // Création d'un responsable
        Responsable resp1 = new Responsable("David", "R001", 1.5);
        resp1.ajouterInferieur(emp1);
        resp1.ajouterInferieur(emp2);

        // Création d'un commercial
        Commercial com1 = new Commercial("Eve", "C001", 1.3, 5000.0);

        // Ajout des employés au personnel
        personnel.ajouterEmploye(emp1);
        personnel.ajouterEmploye(emp2);
        personnel.ajouterEmploye(emp3);
        personnel.ajouterEmploye(resp1);
        personnel.ajouterEmploye(com1);

        // Afficher tous les employés et leurs salaires
        personnel.afficherTousEmployes();

        // Afficher les inférieurs directs et indirects du responsable
        resp1.afficherInferieursDirects();
        resp1.afficherTousInferieurs();

        // Calculer et afficher la somme des salaires
        double sommeSalaires = personnel.calculerSommeSalaires();
        System.out.println("Somme des salaires: " + sommeSalaires);

        // Tester la méthode aboyer du commercial
        System.out.println(com1.getNom() + " a vendu pour " + com1.calculerSalaire());
    }
}
