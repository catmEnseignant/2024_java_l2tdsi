import java.util.Scanner;

public class Entreprise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nom1, nom2, nomCom1, nomCom2, matricule1, matricule2, matriculeCom1, matriculeCom2, nomRes, matriculeRes;
        double indiceSalarial1, indiceSalarial2, indiceSalarialCom1, indiceSalarialCom2, salaireNormale, indiceSalarialRes, venteDernierMoisCom1, venteDernierMoisCom2, tauxCommissionCom1, tauxCommissionCom2;

        System.out.println("\nEnregistrement des données de l'employé 1.");
        System.out.print(" Entrer son nom : ");
        do{
            nom1 = scanner.nextLine();
        } while (nom1 == null);

        System.out.print(" Entrer son matricule : ");
        do{
            matricule1 = scanner.nextLine();
        } while (matricule1 == null);

        System.out.print(" Entrer son indice salarial : ");
        do{
            indiceSalarial1 = scanner.nextDouble();
        } while (indiceSalarial1 <= 0);
        scanner.nextLine();

        System.out.println("\nEnregistrement des données de l'employé 2.");
        System.out.print(" Entrer son nom : ");
        nom2 = scanner.nextLine();

        System.out.print(" Entrer son matricule : ");
        do{
            matricule2 = scanner.nextLine();
        } while (matricule2 == null);

        System.out.print(" Entrer son indice salarial : ");
        do{
            indiceSalarial2 = scanner.nextDouble();
        } while (indiceSalarial2 <= 0);
        scanner.nextLine();

        System.out.print("\nVeuillez saisir la salire normale des employés : ");
        do{
            salaireNormale = scanner.nextDouble();
        } while (salaireNormale <= 0);
        scanner.nextLine();

        // Création des employés
        Employes e1 = new Employes(nom1, matricule1, indiceSalarial1, salaireNormale);
        Employes e2 = new Employes(nom2, matricule2, indiceSalarial2, salaireNormale);

        System.out.println("\nEnregistrement des données de du responsable : ");
        System.out.print(" Entrer son nom : ");
        do{
            nomRes = scanner.nextLine();
        } while (nomRes == null);

        System.out.print(" Entrer son matricule : ");
        do{
            matriculeRes = scanner.nextLine();
        } while (matriculeRes == null);

        System.out.print(" Entrer son indice salarial : ");
        do{
            indiceSalarialRes = scanner.nextDouble();
        } while (indiceSalarialRes <= 0);
        scanner.nextLine();

        //System.out.println("\n Affichage des informations.\n");

        // Création des responsables
        Responsable res = new Responsable(nomRes, matriculeRes, indiceSalarialRes, salaireNormale);
        res.ajouterInferieurs(e1);
        res.ajouterInferieurs(e2);


        System.out.println("\nEnregistrement des données de commerçant 1.");
        System.out.print(" Entrer son nom : ");
        do{
        nomCom1 = scanner.nextLine();
        } while (nomCom1 == null);

        System.out.print(" Entrer son matricule : ");
        do{
            matriculeCom1 = scanner.nextLine();
        } while (matriculeCom1 == null);

        System.out.print(" Entrer son indice salarial : ");
        do{
            indiceSalarialCom1 = scanner.nextDouble();
        } while (indiceSalarialCom1 <= 0);
        scanner.nextLine();

        System.out.print(" Veuillez saisir la vente du dernier mois : ");
        do{
            venteDernierMoisCom1 = scanner.nextDouble();
        } while (venteDernierMoisCom1 <= 0);
        scanner.nextLine();

        System.out.print(" Veuillez saisir le taux de commission (compris entre 0 et 1 (exclus)) : ");
        do{
            tauxCommissionCom1 = scanner.nextDouble();
        } while (tauxCommissionCom1 <= 0 || tauxCommissionCom1 >= 1);
        scanner.nextLine();


        System.out.println("\nEnregistrement des données de commerçant 2.");
        System.out.print(" Entrer son nom : ");
        do{
        nomCom2 = scanner.nextLine();
        } while (nomCom2 == null);

        System.out.print(" Entrer son matricule : ");
        do{
            matriculeCom2 = scanner.nextLine();
        } while (matriculeCom2 == null);

        System.out.print(" Entrer son indice salarial : ");
        do{
            indiceSalarialCom2 = scanner.nextDouble();
        } while (indiceSalarialCom2 <= 0);
        scanner.nextLine();

        System.out.print(" Veuillez saisir la vente du dernier mois : ");
        do{
            venteDernierMoisCom2 = scanner.nextDouble();
        } while (venteDernierMoisCom2 <= 0);
        scanner.nextLine();

        System.out.print(" Veuillez saisir le taux de commission (compris entre 0 et 1 (exclus)) : ");
        do{
            tauxCommissionCom2 = scanner.nextDouble();
        } while (tauxCommissionCom2 <= 0 || tauxCommissionCom2 >= 1);
        scanner.nextLine();


        // Création des commerciaux
        Commerciaux com1 = new Commerciaux(nomCom1, matriculeCom1, indiceSalarialCom1, venteDernierMoisCom1, tauxCommissionCom1);
        Commerciaux com2 = new Commerciaux(nomCom2, matriculeCom2, indiceSalarialCom2, venteDernierMoisCom2, tauxCommissionCom2);

        // Création du personnel
        Personnel personnel = new Personnel();
        personnel.ajouterEmploye(e1);
        personnel.ajouterEmploye(e2);
        personnel.ajouterEmploye(res);
        personnel.ajouterEmploye(com1);
        personnel.ajouterEmploye(com2);

        System.out.println("\n Affichage des informations");

        // Affichage des informations des employés
        personnel.affcherInfosPersonnel();

        // Affichage des inférieurs directs et indirects
        res.afficherInferieursDirects();
        res.afficherInferieurs();

        // Calcul et affichage de la somme des salaires
        double sommeSalaires = personnel.SommeSalaire();
        System.out.println("\nSomme des salaires à verser: " + sommeSalaires + ".\n");

        scanner.close();
    }
}
