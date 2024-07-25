class A {
    public int sum(int a, int b) {
        return a + b;
    }
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class B extends A {
    public int sum (int a, int b) {
        return a + b + 20;
    }
}

public class OverloadingAndRiding {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Ye overloading hai.........");
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(2, 4, 6));

        A obj1 = new B();
        System.out.println("Ye Overriding hai .......");
        System.out.println(obj1.sum(2, 3));

    }
}
