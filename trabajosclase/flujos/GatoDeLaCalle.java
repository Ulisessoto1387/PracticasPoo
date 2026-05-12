public class GatoDeLaCalle {
    int edad, numDePeleas; 
    String nombre; 
    char tamaño; 
    float peso; 

    public void comer(){
        System.out.println("El gato de la calle está comiendo");
    }
    public void jugar(){
        System.out.println("El gato esta jugando"); 
    }
    public void pelear(){
        System.out.println("El gato esta peleando");
        numDePeleas++;
    }

}
