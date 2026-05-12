import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Control {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<GatoDeLaCalle> gatos = new ArrayList<GatoDeLaCalle>();
        String opcion;
        int numDePeleas, edad;
        String nombre;
        char tamaño; 
        float peso; 
        int contador = 0; 

        try {
            File archivoGatos = new File("DatosGatosdelaCalle.dat");
            FileOutputStream flujoDeSalida = new FileOutputStream(archivoGatos, true);
            DataOutputStream flujoDeSalidaFiltrado = new DataOutputStream(flujoDeSalida);
            
            do{
                contador++;
                System.out.println("Proporcionar los datos del gato "+contador+" ");
                GatoDeLaCalle gato01 = new GatoDeLaCalle(); 
                System.out.println("Ingrese nombre: ");
                gato01.nombre = entrada.nextLine();
                System.out.println("Ingrese edad: ");
                gato01.edad = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese tamaño: ");
                gato01.tamaño = entrada.nextLine().charAt(0);
                System.out.println("Ingrese peso: ");
                gato01.peso = entrada.nextFloat();
                System.out.println("Ingrese num de peleas: ");
                gato01.numDePeleas = entrada.nextInt();
                entrada.nextLine();

                flujoDeSalidaFiltrado.writeUTF(gato01.nombre);
                flujoDeSalidaFiltrado.writeInt(gato01.edad);
                flujoDeSalidaFiltrado.writeChar(gato01.tamaño);
                flujoDeSalidaFiltrado.writeFloat(gato01.peso);
                flujoDeSalidaFiltrado.writeInt(gato01.numDePeleas);

                gatos.add(gato01);
                System.out.println("¿Desesas agregar más gatos?");
                opcion = entrada.nextLine();
                System.out.println("---------------------------------------------");
            } while(opcion.equalsIgnoreCase("si"));

        } catch (Exception e){
            System.out.println("Hubo un error");
        }

    }
}