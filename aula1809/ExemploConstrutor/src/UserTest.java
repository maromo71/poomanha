import model.User;

public class UserTest {
    public static void main(String[] args) {
        User usuario1 = new User();
        usuario1.setId(1);
        usuario1.setUserName("user1");
        User usuario2 = new User("admin", "123");

        User usuario3 = new User(3, "user3", "Chico",
                "chico@chico.com", "234");
    }
}
