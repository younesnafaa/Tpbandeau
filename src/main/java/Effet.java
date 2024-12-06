import bandeau.Bandeau;

public abstract class Effet {
    protected Bandeau bandeau;

    public Effet(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    // Méthode abstraite que chaque effet doit implémenter
    public abstract void jouerEffet();
}
