public class Task0_Classes {
    public static void main(String[] args) {
        Car audiCar = new Car("Audi", "Q7", 252, 2011);

        int audiCarCategory = audiCar.insuranceCategory(audiCar.getProductionYear());

        System.out.println(audiCarCategory);

        double tax = audiCar.taxes(audiCarCategory, audiCar.getHorsePower());

        System.out.println(tax);

        Person person = new Person("Kate", 38);

        System.out.println(person.sayHello());
    }
}
