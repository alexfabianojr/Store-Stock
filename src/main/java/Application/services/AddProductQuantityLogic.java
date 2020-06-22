package Application.services;

import org.json.JSONObject;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.stream.Stream;

import static Application.services.RewriteLogic.rewriteLogic;

public class AddProductQuantityLogic {

    public static void addProductQuantityWriteLogic(int primaryKey, int quantity) {
        try {
            Stream<String> lines = Files.lines(Paths.get("C:\\StockDataBase\\stockdatabase.txt"));
            String databaseJSON = lines.skip(primaryKey - 1).findFirst().get();
            JSONObject jsonObject = new JSONObject(databaseJSON);

            String getName = jsonObject.getString("name");
            String getType = jsonObject.getString("type");
            Double getWeight = jsonObject.getDouble("weight");
            Double getDimension = jsonObject.getDouble("dimension");
            Double getPrice = jsonObject.getDouble("price");

            int newQuantity = jsonObject.getInt("quantity") + quantity;

            rewriteLogic(primaryKey, getName, getType, getWeight, getDimension, getPrice, newQuantity);
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
