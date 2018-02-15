import java.util.Scanner;

public class Person {
    private String PersonName;
    private Integer PersonAge;
    private Scanner ScanObject = new Scanner(System.in);

    Person() {
        this("No Name");
    }

    private Person(String Name) {
        this(Name, -1);
    }

    private Person(String Name, Integer Age) {
        this.PersonName = Name;
        this.PersonAge = Age;
    }

    private String getName() {
        return PersonName;
    }

    private Integer getAge() {
        return PersonAge;
    }

    private void setName(String Name) {
        this.PersonName = Name;
    }

    private void setAge(Integer Age) {
        this.PersonAge = Age;
    }

    void display(){
        System.out.println("Initializing Person...");
        System.out.println();

        Scanner input = new Scanner(System.in);
        Person NewPerson = new Person();

        boolean done = true;
        while(done) {
            System.out.print("Please enter name:");
            String inputName = input.nextLine();
            NewPerson.setName(inputName);
            System.out.print("Please enter age:");
            String inputAge = input.nextLine();
            String resultName = "Hello, i am "+NewPerson.getName()+".";
            if (inputAge.isEmpty()) {
                if (inputName.isEmpty()) {
                    System.out.println();
                    System.out.println("I am John Doe.");
                    break;
                }
                System.out.println();
                System.out.println(resultName);
                break;
            }
            if (inputAge.contains("")){
                Integer value = Integer.valueOf(inputAge);
                if (inputName.contains("")){
                    NewPerson.setName(inputName);
                    NewPerson.setAge(value);
                    String resultAge = "I am "+NewPerson.getAge()+" years old.";
                    System.out.printf("%s%s%n", resultName, resultAge);
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("Program finished successfully");
    }
}


