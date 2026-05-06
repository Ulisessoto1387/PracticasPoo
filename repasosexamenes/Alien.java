public class Alien extends ActividadesBasicas {

    String planeta;

    public Alien(){
        planeta = "Marte";
    }
    public Alien(String planeta){
        this.planetqa = planeta;
    }

    @Override 
    public void alimentarse(){
        System.out.println("Come carne cruda");
    }
    @Override 
    public void descansar(){
        System.out.println("Descansando en su nave");
    }

}