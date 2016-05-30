
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numeroMastiles, String matricula, float eslora, int anoFabricacion)
    {
        super(matricula, eslora, anoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    /**
     * retunr coeficiente de bernua
     */
    
    public int getCoeficienteBernua()
    {
        return numeroMastiles;
    }
    
    /**
     * to String
     */
    public String toString()
    {
        return (super.toString() + "Numero de Mastiles: " + numeroMastiles);
    }
}
