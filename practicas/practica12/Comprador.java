class Comprador extends Thread {
    
    private String nombre;
    private AsientoCine asientoCompartido;

    public Comprador(String nombre, AsientoCine asientoCompartido) {
        this.nombre = nombre;
        this.asientoCompartido = asientoCompartido;
    }

    @Override
    public void run() {
        asientoCompartido.comprar(nombre);
    }


}
