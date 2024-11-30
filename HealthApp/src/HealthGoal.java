public class HealthGoal {
    private String goalType;
    private double current;
    private double target;

    public HealthGoal(String goalType, double current, double target) {
        this.goalType = goalType;
        this.current = current;
        this.target = target;
    }

    // Getters for goal data
    public String getGoalType() {
        return goalType;
    }

    public double getCurrent() {
        return current;
    }

    public double getTarget() {
        return target;
    }
}
