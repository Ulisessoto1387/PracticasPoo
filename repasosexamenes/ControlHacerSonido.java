public class ControlHacerSonido {
    public static void main(String[] args){

        Animal animal01 = new Perro();
        Animal animal02 = new Gato();
        Animal animal03 = new Animal();
        animal01.hacerSonido();
        animal02.hacerSonido();
        animal03.hacerSonido();

        Animal animal04 = new Gato();
        animal04.hacerSonido();
        Animal.recibirAnimal(animal04);
        animal04 = new Perro();
        animal04.hacerSonido();
        Animal.recibirAnimal(animal04);

    }
}