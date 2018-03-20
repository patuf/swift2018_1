package hmw12stream.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Task1_ListFileStructure {
    public static void main(String[] args) throws IOException {


        Stream<Path> paths = Files.walk(Paths.get("D:\\SwiftAcademy\\swift2018_1"));
        paths
                .filter(Files::isRegularFile)
                .forEach(System.out::println);


    }
}

