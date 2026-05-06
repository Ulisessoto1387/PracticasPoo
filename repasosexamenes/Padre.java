public class Padre {

    protected String nombre;
    private float ahorro; 

    public Padre(){
        nombre = "Juan";
        ahorro = 0.0f;
    }
    public Padre(String nombre, float ahorro){
        this.nombre = nombre;
        this.ahorro= ahorro;
    }

    public void setAhorro(float ahorro){
        this.ahorro = ahorro;
    }
    public float getAhorro(){
        return ahorro;
    }

    protected void prepararComida(){
        System.out.println("El lo hace a la manera del padre");
    }
    protected float ahorrar(float cantidad){
        ahorro += cantidad;
        return ahorro;
    }

}
