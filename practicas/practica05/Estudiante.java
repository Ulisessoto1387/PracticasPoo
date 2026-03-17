public class Estudiante {
    //Atributos 
    private String nombre; 
    private int edad; 
    private String carrera; 
    private String password; 

    //Constructor
    public Estudiante(String nombre, int edad, String carrera, String password){
        this.nombre = nombre; 
        this.edad = edad; 
        this.carrera = carrera;
        this.password = password;  
    }

    //Metodo
    public void pasarLista(){
        System.out.println("¡Presente, profe!");
    }

    //Metodo set y get de los atributos 
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    public String getNombre(){
        return nombre; 
    }

    public void setEdad(int edad){
        this.edad = edad; 
    }
    public int getEdad(){
        return edad; 
    }

    public void setCarrera(String carrera){
        this.carrera = carrera; 
    }
    public String getCarrera(){
        return carrera; 
    }

    public void setPassword(String password){
        this.password = password; 
    }
    public String getPassword(){
        return password;
    }



}