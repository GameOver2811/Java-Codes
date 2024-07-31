class PersonDetail {

    // Data Members
    private String name;
    private int age;

    //  Constructor
    public PersonDetail(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : "+ this.name+", Age : "+ this.age;
    }

}

public class User {
    public static void main(String[] args) {

//        Creating Object
        PersonDetail person1 = new PersonDetail("Krishna", 20);
        PersonDetail person2 = new PersonDetail("Dwivedi", 20);

//        Printing Details of Person
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
