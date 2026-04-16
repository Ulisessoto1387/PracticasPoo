/**
 * Clase que representa un perrito empaquetado, y una acción que este puede realizar (metodo sobrecargado).
 * @author: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 * @version: 1.0
*/

package mx.unam.ingenieria.mascotas; 
public class PerritoEmpaquetado {

    /**
     * Crea una instancia de PerritoEmpaquetado con nombre, raza y color.
     * @param nombre El nombre del perrito.
     * @param raza La raza del perrito.
     * @param color El color del perrito.
     */
    public PerritoEmpaquetado(String nombre, String raza, String color){
        this.nombre = nombre; 
        this.raza = raza;
        this.color = color;
    }

    /** Indica el nombre del perrito. */
    public String nombre; 
    /** Indica la raza del perrito. */
    public String raza; 
    /** Indica el color del perrito. */
    public String color; 

    /** Ejecuta la acción de que el perrito ladre. */
    public void ladrar(){
        System.out.println("Guauu guauu...."); 
    }

    /**
     * @param veces El número de veces que el perrito ladrara. 
     */
    public void ladrar(int veces){
        for(int i = 0; i < veces; i++){
            System.out.println("Guauu guauu...");
        }
    }


}
