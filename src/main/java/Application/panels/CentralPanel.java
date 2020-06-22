package Application.panels;

import java.text.MessageFormat;
import java.util.Scanner;

import static Application.panels.AddProductPanel.addProductPanel;
import static Application.panels.CheckProductPanel.checkProductPanel;
import static Application.panels.RegisterProductPanel.registerProductPanel;
import static Application.panels.RemoveProductPanel.removeProductPanel;
import static Application.services.StockReportLogic.runningStockReportLogic;

public class CentralPanel {

    public static void centralPanel() {
        try {
            Scanner sc = new Scanner(System.in);
            int switchChooseVariable;
            while (true) {
                System.out.println("\nChoose the service to run..." +
                        "\n1 - Register Product" +
                        "\n2 - Remove Product" +
                        "\n3 - Add Product" +
                        "\n4 - Check Product" +
                        "\n5 - Stock Report" +
                        "\n0 - Exit Program");
                switchChooseVariable = sc.nextInt();
                switch (switchChooseVariable) {
                    case 0 -> {
                        System.exit(1);
                    }
                    case 1 -> { /*OK*/
                        registerProductPanel();
                    }
                    case 2 -> {
                        removeProductPanel();
                    }
                    case 3 -> {
                        addProductPanel();
                    }
                    case 4 -> {
                        checkProductPanel();
                    }
                    case 5 -> { /*OK*/
                        runningStockReportLogic();
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + switchChooseVariable + "\n...Try again");
                }
            }
        } catch (Exception e) {
            System.out.printf(MessageFormat.format("Error: {0}", e));
        }
    }

}
