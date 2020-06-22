package Application.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.MessageFormat;

public class AddProductQuantityLogic {

    public static void addProductQuantityJSONMethodLogic(int code, String name, String type,
                                                         Double weight, Double dimension, int quantity) {
    }

    public static void addProductQuantityWriteLogic() {
        try {
            FileWriter fileWriter = new FileWriter("C:\\StockDataBase\\stockdatabase.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        }
        catch (Exception e) {
            System.out.printf(MessageFormat.format("Error: {0}", e));
        }
    }
}
