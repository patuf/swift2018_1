public class Car {

    String model;
    int horsePower;
    int yearOfManufacture;
    String brand;
    final int currentYear = 2017;

//constructor
    Car(String brand,String model,int yearOfManufacture,int horsePower){
        this.brand=brand;
        this.model=model;
        this.yearOfManufacture=yearOfManufacture;
        this.horsePower=horsePower;

    }

    // method
    void insuranceCategory() {//check years of car
        int yearOffCar = currentYear - yearOfManufacture;// receive how old is car

        if (yearOffCar >= 1 && yearOffCar <= 8) {

            System.out.println("Категория 1- до 8 години");
            int leva = 150;
             System.out.println(brand+" "+model+ yearOfManufacture+" "+horsePower+" tax is "+tax(leva));

        } else if (yearOffCar <= 15) {

            int leva = 200;
            System.out.println("Категория 2- между 8 години");
            System.out.println(brand+" "+model+ yearOfManufacture+" "+horsePower+" tax is "+tax(leva));

        } else if (yearOffCar <= 25) {
            int leva = 300;
            System.out.println("Категория 3- между 25 години");
            System.out.println(brand+" "+model+ yearOfManufacture+" "+horsePower+" tax is "+tax(leva));


        } else {

            int leva = 500;
            System.out.println("Категория над 25 години");
            System.out.println(brand+" "+model+ yearOfManufacture+" "+horsePower+" tax is "+tax(leva));
        }
    }

    double tax(double sum) {
        if (horsePower < 80 && sum == 150 || sum == 200 || sum == 300 || sum == 500) {
            return sum = sum + sum * 0.20;
        } else if (horsePower >= 140 && sum == 150 || sum == 200 || sum == 300 || sum == 500) {
            return sum = sum + sum * 0.45;
        }
        return sum;
    }


    public static void main(String[] args) {
        Car merc=new Car("Mercedes-Benz","s220",2009,160);
        Car opel=new Car("Opel","Astra",1996,85);
        Car bugati=new Car("Bugatti","Veyron",2015,612);
        Car lada=new Car("Lada","5",1989,75);

        merc.insuranceCategory();
        opel.insuranceCategory();
        bugati.insuranceCategory();
        lada.insuranceCategory();
    }

}
