/**
 * Descripción: El programa tiene almacenados por default dos gatitos, pero el usuario puede agregar/eliminar gatitos de la cajonera según se quiera hacer.
 * ojo escribir bien las palabras por favor.
 * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 */

import java.util.Scanner;
import java.util.ArrayList; 

public class ArrayListGatitos {
    public static  void main(String[] args){
        Scanner entrada = new Scanner(System.in); 
        ArrayList<Gatito> CajoneraGatitos = new ArrayList<Gatito>();
        String agregar,respuesta,posicion,acciones;  
        int indice; 

        Gatito gatito1 = new Gatito(); 
        gatito1.nombre = "Michi"; 
        gatito1.color = "Negro"; 
        CajoneraGatitos.add(gatito1);

        Gatito gatito2 = new Gatito(); 
        gatito2.nombre = "Caleta";
        gatito2.color = "Café"; 
        CajoneraGatitos.add(gatito2); 

        System.out.println("El tamaño del ArrayList es: "+CajoneraGatitos.size()+" ");

        System.out.println("¿Quieres agregar otro gatito? (si/no) "); 
        agregar = entrada.nextLine();
        if (agregar.equalsIgnoreCase("si")){
            while(agregar.equalsIgnoreCase("si")) {
            Gatito gatito3 = new Gatito(); 
            System.out.println("Dame el nombre del gatito: "); 
            gatito3.nombre = entrada.nextLine(); 
            System.out.println("Dame el color del gatito: "); 
            gatito3.color = entrada.nextLine(); 
            CajoneraGatitos.add(gatito3); 

            System.out.println("El tamaño del ArrayList es: "+CajoneraGatitos.size()+" "); 

            System.out.println("¿Quieres agregar otro gatito? (Si/No)"); 
            agregar = entrada.nextLine(); }
        } 

        do {
            System.out.println("Los gatitos que hay en la cajonera son: ");
            for (Gatito cajon:CajoneraGatitos){
                indice = CajoneraGatitos.indexOf(cajon);
                System.out.println(" "+indice+" Nombre: "+cajon.nombre+" y color: "+cajon.color+" "); 
            }

            System.out.println("¿Quieres agregar o eliminar un gatito?"); 
            respuesta = entrada.nextLine();

            if(respuesta.equalsIgnoreCase("agregar")){
                System.out.println("¿Quieres agregarlo en una posición especifica o al final?"); 
                posicion = entrada.nextLine();
                if(posicion.equalsIgnoreCase("especifica")){
                    System.out.println("Dame la posición en la que lo agregaras: ");
                    indice = entrada.nextInt(); 
                    entrada.nextLine();
                    Gatito gatito5 = new Gatito();
                    System.out.println("Dame el nombre del gatito: "); 
                    gatito5.nombre = entrada.nextLine(); 
                    System.out.println("Dame el color del gatito: "); 
                    gatito5.color = entrada.nextLine(); 
                    CajoneraGatitos.add(indice, gatito5);
                } else if (posicion.equalsIgnoreCase("final")){
                Gatito gatito4 = new Gatito();
                System.out.println("Dame el nombre del gatito: "); 
                gatito4.nombre = entrada.nextLine(); 
                System.out.println("Dame el color del gatito: "); 
                gatito4.color = entrada.nextLine(); 
                CajoneraGatitos.add(gatito4); }
            } 

            else if (respuesta.equalsIgnoreCase("eliminar")){
                System.out.println("¿Dame el número del gatito que quieres eliminar"); 
                indice = entrada.nextInt();
                entrada.nextLine(); 
                CajoneraGatitos.remove(indice); 
            }

            System.out.println("¿Quieres seguir haciedo acciones? (si/no) "); 
            acciones = entrada.nextLine(); 

        }while (acciones.equalsIgnoreCase("si")); 

        for (Gatito cajon:CajoneraGatitos){
                indice = CajoneraGatitos.indexOf(cajon);
                System.out.println(" "+indice+" Nombre: "+cajon.nombre+" y color: "+cajon.color+" ");
        }

            
    }
}