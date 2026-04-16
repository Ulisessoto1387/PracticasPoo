public class ControlGatoCalle {
    public static void main(String[] args) {

        GatoDeLaCalle gato01 = new GatoDeLaCalle();
        System.out.println("Gato por default: " + gato01.toString() );
        gato01.pelear();
        System.out.println("Las veces que ha peleado: "+gato01.getNumeroDePeleas()+" ");
        gato01.comer();
        gato01.dormir();
        gato01.hablar();

        System.out.println("Cambiar el color del gato...");
        gato01.setColor("Gris");
        System.out.println("El nuevo color es: "+gato01.getColor()+" ");

        GatoDeLaCalle gato02 = new GatoDeLaCalle("Manchado", 3, 8, 5);
        System.out.println("Gato por referencia: "+gato02.toString()+" ");
        gato02.pelear();
        System.out.println("Las veces que ha peleado: "+gato02.getNumeroDePeleas()+" ");
        gato01.comer();
        gato01.dormir();
        gato01.hablar();


    }
}