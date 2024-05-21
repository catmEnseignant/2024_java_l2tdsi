package exercice4;

public class Main {
    public static void main(String[] args) {
        Employe.valeurIndice = 1000;

        Employe employe1 = new Employe("Jean", "1001", 3);
        Employe employe2 = new Employe("Marie", "1002", 4);
        Commerciaux commercial1 = new Commerciaux("Pierre", "1003", 5, 5000);
        Commerciaux commercial2 = new Commerciaux("Sophie", "1004", 6, 8000);

        Personnel personnel = new Personnel(10);

        personnel.ajouterEmploye(employe1);
        personnel.ajouterEmploye(employe2);
        personnel.ajouterEmploye(commercial1);
        personnel.ajouterEmploye(commercial2);

        double totalSalaires = personnel.calculerTotalSalaires();
        System.out.println("La somme des salaires à verser est de : " + totalSalaires);

        employe1.Afficher();
        employe2.Afficher();
        commercial1.Afficher();
        commercial2.Afficher();
    }
}