public abstract class Contenido{

    //Atributos
    protected String titulo;
    protected String autor;

    //Constructor
    public Contenido(String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }

    //getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return titulo;
    }

    //Metodo abstracto
    public abstract String tipo();


    //Override
    @Override 
    public String toString(){
        return "-------------------------" + 
                "\n" + tipo() + ": " + titulo + " - " + autor + 
                "\n-------------------------";
    }   




}