public class LibroDigital extends Contenido implements Descargable{
    //atributos
    private int paginas;

    //Constructor
    public LibroDigital(String titulo, String autor, int paginas){
        super(autor, titulo);
        this.paginas = paginas;
    }


    public boolean esReproducible(){
        return false;
    }

    public boolean esDescargable(){
        return true;
    }


    @Override 
    public double calcularTamanoMB(){
        return paginas * 0.2;
    }

    @Override 
    public String tipo(){
        return "Libro Digital";
    }






}