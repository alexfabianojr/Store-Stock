package Application.panels;

import java.text.MessageFormat;
import java.util.Scanner;

import static Application.services.RemoveProductLogic.removeProductLogic;

public class RemoveProductPanel {

    public static void removeProductPanel() {
        try {
            Scanner sc = new Scanner(System.in);

            int primaryKey;
            int quantity;

            System.out.println("Insert product primary-key: ");
            primaryKey = sc.nextInt();
            System.out.println("Quantity of product to be remove: ");
            quantity = sc.nextInt();
            removeProductLogic(primaryKey, quantity);
        }
        catch (Exception e) {
            System.out.println(MessageFormat.format("IOException Error: {0}", e));
        }
    }

}
