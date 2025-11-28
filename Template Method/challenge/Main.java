public class Main {

    public static void main(String[] args) {
        System.out.println("=== Generando reportes SIN Template Method ===");

        SimpleReport simpleReport = new SimpleReport();
        simpleReport.generateSimple();

        System.out.println();

        DetailedReport detailedReport = new DetailedReport();
        detailedReport.generateDetailed();
    }
}

