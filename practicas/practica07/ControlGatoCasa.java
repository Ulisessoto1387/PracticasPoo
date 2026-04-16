public class ControlGatoCasa {
    public static void main(String[] args) {

        GatoDeCasa gato01 = new GatoDeCasa();
        System.out.println("Gato por default: " + gato01.toString() );
        gato01.molestarKaren();
        gato01.comer();
        gato01.dormir();
        gato01.hablar();

        System.out.println("Cambiar nombre y edad");
        gato01.setNombre("Estrella");
        gato01.setEdad(2);
        System.out.println("Nombre: "+gato01.getNombre()+" y tiene "+gato01.getEdad()+" años");

        GatoDeCasa gato02 = new GatoDeCasa("Gris", 3, 10, "Michi");
        System.out.println("Gato por referencia: " + gato02.toString() );
        gato02.molestarKaren();
        gato02.comer();
        gato02.dormir();
        gato02.hablar();


    }
}