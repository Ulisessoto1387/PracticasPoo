/**
 * Clase que representa un gatito, y las acciones que este puede realizar.
 * @author: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 * @version: 1.0
*/

public class Gatito {

    /**
     * Crea una instancia de Gatito con color y edad.
     * @param color Es el color del gatito.
     * @param edad Es la edad del gatito.
     */
    public Gatito(String color, String edad){
        this.color = color; 
        this.edad = edad;
    }
    
    /**Indica el color del gatito. */
    private String color; 
    /**Indica la edad del gatito. */
    private String edad; 
    
    /** Ejecuta la acción de que el gatito come.  */
    public void comer(){
        System.out.println("El gatito esta comiendo...");
        System.out.println("Ñamm ñamm...");
    }
    /** Ejecuta la acción de que el gatito ronronea.  */
     public void ronronear(){
        System.out.println("Prrr prrrr...");
    }
    /** Ejecuta la acción de que el gatito maulla.  */
     public void maullar(){
        System.out.println("Miauuu miauuu...");
    }

    //Set y get 
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

     public void setEdad(String edad){
        this.edad = edad;
    }
    public String getEdad(){
        return edad;
    }
    
}