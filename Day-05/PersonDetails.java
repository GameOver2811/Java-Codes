class Person {
    private int id;
    private String name;
    private String email;

    public Person() {
        System.out.println("Ye hai Parent........");
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Studetns extends Person {
    private String course;
    private double fee;

    public Studetns(String name, String course) {
        this.setName(name);
        this.course = course;
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

    @Override
    public String toString() {
        String str = "Name : "+ this.getName()+", Course : " + this.getCourse();
        return str;
    }
}

class Employee extends Person {
    private String department;
    private double salary;

    public Employee(String name, double salary) {
        this.setName(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        String str = "Name : "+ this.getName()+", Salary : " + this.getSalary();
        return str;
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Person std = new Studetns("Krishna", "Btech");
        Person emp = new Employee("Sagar", 1200000);

        System.out.println("Student : "+ std.toString());
        System.out.println("Employee : "+ emp.toString());
    }
}