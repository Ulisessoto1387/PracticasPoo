public class ControlServicio {
    public static void main(String[] args){
        ServicioPumabus primerServicioPumabus = new ServicioPumabus(); 
        Conductor cond = new Conductor("Ulises", "216754", 10000.f);
        Pumabus pum = new Pumabus(80, "perfecto", 2);
        ServicioPumabus segundoServicioPumabus = new ServicioPumabus(1, cond, pum); 

        System.out.println("Los datos del primer servicio son: "); 
        System.out.println("Nombre del conductor: "+primerServicioPumabus.getElConductor().getNombre()+" ");
        System.out.println("Núm de trabajador: "+primerServicioPumabus.getElConductor().getNumTrabajador()+" ");
        System.out.println("Salario: "+primerServicioPumabus.getElConductor().getSalario()+" ");
        System.out.println("La capacidad del pumabus es de: "+primerServicioPumabus.getElPumabus().getCapacidad()+" "); 
        System.out.println("El estado del pumabus es: "+primerServicioPumabus.getElPumabus().getEstado()+" ");
        System.out.println("El tipo de servicio es: "+primerServicioPumabus.getElPumabus().getTipoDeServicio()+" ");
        System.out.println("La ruta: "+primerServicioPumabus.ruta+" ");

        System.out.println(" ");
        System.out.println("Los datos del segundo servicio son: "); 
        System.out.println("Nombre del conductor: "+segundoServicioPumabus.getElConductor().getNombre()+" ");
        System.out.println("Núm de trabajador: "+segundoServicioPumabus.getElConductor().getNumTrabajador()+" ");
        System.out.println("Salario: "+segundoServicioPumabus.getElConductor().getSalario()+" ");
        System.out.println("La capacidad del pumabus es de: "+segundoServicioPumabus.getElPumabus().getCapacidad()+" "); 
        System.out.println("El estado del pumabus es: "+segundoServicioPumabus.getElPumabus().getEstado()+" ");
        System.out.println("El tipo de servicio es: "+segundoServicioPumabus.getElPumabus().getTipoDeServicio()+" ");
        System.out.println("La ruta: "+segundoServicioPumabus.ruta+" ");


    }
}