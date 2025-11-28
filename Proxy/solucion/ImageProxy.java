class ImageProxy implements Image {

    private final String filename;
    private RealImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
        System.out.println("[ImageProxy] Imagen creada, carga diferida.");
    }

    @Override
    public void display() {
        System.out.println("[ImageProxy] Mostrando imagen bajo demanda...");
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
