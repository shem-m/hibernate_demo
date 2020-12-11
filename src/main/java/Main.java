import models.Auto;
import models.User;
import services.UserService;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        User user = new User("Masha",26);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
        user.setName("Sasha");
        userService.updateUser(user);
        userService.deleteUser(user);

        /*userService.deleteUser(userService.findUser(1));
        userService.deleteUser(userService.findUser(2));
        userService.deleteUser(userService.findUser(3));
        userService.deleteUser(userService.findUser(4));*/
    }
}
