package exo2;

public class Tasse {
    private Liquide l;

    public void AjouterLiquide(Liquide li) {
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
