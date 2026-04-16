public class GatoDeCasa extends Gato {
    private String nombre;

    public GatoDeCasa(){
        super("Blanco", 1, 12);
        this.nombre = "Luna";
    }
    public GatoDeCasa(String color, int edad, int numeroDeBigotes, String nombre){
        super(color, edad, numeroDeBigotes);
        this.nombre = nombre;
    }

    public void molestarKaren(){
        System.out.println("Rasguñando a Karen...pfff");
    }
    public void comer(){
        System.out.println("Ñam ñamm");
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    @Override 
    public String toString(){
        return super.toString() + " y se llama "+nombre;
    }

}
