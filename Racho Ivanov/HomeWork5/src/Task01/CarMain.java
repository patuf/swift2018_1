package Task01;

import Common.Scan;

import java.time.LocalDate;

public class CarMain
{
    public static void main(String[] args)
    {
        String brand;
        System.out.print("Car brand : ");
        brand = Scan.scanString();

        String model;
        System.out.print("Car model : ");
        model = Scan.scanString();


        System.out.print("Car year : ");
        int year = Scan.scanInt();

        System.out.print("Car horse power : ");
        int horsePower = Scan.scanInt();

        Car car1 = new Car(model, brand, year, horsePower);

        System.out.println(inshuranceCategory(car1));
    }

    static float inshuranceCategory(Car car)
    {
        int currentYear = LocalDate.now().getYear();

        if (currentYear - car.year < 9)
            return 150 * bonusInshurance(car);
        else if (currentYear - car.year < 16)
            return 200 * bonusInshurance(car);
        else if (currentYear - car.year < 26)
            return 300 * bonusInshurance(car);
        else
            return 500 * bonusInshurance(car);


    }

    static float bonusInshurance(Car car)
    {
        if (car.horsePower < 80)
            return (float)1.2;
        else if (car.horsePower > 140)
            return (float)1.45;
        else
            return (float)1;
    }
}
