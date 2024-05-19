import java.util.ArrayList;
import java.util.List;

public class Entreprise {
    private List<Employe> personnel;

    public Entreprise() {
        personnel = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        personnel.add(employe);
    }

    public double calculerSommeSalaires() {
        double somme = 0;
        for (Employe employe : personnel) {
            somme += employe.calculerSalaire();
        }
        return somme;
    }
}
