package swift2018_1.hristo.hwk_05;

public class Car {

        String auto; //Марка на колата
        String model;//Модел
        int power;//Мощност на двигателя
        int year;//Година на производство
        int insurance;//Застрахователна категория
        int age;//Възраст на колата
        int category;//Категория застарховка
        double tax;//Дължим данък

    public Car(String newAuto, String newModel, int newPower, int newYear){
            auto = newAuto;
            model = newModel;
            power = newPower;
            year = newYear;
        }


        public int insuranceCategoty(){

            age = 2018 - year;

            if ( age <= 8){

                category = 1;
            }
            if (age > 8 && age < 15){

                category = 2;
            }
            if (age > 15 && age < 25){

                category = 3;
            }
            if (age >= 25){

                category = 4;
            }


            return category;
        }

        public double tax (){

            switch (category){

                case 1: category =1;
                tax = 150;
                break;

                case 2: category = 2;
                tax = 200;
                break;

                case 3: category = 3;
                tax = 300;
                break;

                case 4: category = 4;
                tax = 500;
                break;

            }
            if (power < 80) tax = tax * 1.2;

            if (power > 140) tax = tax * 1.45;
            return tax;

    }


    public static void main(String[] args) {



    Car car1 = new Car ("Mercedes","S220",160, 2009);
    car1.insuranceCategoty();
    car1.tax();
    System.out.println(car1.auto + " "+car1.model+ " "+car1.power+ " "+car1.year);
    System.out.println("insurance category " + car1.insuranceCategoty());
    System.out.println("tax "+car1.tax());

    }

}
