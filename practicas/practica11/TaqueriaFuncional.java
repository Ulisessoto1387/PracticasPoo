import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class TaqueriaFuncional{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Taquero> trabajadores = new ArrayList<>();
        int opcion;

        try{
            File archivoFuente = new File("taqueros.dat");
            FileInputStream flujoEntrada = new FileInputStream(archivoFuente);
            ObjectInputStream lectorObjetos = new ObjectInputStream(flujoEntrada);

            while(flujoEntrada.available() > 0){
                Taquero t = (Taquero) lectorObjetos.readObject();
                trabajadores.add(t);
            }
            lectorObjetos.close();
        }catch(Exception e){
            System.out.println("Error al leer el archivo:"+e.getMessage()+" ");
        }

        System.out.println("*********************");
        System.out.println("Bienvenido a tu Taqueria favorita");
        System.out.println("Esperemos te guste el servicio");
        System.out.println("*********************");
        System.out.println("Nuestros taqueros del día de hoy son: ");
        for(int i = 0; i < trabajadores.size(); i++){
            System.out.println(""+(i+1)+"."+trabajadores.get(i).nombre+" ");
        }

        try{
            System.out.println("¿Qué taquero te gustaria que te atienda?");
            System.out.println("Dame el número por favor");
            opcion = entrada.nextInt();
            entrada.nextLine();
            Taquero taqueroSeleccionado = (Taquero) trabajadores.get(opcion - 1);
            System.out.println("Muy buena opción");
            taqueroSeleccionado.presentacion();
            
            do{
                System.out.println("¿Qué tipo de taco deseas comer?");
                System.out.println("Entre las opciones podria ser:");
                System.out.println("1.El taco del cual soy especialista");
                System.out.println("2.Taco de la aelección que gustes");
                opcion = entrada.nextInt();
                entrada.nextLine();

                if (opcion ==1){
                    taqueroSeleccionado.preparacionespecial();
                }else if (opcion == 2){
                    System.out.println("¿Qué tipo de taco deseas?");
                    String tipoTaco = entrada.nextLine();
                    taqueroSeleccionado.preparacion(tipoTaco);
                }else {
                    System.out.println("Opción invalida, por favor elige otra opción");
                }
            }while(opcion != 1 && opcion != 2);
        }catch(Exception e){
            System.out.println("Error al elegir taquero: "+e.getMessage()+"");
        }

    }
}