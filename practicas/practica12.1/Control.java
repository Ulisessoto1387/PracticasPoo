import java.util.Scanner;
public class Control {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        FabricaDePizzas primerPizza = new FabricaDePizzas();
        char opcion;

        System.out.println("*************************");
        System.out.println("¡¡Bienvenidos a su pizzeria fav!! ");
        System.out.println("Esperamos que el servicio brindado sea de su agrado");
        System.out.println("*************************");

        System.out.println("Seleccione una opcion según lo dese.");
        System.out.println("A)Ver nuestro menú");
        System.out.println("B)Pedir una pizza");
        System.out.println("C)Cerrar sesión");

        switch(opcion.toLowerCase()){
            case 'a':
                primerPizza.listarPizzas();
            break;
        }


    }
}