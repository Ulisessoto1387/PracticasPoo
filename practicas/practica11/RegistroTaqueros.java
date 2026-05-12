import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class RegistroTaqueros{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Taquero> taqueros = new ArrayList<Taquero>();
        String nombre, alias, especialidad, respuesta; 

        do{
            System.out.println("Ingrese el nombre del taquero: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el alias del taquero: ");
            alias = entrada.nextLine();
            System.out.println("Ingrese la especialidad del taquero: ");
            especialidad = entrada.nextLine();
            Taquero taquero01 = new Taquero(nombre, alias, especialidad);
            taqueros.add(taquero01);
            System.out.println("¿Desea ingresar otro taquero? (si/no)");
            respuesta = entrada.nextLine();
        }while(respuesta.equalsIgnoreCase("si"));

        try {
            File archivodestino = new File("taqueros.dat");
            FileOutputStream flujosalida = new FileOutputStream(archivodestino);
            ObjectOutputStream escritorObjetos = new ObjectOutputStream(flujosalida);
            for (Taquero t : taqueros) {
                escritorObjetos.writeObject(t);
            }
            escritorObjetos.close();
            System.out.println("Taqueros guardados en bytes");
        } catch (Exception e) {
        System.out.println("Error al manejar el archivo: " + e.getMessage());
        }

    }
}