import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax. swing. *;
public class Spiel
{
  König könig;
  Dame dame;
  Bauer [] bauer;
  Turm turm;
  Springer springer;
  Laeufer laeufer;
  private Timer timer;
  Spiel (int x, int y)
  {
        könig = new König ();
        dame = new Dame ();
        bauer = new Bauer [8];
        turm = new Turm ();
        springer = new Springer();
        laeufer = new Laeufer();
        for (int i = 0; i < bauer. length; i++)
        {
            bauer [i] = new Bauer ();
        }
        for (int i = 0; i < bauer. length; i++)
        {
            bauer [i]. PositionSetzen (x + (bauer. length - i), y);
        }
  }
  {
  timer = new Timer (1000, new ActionListener () {
  public void actionPerformed (ActionEvent evt)
  {
      TaktImpulsAusfuehren ();
           
  }
  });
        Schachbrett. FensterGeben (). addKeyListener (new KeyAdapter() {
            /**
             * Gibt die Taste an die eigentliche Aktionsmethode weiter.
             * @param e das zugrestellte Ereignis
             */
            public void keyPressed(KeyEvent e)
            {
                TasteGedrueckt ((char) e. getKeyCode ());
            }
        });

    }
        /**
     * Die eigentliche Aktionsmethode des Timers.
     * Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     */
    void TaktImpulsAusfuehren ()
    {
        System. out. println ("Tick");
    }

    /**
     * Timer starten
     */
    void Starten ()
    {
        timer. start ();
    }

    /**
     * Timer anhalten
     */
    void Anhalten ()
    {
        timer. stop ();
    }
    
    /**
     * Ablaufgeschwindigkeit einstellen
     * 
     * @param dauer: Angabe in Millisekunden
     */
    void TaktdauerSetzen (int dauer)
    {
        timer. setDelay(dauer);
    }
    
    /**
     * Die eigentliche Aktionsmethode für gedrückte Tasten.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     * @param welche die gedrückte Taste
     */
    void TasteGedrueckt (char welche)
    {
        System. out. println ("Taste gedrückt: " + welche);
    }

}
//define the concept of turns here
