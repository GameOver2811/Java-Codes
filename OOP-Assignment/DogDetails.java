class Dog{

//    Data Members
    private String name;
    private String breed;

//    Getters and Setters

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Name : "+this.name+", Breed : "+ this.breed;
    }
}
public class DogDetails {
    public static void main(String[] args) {
//        Object for Dog Class
        Dog dog1 = new Dog("Sweety", "Rottweiler");
        Dog dog2 = new Dog("Simmi", "Koi bedeshi breed hai");

//        Update Details using Setter
        dog1.setName("Rider");
        dog2.setBreed("German");

//        Printing details
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
    }
}
