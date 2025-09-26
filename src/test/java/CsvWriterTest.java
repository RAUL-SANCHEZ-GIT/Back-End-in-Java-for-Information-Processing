import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Csv writer test.
 */
class CsvWriterTest {

    /**
     * Test write djs to csv.
     *
     * @throws IOException the io exception
     */
    @Test
    void testWriteDjsToCsv() throws IOException {
        // Step 1: Prepare test data
        Dj dj = new Dj();
        dj.setNombre("HI-LO");
        dj.setEdad(28);
        dj.setAltura(1.80);
        dj.setEventos(List.of("Tomorrowland", "EDC"));

        List<Dj> testDjs = List.of(dj);

        // Step 2: Temporary file
        File tempFile = File.createTempFile("test_djs", ".csv");

        CsvWriter csvWriter = new CsvWriter();
        // Step 3: Write CSV
        csvWriter.writeDjsToCsv(tempFile.getAbsolutePath(), testDjs, ',');

        // Step 4: Check file exists
        assertTrue(tempFile.exists(), "CSV file should exist");

        // Step 5: Read content and check
        List<String> lines = Files.readAllLines(tempFile.toPath());
        assertEquals(2, lines.size()); // header + 1 DJ
        assertEquals("Name,Age,Height,Events", lines.get(0));
        assertEquals("HI-LO,28,1.8,Tomorrowland | EDC", lines.get(1));

        // Step 6: Delete temp file after test
        tempFile.deleteOnExit();
    }
}
