public class ControlComida {
    public static void main(String[] args){

        Hija hija01 = new Hija();
        System.out.println("La hija01 "+hija01.nombre+ " tiene ahorrado: "+ hija01.getAhorro());
        hija01.ahorrar(150);
        System.out.println("La hija01 "+hija01.nombre+" tiene ahorrado: "+hija01.getAhorro());
        hija01.prepararComida();
        hija01.prepararComidaComoPadre();
        hija01.platicar();

        Padre hija02 = new Hija("Luna", 300, "Stefy");
        System.out.println("La hija02 "+hija02.nombre+" tiene ahorrado: "+hija02.getAhorro()+" ");
        hija02.ahorrar(200);
        System.out.println("La hija02 "+hija02.nombre+" tiene ahorrado: "+hija02.getAhorro()+" ");
        hija02.prepararComida();
        ((Hija)hija02).prepararComidaComoPadre();
        System.out.println("La mejor amiga de la hija02 es: "+((Hija)hija02).getMejorAmiga()+" ");
        ((Hija)hija02).platicar();

    }
}