public class Hija extends Padre {
    
    private String mejorAmiga;

    public Hija(){
        super();
        mejorAmiga = "Ana";
    }
    public Hija(String nombre, float ahorro, String mejorAmiga){
        super(nombre, ahorro);
        this.mejorAmiga = mejorAmiga;
    }

    public void setMejorAmiga(String mejorAmiga){
        this.mejorAmiga = mejorAmiga;
    }
    public String getMejorAmiga(){
        return mejorAmiga;
    }

    private void platicarMejorAmiga(){
        System.out.println("Soy "+nombre+" y platico con "+mejorAmiga+" ");
    }
    public void platicar(){
        platicarMejorAmiga();
    }
    @Override
    protected void prepararComida(){
        System.out.println("Ella lo hace a la manera de la hija");
    }
    protected void prepararComidaComoPadre(){
        super.prepararComida();
    }

}
