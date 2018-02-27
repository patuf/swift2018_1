package hmw08.school;

public class School implements NameAble {
    private final String name;
    //refernce to classes
    Class[] classes;
    int numberOfClasses;

    // constructor
    School(String name) {
        this.name = name;
        this.classes=new Class[4];
    }

// property interface
    @Override
    public String getName() {
        return this.name;
    }

    // methods
/*
    public void writeStudent(){
        classes[numberOfClasses].
    }

    public void assignTecher(){

    }
    */
}
