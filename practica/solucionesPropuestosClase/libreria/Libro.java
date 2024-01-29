package solucionesPropuestosClase.libreria;

/**
 * @author Hugo A.
 */
public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int numPag;

    public Libro(String ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public void imprimirISBNTitulo() {
        System.out.println("El ISBN es " + getISBN());
        System.out.println("El titulo es " + getTitulo());

    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void imprimirLibroCompleto() {
        System.out.println("El libro seleccionado tiene las siguientes características: ");
        imprimirISBNTitulo();
        System.out.println("El autor es " + getAutor());
        System.out.println("El numero de paginas es " + getNumPag());
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPag() {
        return numPag;
    }
}
