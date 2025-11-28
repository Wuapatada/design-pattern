class SimpleReport {

    public void generateSimple() {
        // Paso 1: obtener datos
        String data = "ventas=100; clientes=20";
        System.out.println("[SimpleReport] Obteniendo datos...");

        // Paso 2: formatear
        String formatted = "VENTAS: 100 | CLIENTES: 20";
        System.out.println("[SimpleReport] Formateando datos...");

        // Paso 3: imprimir
        System.out.println("[SimpleReport] Reporte:");
        System.out.println(formatted);
    }
}