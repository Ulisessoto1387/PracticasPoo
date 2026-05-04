import java.util.Scanner;
import java.util.ArrayList;

public class Adopcion {
    Scanner entrada = new Scanner(System.in);

    public void adoptarGatitos(ArrayList<Gatito> arrgatitos) throws ExcepcionGatitos{
        String respuesta, nombre, color; 

        do{
            if (arrgatitos.size() >= 3) { 
                throw new ExcepcionGatitos();   
            }

            System.out.println("Nombre del gatito: ");
            nombre = entrada.nextLine(); 
            System.out.println("Color del gatito: ");
            color = entrada.nextLine();
            Gatito gatito01 = new Gatito(nombre, color);
            gatito01.maullar();
            arrgatitos.add(gatito01);
            System.out.println("");
            System.out.println("Quieres agregar otro gattito? (si/no)");
            respuesta = entrada.nextLine();
            System.out.println("");
        }while(respuesta.equalsIgnoreCase("si"));    
    }

    public void mostrarGatitos(ArrayList<Gatito> arrgatitos){
        for(int i = 0; i < arrgatitos.size(); i++){
            System.out.println("Nombre gato "+(i+1)+": "+arrgatitos.get(i).nombre+" ");
            System.out.println("Color: "+arrgatitos.get(i).color+" ");
            System.out.println("");
        }
    }

}
