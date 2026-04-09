public class Tortuga extends Animal{
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
    

}