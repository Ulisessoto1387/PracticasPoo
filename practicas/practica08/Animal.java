public abstract class Animal {
    private int id;
    private int posicion;
    private String nombre; 
    

    public Animal(int id, int posicion, String nombre){
        this.id = id;
        this.posicion = posicion;
        this.nombre = nombre;
    }
    public Animal(){
        id = 0; 
        posicion = 0; 
        nombre = "Nombre generico";
    }


    public int reportarPosicion(){
        return posicion; 
    }
    public void festejar(){
        System.out.println("Yeiiiii!! I'm the champion");
    }
    public String toString(){
        return "Id:"+id+" va en la posicion:"+posicion+" y se llama: "+nombre+" ";
    } 
    public abstract void avanzar();
    public abstract void hablar();


    public void setId(int id){
        this.id = id; 
    }
    public int getId(){
        return id;
    }
     public void setPosicion(int posicion){
        this.posicion = posicion;     
    }
    public int getPosicion(){
        return posicion;
    }
     public void setNombre(String nombre){
        this.nombre = niombre; 
    }
    public String getNombre(){
        return nombre;
    }


}
