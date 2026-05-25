public class Cine{
    public static void main(String[] args){

        AsientoCine asientoCompartido = new AsientoCine("G07");
        Comprador comprador01 = new Comprador("Christian", asientoCompartido);
        Comprador comprador02 = new Comprador("Angel", asientoCompartido);
        comprador01.start();
        comprador02.start();

    }
}
