public class ImmutableProof {
    public static void main(String[] args) {
        String str = new String("Krishna");
        System.out.println("String address Value before modification : " + str.hashCode());
        str = str + " Dwivedi";
        System.out.println("String address Value after modification : " + str.hashCode());
        System.out.println(
                "Both memory address are different thus we can say that Strings are immutable........"
        );
    }
}
