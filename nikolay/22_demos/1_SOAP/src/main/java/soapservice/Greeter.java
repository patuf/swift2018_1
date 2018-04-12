
package soapservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "Greeter")
public class Greeter {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "goodbye")
    public String goodbye(@WebParam(name = "yourName") String txt) {
        return "Goodbye " + txt + " !";
    }
}
