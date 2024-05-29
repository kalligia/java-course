package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User2;
import gr.aueb.cf.ch12.model.UserCredentials;

public class Main {

    public static void main(String[] args) {

        User2 maria = new User2(1, "Maria", "Papadopoulou");

        UserCredentials marias = new UserCredentials(1, "mariap", "maria1234");

        System.out.println("{" + maria.getId() + ", " + maria.getFirstname() + ", " + maria.getLastname()
        + ", " + marias.getId() + ", " + marias.getUsername() + ", " + marias.getPassword() + "}") ;
    }
}
