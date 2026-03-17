public class Conductor {

    //Atributos privados
    private String nombre;
    private String numTrabajador; 
    private float salario; 

    //Constructor por referencia
    public Conductor(String nombre, String numTrabajador, float salario){
        this.nombre = nombre; 
        this.numTrabajador = numTrabajador; 
        this.salario = salario; 
    } 

    //Constructor por default
    public Conductor(){
        nombre = "Christian";
        numTrabajador = "00000"; 
        salario = 0.0f;
    }

    //Set y Get de cada atributo privado
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNumTrabajador(String numTrabajador){
        this.numTrabajador = numTrabajador;
    }
    public String getNumTrabajador(){
        return numTrabajador;
    }

    public void setSalario(float salario){
        this.salario = salario; 
    }
    public float getSalario(){
        return salario;
    }


}