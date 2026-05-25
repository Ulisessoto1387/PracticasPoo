import java.util.Scanner;
public class AsientoCine {

    private String identificador;
    private boolean disponible;
    
    public AsientoCine(String identificador){
        this.identificador = identificador; 
        this.disponible = true;
    }

    public synchronized void comprar(String nombreComprador){
        Scanner entrada = new Scanner(System.in);
        String respuesta;

        if(disponible){
            System.out.println("["+nombreComprador+"] El asiento "+identificador+" esta disponible.");
            System.out.println("["+nombreComprador+"] ¿Quieres comprarlo? (si/no): ");
            respuesta = entrada.nextLine().toLowerCase();

            if(respuesta.equals("si")) {
                if(disponible){
                    disponible = false;
                    System.out.println(" "+nombreComprador+" ha adquirido el asiento "+identificador+". ");
                } else {
                    System.out.println("Lo sentimos "+nombreComprador+", el asiento "+identificador+" ya fue vendido. :( ");
                }
            } else {
                System.out.println("["+nombreComprador+"] No ha adquirido el asiento.");
            }
        } else {
            System.out.println("Lo sentimos "+nombreComprador+", el asiento "+identificador+" ya fue vendido. :( ");
        }
    }  
    

}

