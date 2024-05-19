public class Main {
      public static void main(String[] args) {
          // Création des employés
          Employe e1 = new Employe("Alice", "E001", 3);
          Employe e2 = new Employe("Bob", "E002", 4);
          
          // Création d'un responsable
          Responsable r1 = new Responsable("Charlie", "R001", 5);
          r1.ajouterSubordonne(e1);
          r1.ajouterSubordonne(e2);
          
          // Création d'un commercial
          Commercial c1 = new Commercial("David", "C001", 2, 1000);
          
          // Création de l'entreprise et ajout des employés
          Entreprise entreprise = new Entreprise();
          entreprise.ajouterEmploye(e1);
          entreprise.ajouterEmploye(e2);
          entreprise.ajouterEmploye(r1);
          entreprise.ajouterEmploye(c1);
          
          // Affichage des caractéristiques des employés
          e1.afficherCaracteristiques();
          e2.afficherCaracteristiques();
          r1.afficherCaracteristiques();
          c1.afficherCaracteristiques();
          
          // Affichage des subordonnés directs et indirects
          r1.afficherInferieursDirects();
          r1.afficherInferieursIndirects();
          
          // Calcul et affichage de la somme des salaires
          System.out.println("Somme des salaires à verser: " + entreprise.calculerSommeSalaires());
      }
  }
  