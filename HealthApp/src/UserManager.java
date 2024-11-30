import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.validatePassword(password)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getPublicUsers() {
        List<User> publicUsers = new ArrayList<>();
        for (User user : users) {
            if ("Public".equals(user.getProfileSettings().getPrivacy())) {
                publicUsers.add(user);
            }
        }
        return publicUsers;
    }
}
