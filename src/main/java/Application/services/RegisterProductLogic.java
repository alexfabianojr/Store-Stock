package Application.services;
import org.json.JSONObject;

import java.io.*;
import java.text.MessageFormat;

import static Application.services.IndexNumberLogic.indexNumberByLineNumberCountLogic;


public class RegisterProductLogic {

    public static void registerProductJSONDataBaseWriteLogic(String name, String type, Double weight,
                                                             Double dimension, Double price, int quantity) {
        try {

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\StockDataBase\\stockdatabase.txt", true));
            JSONObject jsonObject = new JSONObject();

            int index = indexNumberByLineNumberCountLogic();

            jsonObject.put("code", index);
            jsonObject.put("name", name);
            jsonObject.put("type", type);
            jsonObject.put("weight", weight);
            jsonObject.put("dimension", dimension);
            jsonObject.put("price", price);
            jsonObject.put("quantity", quantity);

            bufferedWriter.append(jsonObject.toString() + System.lineSeparator());
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
