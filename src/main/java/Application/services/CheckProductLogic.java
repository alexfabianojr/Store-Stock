package Application.services;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.stream.Stream;

public class CheckProductLogic {
    public static void checkProductLogic(int primaryKey) {
        try {
            Stream<String> lines = Files.lines(Paths.get("C:\\StockDataBase\\stockdatabase.txt"));
            String databaseJSON = lines.skip(primaryKey - 1).findFirst().get();
            JSONObject jsonObject = new JSONObject(databaseJSON);
            LocalDateTime localDateTime = LocalDateTime.now();

            String getName = jsonObject.getString("name");
            String getType = jsonObject.getString("type");
            Double getWeight = jsonObject.getDouble("weight");
            Double getDimension = jsonObject.getDouble("dimension");
            Double getPrice = jsonObject.getDouble("price");
            int getQuantity = jsonObject.getInt("quantity");


            System.out.println("_______________________________________________");
            System.out.printf("| Name: %s%n", getName);
            System.out.printf("| Type: %s%n", getType);
            System.out.printf("| Weight: %s%n", getWeight);
            System.out.printf("| Dimension: %s%n", getDimension);
            System.out.printf("| Price: %s%n", getPrice);
            System.out.printf("| Quantity: %s%n", getQuantity);
            System.out.printf("| Total value in stock: %s%n", (getPrice * getQuantity));
            System.out.printf("| Date: %s%n", localDateTime);
            System.out.println("_______________________________________________");
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
