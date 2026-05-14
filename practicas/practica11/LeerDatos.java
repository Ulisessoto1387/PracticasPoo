import java.io.*;
import java.util.StringTokenizer;

public class LeerDatos{
    public static void main(String[] args){
        String archivoDestino = "Usuarios.txt";
        int contador = 1;

        try {
            FileReader flujoDeEntrada = new FileReader(archivoDestino);
            BufferedReader bufferLectura = new BufferedReader(flujoDeEntrada);
            String linea;

            while ((linea = bufferLectura.readLine()) != null) {
                System.out.println("Datos del usuario "+contador+" ");
                StringTokenizer tokens = new StringTokenizer(linea, ":");
                if (tokens.hasMoreTokens()) System.out.println("  Nombre: "+tokens.nextToken());
                if (tokens.hasMoreTokens()) System.out.println("  Apellido paterno: "+tokens.nextToken());
                if (tokens.hasMoreTokens()) System.out.println("  Apellido materno: "+tokens.nextToken());
                if (tokens.hasMoreTokens()) System.out.println("  Correo: "+tokens.nextToken());
                if (tokens.hasMoreTokens()) System.out.println("  Nickname: "+tokens.nextToken());
                if (tokens.hasMoreTokens()) System.out.println("  Password: "+tokens.nextToken());
                System.out.println("");
                contador++;
            }
            bufferLectura.close();
        }catch (Exception e){
            System.out.println("********************************");
            System.out.println("Error: "+e.getMessage()+" ");
        }

    }
}

