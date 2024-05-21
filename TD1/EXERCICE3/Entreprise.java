package exercice3;

public class Entreprise {
    public static void main(String[] args)
    {
        // Création du personnel
        Personnel personnel = new Personnel();

        // Création des employés
        Employe employe1 = new Employe("Mamadou", "M1", 1.2);
        Employe employe2 = new Employe("Boubacar", "B1", 1.0);

        // Création d'un responsable
        Responsable responsable = new Responsable("Cheikh", "C1", 1.5);
        responsable.ajouterSubordonne(employe1);
        responsable.ajouterSubordonne(employe2);

        // Création d'un commercial
        Commercial commercial = new Commercial("Daouda", "D1", 1.3, 1000000);

        // Ajout des employés au personnel
        personnel.ajouterEmploye(employe1);
        personnel.ajouterEmploye(employe2);
        personnel.ajouterEmploye(responsable);
        personnel.ajouterEmploye(commercial);

        // Affichage des caractéristiques
        employe1.afficher();
        employe2.afficher();
        responsable.afficher();
        commercial.afficher();

        // Affichage des subordonnés
        responsable.afficherSubordonnesDirects();
        responsable.afficherSubordonnesIndirects();

        // Calcul de la somme des salaires
        System.out.println("Somme des salaires à verser: " + personnel.calculerSommeSalaires());

        // Mise à jour de la base salaire
        Employe.setBaseSalaire(350000);

        // Recalcul de la somme des salaires après augmentation
        System.out.println("Somme des salaires à verser après augmentation: " + personnel.calculerSommeSalaires());
    }
}

