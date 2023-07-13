package Entities;
import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    private int id, age;
    private String name, goal;
    private double height, weight;
    private LocalDate birthdate;
    private ArrayList<Routine> activeRoutines;

    public User(int id, String name, String goal, double height, double weight, LocalDate birthdate) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.goal = goal;
        this.height = height;
        this.weight = weight;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal =goal;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }


}

