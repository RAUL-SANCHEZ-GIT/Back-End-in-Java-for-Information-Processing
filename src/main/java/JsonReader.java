import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



import java.io.File;
import java.io.IOException;
import java.util.List;


/**
 * The type Json reader.
 */
public class JsonReader {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src/main/resources/JSON.json");

        try {
            /**
             * Reading JSON file and reading JSON
             */
            List<Dj> djs = objectMapper.readValue(jsonFile, new TypeReference<List<Dj>>() {});

            System.out.println("DJs cargados desde JSON:");
            djs.forEach(dj -> {
                System.out.println("dj = " + dj);
                System.out.println("DJ Name: " + dj.getNombre());
                System.out.println("Dj Altura: " + dj.getAltura());
                System.out.println("---------------");
            });

            /**
             * RException Errors Handler
             */
        } catch (IOException e) {
            System.err.println("Error al leer o procesar el archivo JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
