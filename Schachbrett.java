import java. awt. event. *;
import java. awt. *;
import javax. swing. *;

/**
 * Verwaltet das Ausgabefenster.
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class Schachbrett 
{
    /** Anzeigegröße für eine Rasterkachel */
    public static final int rasterGroesse = 80;
    /** Höhe des Anzeigefensters */
    public static final int hoeheFenster = rasterGroesse * 10;
    /** Breite des Anzeigefensters */
    public static final int breiteFenster = rasterGroesse * 10;
    public static Schachbrett o = null;
    public JFrame  Schachfiguren = null;
    Schachfiguren [] schachfiguren;
    /**
     * Baut die Bedienoberfläche auf
     */
    public Schachbrett ()
    {
        Schachfiguren = new JFrame() ;
        Schachfiguren. setResizable (false);
        Schachfiguren. setVisible (true);
        Schachfiguren. setLayout (null);
        Schachfiguren. getContentPane (). setBackground (new Color (240, 240, 240));
        Insets i = Schachfiguren.getInsets();
        Schachfiguren. setSize (breiteFenster, hoeheFenster + i.top);         // Ausgleich für Fenstertitel
        JComponent hintergrund = new JComponent ()
        {
             /**
             * Zeichnet das Hintergrundmuster.
             */
            public void paintComponent (Graphics g)
            {
                g. setColor (Color. lightGray);
                for (int i = 1; i <= hoeheFenster / (rasterGroesse * 2); i++)
                {
                    g. drawLine (0, hoeheFenster / 2 + i * rasterGroesse, breiteFenster - 1, hoeheFenster / 2 + i * rasterGroesse);
                    g. drawLine (0, hoeheFenster / 2 - i * rasterGroesse, breiteFenster - 1, hoeheFenster / 2 - i * rasterGroesse);
                }
                for (int i = 1; i <= breiteFenster / (rasterGroesse * 2); i++)
                {
                    g. drawLine (breiteFenster / 2 + i * rasterGroesse, 0, breiteFenster / 2 + i * rasterGroesse, hoeheFenster - 1);
                    g. drawLine (breiteFenster / 2 - i * rasterGroesse, 0, breiteFenster / 2 - i * rasterGroesse, hoeheFenster - 1);
                }
                g. setColor (Color. black);
                g. drawLine (0, hoeheFenster / 2, breiteFenster - 1, hoeheFenster / 2);
                g. drawLine (breiteFenster / 2, 0, breiteFenster / 2, hoeheFenster - 1);
            }
        };
        hintergrund. setVisible (true);
        hintergrund. setSize (breiteFenster, hoeheFenster);
        hintergrund. setLocation (0, 0);
        Schachfiguren. add (hintergrund);
    }

    /**
     * Gibt das Ausgabefenster zurück und erzeugt es gegebenenfalls.
     * @return Ausgabefenster
     */
    static JFrame FensterGeben ()
    {
        if (o == null)
        {
            o = new Schachbrett ();
        }
        return o. Schachfiguren;
    }

    /**
     * Gibt die Rastergröße zurück.
     * @return Ausgabefenster
     */
    static int RasterGroesseGeben ()
    {
        return rasterGroesse;
    }

    /**
     * Gibt die Breite des Fensters zurück.
     * @return Fensterbreite
     */
    static int FensterBreiteGeben ()
    {
        return breiteFenster;
    }

    /**
     * Gibt die Höhe des Fensters zurück.
     * @return Fensterhöhe
     */
    static int FensterHoeheGeben ()
    {
        return hoeheFenster;
    }
}