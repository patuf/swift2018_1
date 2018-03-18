public class Task1_Deck {
    public static void main(String[] args) {

        Card[] cards = new Card[52];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                switch (i) {
                    case 0:
                        cards[j] = new Card(intToString(j), "Clubs");
                        System.out.println(cards[j].toString());
                        break;
                    case 1:
                        cards[j] = new Card(intToString(j), "Diamonds");
                        System.out.println(cards[j].toString());
                        break;
                    case 2:
                        cards[j] = new Card(intToString(j), "Hearts");
                        System.out.println(cards[j].toString());
                        break;
                    case 3:
                        cards[j] = new Card(intToString(j), "Spades");
                        System.out.println(cards[j].toString());
                        break;
                    default:
                        break;
                }
            }
        }
    }

    static String intToString(int number) {
        switch (number) {
            case 0:
                return "Two";
            case 1:
                return "Three";
            case 2:
                return "Four";
            case 3:
                return "Five";
            case 4:
                return "Six";
            case 5:
                return "Seven";
            case 6:
                return "Eight";
            case 7:
                return "Nine";
            case 8:
                return "Ten";
            case 9:
                return "Jack";
            case 10:
                return "Queen";
            case 11:
                return "King";
            case 12:
                return "Ace";
            default:
                break;
        }
        return null;
    }
}
