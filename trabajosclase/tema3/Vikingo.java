public class Vikingo extends Videojuego {

    public Vikingo(){
        this.nombre = "Estoico";
        this.energia = 80;
    }

    public void ataque(){
        System.out.println("El vikingo ataca con su espada.");
    }
    public void defensa(){
        System.out.println("El vikingo bloquea el ataque con su escudo.");
    }
    public void movimiento(){
        System.out.println("El vikingo se mueve en barco hasta el campo de batalla.");
    }

}