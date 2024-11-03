package poo;

import unila.Pelicula;
import unila.Documental;
import unila.SerieDeTv;
import unila.VideoYouTube;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Capitán América", "Acción", 124, 2011, "Joe Johnston");
        
        Documental documental = new Documental("Nuestro Planeta", "Naturaleza", 50, "David Attenborough");
       
        SerieDeTv serie = new SerieDeTv("Loki", "Ciencia Ficción", 45, 2, 12);
       
        VideoYouTube video = new VideoYouTube("Introducción a Java", "Educación", 10, "CanalProgramación", 5000);

        pelicula.mostrarDetalles();
        System.out.println();
        
        documental.mostrarDetalles();
        System.out.println();
        
        serie.mostrarDetalles();
        
        video.mostrarDetalles();
    }
}
