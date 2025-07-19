package BuilderDesign;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Deepika").build();
        User user2 = new User.UserBuilder("Alice").address("Rajasthan").build();
        User user3 = new User.UserBuilder("Bob").age(19).build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);


    }
}
