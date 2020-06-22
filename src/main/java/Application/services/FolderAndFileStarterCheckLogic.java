package Application.services;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;

public class FolderAndFileStarterCheckLogic {

    public static void runningFolderAndFileStarterCheckLogic() {
        File dataFolder = new File("C:\\StockDataBase");
        File dataFile = new File("C:\\StockDataBase\\stockdatabase.txt");
        boolean folderFlag = dataFolder.exists();
        boolean fileFlag;
        String fileCheck;
        String folderCheck;
        try {
            dataFolder.mkdirs();
            folderCheck = (folderFlag) ? "\nDataBase folder already exists" : "\nNew dataBase folder created";
            System.out.println(folderCheck);
            fileFlag = dataFile.createNewFile();
            fileCheck = (fileFlag) ? "New dataBase file created\n" : "DataBase file already exists\n";
            System.out.println(fileCheck);
        }
        catch(IOException e) {
            System.out.println(MessageFormat.format("IOException Error: {0}", e));
        }
        catch(Exception e) {
            System.out.println(MessageFormat.format("Exception Error: {0}", e));
        }
    }

}
