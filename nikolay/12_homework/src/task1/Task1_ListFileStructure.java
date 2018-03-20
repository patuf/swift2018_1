package task1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1_ListFileStructure {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String pathString = sc.nextLine();

        File path = new File(pathString);
        if(!path.isDirectory())
            return;

        List<File> allFiles = getFilesAndDirs(path);
        
        for(File file : allFiles){
            System.out.println(file.getAbsolutePath());
        }
        
    }

    private static List<File> getFilesAndDirs(File path) {
        
        List<File> files = new ArrayList<>();
        
        for(File file : path.listFiles()){
            if(file.isDirectory()){
                files.addAll(getFilesAndDirs(file));
            } else{
                files.add(file);
            }
        }
        
        return files;
    }
}
