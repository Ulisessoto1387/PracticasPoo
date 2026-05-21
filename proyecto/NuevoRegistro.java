import java.io.*;

public class NuevoRegistro {

    public static void registrando(Usuario usuario01){
        try{
            File unArchivo = new File("resgistrando.txt");
            FileOutputStream flujoSalida = new FileOutputStream(unArchivo);
            ObjectOutputStream flujoSalidaObjetos = new ObjectOutputStream(flujoSalida);
            flujoSalidaObjetos.writeObject(usuario01);
            flujoSalidaObjetos.close();
            
        } catch(Exception e){
        System.err.println(e.getMessage());
        }


    } 
}