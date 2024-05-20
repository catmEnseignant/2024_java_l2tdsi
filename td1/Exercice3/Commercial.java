public class Commercial extends Employe {
      private double ventesDernierMois;
      private double pourcentageCommission;
  
      public Commercial(String nom, String matricule, double indiceSalarial, double pourcentageCommission) {
          super(nom, matricule, indiceSalarial);
          this.pourcentageCommission = pourcentageCommission;
      }
  
      public void mettreAJourVentes(double ventes) {
          this.ventesDernierMois = ventes;
      }
  
      @Override
      public double calculerSalaire() {
          return super.calculerSalaire() + (ventesDernierMois * pourcentageCommission);
      }
  }
  