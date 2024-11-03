package unila;

public class Documental extends ContenidoAudiovisual {
    private String narrador;  // 

    public Documental(String titulo, String genero, int duracion, String narrador) {
        super(titulo, genero, duracion);
        this.narrador = narrador;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Narrador: " + narrador);
    }
}
