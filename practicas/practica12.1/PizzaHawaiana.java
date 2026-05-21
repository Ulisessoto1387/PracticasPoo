public class PizzaHawaiana implements Pizza{

    String ingredientes;
    int numDeRebanadas;

    public PizzaHawaiana(){
        ingredientes = "Salsa de tomate, queso mozzarella, jamón y piña";
        numDeRebanadas = 8;
    }
    public PizzaHawaina(String ingredientes, int numDeRebanadas){
        this.ingredientes = ingredientes;
        this.numDeRebanadas = numDeRebanadas;
    }

    @Override
    public void ponerIngredientes(){
        System.out.println("Poniendo los ingredientes: "+ingredientes+" ");
    }
    @Override 
    public void cocinar(){
        System.out.println("Cocinando la pizza hawaiana...");
    }
    @Override 
    public void cortar(int numDeRebanadas){
        this.numDeRebanadas = numDeRebanadas;
        System.out.println("Cortando la pizza en "+numDeRebanadas+" rebanadas.");
    }
    @Override 
    public void servir(String tipoDeConsumo){
        System.out.println("Sirve la pizza para comer en: "+tipoDeConsumo+" ");
    }
    @Override 
    public void listaIngredientes(){
        System.out.println("Ingredientes: "+ingredientes);
    }

}