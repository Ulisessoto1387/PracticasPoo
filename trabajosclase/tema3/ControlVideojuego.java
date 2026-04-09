public class ControlVideojuego {
    public static void main(String[] args){
        Mago mago01 = new Mago();
        Vikingo vikingo01 = new Vikingo();
        Arquero arquero01 = new Arquero();

        System.out.println("");
        System.out.println("El mago: "+mago01.nombre+" y tiene un nivel de energia de: "+mago01.energia+" ");
        System.out.println("Sus habilidades son: ");
        mago01.ataque();
        mago01.defensa();
        mago01.movimiento();

        System.out.println("");
        System.out.println("El vikingo: "+vikingo01.nombre+" y tiene un nivel de energia de: "+vikingo01.energia+" ");
        System.out.println("Sus habilidades son: ");
        vikingo01.ataque();
        vikingo01.defensa();
        vikingo01.movimiento();

        System.out.println("");
        System.out.println("El arquero: "+arquero01.nombre+" y tiene un nivel de energia de: "+arquero01.energia+" ");
        System.out.println("Sus habilidades son: ");
        arquero01.ataque();
        arquero01.defensa();
        arquero01.movimiento();

    }
}