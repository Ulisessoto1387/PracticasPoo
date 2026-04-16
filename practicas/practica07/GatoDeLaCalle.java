public class GatoDeLaCalle extends Gato {
    private int numeroDePeleas;

    public GatoDeLaCalle(){
        super("Negro", 4, 8);
        this.numeroDePeleas = 7;
    }
    public GatoDeLaCalle(String color, int edad, int numeroDeBigotes, int numeroDePeleas){
        super(color, edad, numeroDeBigotes);
        this.numeroDePeleas = numeroDePeleas;
    }

    public void pelear(){
        numeroDePeleas++;
        System.out.println("Esta peleando...punch pam pum...");
    }

    public void setNumeroDePeleas(int numeroDePeleas){
        if (numeroDePeleas >= 0){
            this.numeroDePeleas = numeroDePeleas;
        } else {
            System.out.println("Tuvo que haber peleado más veces");
        }
    }
    public int getNumeroDePeleas(){
        return numeroDePeleas;
    }

    @Override
    public String toString(){
        return super.toString() + " y ha peleado "+numeroDePeleas+" veces";
    }

}