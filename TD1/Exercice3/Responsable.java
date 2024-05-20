import java.util.*;
// import java.util.Scanner;
// import java.util.Arrays;

public class Responsable extends Employes {
    public Responsable(String nom, String matricule, double indiceSalarial, double SalaireNormal)
    {
        super(nom, matricule, indiceSalarial, SalaireNormal);
        this.inferieursDirects = new ArrayList<Employes>();
    }

    public void ajouterInferieurs(Employes e){
        this.inferieursDirects.add(e);
    }

    public void afficherInferieursDirects(){ 
        System.out.println("Inférieurs directs de " + getNom() + ":");
        for(Employes inferieur : inferieursDirects){
            System.out.println(" - " + inferieur.getNom());
        }
        System.out.println();
    }

    public void afficherInferieurs() {
        System.out.println("Tous les inférieurs de " + getNom() + ":");
        afficherInferieursRecursif(this);
        System.out.println();
    }

    private void afficherInferieursRecursif(Responsable r) {
        for (Employes e : r.inferieursDirects) {
            System.out.println(" - " + e.getNom());
            if (e instanceof Responsable) {
                afficherInferieursRecursif((Responsable) e);
            }
        }
    }

    private List<Employes> inferieursDirects;
}