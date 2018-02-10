package Task0_Classes;

public class Person {
    private String Name;
    private int Year;
    //constructor 1
    public Person(){
        Name = "No name";
        Year = -1;
    }
    //constructor 2
    public Person(String name){
        Name = name;
        Year = -1;
    }
    //constructor 3
    public Person(String name, int year){
        Name = name;
        //checking input parameter
        if(year <=0){
            System.out.println("Year must be higher then 0");
        }else
        Year = year;
    }
    public void setName(String name){
        Name = name;
    }
    public String getName(){
        return Name;
    }
    public void setYear(int year){
        //checking input parameter
        if(year <=0){
            System.out.println("Year must be greater then 0");
        }else
        Year = year;
    }
    //method to print the string
    public void printPerson() {
        if(Name.equals("No name")) Name = "John Doe";
        //checking if there is input in year
        if( Year == -1){
            System.out.format("Hello,I am %s.%n", Name);
        }else
            System.out.format("Hello,I am %s. I am %d years old. %n",Name,Year);
    }
}
