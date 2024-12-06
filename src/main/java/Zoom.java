import bandeau.Bandeau;

import java.awt.Font;

public class Zoom extends Effet {
    private int maxTaille;

    public Zoom(Bandeau bandeau, int maxTaille) {
        super(bandeau);
        this.maxTaille = maxTaille;
    }

    @Override
    public void jouerEffet() {
        Font policeInitiale = bandeau.getFont(); // Sauvegarde de la police initiale
        for (int taille = 5; taille <= maxTaille; taille += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, taille));
            bandeau.sleep(100);
        }
        bandeau.setFont(policeInitiale); // Restauration de la police initiale
    }
}

