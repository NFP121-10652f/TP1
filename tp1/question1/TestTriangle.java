package question1;
import question1.Triangle;

/**
 * D�crivez votre classe TestTriangle ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
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
