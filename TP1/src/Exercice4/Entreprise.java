package Exercice4;

public class Entreprise {
    public static void main(String[] args) {
       
        Employe employe1 = new Employe("Ali", "E001", 3);
        Employe employe2 = new Employe("Baba", "E002", 2);
        Responsable responsable1 = new Responsable("Amy", "R001", 5);
        Commercial commercial1 = new Commercial("papa", "C001", 4, 10000.0);

        
        responsable1.ajouterSubordonne(employe1);
        responsable1.ajouterSubordonne(employe2);
        responsable1.ajouterSubordonne(commercial1);

        Personnel personnel = new Personnel();
        personnel.ajouterEmploye(employe1);
        personnel.ajouterEmploye(employe2);
        personnel.ajouterEmploye(responsable1);
        personnel.ajouterEmploye(commercial1);

        System.out.println("Caractéristiques des employés:");
        personnel.afficherEmployes();

 
        System.out.println("Subordonnés directs du responsable:");
        responsable1.afficherSubordonnesDirects();
        
        System.out.println("Subordonnés directs et indirects du responsable:");
        responsable1.afficherSubordonnesIndirects();

       
        double sommeSalaires = personnel.calculerSommeSalaires();
        System.out.println("Somme des salaires à verser : " + sommeSalaires);
    }
}
