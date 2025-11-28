class RealImage {

    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("[RealImage] Cargando imagen desde disco: " + filename);
    }

    public void display() {
        System.out.println("[RealImage] Mostrando imagen: " + filename);
    }
}
