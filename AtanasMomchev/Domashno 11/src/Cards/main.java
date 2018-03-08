package Cards;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        for(Enum part : CardSuit.values()){
            System.out.print(part + " ");
        }
        System.out.println();
        for(Enum part2 : CardRank.values()){
            System.out.print(part2 + " ");
        }
    }
}
