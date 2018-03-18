import java.io.File;

public class Task2_ListRelativeFileStructure {
    public static void main(String[] args) {
        File folder = new File("D:\\JavaSwiftAcademy\\swift2018_1");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println(listOfFiles[i].getAbsolutePath());
            } else {
                File[] childListOfFiles = listOfFiles[i].listFiles();
                for (File childListOfFile : childListOfFiles) {
                    System.out.println(childListOfFile.getAbsolutePath());
                }
            }
        }
    }
}
