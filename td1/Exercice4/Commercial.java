public class Commercial extends Employe {
      private double ventesDuMois;
  
      public Commercial(String nom, String matricule, int indiceSalarial, double ventesDuMois) {
          super(nom, matricule, indiceSalarial);
          this.ventesDuMois = ventesDuMois;
      }
  
      public void mettreAJourVentes(double nouvellesVentes) {
          this.ventesDuMois = nouvellesVentes;
      }
  
      @Override
      public double calculerSalaire() {
          return super.calculerSalaire() + 0.1 * ventesDuMois; // Exemple: 10% des ventes comme bonus
      }
  }
  