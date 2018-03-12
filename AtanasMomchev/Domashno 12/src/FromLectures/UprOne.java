package FromLectures;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class UprOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            String path = "D:\\configuration";
            Files.createDirectories(Paths.get(path));
            File f = new File("D:\\configuration");
            Files.createFile(Paths.get("D:\\configuration\\conf.txt"));
            Writer w = new FileWriter("D:\\configuration\\conf.txt");
            w.write(input.nextLine());
            w.write(input.nextLine());
            w.write(input.nextLine());
            w.close();
            File s = new File("D:\\configuration\\conf.txt");
            File b = new File("D:\\configuration\\backup.txt");
            Files.copy(s.toPath(), b.toPath());
            FileReader fr= new FileReader(b);
            BufferedReader br = new BufferedReader(fr);
            String ss;
            while ((ss = br.readLine()) != null){
                System.out.println(ss);
            }
            br.close();
            fr.close();
            Files.delete(s.toPath());
            Files.delete(b.toPath());
            Files.delete(f.toPath());
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
