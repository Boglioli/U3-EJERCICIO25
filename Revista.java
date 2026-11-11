public class Revista extends MaterialBibloteca {
    int numeroEdicion;
    String mesPublicacion;
    public Revista(String titulo, int añoEdicion, String editorial, int numeroEdicion, String mesPublicacion) {
        super(titulo, añoEdicion, editorial);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("número de edición: " + numeroEdicion);
        System.out.println("mes de publicación: " + mesPublicacion);
    }
}
