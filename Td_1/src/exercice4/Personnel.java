package exercice4;

class Personnel {
    Employe[] employes;
    int nombreEmployes;

    public Personnel(int tailleMaximale) {
        employes = new Employe[tailleMaximale];
        nombreEmployes = 0;
    }

    public void ajouterEmploye(Employe employe) {
        employes[nombreEmployes++] = employe;
    }

    public double calculerTotalSalaires() {
        double totalSalaires = 0;
        for (int i = 0; i < nombreEmployes; i++) {
            totalSalaires = totalSalaires + employes[i].calculer();
        }
        return totalSalaires;
    }
}
