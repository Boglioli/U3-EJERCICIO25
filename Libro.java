public class Libro extends MaterialBibloteca {
    int cantidadPaginas;
    String autor;
    public Libro(String titulo, int añoEdicion, String editorial, int cantidadPaginas, String autor) {
        super(titulo, añoEdicion, editorial);
        this.cantidadPaginas = cantidadPaginas;
        this.autor = autor;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("cantidad de páginas: " + cantidadPaginas);
        System.out.println("autor: " + autor);
    }
}
