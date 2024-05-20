public class Main {
      public static void main(String[] args) {
          // Création des employés
          Employe e1 = new Employe("Alice", "001", 1.2);
          Employe e2 = new Employe("Bob", "002", 1.5);
          Employe e3 = new Employe("Charlie", "003", 1.8);
  
          // Création des responsables
          Responsable r1 = new Responsable("David", "004", 2.0);
          Responsable r2 = new Responsable("Eve", "005", 2.5);
  
          // Ajout des employés sous les responsables
          r1.ajouterInferieur(e1);
          r1.ajouterInferieur(e2);
          r2.ajouterInferieur(e3);
          r1.ajouterInferieur(r2);
  
          // Création des commerciaux
          Commercial c1 = new Commercial("Frank", "006", 1.3, 0.05);
          c1.mettreAJourVentes(20000);
  
          // Création du personnel et ajout des employés
          Personnel personnel = new Personnel();
          personnel.ajouterEmploye(e1);
          personnel.ajouterEmploye(e2);
          personnel.ajouterEmploye(e3);
          personnel.ajouterEmploye(r1);
          personnel.ajouterEmploye(r2);
          personnel.ajouterEmploye(c1);
  
          // Affichage des informations
          System.out.println("Salaires des employés:");
          e1.afficherCaracteristiques();
          System.out.println("Salaire: " + e1.calculerSalaire());
  
          e2.afficherCaracteristiques();
          System.out.println("Salaire: " + e2.calculerSalaire());
  
          c1.afficherCaracteristiques();
          System.out.println("Salaire: " + c1.calculerSalaire());
  
          System.out.println("\nInférieurs directs et indirects de David:");
          r1.afficherInferieursDirects();
          r1.afficherInferieursIndirects();
  
          System.out.println("\nSomme des salaires à verser: " + personnel.calculerSommeSalaires());
      }
  }
  