package exercice3;
import java.util.*;
public class Responsable extends Employe
{
    private List<Employe> subTab;
    public Responsable(String nom, int mat, int indice)
    {
        super(nom, mat, indice);
        this.subTab = new ArrayList<>();
    }
    @Override
    public void calculSalaire()
    {
        this.Salaire=this.indiceS*getValeurS();
    }

    @Override
    public float getSalaire() {
        return Salaire;
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public void afficher()
    {
        System.out.println("Le responsable au nom "+this.nom+" avec la matricule "+this.matricule+" a un salaire de "+this.Salaire+".");
    }

    public void ajouter(Employe e) {
        subTab.add(e);
    }

    public void afficherSubDirects() {
        System.out.println("Subordonnés directs de " + getNom() + " :");
        for (Employe e : subTab) {
            System.out.println("  - " + e.getNom());
        }
    }

    public void afficherTousLesSubordonnes() {
        System.out.println("Tous les subordonnés de " + getNom() + " :");
        afficherTousLesSubordonnes(this);
    }

    private void afficherTousLesSubordonnes(Responsable r) {
        for (Employe e : r.subTab) {
            System.out.println("  - " + e.getNom());
            if (e instanceof Responsable) {
                afficherTousLesSubordonnes((Responsable) e);
            }
        }
    }

}
