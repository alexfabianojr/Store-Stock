package Application.services;

import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class RewriteLogic {

    public static void rewriteLogic(int primaryKey, String name, String type,
                                    Double weight, Double dimension, Double price, int quantity) {
        try {
            BufferedWriter bufferedWriter;
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader("C:\\StockDataBase\\stockdatabase.txt"));
            JSONObject jsonObject = new JSONObject();

            List<String> listJSON = (Files.readAllLines(Paths.get("C:\\StockDataBase\\stockdatabase.txt")));

            bufferedReader.close();

            jsonObject.put("primary-key", primaryKey);
            jsonObject.put("name", name);
            jsonObject.put("type", type);
            jsonObject.put("weight", weight);
            jsonObject.put("dimension", dimension);
            jsonObject.put("price", price);
            jsonObject.put("quantity", quantity);

            listJSON.set((primaryKey - 1), jsonObject.toString());

            bufferedWriter = new BufferedWriter(new FileWriter("C:\\StockDataBase\\stockdatabase.txt", false));

            for (int i = 0; i < listJSON.size(); i++) {
                bufferedWriter.append(listJSON.get(i) + System.lineSeparator());
            }

            bufferedWriter.close();
        }

        catch (IllegalStateException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (IllegalArgumentException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (NullPointerException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (InputMismatchException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (IOException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (Exception exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
    }
}
