/**
 * Clase que representa un pececito empaquetado, y una acción que este puede realizar.
 * @author: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 * @version: 1.0
*/

package mx.unam.ingenieria.mascotas; 
public class PececitoEmpaquetado{
    
    /**
     * Crea una instancia de PececitoEmpaquetado con color y tipo.
     * @param color El color que tendrá el pez.
     * @param tipoPez Especie del pez.
     */
    public PececitoEmpaquetado(String color, String tipoPez){
        this.color = color;
        this.tipoPez = tipoPez;
    }
    
    /** Indica el color del pez. */
    public String color; 
    /** Indica el tipo de pez. */
    public String tipoPez;
    
    /** Ejecuta la acción de que el pez nada.  */
    public void nadar(){
        System.out.println("Pez nadando....");
        System.out.println("Gluuup gluuuup");
    }


}
