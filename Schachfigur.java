
Achtung code ist unvollständig!!!
/**
 * Write a description of class Schachfigur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

abstract class Schachfigur
{
    // instance variables - replace the example below with your own
    protected int x; //Spalte 0...7
    protected int y; // Zeile 0...7
    protected bool IstWeiß;
    //Annahme: xZiel und yZiel sind zwischen 0 und 7
    //Annahme: Zielpunkt != Startpunkt
    //Annahme: Niemand steht im Weg
    //Rückgabe: ist der zug erlaubt
    public abstract bool BewegeNach(int xZiel, int yZiel);
}   
    
    class Turm extends Schachfigur
    {
        public override bool BewegeNach(int xZiel, int yZiel);
        {
            return xZiel == x || yZiel == y;
        }    
        
    }        
        

    /**
     * Constructor for objects of class Schachfigur
     */
    public Schachfigur()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
