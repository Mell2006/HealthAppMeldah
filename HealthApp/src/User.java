import java.util.List;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private int age;
    private double weight;
    private double height;
    private String activityLevel;
    private ProfileSettings profileSettings;
    private List<HealthGoal> healthGoals = new ArrayList<>();

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.profileSettings = new ProfileSettings("Private");
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters and setters for user details
    public String getUsername() {
        return username;
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    public void setProfileData(int age, double weight, double height, String activityLevel) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activityLevel = activityLevel;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    public void addHealthGoal(HealthGoal goal) {
        healthGoals.add(goal);
    }

    public List<HealthGoal> getHealthGoals() {
        return healthGoals;
    }

    public ProfileSettings getProfileSettings() {
        return profileSettings;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }
}