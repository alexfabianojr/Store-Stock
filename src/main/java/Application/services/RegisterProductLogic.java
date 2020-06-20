package Application.services;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;


public class RegisterProductLogic {

    public static void registerProductJSONDataBaseWriteLogic(int code, String name, String type, Double weight, Double dimension, int quantity) {
        try {

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\StockDataBase\\stockdatabase.txt", true));
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("name", name.toString());
            jsonObject.put("type", type.toString());
            jsonObject.put("weight", weight);
            jsonObject.put("dimension", dimension);
            jsonObject.put("quantity", quantity);

            bufferedWriter.append("DATA_CODE" + jsonObject.toString() + System.lineSeparator());
            bufferedWriter.close();

            System.out.println(jsonObject.toString());
            System.out.println("Product Registered!");
        }
        catch (IOException e) {
            System.out.printf(MessageFormat.format("Error: {0}", e));
        }
        catch (Exception e) {
            System.out.printf(MessageFormat.format("Error: {0}", e));
        }
    }
}
