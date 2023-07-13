package Entities;
import java.util.ArrayList;

public class Routine {
    private int id, difficultyLevel, duration;
    private String name, description;
    private ArrayList<User> activeUsers;

    public Routine() {
    }

    public Routine(int id, int difficultyLevel, String name, String description, int duration) {
        this.id = id;
        this.difficultyLevel = difficultyLevel;
        this.name = name;
        this.description = description;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}

