public class MaterialBibloteca {
    String titulo;
    int añoEdicion;
    String editorial;
    public MaterialBibloteca(String titulo, int añoEdicion, String editorial) {
        this.titulo = titulo;
        this.añoEdicion = añoEdicion;
        this.editorial = editorial;
    }
    public void mostrarInformacion() {
        System.out.println("título: " + titulo);
        System.out.println("año de edición: " + añoEdicion);
        System.out.println("editorial: " + editorial);
    }
}
