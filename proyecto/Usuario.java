import java.io.Serializable;
public class Usuario implements Serializable {

    private String nombre; 
    private String apellidop;
    private String apellidom;
    private int edad; 
    private String nickname;
    private String contraseña; 
    private String correo; 
    private String telefono; 
    private String direccion; 

    public Usuario(String nombre, String apellidop, String apellidom, int edad, String nickname, String contraseña, String correo, String telefono, String direccion){
        this.nombre = nombre; 
        this.apellidop = apellidop; 
        this.apellidom = apellidom; 
        this.edad = edad; 
        this.nickname = nickname; 
        this.contraseña = contraseña; 
        this.correo = correo; 
        this.telefono = telefono; 
        this.direccion = direccion; 
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre; 
    }
    public void setApellidop(String apellidop){
        this.apellidop = apellidop; 
    }
    public String getApellidop(){
        return apellidop;
    }
      public void setApellidom(String apellidom){
        this.apellidom = apellidom; 
    }
    public String getApellidom(){
        return apellidom;
    }
    public void setEdad(int edad){
        this.edad = edad; 
    }
    public int getEdad(){
        return edad; 
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public String getNickname(){
        return nickname;
    }
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    public String getContraseña(){
        return contraseña; 
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getCorreo(){
        return correo; 
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }
     public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getDireccion(){
        return direccion; 
    }

}