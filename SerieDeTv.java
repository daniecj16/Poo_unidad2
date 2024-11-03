package unila;

public class SerieDeTv extends ContenidoAudiovisual {
    private int numeroTemporadas;
    private int numeroEpisodios;

    public SerieDeTv(String titulo, String genero, int duracion, int numeroTemporadas, int numeroEpisodios) {
        super(titulo, genero, duracion);
        this.numeroTemporadas = numeroTemporadas;
        this.numeroEpisodios = numeroEpisodios;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de Temporadas: " + numeroTemporadas);
        System.out.println("Número de Episodios: " + numeroEpisodios);
    }
}
