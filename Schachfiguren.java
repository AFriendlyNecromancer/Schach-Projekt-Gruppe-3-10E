
public abstract class Schachfiguren
{
    int xJetzt;
    int yJetzt;
    boolean CheckObFigurDaIst()
    {
        if (xAusgewähltesFeld == xAnfangsFeld)
        {
             
        }
        else
        {
          FigurIstNichtDa();
        }
        return true;
    }
    void FigurIstNichtDa()
    {
        System. out. println = "figur ist Nicht da!";
    }
    void WelcheFigur()
    {
        
    }
}
