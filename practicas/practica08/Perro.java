public class Perro extends Animal {
    private int edad; 


    public Perro(){
        super(); 
        edad = 3; 
    }
    public Perro(int id, int posicion, String nombre, int edad){
        super(id, posicion, nombre);
        this.edad = edad;
    }


    public void moverLaCola(){
        System.out.println("Estoy moviendo la cola");
    }
    public String toString(){
        return super.toString() + "y tengo "+edad+" años ";
    }
    public void hablar(){
        System.out.println("¡¡Soy un buen perro!! y me llamo: "+getNombre()+" ");
    }
    public void avanzar(){
        setPosicion(getPosicion()+4);
        System.out.println("Soy un perro, me llamo:"+getNombre()+" ");
        System.out.println("Avanzo cuatro posiciones");
        System.out.println("Posición actual: "+getPosicion()+" ");
    }


    public void setEdada(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    
}