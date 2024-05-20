public class Tasse {
    
    public Liquide liquide;

    public void AjouterLiquide(Liquide liquide){
        this.liquide = liquide;
    }

    public void imprimer(){
        if (liquide != null) {
            liquide.imprimer();
        }
        else{
            System.out.println("La tasse est vide");
        }
    }
}
