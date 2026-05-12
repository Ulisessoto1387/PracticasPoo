import java.io.*;
import java.util.Scanner; 

public class Registro{
    public static void main(String[] args){
        try{
            Scanner entrada = new Scanner(System.in);
            File archivodestino = new File("Usuarios.txt");
            FileWriter flujosalida = new FileWriter(archivodestino, true);
            BufferedWriter buffersalida = new BufferedWriter(flujosalida);
            PrintWriter escritor = new PrintWriter(buffersalida);
            String nombre, apellidopaterno, apellidomaterno, correo, nickname, password, respuesta;

            do{
                System.out.println("Ingrese su nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese su apellido paterno: ");
                apellidopaterno = entrada.nextLine();
                System.out.println("Ingrese su apellido materno: ");
                apellidomaterno = entrada.nextLine();
                System.out.println("Ingrese su correo: ");
                correo = entrada.nextLine();
                System.out.println("Ingrese su nickname: ");
                nickname = entrada.nextLine();
                System.out.println("Ingrese su password: ");
                password = entrada.nextLine();
                escritor.println(nombre+":"+apellidopaterno+":"+apellidomaterno+":"+correo+":"+nickname+":"+password);
                System.out.println("¿Deseas ingresar otro usuaio? (si/no)");
                respuesta = entrada.nextLine();
            }  while (respuesta.equalsIgnoreCase("si"));
            escritor.close();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage()+" ");
        }

    }
}