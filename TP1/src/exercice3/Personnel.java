package exercice3;

import java.util.ArrayList;

class Personnel
{
    private ArrayList<Employe> employes;

    public Personnel() {
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e)
    {
        employes.add(e);
    }

    public double calculerSommeSalaires()
    {
        double somme = 0.0;
        for (Employe e : employes)
        {
            somme += e.calculerSalaire();
        }
        return somme;
    }
}

