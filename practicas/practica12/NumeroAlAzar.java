import java.security.SecureRandom;

public class NumeroAlAzar { 
    public static void main(String[] args){

        SecureRandom NumAleatorios = new SecureRandom();
        int numero = NumAleatorios.nextInt(101);
        System.out.println("El numero genrado aletoriamente es: "+numero+" ");

    }
}