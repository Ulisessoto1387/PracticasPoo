public class Usuario {
    // Atributos
    public String nickname;
    private String password;
    private int edad;

    // Métodos
    public Usuario(String nickname, String password, int edad){
        this.nickname = nickname;
        this.password = cambiarContrasena(password); 
        this.edad = edad;
    }

    public String cambiarContrasena(String texto) {
        String resultado = texto.toLowerCase()
                                .replace('a', '4')
                                .replace('e', '3')
                                .replace('i', '1')
                                .replace('o', '0')
                                .replace('u', '2');
        return resultado + "hola";
    }

    public void setPassword(String password){
        // Cada vez que alguien quiera cambiar la clave, se procesa primero
        this.password = cambiarContrasena(password);
    }

    public String getPassword(){
        return password;
    }

    public float verSaldo(){
        System.out.println("Se muestra el saldo");
        return 1.1F;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }
    
}