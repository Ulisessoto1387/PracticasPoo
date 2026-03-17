public class ServicioPumabus {
    
    //Atributos
    int ruta; 
    private Conductor elConductor;
    private Pumabus elPumabus;

    //Constructor por referencia
    public ServicioPumabus(int ruta, Conductor elConductor, Pumabus elPumabus){
        this.ruta = ruta;
        this.elConductor = elConductor; 
        this.elPumabus = elPumabus; 
    }

    //Constructor por default 
    public ServicioPumabus(){
        ruta = 1;
        elConductor = new Conductor();
        elPumabus = new Pumabus(); 
    }

    //Set y Get de los atributos privados
    public void setElConductor (Conductor elConductor){
        this.elConductor = elConductor; 
    }
    public Conductor getElConductor(){
        return elConductor; 
    }

    public void setElPumabus(Pumabus elPumabus){
        this.elPumabus = elPumabus; 
    }
    public Pumabus getElPumabus(){
        return elPumabus; 
    } 


}