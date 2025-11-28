public class Main {

    public static void main(String[] args) {
        System.out.println("=== Cargando imagenes SIN Proxy ===");

        RealImage image1 = new RealImage("foto_perfil.png");
        RealImage image2 = new RealImage("banner.png");

        System.out.println("Las imagenes ya se cargaron, aunque quizá no las mostremos...");
        image1.display();
    }
}

