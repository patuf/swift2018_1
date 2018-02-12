package Task0b_Classes;

public class main {
    public static void main(String[] args) {
        //brand, mode, engine power, year
        Cars c = new Cars("Mercedes-benz","S220",75,1989);
        System.out.format("%.2f",c.carTax());
    }
}
