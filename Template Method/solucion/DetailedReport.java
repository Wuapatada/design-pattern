class DetailedReport extends ReportGenerator {

    @Override
    protected String fetchData() {
        System.out.println("[DetailedReport] Obteniendo datos...");
        return "ventas=100; clientes=20; devoluciones=5";
    }

    @Override
    protected String formatData(String rawData) {
        System.out.println("[DetailedReport] Formateando datos...");
        return "VENTAS: 100 | CLIENTES: 20 | DEVOLUCIONES: 5";
    }
}
