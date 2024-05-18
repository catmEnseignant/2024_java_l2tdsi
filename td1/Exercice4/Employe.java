public class Employe {
      private String nom;
      private String matricule;
      private int indiceSalarial;
      private static double valeurSalaire = 100; // Valeur de base pour le calcul du salaire, peut changer
  
      public Employe(String nom, String matricule, int indiceSalarial) {
          this.nom = nom;
          this.matricule = matricule;
          this.indiceSalarial = indiceSalarial;
      }
  
      public void afficherCaracteristiques() {
          System.out.println("Nom: " + nom + ", Matricule: " + matricule + ", Indice Salarial: " + indiceSalarial);
      }
  
      public double calculerSalaire() {
          return indiceSalarial * valeurSalaire;
      }
  
      public static void setValeurSalaire(double nouvelleValeurSalaire) {
          valeurSalaire = nouvelleValeurSalaire;
      }
  
      public String getNom() {
          return nom;
      }
  }
  