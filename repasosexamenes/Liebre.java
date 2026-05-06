public class Liebre extends AnimalCarrera {
    
    String estado;

    public Liebre(){
        super();
        estado = "corriendo";
    }
    public Liebre(int posicion, int id, String nombre ) {
        super(posicion, id, nombre);
        this.estado = estado;
    }
    
    public void comer(){
        System.out.println("Estoy comiendo una zanahoria");
    }
    @Override
    public void avanzar(){
        posicion += 2;
    }
    @Override
    public void hablar(){
        System.out.println("Que hay de nuevo viejo");
    }

}