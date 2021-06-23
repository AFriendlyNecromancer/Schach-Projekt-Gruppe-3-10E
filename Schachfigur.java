
public abstract class Schachfigur
{
    // instance variables - replace the example below with your own
    protected int x; //Spalte 0...7
    protected int y; // Zeile 0...7
    protected boolean istWeiß;
    protected char form;
    
    //Annahme: xZiel und yZiel sind zwischen 0 und 7
    //Annahme: Zielpunkt != Startpunkt
    //Annahme: Niemand steht im Weg
    //Rückgabe: ist der zug erlaubt
    public abstract boolean BewegeNach(int xZiel, int yZiel); 
    
    public Schachfigur(int x, int y, boolean istWeiß, char form)
    {
        this.x = x;
        this.y = y;
        this.istWeiß = istWeiß;
        this.form = form;
    }
}