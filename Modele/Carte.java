package Modele;

/**
 * Classe représentant une carte
 */
public class Carte {

    //Initialisation de la carte
    private boolean[][] carte = {
        {false, false, true, true, true, false, true, false},
        {true, true, true, true, true, false, true, false},
        {false, false, true, false, false, false, true, false},
        {false, false, true, true, true, false, true, false},
        {true, true, false, true, true, false, true, false},
        {false, false, false, true, true, true, true, false},
        {false, false, false, true, true, true, true, false},
        {false, false, true, true, true, true, true, false},
        {false, false, true, true, true, false, true, false},
        {false, false, true, true, true, false, true, true},
    };

    public Carte() {
        
    }

    /**
     * @return la largeur de la carte
     */
    public int getWidth() {
        return this.carte[0].length;
    }

    /**
     * @return la hauteur de la carte
     */
    public int getHeight() {
        return this.carte.length;
    }

    /**
     * On vérifie si la valeur de x et y ne dépasse pas les bords de la carte
     * @param x
     * @param y
     * @return true si c'est une case blanche(possède la valeur true dans la carte)
     */
    public boolean isCaseBlanche(int x, int y) {
        if(x >= 0 && x <= getWidth() && y >= 0 && y <= getHeight()) {
            return carte[x][y];
        }
        return false;
    }
    
}