public class FabricaDePizzas {

    public static Pizza crearPizza(String tipoDePizza){
        Pizza unapizza = null;
        switch(tipoDePizza.toLowerCase()){
            case "hawaiana":
                unapizza = new PizzaHawaiana();
                break;
            case "mexicana":
                unapizza = new PizzaMexicana();
                break;
            case "margarita":
                unapizza = new PizzaMargarita();
                break;
            case "tres quesos":
                unapizza = new PizzaTresQuesos();
                break;
            default:
                System.out.println("Pizza inválida");
                break;
        }
        return unaPizza;
    }
    public static void listarPizzas(){
        System.out.println("********************************");
        System.out.println("Pizzas disponibles:");
        System.out.println("Pizza Hawaiana");
        System.out.println("Pizza Mexicana");
        System.out.println("Pizza Margarita");
        System.out.println("Pizza Tres Quesos");
        System.out.println("********************************");        
    }


}
