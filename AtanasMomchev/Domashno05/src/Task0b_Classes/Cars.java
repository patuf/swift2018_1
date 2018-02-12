package Task0b_Classes;

public class Cars {
    private String brand;
    private String model;
    private int enginePower;
    private int yearOfProduction;
    public  Cars(String carB, String carM, int carEP,int carYP){
        brand = carB;
        model = carM;
        enginePower = carEP;
        yearOfProduction = carYP;
    }
    public int insuranceCategory(){
        int category ;
        //calculating how old is the car
        int old = 2018 - yearOfProduction;
         if(old<=8){
            category = 150;
         }else if (8>old && old<=15){
             category = 200;
         }else if (15>old && old<=25){
             category = 300;
         }else
             category = 500;
         return category;
    }
    public double carTax(){
        //setting the carTax depending on category
        double carTax = insuranceCategory();
        //check engine power to increase tax
        if(enginePower<80)
            carTax = carTax + (carTax*(20/100.0f));
        else if(enginePower>140)
            carTax = carTax + (carTax*(45/100.0f));
        return carTax;
    }
}
