public class Employe {
      private String nom;
      private String matricule;
      private double indiceSalarial;
      private static double valeurIndice = 1000.0; // Exemple de valeur pour l'indice salarial
  
      public Employe(String nom, String matricule, double indiceSalarial) {
          this.nom = nom;
          this.matricule = matricule;
          this.indiceSalarial = indiceSalarial;
      }
  
      public void afficherCaracteristiques() {
          System.out.println("Nom: " + nom);
          System.out.println("Matricule: " + matricule);
          System.out.println("Indice Salarial: " + indiceSalarial);
      }
  
      public double calculerSalaire() {
          return indiceSalarial * valeurIndice;
      }
  
      public static void setValeurIndice(double nouvelleValeur) {
          valeurIndice = nouvelleValeur;
      }
  }

  