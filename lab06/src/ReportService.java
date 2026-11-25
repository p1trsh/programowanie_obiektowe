public class ReportService {
    Storage storage;
    public void generateReport() {
        String report = "Raport";

        storage.save(report);
    }
}