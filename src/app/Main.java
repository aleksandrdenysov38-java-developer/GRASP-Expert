package app;

public class Main {
    public static void main(String[] args) {

        User user = new User("John");


        Address address = new Address("Los Angeles", "Academy str.", "7");


        user.setAddress(address);


        System.out.println("User: " + user.getName());
        System.out.println("Address: " + user.getAddress().getFullAddress());
    }
}
