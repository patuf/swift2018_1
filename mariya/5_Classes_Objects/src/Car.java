public class Car {

    String make;
    String model;
    int horsePower;
    int productionYear;

    Car(String makeValue, String modelValue, int horsePowerValue, int productionYearValue) {
        make = makeValue;
        model = modelValue;
        horsePower = horsePowerValue;
        productionYear = productionYearValue;
    }

    void setMake(String makeValue) {
        this.make = makeValue;
    }

    String getMake() {
        return this.make;
    }

    void setModel(String modelValue) {
        this.model = modelValue;
    }

    String getModel() {
        return this.model;
    }

    void setHorsePower(int horsePowerValue) {
        this.horsePower = horsePowerValue;
    }

    int getHorsePower() {
        return this.horsePower;
    }

    void setProductionYear(int productionYearValue) {
        this.productionYear = productionYearValue;
    }

    int getProductionYear() {
        return this.productionYear;
    }

    public int insuranceCategory(int productionYear){
        int category;
        final int currentYear = 2018;
        int carAge = currentYear - productionYear;

        if (carAge < 8) {
            category = 1;
        } else if (carAge >= 8 && carAge < 15) {
            category = 2;
        } else if (carAge >= 15 && carAge < 25) {
            category = 3;
        } else{
            category = 4;
        }

        return category;
    }

    public double taxes(int category, int horsePower){
        double taxValue = 0;

        if (category == 1) {
            taxValue = 150;
        } else if (category == 2) {
            taxValue = 200;
        } else if (category == 3) {
            taxValue = 300;
        } else if (category == 4){
            taxValue = 500;
        }

        if (horsePower < 80) {
            taxValue = taxValue + (taxValue * 0.2);
        } else {
            taxValue = taxValue + (taxValue * 0.45);
        }

        return taxValue;
    }
}
