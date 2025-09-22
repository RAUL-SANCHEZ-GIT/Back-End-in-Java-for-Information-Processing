import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for {@link JsonReader}.
 * This class tests the JSON reading functionality, ensuring that DJ objects are correctly
 * loaded from a JSON file and that the content matches expected data
 */
 class JsonReaderTest {

    /**
     * Tests reading a list of DJs from a JSON file.
     *
     * @throws IOException if an I/O error occurs during file creation or reading.
     */
    @Test
    public void testReadDjsFromJson() throws IOException {
        // Step 1: Create temporary JSON file with test data
        File tempJson = File.createTempFile("test_djs", ".json");

        String jsonContent = """
                [
                  {
                    "nombre": "HI-LO",
                    "edad": 28,
                    "altura": 1.80,
                    "eventos": ["Tomorrowland","EDC"]
                  },
                  {
                    "nombre": "Oliver Heldens",
                    "edad": 30,
                    "altura": 1.78,
                    "eventos": ["Ultra Music Festival","Coachella"]
                  }
                ]
                """;

        try (FileWriter writer = new FileWriter(tempJson)) {
            writer.write(jsonContent);
        }

        // Step 2: Read JSON using ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        List<Dj> djs = objectMapper.readValue(tempJson, new TypeReference<List<Dj>>() {});

        // Step 3: Validate list size
        assertEquals(2, djs.size(), "There should be 2 DJ objects");

        // Step 4: Validate content of first DJ
        Dj firstDj = djs.get(0);
        assertEquals("HI-LO", firstDj.getNombre());
        assertEquals(28, firstDj.getEdad());
        assertEquals(1.80, firstDj.getAltura());
        assertEquals(List.of("Tomorrowland", "EDC"), firstDj.getEventos());

        // Step 5: Validate content of second DJ
        Dj secondDj = djs.get(1);
        assertEquals("Oliver Heldens", secondDj.getNombre());
        assertEquals(30, secondDj.getEdad());
        assertEquals(1.78, secondDj.getAltura());
        assertEquals(List.of("Ultra Music Festival", "Coachella"), secondDj.getEventos());

        // Step 6: Clean up temporary file
        tempJson.deleteOnExit();
    }
}
