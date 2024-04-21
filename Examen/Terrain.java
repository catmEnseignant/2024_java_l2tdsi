package Examen;

public class Terrain {
    private double longueur;
    private double largeur;
    private String typePropriete;
    private String adresse;
    private boolean occupe;
    private Personne personne;

    public Terrain(double longueurParam, double largeurParam, String typeProprieteParam, String adresseParam,
            boolean occupeParam) {
        this.longueur = longueurParam;
        this.largeur = largeurParam;
        this.typePropriete = typeProprieteParam;
        this.adresse = adresseParam;
        this.occupe = occupeParam;
    }

}

    public double CalculerSurface() {
        return this.longueur * this.largeur;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public void setLongueur(double longueuParam) {
        this.longueur = longueuParam;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLargeur(double largeurParam) {
        this.largeur = largeurParam;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setTypePropriete(double typeProprieteParam) {
        this.largeur = typeProprieteParam;
    }

    public String getTypePropriete() {
        return typePropriete;
    }

    public void setAdresse(double adresseParam) {
        this.largeur = adresseParam;
    }

    public String getAdresse() {
        return adresse;
    }

    public void allouer(Personne personne) {
        if (!this.occupe) {
            this.personne = personne;
            this.occupe = true;
            System.out.println("Le terrain a été attribué à " + personne.getNom() + ".");
        } else {
            System.out.println("Le terrain est déjà occupé par " + this.personne.getNom() + ".");
        }

    public String informationTerrain() {
        return " mon longueur  " + this.longueur + "   ma largeur  " + this.largeur + "  mon type de propriete "
                + this.typePropriete + "mon adresse " + this.adresse + "occupe" + this.occupe;

    }
}