/**
 * Descripción: El programa pide al usuario una frase de no más de 50 caracteres y realiza varias operaciones/manipulaciones a esta. 
 * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 */

import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        String frase; 
        int contador = 0; 

        System.out.println("Escribe una frase de hasta 50 caracteres: ");
            frase = entrada.nextLine();

        while (frase.length() > 50) {
            System.out.println("La frase supera lo pedidio.");
            System.out.println("Dame otra cadena");
            frase = entrada.nextLine();
        } 
        
        System.out.println("Esta bien, comenzamos a trabajar. ");
        System.out.println("La frase tiene "+frase.length()+" caracteres.");
        System.out.println("La frase original es: "+frase+" ");
        System.out.println("La frase original sin espacios: "+frase.replace(" ", "")+" ");
        System.out.println("La frase original en mayúsculas: "+frase.toUpperCase()+" ");
        System.out.println("La frase original en minusculas: "+frase.toLowerCase()+" ");
        System.out.println("La frase original reemplazando las a por @: "+frase.replace("a", "@")+" ");
        System.out.println("Las puras vocales de la frase: ");
        for (int i = 0; i< frase.length(); i++){
            char letra = frase.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            contador += 1; 
            }
        }
        System.out.println(" El total de las vocales en la frase es: "+contador+" ");

        System.out.println("El número de posición en la frase en la que aparece la primera letra a: "+frase.indexOf("a")+" ");
        System.out.println("El número de posición en la frase en la que aparece la última letra e: "+frase.lastIndexOf("e")+" ");
        System.out.println("La frase original al revés: ");
          for(int j = frase.length()-1; j >= 0; j--){
            System.out.print(frase.charAt(j)); 
         }
        System.out.println();  
        System.out.println("La subcadena que va desde el carácter con posición 3 hasta la posición 8: "+frase.substring(3,9)+" ");
        System.out.println("La subcadena que va desde el carácter 5 hasta el final de la frase: "+frase.substring(5,frase.length())+" ");
        System.out.println("El carácter que se encuentra en la posición 3: "+frase.charAt(3)+" ");


        entrada.close();
    }
}
