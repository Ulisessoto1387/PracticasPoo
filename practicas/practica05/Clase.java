/**
 * Descripción: El programa cuenta con una clase Estudiante con el constructor, atributos, metodos y en la clase de control se creaun arreglo con 5 objetos
 * tipo Estudiante y se imprimen posteriormente con el metodo.  
 * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 */

import java.util.Scanner; 

public class Clase {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); 
        String nombre, carrera, password; 
        int edad; 

        Estudiante[] alumnos = new Estudiante[5];
        for (int i = 0; i < 5; i++){
            System.out.println("Dame tu nombre: ");
            nombre = entrada.nextLine(); 
            System.out.println("Dame tu edad: ");
            edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Dame tu carrera: ");
            carrera = entrada.nextLine();
            System.out.println("Dame tu password: ");
            password = entrada.nextLine();
            alumnos[i] = new Estudiante(nombre, edad, carrera, password);
            System.out.println(" "); 
        }

        System.out.println(" ");
        System.out.println("Pase de lista.");
        for (int i = 0; i < 5; i++){
            System.out.println("Nombre:"+alumnos[i].getNombre()+" "); 
            System.out.println("Edad:"+alumnos[i].getEdad()+" "); 
            System.out.println("Carrera:"+alumnos[i].getCarrera()+" "); 
            System.out.println("Password:"+alumnos[i].getPassword()+" ");
            alumnos[i].pasarLista(); 
            System.out.println(" "); 
        }


    }
}