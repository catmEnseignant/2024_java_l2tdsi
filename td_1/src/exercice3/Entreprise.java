package exercice3;

public class Entreprise {
    public static void main(String[] args) {
        Personnel personnel = new Personnel();

        // Création des employés et des commerciaux
        Employe e1 = new Employe("Dupont", 12345, 5);
        Commercial c1 = new Commercial("Martin", 54321, 4, 0.05f); // Taux d'intéressement de 5%

        // Mise à jour des ventes pour le commercial
        c1.mettreAJourVentes(50000.0f); // 50,000 unités de ventes

        // Calcul des salaires
        e1.calculSalaire();
        c1.calculSalaire();

        // Ajout des employés au personnel
        personnel.ajouterEmploye(e1);
        personnel.ajouterEmploye(c1);

        // Affichage des informations
        personnel.afficherEmployes();

        // Calcul et affichage de la somme des salaires
        float sommeSalaires = personnel.calculerSommeSalaires();
        System.out.println("La somme des salaires à verser est : " + sommeSalaires + " FranCFA.");
    }
}

