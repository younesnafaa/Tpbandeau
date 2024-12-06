import bandeau.Bandeau;

public class Rotation extends Effet {
    private int repetitions;

    public Rotation(Bandeau bandeau, int repetitions) {
        super(bandeau);
        this.repetitions = repetitions;
    }

    @Override
    public void jouerEffet() {
        double rotationInitiale = bandeau.getRotation(); // Sauvegarde de la rotation initiale
        for (int i = 0; i < repetitions; i++) {
            for (int angle = 0; angle <= 360; angle += 10) {
                bandeau.setRotation(Math.toRadians(angle));
                bandeau.sleep(50);
            }
        }
        bandeau.setRotation(rotationInitiale); // Restauration de la rotation initiale
    }
}
