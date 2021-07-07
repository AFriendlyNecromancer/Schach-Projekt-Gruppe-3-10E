import java.awt.*;
import javax. swing. *;

public class Bauer
{
    private JFrame fenster;
    
    private static final int groesse = Schachbrett. RasterGroesseGeben ();

    private JComponent anzeige;
    
    int x, xAnfang;
    int y, yAnfang;
    int xJetzt = XPositionGeben ();
    int yJetzt = YPositionGeben ();
    Bauer()
    {
        yAnfang = 1;
        xAnfang = 2;
        
        fenster = Schachbrett. FensterGeben ();
        anzeige = new JComponent () {
            // Stellt die Figur auf dem Fenster dar.
            public void paintComponent (Graphics g)
            {
                g. clearRect (0, 0, groesse, groesse);
                g. setColor (Color. white);
                g. fillRect (0, 0, groesse - 1, groesse - 1);
                g. setColor (new Color (255, 0, 0));
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

    public void Entfernen ()
    {
        (Schachbrett. FensterGeben ()). remove (anzeige);
        (Schachbrett. FensterGeben ()). repaint();
    }
    
    int XPositionGeben ()
    {
        return x;
    }

    int YPositionGeben ()
    {
        return y;
    }
    
    public void CheckBauer (int x, int y)
    {
        if (xJetzt == xAnfang && yJetzt == yAnfang)
        {
            BauerBewegen1();
        }
        else
        {
            BauerBewegen2();
        }
    }
    
    void BauerBewegen1()
    {
        //Hier wird bestimmt das der Bauer sich 1 bzw. 2 felder nach vorne bewegen kann
    }

    void BauerBewegen2()
    {
        //Im Falle das die jetzige Position des Bauers nicht der anfänglichen entspricht
        //wird diese Methode aufgerufen --> Der Bauer kann sich ein Feld nach vorne bewegen
    }    

class Bauerb
{
    private JFrame fenster;

    private final int groesse = Schachbrett. RasterGroesseGeben ();
    
    private int x;
    private int y;
    
    private JComponent anzeige;
    Bauerb()
    {
        fenster = Schachbrett. FensterGeben ();
        anzeige = new JComponent () {
            // Stellt die Figur auf dem Fenster dar.
            public void paintComponent (Graphics g)
            {
                g. clearRect (0, 0, groesse, groesse);
                g. setColor (Color. black);
                g. fillRect (0, 0, groesse - 1, groesse - 1);
                g. setColor (new Color (255, 0, 0));
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
    
    public void BauerBewegen (int x, int y)
    {
        
    }
  }
}