package Exercice1;
public class Cafe extends Liquide {
    protected  String LI;
    protected  String cafe;
      public String Imprimer(){
          this.LI =super.Imprimer();
          this.cafe="cafe.";
           System.out.println(LI+cafe);
                     return LI;
      }
      
       public String cafes( String C){
          C=this.cafe;
          return C;
          
      }
        
 
}