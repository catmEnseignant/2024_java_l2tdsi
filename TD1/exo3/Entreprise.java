
import Exercice3.*;

public class Entreprise {
    public static void main(String[] args) {
        Employe emp1 = new Employe("Anta", "2293DD", 5);
        Employe emp2 = new Employe("Babacar", "2URBF2", 4);
        Commercial comm1 = new Commercial("Cama", "44JFN", 3, 0.05);
        comm1.mettreAJourVentes(20000);
        
        Responsable resp1 = new Responsable("Daoud", "DIF5J", 6);
        resp1.ajouterInferieur(emp1);
        resp1.ajouterInferieur(comm1);
        
        Responsable resp2 = new Responsable("Eva", "E44UBF", 7);
        resp2.ajouterInferieur(resp1);
        resp2.ajouterInferieur(emp2);

        Personnel personnel = new Personnel();
        personnel.ajouterEmploye(emp1);
        personnel.ajouterEmploye(emp2);
        personnel.ajouterEmploye(comm1);
        personnel.ajouterEmploye(resp1);
        personnel.ajouterEmploye(resp2);

        System.out.println("Salaires:");
        emp1.afficherCaracteristiques();
        emp2.afficherCaracteristiques();
        comm1.afficherCaracteristiques();
        resp1.afficherCaracteristiques();
        resp2.afficherCaracteristiques();

        System.out.println("\nInférieurs directs de Daoud:");
        resp1.afficherInferieursDirects();

        System.out.println("\nInférieurs indirects de Eva:");
        resp2.afficherInferieursIndirects();

        System.out.println("\nTotal des salaires: " + personnel.calculerTotalSalaires());
    }
}
