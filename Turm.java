import java.awt.*;
import javax. swing. *;
public class Turm
{
    private JFrame fenster;

    private static final int groesse = Schachbrett. RasterGroesseGeben ();

    public int x;
    public int y;
    private JComponent anzeige;

    Turm()
    {
        fenster = Schachbrett. FensterGeben ();
        anzeige = new JComponent () {
            // Stellt die Figur auf dem Fenster dar.
            public void paintComponent (Graphics g)
            {
                g. clearRect (0, 0, groesse, groesse);
                g. setColor (Color. white);
                g. fillRect (0, 0, groesse - 1, groesse - 1);
                g. setColor (new Color (255, 0, 255));
                g. drawRect (0, 0, groesse - 1, groesse - 1);
                g. drawRect (1, 1, groesse - 3, groesse - 3);
                g. drawLine (0, 0, groesse - 1, groesse - 1);
                g. drawLine (1, 0, groesse - 1, groesse - 2);
                g. drawLine (0, 1, groesse - 2, groesse - 1);
                g. drawLine (0, groesse - 1, groesse - 1, 0);
                g. drawLine (1, groesse - 1, groesse - 1, 1);                
                g. drawLine (0, groesse - 2, groesse - 2, 0);
            }

        };
        anzeige. setVisible (true);
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (0, 0);
    }

    public void PositionSetzen (int x, int y)
    {
        this. x = x;
        this. y = y;
        anzeige. setLocation (Schachbrett. FensterBreiteGeben () / 2 + x * groesse, Schachbrett. FensterHoeheGeben () / 2 + y * groesse);
    }

    int XPositionGeben ()
    {
        return x;
    }

    int YPositionGeben ()
    {
        return y;
    }

    public void Entfernen ()
    {
        (Schachbrett. FensterGeben ()). remove (anzeige);
        (Schachbrett. FensterGeben ()). repaint();
    }
}
class Turmb
{
    private JFrame fenster;

    private static final int groesse = Schachbrett. RasterGroesseGeben ();

    public int x;
    public int y;
    private JComponent anzeige;

    Turmb()
    {
        fenster = Schachbrett. FensterGeben ();
        anzeige = new JComponent () {
            // Stellt die Figur auf dem Fenster dar.
            public void paintComponent (Graphics g)
            {
                g. clearRect (0, 0, groesse, groesse);
                g. setColor (Color. black);
                g. fillRect (0, 0, groesse - 1, groesse - 1);
                g. setColor (new Color (255, 0, 255));
                g. drawRect (0, 0, groesse - 1, groesse - 1);
                g. drawRect (1, 1, groesse - 3, groesse - 3);
                g. drawLine (0, 0, groesse - 1, groesse - 1);
                g. drawLine (1, 0, groesse - 1, groesse - 2);
                g. drawLine (0, 1, groesse - 2, groesse - 1);
                g. drawLine (0, groesse - 1, groesse - 1, 0);
                g. drawLine (1, groesse - 1, groesse - 1, 1);                
                g. drawLine (0, groesse - 2, groesse - 2, 0);
            }

        };
        anzeige. setVisible (true);
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (0, 0);
    }

    public void PositionSetzen (int x, int y)
    {
        this. x = x;
        this. y = y;
        anzeige. setLocation (Schachbrett. FensterBreiteGeben () / 2 + x * groesse, Schachbrett. FensterHoeheGeben () / 2 + y * groesse);
    }

    int XPositionGeben ()
    {
        return x;
    }

    int YPositionGeben ()
    {
        return y;
    }

    public void Entfernen ()
    {
        (Schachbrett. FensterGeben ()). remove (anzeige);
        (Schachbrett. FensterGeben ()). repaint();
    }
}