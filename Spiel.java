import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax. swing. *;
public class Spiel
{
  Turmb [] turmb; 
  Dameb [] dameb;
  Laeuferb [] laeuferb;
  Springerb [] springerb;
  Königb [] königb;
  Bauerb [] bauerb;
  König [] könig;
  Dame [] dame;
  Bauer [] bauer;
  Turm [] turm;
  Springer [] springer;
  Laeufer [] laeufer;
  private Timer timer;
  Spiel(int x, int y)
  {
        bauer = new Bauer [8];
        bauerb = new Bauerb [8];
        könig = new König [1];
        königb = new Königb [1];
        dame = new Dame [1];
        dameb = new Dameb [1];
        turm = new Turm [1];
        turmb = new Turmb [1];
        springer = new Springer [1];
        springerb = new Springerb [1];
        laeufer = new Laeufer [1];
        laeuferb = new Laeuferb [1];
        for (int i = 0; i < bauer. length; i++)
        {
            bauer [i] = new Bauer ();
        }
        for (int i = 0; i < bauer. length; i++)
        {
            bauer [i]. PositionSetzen (x + (bauer. length - i), y);
        }
        for (int i = 0; i < bauerb. length; i++)
        {
            bauerb [i] = new Bauerb ();
        }
        for (int i = 0; i < bauerb. length; i++)
        {
            bauerb [i]. PositionSetzen (x + (bauerb. length - i), y-5);
        }
        for (int i = 0; i < könig. length; i++)
        {
            könig [i] = new König ();
        }
        for (int i = 0; i < könig. length; i++)
        {
            könig [i]. PositionSetzen (4+x + (könig. length - i), y+1);
        }
        for (int i = 0; i < königb. length; i++)
        {
            königb [i] = new Königb ();
        }
        for (int i = 0; i < königb. length; i++)
        {
            königb [i]. PositionSetzen (4+x + (königb. length - i), y-6);
        }
        for (int i = 0; i < dame. length; i++)
        {
            dame [i] = new Dame ();
        }
        for (int i = 0; i < dame. length; i++)
        {
            dame [i]. PositionSetzen (3+x + (dame. length - i), y+1);
        }
        for (int i = 0; i < dameb. length; i++)
        {
            dameb [i] = new Dameb ();
        }
        for (int i = 0; i < dameb. length; i++)
        {
            dameb [i]. PositionSetzen (3+x + (dameb. length - i), y-6);
        }
        for (int i = 0; i < springer. length; i++)
        {
            springer [i] = new Springer ();
        }
        for (int i = 0; i < springer. length; i++)
        {
            springer [i]. PositionSetzen (1+x + (springer. length - i), y+1);
        }
        for (int i = 0; i < springer. length; i++)
        {
            springer [i] = new Springer ();
        }
        for (int i = 0; i < springer. length; i++)
        {
            springer [i]. PositionSetzen (6+x + (springer. length - i), y+1);
        }
        for (int i = 0; i < springerb. length; i++)
        {
            springerb [i] = new Springerb ();
        }
        for (int i = 0; i < springerb. length; i++)
        {
            springerb [i]. PositionSetzen (1+x + (springerb. length - i), y-6);
        }
        for (int i = 0; i < springerb. length; i++)
        {
            springerb [i] = new Springerb ();
        }
        for (int i = 0; i < springerb. length; i++)
        {
            springerb [i]. PositionSetzen (6+x + (springerb. length - i), y-6);
        }
        for (int i = 0; i < turm. length; i++)
        {
            turm [i] = new Turm ();
        }
        for (int i = 0; i < turm. length; i++)
        {
            turm [i]. PositionSetzen (7+x + (turm. length - i), y+1);
        }
        for (int i = 0; i < turmb. length; i++)
        {
            turmb [i] = new Turmb ();
        }
        for (int i = 0; i < turmb. length; i++)
        {
            turmb [i]. PositionSetzen (x + (turm. length - i), y-6);
        }
        for (int i = 0; i < turmb. length; i++)
        {
            turmb [i] = new Turmb ();
        }
        for (int i = 0; i < turmb. length; i++)
        {
            turmb [i]. PositionSetzen (7+x + (turm. length - i), y-6);
        }
        for (int i = 0; i < turm. length; i++)
        {
            turm [i] = new Turm ();
        }
        for (int i = 0; i < turm. length; i++)
        {
            turm [i]. PositionSetzen (x + (turm. length - i), y+1);
        }
        for (int i = 0; i < laeufer. length; i++)
        {
            laeufer [i] = new Laeufer ();
        }
        for (int i = 0; i < laeufer. length; i++)
        {
            laeufer [i]. PositionSetzen (5+x + (turm. length - i), y+1);
        }
        for (int i = 0; i < laeuferb. length; i++)
        {
            laeuferb [i] = new Laeuferb ();
        }
        for (int i = 0; i < laeuferb. length; i++)
        {
            laeuferb [i]. PositionSetzen (2+x + (laeufer. length - i), y-6);
        }
        for (int i = 0; i < laeuferb. length; i++)
        {
            laeuferb [i] = new Laeuferb ();
        }
        for (int i = 0; i < laeuferb. length; i++)
        {
            laeuferb [i]. PositionSetzen (5+x + (laeuferb. length - i), y-6);
        }
        for (int i = 0; i < laeufer. length; i++)
        {
            laeufer [i] = new Laeufer ();
        }
        for (int i = 0; i < laeufer. length; i++)
        {
            laeufer [i]. PositionSetzen (2+x + (laeufer. length - i), y+1);
        }
        //setzen wir sie als Array
        //einfach in das Feld, es ist sehr viel copy paste aber es 
        //funktioniert
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
