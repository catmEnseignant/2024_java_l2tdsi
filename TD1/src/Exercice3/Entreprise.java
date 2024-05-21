package Exercice3;

public class Entreprise {

    public static void main(String[] args) {
        // Définir la valeur de l'indice salarial
        Employe.setSalaryValue(150.0f);

        // Créer des employés
        Employe e1 = new Employe("Mbacke", 123, 1.2f);
        Employe e2 = new Employe("Ndiaye", 456, 1.1f);
        Vendeur e3 = new Vendeur("Diop", 789, 1.0f, 10000.0f);

        // Créer des superviseurs
        Superviseur s1 = new Superviseur("Faye", 987, 1.3f);
        Superviseur s2 = new Superviseur("Sall", 654, 1.4f);

        // Ajouter des subordonnés directs
        s1.addDirectReport(e1);
        s1.addDirectReport(e2);
        s2.addDirectReport(e3);

        // Ajouter des superviseurs à l'équipe
        Equipe equipe = new Equipe();
        equipe.addEmployee(e1);
        equipe.addEmployee(e2);
        equipe.addEmployee(e3);
        equipe.addEmployee(s1);
        equipe.addEmployee(s2);

        // Afficher les caractéristiques d'un employé
        e1.displayCharacteristics();

        // Afficher les subordonnés directs d'un superviseur
        s1.displayDirectReports();

        // Afficher tous les subordonnés d'un superviseur (direct et indirects)
        s2.displayReports(true);

        // Afficher le salaire d'un commercial après mise à jour des ventes
        e3.updateMonthlySales(15000.0f);
        System.out.println("Salaire de " + e3.getNom() + " après mise à jour des ventes: " + e3.calculateSalary());
    }

}
