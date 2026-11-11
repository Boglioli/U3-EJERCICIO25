public class Main {
    public static void main(String[] args) {
        MaterialBibloteca[] materiales = new  MaterialBibloteca[2];
        materiales[0] = new Libro("el principito", 1943, "editorial planeta", 96, "antoine de saint-exupéry");
        materiales[1] = new Revista("revista científica", 2023, "editorial científica", 5, "junio");
        for (int i = 0; i < materiales.length; i++) {
            System.out.println("---- material de biblioteca ----");
            materiales[i].mostrarInformacion();
        }
    }
}