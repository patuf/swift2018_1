package controller;

import model.Book;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/books")
public class BookController {

    @GET
    @Produces("text/plain")
    public String getMyBook() {
        return "A book";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getMyBookInHTML() {
        return "<html> " + "<title>" + "A book" + "</title>"
                + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getMyBookInJSON() {
        return new Book("pesho", "the adventures of pesho", "p-e-s-h-o", 1980);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getMyBookInJSONTests(@PathParam("id") String id, @DefaultValue("pesho") @QueryParam("author") String author) {
        List<Book> res = new ArrayList<>();
        res.add(new Book(author, "the adventures of pesho", id, 1980));
        res.add(new Book("gosho", "gosho and the lamya", "2", 2014));
        return res;
    }

    @GET
    @Path("{id}/{year}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getMyBookInJSONTests(@PathParam("id") String id, @PathParam("year") String year,
                                           @DefaultValue("pesho") @QueryParam("author") String author) {
        List<Book> res = new ArrayList<>();
        res.add(new Book(author, "the adventures of pesho", id, Integer.valueOf(year)));
        res.add(new Book("gosho", "gosho and the lamya", "2", 2014));
        return res;
    }

    @POST
    @Path("create")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean createBook(Book book) {
        System.out.printf("JSON post: Title: %s, written by %s%n", book.getTitle(), book.getAuthor());
        return true;
    }

    @POST
    @Path("create")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public boolean createBookForm(@FormParam("title") String title, @FormParam("author") String author) {
        System.out.printf("Form post: Title: %s, written by %s%n", title, author);
        return true;
    }
}
