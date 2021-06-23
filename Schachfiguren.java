
class Schachfiguren
{
    König könig;
    Königin königin;
    Bauer [] bauer;
    Turm turm;
    Springer springer;
    Laeufer laeufer;
    
    Schachfiguren (int x, int y)
    {
        könig = new König ();
        königin = new Königin ();
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
    void FigurenSetzen(int x, int y)
    {
       
    }
}