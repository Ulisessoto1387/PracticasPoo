import java.io.Serializable;
public class Taquero implements Serializable{

    String nombre, alias, especialidad; 

    public Taquero(String nombre, String alias, String especialidad){
        this.nombre = nombre;
        this.alias = alias;
        this.especialidad = especialidad;
    }

    public void presentacion(){
        System.out.println("Hola, mi nombre es "+nombre+" mejor conocido como "+alias+" y mi especialidad es "+especialidad+" ");
    }
    public void preparacion(String taco){
        System.out.println("Estoy preparando un delicioso taco de "+taco+" ");
    }
    public void preparacionespecial(){
        System.out.println("Estoy preparando un delicioso taco de "+this.especialidad+" con mi toque especial");
    }

}

