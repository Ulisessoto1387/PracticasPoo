import java.util.Scanner;

public class Control{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre, apellidop, apellidom, nickname, contraseña, correo, direccion, telefono;
        int edad;

        Usuario usuario01 = new Usuario();
        System.out.println("dame tus datos:");
        usuario01.getNombre = entrada.nextLine();
        usuario01.getApellidop = entrada.nextLine();
        usuario01.getApellidom = entrada.nextLine();
        usuario01.getEdad = entrada.nextineInt();
        entrada.nextLine();
        usuario01.getNickname = entrada.nextLine();
        usuario01.getContraseña = entrada.nextLine();
        usuario01.getCorreo = entrada.nextLine();
        usuario01.getTelefono = entrada.nextLine();
        usuario01.getDireccion = entrada.nextLine();

        NuevoRegistro.registrando(usuario01);
    }
}