import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility class responsible for writing a list of DJs to a CSV file.
 */
public class CsvWriter {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        List<Dj> djs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Dj dj = new Dj();
            dj.setNombre("PablitoMix" + i);
            dj.setEdad(20 + i);
            dj.setAltura(1.70 + ((double) i / 100));
            dj.setEventos(List.of("Pal Norte", "Tomorrowland", "Coachella"));
            djs.add(dj);
        }

        writeDjsToCsv("./file.csv", djs, ',');
    }

    /**
     * Writes a list of DJs into a CSV file.
     *
     * @param filePath  The path where the CSV file will be saved.
     * @param djs       The list of DJ objects to be written.
     * @param delimiter The delimiter to use between cells (e.g., ',' or ';').
     */
    public static void writeDjsToCsv(String filePath, List<Dj> djs, char delimiter) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath),
                delimiter,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END)) {

            String[] header = {"Name", "Age", "Height", "Events"};
            writer.writeNext(header);

            for (Dj dj : djs) {
                String[] line = {
                        dj.getNombre(),
                        String.valueOf(dj.getEdad()),
                        String.valueOf(dj.getAltura()),
                        String.join(" | ", dj.getEventos())
                };
                writer.writeNext(line);
            }

            System.out.println("CSV successfully generated at: " + filePath);

        } catch (IOException e) {
            System.err.println("Error writing the CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
