package Application.services;

import java.io.*;
import java.nio.file.Files;
import java.text.MessageFormat;
import java.util.List;

public class StockReportLogic {
    public static void runningStockReportLogic() {
        try {

            File file = new File("C:\\StockDataBase\\stockdatabase.txt");

            List<String> linesList = Files.readAllLines(file.toPath());

            linesList.forEach(e -> System.out.println(e));

        }
        catch (IOException e) {
            System.out.println(MessageFormat.format("IOException Error: {0}", e));
        }
        catch (Exception e) {
            System.out.println(MessageFormat.format("IOException Error: {0}", e));
        }
    }
}
