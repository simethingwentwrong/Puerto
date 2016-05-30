
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int potencia,String matricula, float eslora, int anoFabricacion)
    {
        super(matricula, eslora, anoFabricacion);
        this.potencia = potencia;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getCoeficienteBernua()
    {
         return potencia;
    }
    
    /**
     * to String
     */
    public String toString()
    {
        return (super.toString() + "Potencia: " + potencia);
    }
}
