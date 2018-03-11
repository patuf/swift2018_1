package swift2018_1.hristo.hwk_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task1_ListFileStructure {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        System.out.println("Input the file path: ");

        Files.walk(Paths.get(sc.nextLine()))
                .filter(Files::isRegularFile)
                .forEach(System.out::println);
    }
}
