public class Direccion {
    //Atributos 
    private String entidadfederativa, alcaldia, calle, numero; 
    
    //Set y get de los atributos 
    public void setEntidadfederativa(String entidadfederativa){
        this.entidadfederativa = entidadfederativa; 
    }
    public String getEntidadfederativa(){
        return entidadfederativa; 
    }

    public void setAlcaldia(String alcaldia){
        this.alcaldia = alcaldia; 
    } 
    public String getAlcaldia(){
        return alcaldia; 
    }

    public void setCalle(String calle){
        this.calle = calle; 
    }
    public String getCalle(){
        return calle; 
    }

    public void setNumero(String numero){
        this.numero = numero; 
    }
    public String getNumero(){
        return numero; 
    }

}