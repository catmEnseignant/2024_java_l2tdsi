public class testliquide { // 2/2 : Il faut mettre la première lettre en majuscule pour le nom d'une classe
        public static void main(String[] args) {
        tasse[] tasses = new tasse[3];

        tasses[0] = new tasse();
        tasses[0].ajouterliquide(new cafe());

        tasses[1] = new tasse();
        tasses[1].ajouterliquide(new lait());

        tasses[2] = new tasse();
        tasses[2].ajouterliquide(new liquide());

        for (tasse tasse : tasses) {
            tasse.imprimer();
        }
    }
}
