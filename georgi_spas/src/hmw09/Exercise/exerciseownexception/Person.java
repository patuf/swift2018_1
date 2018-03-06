package hmw09.Exercise.exerciseownexception;

public class Person {
    private final String name;
    private int age;
    private String profesion;


    Person(String name) throws ValidateInputException,Exception {
        if (name == null) {
            throw new ValidateInputException("Name can't be null!");
        }
        if (name.isEmpty()) {
            System.out.println("name can't be empty");
            throw new Exception();
        }
        this.name = name;

    }


}
