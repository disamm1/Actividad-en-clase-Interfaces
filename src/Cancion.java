public class Cancion extends Contenido implements Descargable, Reproducible{
    //atributos
    private int duracionSeg;

    //Constructor
    public Cancion(String titulo, String autor, int duracionSeg){
        super(autor, titulo);
        this.duracionSeg = duracionSeg;
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
        return (duracionSeg / 60) * 1.5;
    }

    @Override 
    public String tipo(){
        return "Cancion";
    }


}