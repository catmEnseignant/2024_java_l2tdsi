public class Personne {
    private String numeroTelephone;
    private String prenom;
    private String nom;
    public double surfaceOccupe;


    public Personne(String numeroTelephone, String prenom, String nom)
    {
        this.numeroTelephone = numeroTelephone;
        this.prenom = prenom;
        this.nom = nom;
        this.surfaceOccupe = 0;
        
    }

    public void setSurfaceOccupe(double surf)
    {
        this.surfaceOccupe = surf;
    }



    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSurfaceOccupe() {
        return surfaceOccupe;
    }

    public void print()
    {
        System.out.println(this.prenom+" "+this.nom+" dont le numero est '"+this.numeroTelephone+"' occupe le terrain de surface:"+this.surfaceOccupe+" .");
        System.out.println("");
    }
}
