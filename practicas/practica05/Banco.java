/**
 * Descripción: El programa tiene 3 clases con distintas funciones cada una, en la de comando manda hablar a variables, metodos de estas 
 * y lo que hace es crear con algúnos datos como un usuario para un banco, tenemos que manejar la función de ahorrar o retirar dinero.   
 * Autores: Christian Ulises Soto Fuentes y Joshua Jacob Oseguera Salinas 
 */

import java.util.Scanner; 

public class Banco {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float cantidad; 
        double nvosaldo;
        String respuesta; 
        Cliente cliente01 = new Cliente(); 
        Direccion direccion01 = new Direccion(); 
        CuentaBancaria cuentaBancaria01 = new CuentaBancaria(); 

        System.out.println("Crear su cuenta-usuario");
        System.out.println("Nombre: ");
        cliente01.setNombre(entrada.nextLine());  
        System.out.println("Saldo: ");
        cuentaBancaria01.setSaldo(entrada.nextFloat());
        entrada.nextLine();  
        System.out.println("Clave: ");
        cuentaBancaria01.setClave(entrada.nextLine());  
        System.out.println("Estado: ");
        direccion01.setEntidadfederativa(entrada.nextLine());  
        System.out.println("Alcaldia: ");
        direccion01.setAlcaldia(entrada.nextLine());  
        System.out.println("Calle: ");
        direccion01.setCalle(entrada.nextLine()); 
        System.out.println("Numero: ");
        direccion01.setNumero(entrada.nextLine()); 

        cliente01.setDireccion01(direccion01);
        cliente01.setCuentaBancaria01(cuentaBancaria01);   

        System.out.println(" ");
        System.out.println("Su nombre: "+cliente01.getNombre()+" "); 
        System.out.println("Su saldo inicial: $"+cliente01.getCuentaBancaria01().getSaldo()+" "); 
        System.out.println("Su clave sera: "+cliente01.getCuentaBancaria01().getClave()+" "); 
        System.out.println("Estado donde habita: "+cliente01.getDireccion01().getEntidadfederativa()+" ");
        System.out.println("Alcaldia: "+cliente01.getDireccion01().getAlcaldia()+" ");  
        System.out.println("Calle: "+cliente01.getDireccion01().getCalle()+" "); 
        System.out.println("Numero: "+cliente01.getDireccion01().getNumero()+" "); 
        
        System.out.println(" ");
        System.out.println("¿Cuánto dinero quiere ahorrar?");
        cantidad = entrada.nextFloat();
        entrada.nextLine();
        nvosaldo = cliente01.ahorrar(cliente01.getCuentaBancaria01().getSaldo(), cantidad);
        cliente01.getCuentaBancaria01().setSaldo((float)nvosaldo);
        System.out.println("El nuevo saldo es: $"+cliente01.getCuentaBancaria01().getSaldo());

        System.out.println(" "); 
        System.out.println("¿Quieres retirar?");
        respuesta = entrada.nextLine().toLowerCase();
        if (respuesta.equals("si")){
            System.out.println("¿Cuanto vas a retirar?");
            cantidad = entrada.nextFloat();
            nvosaldo = cliente01.retirar(nvosaldo, cantidad);
        } 
        System.out.println("El saldo quedo en: $"+nvosaldo+" ");


    }
}