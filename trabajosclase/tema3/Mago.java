public class Mago extends Videojuego {
    
    public Mago(){
        this.nombre = "Potter";
        this.energia = 150;
    }

    public void ataque(){
        System.out.println("El mago lanza una bola de fuego.");
    }
    public void defensa(){
        System.out.println("El mago bloquea el ataque con un escudo mágico.");
    }
    public void movimiento(){
        System.out.println("El mago se mueve volando por el campo de battalla.");
    }

}