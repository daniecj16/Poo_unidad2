package unila;

public class Pelicula extends ContenidoAudiovisual {
    private String director;
    private int añoDeLanzamiento;

    // Constructor con todos los parámetros necesarios
    public Pelicula(String titulo, String genero, int duracion, int añoDeLanzamiento, String director) {
        super(titulo, genero, duracion); // Llama al constructor de la clase padre
        this.director = director;
        this.añoDeLanzamiento = añoDeLanzamiento;
    }

    // Métodos getter y setter para director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Métodos getter y setter para año de lanzamiento
    public int getAñoDeLanzamiento() {
        return añoDeLanzamiento;
    }

    public void setAñoDeLanzamiento(int añoDeLanzamiento) {
        this.añoDeLanzamiento = añoDeLanzamiento;
    }

    // Sobrescribe el método mostrarDetalles para incluir detalles adicionales de la película
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método mostrarDetalles de la clase padre
        System.out.println("Año de Lanzamiento: " + añoDeLanzamiento);
        System.out.println("Director: " + director);
    }
}
