package Application;
import java.text.MessageFormat;

import static Application.panels.CentralPanel.centralPanel;
import static Application.services.FolderAndFileStarterCheckLogic.runningFolderAndFileStarterCheckLogic;

public class App {
    public static void main(String[] args) {
        try {
            runningFolderAndFileStarterCheckLogic();
            centralPanel();
        }
        catch (Exception e) {
            System.out.println(MessageFormat.format("Error: {0}", e));
        }
    }
}
