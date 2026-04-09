public class EjemplosGetSet {
    public static void main(String[] args) {
        Usuario unUsuario = new Usuario("Fulanito", "hola123", 22);
        
        System.out.println("Datos del usuario");
        System.out.println("Nickname: " + unUsuario.nickname);
        System.out.println("Password: " + unUsuario.getPassword()); 
        System.out.println("Edad: " + unUsuario.getEdad());

        System.out.println("");
        System.out.println("Actualizado el password y edad del usuario");
        unUsuario.nickname = "Menganito";
        
        unUsuario.setPassword("taquitoDeSuadero");
        unUsuario.setEdad(23);

        System.out.println("Datos del usuario");
        System.out.println("Nickname: " + unUsuario.nickname);
        System.out.println("Password: " + unUsuario.getPassword()); 
        System.out.println("Edad: " + unUsuario.getEdad());

    }
}