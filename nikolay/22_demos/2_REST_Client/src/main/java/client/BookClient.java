package client;

import client.Greeter;
import model.Book;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class BookClient {
    public static void main(String[] args) {
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget target = client.target(getBaseURI());


        System.out.println("Check out the raw response:");
        Response response = target.path("weblib").path("books").request().accept(MediaType.TEXT_PLAIN).get(Response.class);
        System.out.println(response.readEntity(String.class));
        System.out.println(response);

        System.out.println("Expecting plain response:");
        String plainAnswer = target.path("weblib").path("books").request().accept(MediaType.TEXT_PLAIN).get(String.class);
        System.out.println(plainAnswer);

        System.out.println("Expecting HTML response:");
        String htmlAnswer = target.path("weblib/books").request().accept(MediaType.TEXT_HTML).get(String.class);
        System.out.println(htmlAnswer);

//        String xmlAnswer =
//                target.path("weblib").path("books").request().accept(MediaType.TEXT_XML).get(String.class);
//        System.out.println(xmlAnswer);

        System.out.println("Expecting JSON response:");
        String jsonAnswer = target.path("weblib/books").request().accept(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println(jsonAnswer);

        System.out.println("Expecting JSON response bound to java class:");
        Book pojoAnswer = target.path("weblib/books").request().accept(MediaType.APPLICATION_JSON).get(Book.class);
        System.out.println(pojoAnswer.getAuthor());

        System.out.println("Expecting JSON response bound to java class:");
        Entity<Book> eBook = Entity.entity(new Book("Orwell", "84ta", "1234", 1948), MediaType.APPLICATION_JSON);
        Response createAnswer = target.path("weblib/books/create").request().accept(MediaType.TEXT_PLAIN).post(eBook);
        System.out.println(createAnswer.readEntity(Boolean.class));

        Form form = new Form().param("author", "Orwell").param("title", "Osemdese I nekoia").param("isbn", "1234").param("year", "1948");
        Entity eBookF = Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED);
        createAnswer = target.path("weblib/books/create").request().accept(MediaType.TEXT_PLAIN).post(eBookF);
        System.out.println(createAnswer.readEntity(Boolean.class));
    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/RESTDemo").build();
    }
}
