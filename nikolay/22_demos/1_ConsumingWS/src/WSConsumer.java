
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WSConsumer {

    public static void main(String[] args) throws MalformedURLException, IOException {

        String url = "http://localhost:8080/3_RESTExample/person";

        try (InputStream stream = new URL(url).openStream();
                Scanner sc = new Scanner(stream)) {

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            
            //// 2nd way to retrieve content
            //String content = sc.useDelimiter("\\A").next();
            //System.out.println(content);
        }
    }
}
