import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public class TestScenario {
    public static void main(String[] args) {
        // Création du bandeau
        Bandeau bandeau = new Bandeau();
        bandeau.setMessage("Démonstration des scénarios");
        bandeau.setFont(new Font("SansSerif", Font.BOLD, 20));
        bandeau.setForeground(Color.BLUE);

        // Création d'un scénario
        Scenario scenario = new Scenario();

        // Ajout d'effets au scénario
        scenario.ajouterEffet(new Clignotant(bandeau, 5), 1);  // Clignotant répété 1 fois
        scenario.ajouterEffet(new Rotation(bandeau, 1), 2);    // Rotation répétée 2 fois
        scenario.ajouterEffet(new Zoom(bandeau, 50), 1);       // Zoom répété 1 fois

        // Exécution du scénario
        scenario.jouer();

        // Fin du scénario
        bandeau.setMessage("Fin du scénario");
        bandeau.sleep(3000);
        bandeau.close();
    }
}
