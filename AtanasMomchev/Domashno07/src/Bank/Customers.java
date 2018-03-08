package Bank;

public class Customers {
    private  String name;
    private boolean company = false;

    Customers(String name){
        this.name = name;
    }
    Customers(String name, boolean company){
        this.name = name;
        this.company = true;
    }

    public boolean isCompany() {
        return company;
    }

    public String getName() {
        return name;
    }
}
