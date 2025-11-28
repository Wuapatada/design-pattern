class SimpleReport extends ReportGenerator {

    @Override
    protected String fetchData() {
        System.out.println("[SimpleReport] Obteniendo datos...");
        return "ventas=100; clientes=20";
    }

    @Override
    protected String formatData(String rawData) {
        System.out.println("[SimpleReport] Formateando datos...");
        return "VENTAS: 100 | CLIENTES: 20";
    }
}

