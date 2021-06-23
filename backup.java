
public abstract class Schachfigur
{ 
    protected int x; //Spalte 0...7
    protected int y; // Zeile 0...7
    protected boolean istWeiß;
    protected char form;
    private boolean white = false;
    //Annahme: xZiel und yZiel sind zwischen 0 und 7
    //Annahme: Zielpunkt != Startpunkt
    //Annahme: Niemand steht im Weg
    //Rückgabe: ist der zug erlaubt
    public Schachfigur(boolean white)
    {
        this.setWhite(white);
    }
    public boolean isWhite()
    {
        return this.white;
    }
    public void setWhite(boolean white)
    {
        this.white = white;
    }
    public abstract void BewegeNach(int xZiel, int yZiel);
    /**
 * Das Symbol des Schlangenrumpfs.
 * Das Fenster wird bei Bedarf generiert.
 *
 * @author Albert Wiedemann
 * @version 1.0
 */
