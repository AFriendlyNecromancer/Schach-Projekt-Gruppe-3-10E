import java.awt.*;
import java.awt.event.*;
public class Buttons
{
    Frame fenster;
    Label fragetext;
    Button FeldA1;
    Button FeldB1;
    Button FeldC1;
    Button FeldD1;
    Button FeldE1;
    Button FeldF1;
    Button FeldG1;
    Button FeldH1;
    Button FeldA2;
    Button FeldB2;
    Button FeldC2;
    Button FeldD2;
    Button FeldE2;
    Button FeldF2;
    Button FeldG2;
    Button FeldH2;
    Button FeldA3;
    Button FeldB3;
    Button FeldC3;
    Button FeldD3;
    Button FeldE3;
    Button FeldF3;
    Button FeldG3;
    Button FeldH3;
    Button FeldA4;
    Button FeldB4;
    Button FeldC4;
    Button FeldD4;
    Button FeldE4;
    Button FeldF4;
    Button FeldG4;
    Button FeldH4;
    Button FeldA5;
    Button FeldB5;
    Button FeldC5;
    Button FeldD5;
    Button FeldE5;
    Button FeldF5;
    Button FeldG5;
    Button FeldH5;
    Button FeldA6;
    Button FeldB6;
    Button FeldC6;
    Button FeldD6;
    Button FeldE6;
    Button FeldF6;
    Button FeldG6;
    Button FeldH6;
    Button FeldA7;
    Button FeldB7;
    Button FeldC7;
    Button FeldD7;
    Button FeldE7;
    Button FeldF7;
    Button FeldG7;
    Button FeldH7;
    Button FeldA8;
    Button FeldB8;
    Button FeldC8;
    Button FeldD8;
    Button FeldE8;
    Button FeldF8;
    Button FeldG8;
    Button FeldH8;
    /**
     * Constructor for objects of class BUTTONBIGLOLE
     */
    public Buttons()
    {
        fenster = new Frame("UI");
        fenster.setSize(600,600);
        fenster.setLocation(0,30);
        fenster.setVisible(true);
        fenster.setLayout(null);
        
        FeldA8 = new Button();
        FeldA8.setLocation(0,30);
        FeldA8.setLabel("A8");
        FeldA8.setVisible(true);
        FeldA8.setSize(50,50);
        FeldA8.setEnabled(true);
        FeldA8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Hier wird Frage A ausgewählt
            }
        });
        FeldA7 = new Button();
        FeldA7.setLocation(0,75);
        FeldA7.setLabel("A7");
        FeldA7.setVisible(true);
        FeldA7.setSize(50,50);
        FeldA7.setEnabled(true);
        FeldA7.addActionListener(new ActionListener()
        
        {
            public void actionPerformed(ActionEvent e)
            {
                //Hier wird das genannte Spielfeld ausgewählt
            }
        });
        fenster.add(FeldA8);
        fenster.add(FeldA7);   
    }
}