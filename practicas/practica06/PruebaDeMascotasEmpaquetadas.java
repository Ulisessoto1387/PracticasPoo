/**
 * Clase que hace una prueba de las clases PececitoEmpaquetado y PerritoEmpaquetado, creando objetos y utilizandolos. 
 * @author: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 * @version: 1.0
*/

package mx.unam.ingenieria.mascotas; 
public class PruebaDeMascotasEmpaquetadas {
    public static void main(String[] args){
        PececitoEmpaquetado pez01 = new PececitoEmpaquetado("Amarrillo", "Beta");
        PerritoEmpaquetado perro01 = new PerritoEmpaquetado("Dobie", "Doberman", "Negro");

        System.out.println("El pez es de color: "+pez01.color+" y es un pez: "+pez01.tipoPez+" "); 
        pez01.nadar(); 

        System.out.println("El perro se llama: "+perro01.nombre+" de raza: "+perro01.raza+" y es de color: "+perro01.color+" ");
        perro01.ladrar(); 
        System.out.println("Ladrar n veces: ");
        perro01.ladrar(5); 

    }
}
