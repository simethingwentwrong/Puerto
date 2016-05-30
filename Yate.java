
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    // instance variables - replace the example below with your own
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int camarotes, int potencia,String matricula, float eslora, int anoFabricacion)
    {
        super(potencia, matricula, eslora, anoFabricacion);
        this.camarotes = camarotes;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getCoeficienteBernua()
    {
         return camarotes;
    }
    
    /**
     * to String
     */
    public String toString()
    {
        return (super.toString() + "camarotes : " + camarotes);
    }
}
