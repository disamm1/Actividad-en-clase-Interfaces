public class Podcast extends Contenido implements Descargable, Reproducible{
    //atributos
    private int duracionSeg;
    private int episodio;

    //Constructor
    public Podcast(String titulo, String autor, int duracionSeg, int episodio){
        super(autor, titulo);
        this.duracionSeg = duracionSeg;
        this.episodio = episodio;
    }


    public boolean esReproducible(){
        return true;
    }

    public boolean esDescargable(){
        return true;
    }


    @Override 
    public int getDuracionSeg(){
        return duracionSeg;
    }



    @Override
    public void reproducir(){
        System.out.println("Reproduciendo " + tipo() + ": " + titulo + " (" + duracionSeg / 60 + " min " + duracionSeg % 60 + " s)"); 
    }



    @Override 
    public double calcularTamanoMB(){
        return (duracionSeg / 60) * 1.0;
    }

    @Override 
    public String tipo(){
        return "Podcast";
    }






}