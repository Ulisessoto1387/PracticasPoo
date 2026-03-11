/**
 * Descripción: El programa de comando/principal tiene dos clases de las cuales una es para crear objetos de tipo cocinero y sus metodos, y la segunda para un mensaje de bienvenida
 * Y los que hace es crear dos objetos de tipo cocinero y uno por default, se le da la bienvenida al usuario y se le pregunta que tipo de pizza hawaiana va querer y de acuerdo a eso
 * hace una de las posibles pizzas,esto gracias a un switch case donde esta asignado por tipo de pizza un cocinero y al final se les aumenta el sueldo.
 * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 */

import java.util.Scanner; 
public class Pizzeria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        String opcion,ingespecial,ingsuper,respuesta;
        int i = 0;
        String continuar;

        Cocinero uncocinero = new Cocinero();
        Cocinero cocinero01 = new Cocinero(); 
        cocinero01.nombre = "Lazlo Lozla";
        cocinero01.turno = "Matutino"; 

        Cocinero cocinero02 = new Cocinero(); 
        cocinero02.nombre = "Pepe Pecas";
        cocinero02.turno = "Matutino"; 

        UtilidadesVarias.MensajeBienvenida();
        
        System.out.println("¿Le daremos una pizza hawaiana normal, una especial o una súper especial?");
        opcion = entrada.nextLine().toLowerCase(); 

        switch (opcion){
            case "normal" : 
                System.out.println("Cocinero "+cocinero01.nombre+" "); 
                System.out.println("Prepare una pizza Hawaiana normal"); 
                cocinero01.prepararPizzaHawaiana();
            break; 

            case "especial" :
                System.out.println("¿Qué ingrediente extra quiere?");
                System.out.println("Tenemos extraqueso, tocino, camarones o pepperoni."); 
                ingespecial=entrada.nextLine(); 
                System.out.println("Cocinero "+cocinero02.nombre+" ");
                cocinero02.prepararPizzaHawaiana(ingespecial);
            break; 

            case "super especial" :
                String[] ingredientesExtras = new String[4];
                do {
                    System.out.println("¿Qué ingrediente extra quiere?");
                    ingredientesExtras[i] = entrada.nextLine();
                    i++;

                    if (i < 4) {
                        System.out.println("¿Quiere algún otro? (si/no)");
                        continuar = entrada.nextLine().toLowerCase();
                    } else {
                        System.out.println("Llegaste al límite de 4 ingredientes.");
                        continuar = "no";
                    }
                } while (continuar.equals("si") && i < 4); 
                System.out.println("Cocinero:"+uncocinero.nombre+" ");
                uncocinero.prepararPizzaHawaiana(ingredientesExtras);
            break; 

            default :
            System.out.println("Opcion invalida, regrese"); 
            break; 

        }

        System.out.println(" ");
        Cocinero.salario = 30000; 
        System.out.println("Nuevo salario");
        System.out.println("Salario Lazlo: "+cocinero01.salario+" ");
        System.out.println("Salario Pepe: "+cocinero02.salario+" ");
        System.out.println("Salario Chefsito: "+uncocinero.salario+" ");

    }
}