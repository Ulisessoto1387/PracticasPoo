import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class NuevoRegistro {

    public static void registrando(Usuario usuario01){

        try{
            File unArchivo = new File("registrando.dat");
            FileOutputStream flujoSalida = new FileOutputStream(unArchivo);
            ObjectOutputStream flujoSalidaObjetos = new ObjectOutputStream(flujoSalida);
            flujoSalidaObjetos.writeObject(usuario01);
            flujoSalidaObjetos.close();

            File archivoFuente = new File("registrando.dat");
            FileInputStream flujoEntrada = new FileInputStream(archivoFuente);
            ObjectInputStream lectorObjetos  = new ObjectInputStream(flujoEntrada);
            Usuario usuarioGuardado = (Usuario) lectorObjetos.readObject();
            lectorObjetos.close();



        } catch(Exception e){
        System.err.println(e.getMessage());
        }


    } 
}