import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class reader {
    public class CSVReader {

        private static final String DELIMITER = ",";

        public static ArrayList<String[]> read(String fileName) {
            ArrayList<String[]> data = new ArrayList<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));

                String line;
                while((line = reader.readLine()) != null) {
                    String[] tokens = line.split(DELIMITER);
                    data.add(tokens);
                }

                reader.close();
            } catch(Exception e) {
                e.printStackTrace();
            }

            return data;
        }
    }

}
