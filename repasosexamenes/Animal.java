public class Animal {

    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

    public static void recibirAnimal(Animal unAnimal){
        System.out.println("Recibir animal");
        unAnimal.hacerSonido();
    }

    public void recibirPerro(Perro unPerro){
        unPerro.hacerSonido();
    }

}
