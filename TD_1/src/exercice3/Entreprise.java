package exercice3;

public class Entreprise {
    public static void main(String[] args) {
        Employe e1 = new Employe("Alice", "001", 3);
        Employe e2 = new Employe("Bob", "002", 4);
        Responsable r1 = new Responsable("Charlie", "003", 5);
        Commercial c1 = new Commercial("Dave", "004", 2, 5000.0);

        r1.ajouterInferieur(e1);
        r1.ajouterInferieur(e2);

        Personnel personnel = new Personnel();
        personnel.ajouterEmploye(e1);
        personnel.ajouterEmploye(e2);
        personnel.ajouterEmploye(r1);
        personnel.ajouterEmploye(c1);

        e1.afficherCaracteristiques();
        e2.afficherCaracteristiques();
        r1.afficherCaracteristiques();
        c1.afficherCaracteristiques();

        System.out.println("Salaires des employés sous la responsabilité de Charlie:");
        r1.afficherInferieursDirects();

        System.out.println("Total des salaires à verser: " + personnel.calculerTotalSalaires());
    }
}
