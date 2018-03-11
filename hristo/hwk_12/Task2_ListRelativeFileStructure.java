package swift2018_1.hristo.hwk_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task2_ListRelativeFileStructure     {

    public static void main(String[] args) throws IOException {

        /*This class i equal to Task1_ListFileStructure but its works according task condition.
         * If you write in console /some/path/ the result will be in relative path format */

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the file path: ");


        Files.walk(Paths.get(sc.nextLine()))
                .filter(Files::isRegularFile)
                .forEach(System.out::println);


    }
}


