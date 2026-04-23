import java.util.Scanner;

public class Control {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Gatito[] arrgatitos = new Gatito[3];
        String respuesta, nombre, color; 
        int cantidadGatitos = 0;
        do{
            System.out.println("Nombre del gatito: ");
            nombre = entrada.nextLine();
            System.out.println("Color del gatito: ");
            color = entrada.nextLine(); 
            Gatito gatito01 = new Gatito(nombre, color);
            try {
                if (cantidadGatitos >= 3){
                    throw new ExcepcionGatitos();
                } 
            }
            catch (ExcepcionGatitos e){
                System.err.println(e.getMessage());
            }
            arrgatitos[cantidadGatitos] = gatito01;
            cantidadGatitos++;
            System.out.println("Quieres agregar otro gattito? (si/no)");
            respuesta = entrada.nextLine();
        }while(respuesta.equalsIgnoreCase("si")); 

    }

    public static void mostrarGatitos(Gatito[] arrgatitos, int cantidadGatitos){
        for(int i = 0; i < cantidadGatitos; i++){
            System.out.println("Nombre: "+arrgatitos[i].nombre+" ");
            System.out.println("Color: "+arrgatitos[i].color+" ");
        }
    }

}