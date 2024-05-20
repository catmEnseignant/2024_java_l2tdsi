public class Tasse
{
    private Liquide l;

    public void AjouterLiquide(Liquide li)
    {
        this.l = li;
    }

    public void imprimer()
    {
        if(this.l == null)
        {
            System.out.println("La tasse est vide.");
        } else {
            this.l.imprimer();
        }    
    }
}