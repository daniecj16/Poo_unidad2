package unila;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int visualizaciones;

    public VideoYouTube(String titulo, String genero, int duracion, String canal, int visualizaciones) {
        super(titulo, genero, duracion);
        this.canal = canal;
        this.visualizaciones = visualizaciones;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Canal: " + canal);
        System.out.println("Visualizaciones: " + visualizaciones);
    }
}
