package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Student;

/**
 * Like a client.
 * 1. Creates an {@link Student} instance (alice)
 * 2. Invokes public methods (setters / getters)
 */
public class StudentMain {

    public static void main(String[] args) {
        /*με χρήση του default constructor, δημιουργώ την alice κ
        μετά πρέπει να χρησιμοποιήσω getters & setters */
        Student alice = new Student();

        //χρήση overloaded constructor, δινω απευθειας values
        Student bob = new Student(2, "Bob", "D.");

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W");

        System.out.println("id: " + alice.getId());
        System.out.println("firstname: " + alice.getFirstname());
        System.out.println("lastname: " + alice.getLastname());;

//        //set
//        alice.id = 1;
//        alice.firstname = "Alice";
//        alice.lastname = "Wonderland";
//
//        //get
//        System.out.println("id: " + alice.id);
//        System.out.println("firstname: " + alice.firstname);
//        System.out.println("lastname: " + alice.lastname);;


    }
}
