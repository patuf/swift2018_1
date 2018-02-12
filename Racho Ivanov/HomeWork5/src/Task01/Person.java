package Task01;

public class Person
{
    String name;
    int age;

    public Person()
    {
        name = "No name";
        age = -1;
    }
    public Person(String name)
    {
        this.name = name;
        age = -1;
    }
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public char[] Greating()
    {
        if (name == null)
            return "I am John Doe".toCharArray();
        else if(age == -1)
            return ("Hello I am" + name + ".").toCharArray();
        else
            return ("Hello I am" + name + ". I am " + age + "years old.").toCharArray();

    }
}
