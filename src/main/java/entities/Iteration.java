package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Iteration {

    private String goal;
    private Project project;
    private List<Activity> activities;

    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();

        project.addIteration(this);
    }
    public Duration getDuration() throws SabanaResearchException{
        Duration FF = Duration.ZERO;
        if (activities.size() != 0) {
            for (Activity a : activities) {
                FF = FF.plusDays(a.getDuration().toDays());
            }
        }
        else {
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_ITERATION);

        }
        return FF;
    }
    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

}
