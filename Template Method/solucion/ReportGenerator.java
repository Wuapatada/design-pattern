
abstract class ReportGenerator {


    public final void generate() {
        String rawData = fetchData();
        String formattedData = formatData(rawData);
        print(formattedData);
    }

    protected abstract String fetchData();

    protected abstract String formatData(String rawData);

    protected void print(String formattedData) {
        System.out.println("[ReportGenerator] Imprimiendo reporte:");
        System.out.println(formattedData);
    }
}
