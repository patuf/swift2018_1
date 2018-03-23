package ListFileStructure;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileStructure {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        Path path = Paths.get(input.next());
        File [] files = new File(path.toString()).listFiles();
        fileStructure(files);
        BufferedReader br = new BufferedReader(new FileReader("D:\\dir.txt"));
        String line;
        line = br.readLine();
        System.out.println(line);
        br.close();
    }
    public static void fileStructure(File[] files) throws IOException{
        PrintWriter pw = new PrintWriter("D:\\dir.txt");
        for(File file : files){
            if(file.isDirectory()){
                pw.println(file.getAbsolutePath());
            }
        }
        pw.close();
    }
}

