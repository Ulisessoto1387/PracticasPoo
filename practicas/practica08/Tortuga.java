public class Tortuga extends Animal {
    private String estado;


    public Tortuga(){
        super();
        estado = "durmiendo";
    }
    public Tortuga(int id, int posicion, String nombre, String estado){
        super(id, posicion, nombre);
        this.estado = estado; 
    }


    public void descansar(){
        estado = "descansando";
        System.out.println("Estado: "+estado+" ");
    }
    public String toString(){
        return super.toString() + "y estoy "+estado+" ";
    }
    public void avanzar(){
        estado = "compitiendo";
        setPosicion(getPosicion()+1);
        System.out.println("Soy una tortuga, me llamo:"+getNombre()+" ");
        System.out.println("Avanzo una posición");
        System.out.println("Posición actual: "+getPosicion()+" ");
    }
    public void hablar(){
        System.out.println("Soy una tortuga, me llamo:"+getNombre()+" ");
        System.out.println("¡¡Kawawonga!!");
    }
    

    public void setEstado(String estado){
        this.estado = estado; 
    }
    public String getEstado(){
        return estado; 
    }


}