package org.example;

public class Livros {
    private String Titulo;
    private String Autor;
    private int ISBN;
    private int Numerodepaginas;
    private double valor;

    public Livros(String titulo, String autor, int ISBN, int numerodepaginas, double valor) {
        Titulo = titulo;
        Autor = autor;
        this.ISBN = ISBN;
        Numerodepaginas = numerodepaginas;
        this.valor = valor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumerodepaginas() {
        return Numerodepaginas;
    }

    public void setNumerodepaginas(int numerodepaginas) {
        Numerodepaginas = numerodepaginas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "Titulo= '" + Titulo + '\'' +
                ", Autor= '" + Autor + '\'' +
                ", ISBN= " + ISBN +
                ", Numero de paginas= " + Numerodepaginas +
                ", valor= " + valor +
                '}';
    }
}
