public class Tasse {
      private liquide l;
  
      public void AjouterLiquide(liquide li) {
          this.l = li;
      }
  
      public void imprimer() {
          if (l != null) {
              l.imprimer();
          } else {
              System.out.println("la tasse est vide");
          }
      }
  }
  