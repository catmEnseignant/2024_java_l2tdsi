public class TriTab {
      private int[] tab;
  
      public TriTab(int[] tab) {
          this.tab = tab;
      }
  
      // Méthode pour rechercher le minimum dans tab entre les indices i et j
      private int rechercheMin(int i, int j) {
          int minIndex = i;
          for (int k = i + 1; k <= j; k++) {
              if (tab[k] < tab[minIndex]) {
                  minIndex = k;
              }
          }
          return minIndex;
      }
  
      // Méthode pour trier tab
      public void tri() {
          int n = tab.length;
          for (int i = 0; i < n - 1; i++) {
              int minIndex = rechercheMin(i, n - 1);
              // Échanger tab[i] avec le minimum trouvé
              int temp = tab[minIndex];
              tab[minIndex] = tab[i];
              tab[i] = temp;
          }
      }
  }
  