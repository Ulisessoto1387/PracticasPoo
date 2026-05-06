public abstract class AnimalCarrera {

    private int posicion;
    private int id;
    private String nombre;  

    public AnimalCarrera(int posicion, int id, String nombre){
        this.posicion = posicion; 
        this.id = id;
        this.nombre = nombre;
    }
    public AnimalCarrera(){
        pociion = 0; 
        id = 000;
        nombre = "Pancrasio";
    }

    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
    public int getPosicion(){
        return posicion;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public int reportarPosicion(){
        return posicion;
    }
    public void festejar(){
        System.out.println("¡Vengaaa ganeee!");
    }

    abstract public void avanzar();
    abstract public void hablar();

}
