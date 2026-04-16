public class Liebre extends Animal {
    String estado; 


    public Liebre(){
        super();
        estado = "durmiendo"; 
    }
    public Liebre(int id, int posicion, String nombre, String estado){
        super(id, posicion, nombre);
        this.estado = estado; 
    }


    public void comer(){
        estado = "comiendo";
        System.out.println("Estado: "+estado+" unas zanahorias");
    }
    public String toString(){
        return super.toString() + " y estoy "estado+" ";
    }
    public void avanzar(){
        estado = "compitiendo";
        setPosicion(getPosicion()+3);
        System.out.println("Soy una liebre, me llamo:"+getNombre+" ");
        System.out.println("Avanzo tres posiciones");
        System.out.println("Posicion actual: "+getPosicion()+" ");
    }
    public void hablar(){
        System.out.println("Soy una liebre, me llamo:"+getNombre+" ");
        System.out.println("¡Que hay de nuevo, viejo!");
    }


}