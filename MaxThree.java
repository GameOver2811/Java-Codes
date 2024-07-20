class MaxThree {
    public static void main(String[] args) {
        int a = 110, b = 220, c = 30; 
        if (a > b && a > c) {
            System.out.println("Max is " + a);
        } else if (b > c) {
            System.out.println("Max is " + b);
        } else {
            System.out.println("Max is " + c);
        }
    }
}