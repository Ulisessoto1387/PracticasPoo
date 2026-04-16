public class Cocinero {

    //Atributos
    String nombre, turno; 
    static double salario = 10000;

    //Metodos
    public Cocinero() {
        this.nombre = "Chefsito"; 
        this.salario = 20000; 
        this.turno = "Nocturno"; 
    }

    public Cocinero(String nombre, String turno) {
        this.nombre=nombre; 
        this.turno=turno; 
    }

    public void prepararPizzaHawaiana() {
        System.out.println("Se prepara una pizza con jamón, piña, queso mozzarella y cereza."); 
    }

    public void prepararPizzaHawaiana(String ingrediente) {
        System.out.println("Se prepara una pizza con jamón, piña, queso mozzarella, cereza y "+ingrediente+" "); 
    }

    public void prepararPizzaHawaiana(String[] extras) {
        System.out.println("Se prepara una pizza con jamón, piña, queso mozzarella, cereza ");
        for (String ing:extras) {
           if (ing != null) { 
            System.out.print(ing + " "); 
        }
    }

    }
}