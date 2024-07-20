class Student {
    // Data members
    private int id;
    private String name;
    private String course;
    private double fee;

    // Default Constructor
    public Student() {
        // Optional: Initialize with default values
        this.id = 0;
        this.name = "";
        this.course = "";
        this.fee = 0.0;
    }

    // Parameterized Constructor
    public Student(int id, String name, String course, double fee) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        System.out.println("Creating Student object...");
        Student obj = new Student(1, "Krishna", "Btech", 10000);
        System.out.println("Name of this Student is " + obj.getName());
    }
}
