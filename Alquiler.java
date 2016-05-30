
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // instance variables - replace the example below with your own
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    private static final int VALOR_ALQUILER = 300;
    private static final int MULTIPLICADOR_ESLORA = 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dias, Cliente cliente, Barco barco)
    {
        this.numeroDias = numeroDias;
        this.cliente = cliente;
        this.barco = barco;
    }

    /**
     * toString
     */
    public String toString()
    {
        return ( "Numero de Dias: " + numeroDias + "Cliente: " + cliente + "Barco: " + barco);
    }
    
    public float getPrecioAlquiler()
    {
      
         return numeroDias*(barco.getEslora()*MULTIPLICADOR_ESLORA)+VALOR_ALQUILER*barco.getCoeficienteBernua();
     
    }
}
