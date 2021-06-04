package question1;
import question1.Triangle;

/**
 * Décrivez votre classe TestTriangle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TestTriangle
{
       public static void main(final String[] args) { 
        Triangle t;                            // reference 
        t = new Triangle();
        t.changeColor("black");
        t.makeVisible();
        t.moveHorizontal(150);
        t.moveVertical(100);
       
        
    }
}
