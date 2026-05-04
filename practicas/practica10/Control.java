import java.util.ArrayList;
import java.util.Scanner; 

 class Control {
    public static void main(String[] args){
        ArrayList<Gatito> arrgatitos = new ArrayList<Gatito>();
        Adopcion adopcion01 = new Adopcion();
        Scanner entrada = new Scanner(System.in);
        String opcion;

        try{
            adopcion01.adoptarGatitos(arrgatitos);
        }
        catch(Exception e){
            System.out.println("");
            System.out.println("----------------------");
            System.err.println(e.getMessage());
            System.out.println("----------------------");
            System.out.println("¿Qué deseas hacer?");
            System.out.println("A) No adoptar al gatito");
            System.out.println("B) Dar en adopción un gatito existenete y adoptar al nuevo gatito");
            opcion = entrada.nextLine();

            if(opcion.equalsIgnoreCase("A")){
                System.out.println("El nuevo gatito encontrará un buen hogar");
            } else if(opcion.equalsIgnoreCase("B")){
                adopcion01.mostrarGatitos(arrgatitos);
                System.out.println("¿Qué gato deseas dar en adopción?");
                int indice = entrada.nextInt();
                entrada.nextLine();
                arrgatitos.remove(indice-1);
                System.out.println("");

                try{
                    adopcion01.adoptarGatitos(arrgatitos);
                }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }

        }
        finally{
            System.out.println("");
            System.out.println("Gatitos adoptados");
            adopcion01.mostrarGatitos(arrgatitos);
        }

    }
}