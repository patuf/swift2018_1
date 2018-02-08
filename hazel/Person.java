package Task0_Classes;

    public class Person {
        public String name ;
        public int age ;

        public static void main(String[]args){
            Person person = new Person();
            person.name="Pesho";
            person.age=0;
            person.greeting(person);
        }
        public Person(int newAge, String newName) {
            name = newName;
            age = newAge;
        }

        public Person() {
            name = "No name";
            age = -1;
        }

        public Person(String n) {
            name =n;
            age = -1;
        }

        public void greeting(Person person){
            if (person.age==0 & person.name!=null){
                System.out.printf("Hello, I am %s.",person.name);
            }
            else if(person.name==null& person.age!=0){
                System.out.printf("I am %d years old.",person.age);
            }
            else if(person.age==0&person.name==null){
                System.out.printf("I am John Doe");
            }
            else System.out.printf("Hello, I am %s. I am %d years old.",person.name,person.age);
        }

        public String getName()
        {
            return this.name;
        }
        public int getAge()
        {
            return this.age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }
    }


