public class FabricaDePizzas {

    public static Pizza crearPizza(String tipoDePizza){
        if(tipoDePizza.equalsIgnoreCase("Hawaiana")){
            PizzaHawaiana pizza01 = new Pizzahawaiana();
            return pizza01;
        } else if(tipoDePizza.equalsIgnoreCase("Mexicana")){
            PizzaMexicana pizza01 = new PizzaMexicana();
            return pizza01;
        }
        public static void listarPizzas(){
            System.out.println("********************************");
            System.out.println("Pizzas disponibles:");
            System.out.println("Pizza Hawaiana");
            System.out.println("Pizza Mexicana");
            System.out.println("********************************");
        }

    }
}
