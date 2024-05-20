package Exo3;
import java.util.ArrayList;
import java.util.List;

public class Entreprise {
    private List<Employer> personnel;

    public Entreprise() {
        this.personnel = new ArrayList<>();
    }

    public void ajouterEmploye(Employer employe) {
        this.personnel.add(employe);
    }

    public double calculerSommeSalaires() {
        double sommeSalaires = 0.0;
        for (Employer employe : this.personnel) {
            sommeSalaires += employe.calculerSalaire();
        }
        return sommeSalaires;
    }
}

