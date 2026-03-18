public class Cliente {
    //Atributos 
    private String nombre; 
    private Direccion direccion01; 
    private CuentaBancaria cuentaBancaria01; 

    //Metodos utilitarios 
    public static double ahorrar(double saldo, double cantidad){
        double nvosaldo = saldo + cantidad; 
        return nvosaldo; 
    }

    public static double retirar(double saldo, double cantidad){    
        if (cantidad <= saldo){
        double nvosaldo = saldo - cantidad;
        return nvosaldo;  
        } else {
        System.out.println("No te alcanza para retirar esa cantidad");
        return saldo; 
        }   
    }

    //Set y get para atributos priv
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    public String getNombre(){
        return nombre; 
    }

    public void setDireccion01(Direccion direccion01){
        this.direccion01 = direccion01; 
    }
    public Direccion getDireccion01(){
        return direccion01; 
    }

    public void setCuentaBancaria01(CuentaBancaria cuentaBancaria01){
        this.cuentaBancaria01 = cuentaBancaria01; 
    }
    public CuentaBancaria getCuentaBancaria01(){
        return cuentaBancaria01; 
    }


}
