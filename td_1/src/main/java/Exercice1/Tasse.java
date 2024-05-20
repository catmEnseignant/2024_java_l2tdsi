package Exercice1;
public class Tasse {
    private Liquide l;

    public void ajouterLiquide(Liquide li) {
        this.l = li ;
}


public void imprimer() {
    if (l != null) {
        l.imprimer();
    } else {
        System.out.println("La tasse est vide");
    }
}

}