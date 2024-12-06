import bandeau.Bandeau;

import java.awt.Color;

public class Clignotant extends Effet {
    private int repetitions;

    public Clignotant(Bandeau bandeau, int repetitions) {
        super(bandeau);
        this.repetitions = repetitions;
    }

    @Override
    public void jouerEffet() {
        Color couleurInitiale = bandeau.getForeground(); // Sauvegarde de la couleur initiale
        for (int i = 0; i < repetitions; i++) {
            bandeau.setForeground(Color.BLACK);
            bandeau.sleep(200);
            bandeau.setForeground(Color.WHITE);
            bandeau.sleep(200);
        }
        bandeau.setForeground(couleurInitiale); // Restauration de la couleur initiale
    }
}

