package Task2_Bank.Customers;

public class IndividualCustomer {
    private String clientName;

    public IndividualCustomer(String name) {
        this.clientName = name;
    }

    public String getIndName(){
        return clientName;
    }

    public void setIndName(String name){
        this.clientName = name;
    }
}


