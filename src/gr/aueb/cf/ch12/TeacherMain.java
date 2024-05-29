package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Teacher;

/**
 * Client class that creates a {@link Teacher}
 * instance and populates its state
 */
public class TeacherMain {

    public static void main(String[] args) {
        Teacher elon = new Teacher();
        Teacher anna = new Teacher(2, "Anna", "C");

        elon.setId(1);
        elon.setFirstname("Elon");
        elon.setLastname("K");

        System.out.println("Elon's state");
        System.out.println("id: " + elon.getId());
        System.out.println("firstname: " + elon.getFirstname());
        System.out.println("lastname" + elon.getLastname());

        System.out.println("Anna's state");
        System.out.println("id: " + anna.getId());
        System.out.println("firstname: " + anna.getFirstname());
        System.out.println("lastname" + anna.getLastname());
    }
}
