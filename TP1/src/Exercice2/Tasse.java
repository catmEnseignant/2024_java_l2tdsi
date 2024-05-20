
package Exercice2;
class Tasse {
    private Liquide liquide;
    public void ajouterLiquide(Liquide liquide) {
        this.liquide = liquide;
    }
    public void imprimer() {
        if (liquide != null) {
            liquide.imprimer();
        } else {
            System.out.println("La tasse est vide");
        }
    }
}

    

