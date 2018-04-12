package client;

import client.Greeter;

import javax.xml.ws.WebServiceRef;

public class GreeterClient {
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/SOAPDemo/greetme.wsdl")
    private static Greeter_Service service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        service = new Greeter_Service();
        System.out.println(sayHello("World"));
        System.out.println(sayGoodbye("Pesho"));
    }

    private static String sayHello(String subject) {
        Greeter greeter = service.getGreeterPort();

        return greeter.hello(subject);
    }

    private static String sayGoodbye(String subject) {
        Greeter greeter = service.getGreeterPort();

        return greeter.goodbye(subject);
    }
}
