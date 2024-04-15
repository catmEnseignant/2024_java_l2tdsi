public class Terrain {
    private double longueur;
    private double largeur;
    private String typePropriete;
    private String adresse;
    private boolean occupe = false;

    public Terrain(double longueur, double largeur, String typePropriete, String adresse, boolean occupe) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.typePropriete = typePropriete;
        this.adresse = adresse;
        this.occupe = occupe;
    }

    @Override
    public String toString() {
        return "Terrain{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", typePropriete='" + typePropriete + '\'' +
                ", adresse='" + adresse + '\'' +
                ", occupe=" + occupe +
                '}';
    }

    public double calculerSurface() {
        return longueur * largeur;
    }

    public void allouer(Personne p) {
        if (occupe= true) {
            System.out.println("Désolé ! Le terrain est déjà occupé.");
        } else {
            occupe = false;
            allouer(p) ;
        }
    }
}

