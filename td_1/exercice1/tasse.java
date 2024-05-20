public class tasse {
    private liquide liquide;

    public void ajouterliquide(liquide li) {
        this.liquide = li;
    }

    public void imprimer() {
        if (liquide != null) {
            liquide.imprimer();
        } else {
            System.out.println("La tasse est vide");
        }
    }
}