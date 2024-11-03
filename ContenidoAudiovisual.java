package unila;

public class ContenidoAudiovisual {
    private String titulo;
    private String genero;
    private int duracion;

    public ContenidoAudiovisual(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo + ", Género: " + genero + ", Duración: " + duracion + " minutos.");
    }
}
