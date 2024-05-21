package exo4;



public class TestEntreprise {
    public static void main(String[] args) {
        Employe e1 = new Employe("modou", "E001", 10);
        Employe e2 = new Employe("mariem", "E002", 12);
        Responsable r1 = new Responsable("diouck", "R001", 15);
        Commercial c1 = new Commercial("cheikh", "C001", 8, 2000);

        c1.mettreAJourVentes(5000);

        r1.ajouterSubordonne(e1);
        r1.ajouterSubordonne(c1);

        Personnel personnel = new Personnel();
        personnel.ajouterEmploye(e1);
        personnel.ajouterEmploye(e2);
        personnel.ajouterEmploye(r1);
        personnel.ajouterEmploye(c1);

        e1.afficherCaracteristiques();
        e2.afficherCaracteristiques();
        r1.afficherCaracteristiques();
        c1.afficherCaracteristiques();

       
        r1.afficherSubordonnesDirects();
        r1.afficherSubordonnesIndirects();

    
        double sommeSalaires = personnel.calculerSommeSalaires();
        System.out.println("Somme des salaires à verser: " + sommeSalaires);
    }
}
