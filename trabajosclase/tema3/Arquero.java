public class Arquero extends Videojuego {
    
    public Arquero(){
        this.nombre = "Falcon";
        this.energia = 100;
    }

    public void ataque(){
        System.out.println("El arquero dispara una flecha.");
    }
    public void defensa(){
        System.out.println("El arquero esquiva el ataque con agilidad.");
    }
    public void movimiento(){
        System.out.println("El arquero se mueve corriendo por el campo de battalla.");
    }

}