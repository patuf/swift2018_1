package hmw08.school.bank;

public class DemoBank {

    public static void main(String[] args) {
     Client client1=new IndividualCustomer("Maria");
        Client client2=new IndividualCustomer("Maria");
        Client client3=new CompanyCustomer("Maria");
        client1.openAccount(20,3.0/100);
        client2.openAccount(20,3.0/100);
      //  Account indvidAccount1=new Account(client1,20,3.0/100);
        //Account indvidAccount2=new Account(client1,20,3.0/100);




    }

}
