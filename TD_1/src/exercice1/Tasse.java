package exercice1;

public class Tasse {
    private Liquide l;

    public Liquide AjouterLiquide(Liquide li)
    {
        return this.l = li;
    }

    public void imprimer()
    {
        if (this.l!=null)
        {
            l.imprimer();
        }
        else
        {
            System.out.println("Votre tasse est vide.");
        }
    }
}
