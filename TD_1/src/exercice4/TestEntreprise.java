package exercice4;

public class TestEntreprise {
    public static void main(String[] args) {
        Employe e1 = new Employe("Samba", 1, 1.5);
        Employe e2 = new Employe("Sarra", 2, 1.2);
        Responsable r1 = new Responsable("Ndeye", 3, 2.0);
        Commercial c1 = new Commercial("Dame", 4, 1.0, 0.05);

        r1.ajouterSubordonne(e1);
        r1.ajouterSubordonne(e2);

        c1.mettreAJourVentes(50000);

        Entreprise entreprise = new Entreprise();
        entreprise.ajouterEmploye(e1);
        entreprise.ajouterEmploye(e2);
        entreprise.ajouterEmploye(r1);
        entreprise.ajouterEmploye(c1);

        entreprise.afficherEmployes();
        System.out.println("Somme des salaires : " + entreprise.calculerSommeSalaires());
    }
}

