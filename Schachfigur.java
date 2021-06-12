
public abstract class Schachfigur
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
    public @override bool BewegeNach(int xZiel, int yZiel);
    {
     return xZiel == x || yZiel == y;
    }    
}