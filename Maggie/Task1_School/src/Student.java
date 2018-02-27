public class Student implements NameSt {
    private String NameSt;
    private final int StID;

    public Student(String nameSt, int id) {
        this.NameSt=nameSt;
        this.StID = id;
    }

    public String findId(){
        return String.format("My ID is %d. ", getStID());
    }

    public int getStID() {
        return StID;
    }

    public String findName(){
        return String.format("My name is %s. ", getNameSt());
    }

    @Override
    public String getNameSt() {
        return NameSt;
    }
}