package Exercice1;
public class Lait extends Liquide {
    protected  String LI;
    protected  String lait;
      public String Imprimer(){
          this.LI =super.Imprimer();
          this.lait="lait.";
             System.out.println(LI+lait);
                     return LI;
      }
      public String Laits( String L){
          L=this.lait;
          return L;
          
      }
        
 
}
