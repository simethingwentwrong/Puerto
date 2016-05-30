
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     *devulebe el DNI
     */
    public String getDni()
    {
        return dni;
    }
    
    /**
     * devuelbe el nombre
     */
    public String nombre()
    {
        return nombre;
    }
    
    /**
     * toString
     */
    public String  toString()
    {
        return ( "Cliente: " + nombre + "DNI: " + dni); 
    }
}
