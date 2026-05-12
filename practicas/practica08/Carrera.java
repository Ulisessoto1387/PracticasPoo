import java.util.Scanner;
import java.util.Hashtable;

public class Carrera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respuesta, nombre, especie;
        int elegido, accion, meta = 20, id = 0; 
        Animal competidorelegido = null;
        
        Hashtable<Integer, Animal> competidores = new Hashtable<Integer, Animal>();
        do {
            System.out.println("¡Bienvenido a las carreras");
            System.out.println("Dame el nombre del competidor:");
            nombre = entrada.nextLine();
            System.out.println("Proporcionar la especie del competidor");
            especie = entrada.nextLine();
            if (especie.equalsIgnoreCase("liebre")){
                Animal liebre01 = new Liebre(id, 0, nombre, "descansando");
                competidores.put(id, liebre01);
            } else if (especie.equalsIgnoreCase("tortuga")){
                Animal tortuga01 = new Tortuga(id, 0, nombre, "descansando");
                competidores.put(id, tortuga01);
            } else if (especie.equalsIgnoreCase("perro")){
                Animal perro01 = new Perro(id, 0, nombre, 3);
                competidores.put(id, perro01);
            } else {
                System.out.println("Esta especie no entra en la carrera");
            }
            id++;

            System.out.println("");
            System.out.println("¿Quieres agregar otro competidor?");
            respuesta = entrada.nextLine();
            System.out.println("");
        } while (respuesta.equalsIgnoreCase("si"));

        do {
            System.out.println("");
            System.out.println("Comienza la carrera!!");
            System.out.println("Lista de competidores:");
            for (Integer key: competidores.keySet()){
                System.out.println(" "+competidores.get(key).toString());
            }
            System.out.println("Dame el id del competidor elegido:");
            elegido = entrada.nextInt();
            entrada.nextLine();
            competidorelegido = competidores.get(elegido);
            if (competidorelegido instanceof Liebre){
                Liebre liebre01 = (Liebre) competidorelegido;
                liebre01.hablar();
                System.out.println("Lo que puedo hacer es:");
                System.out.println("1. Avanzar");
                System.out.println("2. Comer");
                accion = entrada.nextInt();
                if (accion == 1){
                    liebre01.avanzar();
                } else if (accion == 2){
                    liebre01.comer();
                } else {
                    System.out.println("Accion invalida");
                }
            } else if (competidorelegido instanceof Tortuga){
                Tortuga tortuga01 = (Tortuga) competidorelegido;
                tortuga01.hablar();
                System.out.println("Lo que puedo hacer es:");
                System.out.println("1. Avanzar");
                System.out.println("2. Descansar");
                accion = entrada.nextInt();
                if (accion == 1){
                    tortuga01.avanzar();
                } else if (accion == 2){
                    tortuga01.descansar();
                } else {
                    System.out.println("Accion invalida");
                }
            } else if (competidorelegido instanceof Perro){
                Perro perro01 = (Perro) competidorelegido;
                perro01.hablar();
                System.out.println("Lo que puedo hacer es:");
                System.out.println("1. Avanzar");
                System.out.println("2. Mover la cola");
                accion = entrada.nextInt();
                if (accion == 1){
                    perro01.avanzar();
                } else if (accion == 2){
                    perro01.moverLaCola();
                } else {
                    System.out.println("Accion invalida");
                }
            } else if (competidorelegido == null) {
                System.out.println("Competidor no valido");
                continue;
            }
        } while (competidorelegido == null || competidorelegido.getPosicion() < meta);

        System.out.println("¡Tenemos un ganador!");
        competidorelegido.festejar();


    }
}