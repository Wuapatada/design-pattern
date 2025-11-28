class DetailedReport {

    public void generateDetailed() {
        // Paso 1: obtener datos
        String data = "ventas=100; clientes=20; devoluciones=5";
        System.out.println("[DetailedReport] Obteniendo datos...");

        // Paso 2: formatear
        String formatted = "VENTAS: 100 | CLIENTES: 20 | DEVOLUCIONES: 5";
        System.out.println("[DetailedReport] Formateando datos...");

        // Paso 3: imprimir
        System.out.println("[DetailedReport] Reporte detallado:");
        System.out.println(formatted);
    }
}
