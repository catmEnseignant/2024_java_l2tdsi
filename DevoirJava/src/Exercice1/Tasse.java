package Exercice1;

public class Tasse {
   public Liquide liquide;
   
   public void AjouterLiquide(Liquide li) {
	   this.liquide=li ;
   }
   public void imprimer() {
	   if(liquide!=null) {
		   liquide.Imprimer();
	   }else {
		   System.out.println("la tasse est vide");
	   }	 
   }
}
