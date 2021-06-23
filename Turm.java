public class Turm extends Schachfigur
{
    public Turm(int x, int y, boolean istWeiß)
    {
        if(istWeiß)
        {
            form = '♖';
        }
        else
        {
            form = '♜';
        }    
    }
    
        
     
    
        
    
    //char schwarzeFigur = '♜';
    //char weißeFigur = '♖';
    
    public @override boolean BewegeNach(int xZiel, int yZiel)
    {
         return xZiel == x || yZiel == y;
         }  
   
        
    }