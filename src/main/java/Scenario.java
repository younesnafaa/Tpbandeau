import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private List<Effet> effets;           // Liste des effets à jouer
    private List<Integer> repetitions;   // Nombre de répétitions pour chaque effet

    public Scenario() {
        this.effets = new ArrayList<>();
        this.repetitions = new ArrayList<>();
    }

    // Ajouter un effet avec le nombre de répétitions
    public void ajouterEffet(Effet effet, int repetition) {
        effets.add(effet);
        repetitions.add(repetition);
    }

    // Jouer tous les effets du scénario
    public void jouer() {
        for (int i = 0; i < effets.size(); i++) {
            Effet effet = effets.get(i);
            int repetition = repetitions.get(i);

            // Jouer l'effet avec le nombre de répétitions spécifié
            for (int j = 0; j < repetition; j++) {
                effet.jouerEffet();
            }
        }
    }
}
