package question1;
import question1.Square;

/**
 * D�crivez votre classe TestSquare ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class TestSquare
{
       public static void main(final String[] args) { 
        Square s;                            // reference 
        s = new Square();
        s.changeColor("red");
        s.makeVisible();
        s.moveHorizontal(50);
        s.moveVertical(100);
       
        
    } 
}
