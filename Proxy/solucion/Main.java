
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Cargando imagenes CON Proxy ===");

        Image image = new ImageProxy("foto_perfil.png");

        System.out.println("La imagen todavía NO se ha cargado desde disco...");
        System.out.println("Ahora la mostramos cuando realmente se necesita:");

        image.display(); // Aquí se dispara la carga real
        System.out.println("Segunda llamada a display():");
        image.display(); // Ya no vuelve a cargar desde disco
    }
}

