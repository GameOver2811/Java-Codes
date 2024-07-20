import java.util.Arrays;

class Parent {
    int parentId;
    String parentName;
}

class Child extends Parent {
    int childId;
    String childName;
    public Child() {}
    public Child(int childId, String childName, int parentId, String parentName) {
        this.childId = childId;
        this.childName = childName;
        this.parentId = parentId;
        this.parentName = parentName;
    }
}


public class InheritenceInJava {
    public static void main(String[] args) {
        Child obj = new Child(1, "Baccha hai ye", 1, "Ye inke pita shree");
        System.out.println(obj);
    }
}
