import java.util.Scanner;

public class AlmacenadorDeValores {
    Scanner entrada = new Scanner(System.in);
    int cantidadValores;

    public void ingresarValores(){
        try{
            System.out.println("¿Cuántos valores deseas agregar?");
            cantidadValores = entrada.nextInt();
            entrada.nextLine();

            double[] arrValores = new double[cantidadValores];

            for (int i = 0; i < cantidadValores; i++){
                System.out.println("Valor para la casilla:"+i+":");
                arrValores[i] = entrada.nextDouble();
            }

            for (int i = 0; i < cantidadValores; i++){
                System.out.println("Casilla:"+i+" tiene el valor:"+arrValores[i]+" ");
            }
        
        }catch (NegativeArraySizeException e){
            System.out.println("----------------------------------");
            System.out.println("Error: no se puede realizar la operación indicada ya que indicó una capacidad negativa para el arreglo.");
            System.out.println("----------------------------------");
        }catch (Exception e){
            System.out.println("----------------------------------");
            System.out.println("Error:No se puede realizar la operación indicada ya que no proporcionó un tipo de dato adecuado.");
            System.out.println("----------------------------------");
        }

    }
}
