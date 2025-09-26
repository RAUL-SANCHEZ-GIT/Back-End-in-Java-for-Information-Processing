import java.util.List;

public class Main {
    public static void main(String[] args) {

        JsonReader jsonReader = new JsonReader();
        Config config = jsonReader.readerConfig();

        List<Dj> djList = jsonReader.readerDjs(config.getPathReader());

        CsvWriter csvWriter = new CsvWriter();
        csvWriter.writeDjsToCsv(config.getPathWriter(),djList,config.getDelimiter());

    }
}
