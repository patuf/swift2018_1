package Task1_ListFileStructure;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFileStructure {
    public static void main(String[] args) {
        Path printDir = Paths.get("F:\\SwiftAcademy\\Lectures and HW");

        File testDir = new File(String.valueOf(printDir));
        File[] files = testDir.listFiles();

        assert files != null;
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

    }
}
