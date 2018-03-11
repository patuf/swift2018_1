package com.swift.academy.filesDirectoriesManipulation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDirectoriesExample {

    public static void main(String[] args) throws IOException {

        Path outputDir = Paths.get("outputs");
        
        if(! Files.exists(outputDir)){
            Files.createDirectories(outputDir);
        }

        String fileToWrite = "inputs/info";

        byte[] allBytes = Files.readAllBytes(Paths.get(fileToWrite));

        Files.write(outputDir.resolve("output_info"), allBytes);

        //

        File file = new File(outputDir + File.separator + "outputFile");

        System.out.println(file.exists());

        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(allBytes);

    }
}
