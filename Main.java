import java.util.Scanner;
import Modele.Carte;
import Modele.Heros;

/**
 * Classe de test
 */
public class Main {
    
    public static void main(String[] args) {

        //Créer un objet Scanner pour la saisie des informations
        Scanner scanner = new Scanner(System.in);

        //Récupérer la position x initiale du héros
        System.out.println("Saisir la position x du héros : ");
        int xValue = scanner.nextInt();

        //Récupérer la position y initiale du héros
        System.out.println("Saisir la position y du héros : ");
        int yValue = scanner.nextInt();

        //Récupérer les instructions de déplacement du héros
        System.out.println("Saisir les instructions de déplacement : ");
        String instructions = scanner.next();

        //Afficher la position finale du héros
        Carte carte = new Carte();
        Heros heros = new Heros(xValue, yValue);
        heros.déplacer(carte, instructions);
        System.out.println("La position finale du héros est : (" + heros.getX() + ", " + heros.getY() + ")");
    }
}
