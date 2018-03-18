import java.io.File;

public class Task1_ListFileStructure {
    public static void main(String[] args) {

        File folder = new File("D:\\JavaSwiftAcademy\\swift2018_1");
        File[] listOfFiles = folder.listFiles();

        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                System.out.println(listOfFile.getAbsolutePath());
            }
        }
    }
}
