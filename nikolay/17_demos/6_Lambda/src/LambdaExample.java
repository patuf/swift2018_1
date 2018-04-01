
import java.util.Arrays;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee[]{
            new Employee("Peter", 1234),
            new Employee("Nadya", 2512),
            new Employee("Ivan", 1551),
            new Employee("Maria", 2211),
            new Employee("Gosho", 2411)});

        employees.sort((x, y) -> x.salary - y.salary);

        employees.stream().filter((employee -> employee.salary > 2000)).sorted((x, y) -> x.salary - y.salary).forEach((employee) -> {
            System.out.printf("%s %d%n", employee.name, employee.salary);
        });

        employees.stream().filter((employee -> employee.salary <= 2000)).forEach((employee) -> {
            System.out.printf("%s %d%n", employee.name, employee.salary);
        });

       employees.forEach((employee) -> {
            System.out.printf("%s %d%n", employee.name, employee.salary);
        });
    }
}
