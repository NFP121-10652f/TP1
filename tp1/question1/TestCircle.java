package question1;
import question1.Circle;

/**
 * Décrivez votre classe TestCircle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TestCircle
{

       public static void main(final String[] args) { 
        Circle c;                            // reference 
        c = new Circle();
        c.makeVisible();
        c.slowMoveHorizontal(10);
        c.slowMoveVertical(20);
        c.changeColor("yellow");
        
    } 
}
