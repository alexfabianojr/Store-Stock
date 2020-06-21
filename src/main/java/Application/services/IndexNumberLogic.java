package Application.services;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class IndexNumberLogic {

    public static int indexNumberByLineNumberCountLogic() throws IOException {
        try (LineNumberReader reader = new LineNumberReader(new FileReader("C:\\StockDataBase\\stockdatabase.txt"))) {
            reader.skip(Integer.MAX_VALUE);
            int numberOfLines = reader.getLineNumber() + 1;
            return numberOfLines;
        }
    }

}

