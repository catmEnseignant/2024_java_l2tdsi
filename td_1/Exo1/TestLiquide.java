
public class TestLiquide {
    public static void main(String args[]){
        
        Tasse[] tasses = new Tasse[2];

        Tasse tasse1 = new Tasse();
        Tasse tasse2 = new Tasse();

        Liquide cafe = new Cafe();
        Liquide lait = new Lait();
    
    
        tasse1.AjouterLiquide(cafe);
        tasse2.AjouterLiquide(lait);
    
        tasses[0] = tasse1;
        tasses[1] = tasse2;

        tasses[0].imprimer();
        tasses[1].imprimer();
    }
    
}
