
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Generando reportes CON Template Method ===");

        ReportGenerator simpleReport = new SimpleReport();
        simpleReport.generate();

        System.out.println();

        ReportGenerator detailedReport = new DetailedReport();
        detailedReport.generate();
    }
}


