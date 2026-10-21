package employee;

public interface Reportable {
    String generateReport();

    default String reportHeader() {
        return "=== RAPPORT ===";
    }
}