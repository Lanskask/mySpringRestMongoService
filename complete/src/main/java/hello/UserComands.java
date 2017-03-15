package hello;

/**
 * Created by a1 on 15.03.17.
 */
public class UserComands {

    String hostAdress = "http://localhost:8080/people";

    void crateNewPerson(String firstName, String lastName) {
        String.format("curl -i -X POST -H \"Content-Type:application/json\" -d " +
                "'{  \"firstName\" : %s,  \"lastName\" : %s }' " + this.hostAdress, firstName, lastName);
    }

    void deletePerson(String personHref) {
//        http://localhost:8080/people/53149b8e3004990b1af9f229
        String.format("curl -X DELETE %s/%s", this.hostAdress, personHref);
    }

    void findByEmail(String email) {
//        "curl http://localhost:8080/people/search/findByLastName?name=Baggins"
        String.format("curl %s//search/findByEmail?email=%s", this.hostAdress, email);
    }

}
