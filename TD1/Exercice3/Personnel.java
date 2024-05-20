import java.util.*;

public class Personnel {
    
    public Personnel()
    {
        this.employes = new ArrayList<Employes>();
    }

    public void ajouterEmploye(Employes e){
        employes.add(e);
    }

    public double SommeSalaire(){
        double somme = 0;
        for (Employes e : employes) {
            somme += e.calculerSalaire();
        }
        return somme;
    }

    public void affcherInfosPersonnel(){
        for (Employes e : employes) {
            e.afficherInfos();
            System.out.println();
        }
    }

    protected List<Employes> employes;
}
