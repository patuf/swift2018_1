package controllers;

import data_objects.Person;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("person")
@Produces(MediaType.APPLICATION_JSON)
public class PersonController {

    List<Person> people;

    public PersonController() {
        people = new ArrayList<>();

        people.add(new Person("Pesho", 24));
        people.add(new Person("Gosho", 35));
        people.add(new Person("Maria", 19));
    }

    @GET
    public String test() {
        return "People database deployed and running.";
    }

    @GET
    @Path("{user_id}")
    public Person getPerson(@PathParam("id") int id) {
        return people.get(id);
    }

    @GET
    @Path("age/average")
    public String getAllNames() {
        double avg = 0;
        for (Person person : people) {
            avg += person.getAge();
        }
        avg /= people.size();

        return Double.toString(avg);
    }

    @OPTIONS
    @Path("listAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAllPeople() {
        return people;
    }
}
