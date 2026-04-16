public class Gato {
    private String color; 
    private int edad; 
    protected int numeroDeBigotes;

    public Gato(){
        this.color = "Gris";
        this.edad = 3;
        this.numeroDeBigotes = 10;
    }
    public Gato(String color, int edad, int numeroDeBigotes){
        this.color = color; 
        this.edad = edad; 
        this.numeroDeBigotes = numeroDeBigotes;
    }

    public void comer(){
        System.out.println("Ñam ñamm....");
    }
    public void dormir(){
        System.out.println("Zzzz zzzz....");
    }
    public void hablar(){
        System.out.println("Holaa...");
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setNumeroDeBigotes(int numeroDeBigotes){
        if(numeroDeBigotes >= 0){
            this.numeroDeBigotes = numeroDeBigotes;
        } else {
            System.out.println("No se pueden tener Bigotes negativos");
        }
    }
    public int getNumeroDebigotes(){
        return numeroDeBigotes;
    }

    @Override 
    public String toString(){
        return "El gato es de color "+color+", tiene "+edad+" años y "+numeroDeBigotes+" bigotes";
    }

}
