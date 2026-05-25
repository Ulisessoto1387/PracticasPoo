import java.util.Scanner;

public class Control{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre, apellidop, apellidom, nickname, contraseña, contraseña2, correo, direccion, telefono;
        int edad;

        System.out.println("dame tus datos:");
        nombre = entrada.nextLine();
        apellidop = entrada.nextLine();
        apellidom = entrada.nextLine();
        edad = entrada.nextInt();
        entrada.nextLine();
        nickname = entrada.nextLine();
        contraseña = entrada.nextLine();
        contraseña2 = entrada.nextLine();
        correo = entrada.nextLine();
        telefono = entrada.nextLine();
        direccion = entrada.nextLine();

        Usuario usuario01 = new Usuario(nombre, apellidop, apellidom, edad, nickname, contraseña, contraseña2, correo, telefono, direccion);
        NuevoRegistro.registrando(usuario01);
    }
}