package Store;

import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VideoStore vs = new VideoStore();

        endLable:
        while (true){
            System.out.println("Input commands now: ");
            String str = input.next();
            str = str.toUpperCase();
            switch (str){
                case ("END") :
                    System.out.println("Good bye !");break endLable;
                    //ADDMOVIE TITANIC PESHO DRAMA 5.0 2000-10-23 7 2.5
                case("ADDMOVIE") : System.out.format(vs.addVSMovie(input.next(),input.next(),input.next(),
                        input.nextDouble(),LocalDate.parse(input.next()),input.nextInt()
                        ,input.nextDouble()) ? "success %n" : "fail %n");
                break;
                case("ADDCLIENT"):
                    System.out.printf(vs.addVSClient(input.next()) ? "success %n" : "fail %n");
                    break;
                case("REMVECLIENT"):
                    System.out.printf(vs.removeVSClient(input.next()) ? "success %n" : "fail %n" );
                    break;
                case("RENT"):
                    System.out.printf(vs.clientRentsMovie(input.next(),input.next()) ? "success %n" : "fail %n" );
                    break;
                case("RETURNMOVIE"):
                    System.out.printf(vs.clientReturnsMovie(input.next(),input.next()) ? "success %n" : "fail %n");
                    break;
                case("QUERYFINDTITLE"):
                    System.out.println(vs.findByTitle(input.next())); break ;
                case ("QUERYFINDEDITOR"):
                    System.out.println(vs.findByEditor(input.next()));break ;
                case ("QUERYFINDGENRE"):
                    System.out.println(vs.findByGenre(input.next()));break ;
                case ("QUERYFINDRATING"):
                    System.out.println(vs.findByRating(input.nextDouble()));break ;
                default:
                    System.err.println("NO SUCH COMMAND");
            }
        }
    }
}
