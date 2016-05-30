
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    // instance variables - replace the example below with your own
    private String matricula;
    private float eslora;
    private int anoFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, float eslora, int anoFabricacion)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }

    /**
     * return maticula
     */
    public String getMatricula()
    {
        
        return matricula; 
    }
    
    /**
     * return eslora
     */
    public float getEslora()
    {
        return eslora;
    }
    
    /**
     * return ano fabricacion
     */
    public int getAnoFabricacion()
    {
        return anoFabricacion;
    }
    
    /**
     * return coeficiente de bernua
     */
    public abstract int getCoeficienteBernua();
    
    /**
     * to String
     */
   public String toString()
   {
       return("matricula: " + matricula + "eslora: " + eslora + "Año Fabricacion :" + anoFabricacion);
   }
}
