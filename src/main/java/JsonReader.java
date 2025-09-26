import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * The type Json reader.
 */
public class JsonReader {

    /**
     * The entry point of application.
     *
     * @param path the JSOMN file path
     */
    public List<Dj> readerDjs(String path) {

        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File(path);

        try {
            /**
             * Reading JSON file and reading JSON
             */
            return objectMapper.readValue(jsonFile, new TypeReference<List<Dj>>() {});

            /**
             * RException Errors Handler
             */
        } catch (IOException e) {
            System.err.println("Error al leer o procesar el archivo JSON: " + e.getMessage());
            e.printStackTrace();
            return new ArrayList<Dj>();
        }
    }

    public Config readerConfig() {

        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src/main/resources/CONFIG.json");

        try {
            /**
             * Reading JSON file and reading JSON
             */
            return objectMapper.readValue(jsonFile, Config.class);

            /**
             * RException Errors Handler
             */
        } catch (IOException e) {
            System.err.println("Error al leer o procesar el archivo JSON: " + e.getMessage());
            e.printStackTrace();
            return new Config();
        }
    }
}
