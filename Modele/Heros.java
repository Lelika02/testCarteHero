package Modele;

/**
 * Classe représentant un héros
 */
public class Heros {
    
    private int x;
    private int y;

    //Constructeur(créer un héros avec une position (x,y) initiale)
    public Heros(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Déplacement du personnage en fonction des instructions saisies(par exemple SSNNOOEE)
     */
    public void déplacer(Carte carte, String instructions) {
        for(int i = 0; i < instructions.length(); i++) {
            char value = instructions.charAt(i);

            switch (value) {
                case 'N':
                    if(carte.isCaseBlanche(x, y-1)) {
                        this.y--;
                    }
                    break;
                case 'S':
                    if(carte.isCaseBlanche(x, y+1)) {
                        this.y++;
                    }
                    break;
                case 'O':
                    if(carte.isCaseBlanche(x-1, y)) {
                        this.x--;
                    }
                    break;
                case 'E':
                    if(carte.isCaseBlanche(x+1, y)) {
                        this.x++;
                    }
                    break;
            
                default:
                    break;
            }
        }
        
    }
}