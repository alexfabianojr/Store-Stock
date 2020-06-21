package Application.panels;

import java.text.MessageFormat;
import java.util.Scanner;

import static Application.services.RegisterProductLogic.registerProductJSONDataBaseWriteLogic;

public class RegisterProductPanel {

    public static void registerProductPanel() {

        try {

            Scanner sc = new Scanner(System.in);

            int code; /*change code to get file next code number and take out this user decision*/
            String name;
            String type;
            Double weight;
            Double dimension;
            Double price;
            int quantity;

            System.out.println("...Register Product Painel");
            System.out.println("Code: ");
            code = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("Type: ");
            type = sc.nextLine();
            System.out.println("Weight: ");
            weight = sc.nextDouble();
            System.out.println("Dimension: ");
            dimension = sc.nextDouble();
            System.out.println("Price: ");
            price =  sc.nextDouble();
            System.out.println("Quantity: ");
            quantity = sc.nextInt();

            registerProductJSONDataBaseWriteLogic(code, name, type, weight, dimension, price, quantity);
        }
        catch (Exception e) {
            System.out.printf(MessageFormat.format("Error: {0}", e + "\n...try again"));
        }
    }

}
