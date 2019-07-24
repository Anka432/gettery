package setterygettery;

public class Main {

    public static void main(String[] args) {


        User user = new User(1l, "admin", "admin", "admin@example.com");

        System.out.println(user.getId());

        System.out.println(user.getLogin());

        System.out.println(user.getPassword());

        System.out.println(user.getEmail());

        user.setPassword("pass");

        System.out.println(user.getPassword());
    }
}