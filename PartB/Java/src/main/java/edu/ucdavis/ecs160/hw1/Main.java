package edu.ucdavis.ecs160.hw1;

public class Main {
    public static void main(String[] args) {

        User user = new LoggedUser(new AdminUser("Alice", "alice@ucdavis.edu")); 


        user.setEmail("alice@ucdavis.edu");
        user.getName();
        user.getEmail();

    }
}
