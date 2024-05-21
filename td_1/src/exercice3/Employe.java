package exercice3;

public class Employe
{
    protected String nom;
    protected int matricule;
    protected int indiceS;
    protected final float ValeurS = 50000;
    protected float Salaire;

    public float getSalaire() {
        return Salaire;
    }

    public Employe(String nom, int mat, int indice)
    {
        this.nom=nom;
        this.matricule=mat;
        this.indiceS=indice;
    }

    public String getNom()
    {
        return nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public float getValeurS() {
        return ValeurS;
    }

    public void calculSalaire()
    {
        this.Salaire=this.indiceS*this.ValeurS;
    }

    public void afficher()
    {
        System.out.println("L'employe au nom "+this.nom+" avec la matricule "+this.matricule+" a un salaire de "+this.Salaire+".");
    }
}
