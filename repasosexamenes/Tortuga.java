public class Tortuga extends AnimalCarrera {

    String estado;

    public Tortuga(){
        super();
        estado = "durmiendo";
    }
    public Tortuga(int posicion, int id, String nombre){
        super(posicion, id, nombre);
        this.estado = estado;
    }

    public void descansar(){
        System.out.println("Estoy descansando");
    }
    @Override
    public void avanzar(){
        posicion += 1;
    }
    @Override 
    public void hablar(){
        System.out.println("No tengo prisa");
    }

}