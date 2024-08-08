import java.util.*;

class Emp {
    private int id;
    private String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Id : " +this.id+", Name : "+ this.name;
    }
}

class IdComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp i, Emp j) {
        return i.getId() - (j.getId());
    }
}
class NameComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp i, Emp j) {
        return i.getName().compareTo(j.getName());
    }
}


public class ComparatorTest {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(101, "Krishna"));
        list.add(new Emp(201, "Dwivedi"));
        list.add(new Emp(10, "Akshat"));
        list.add(new Emp(1, "Trivedi"));
        System.out.println("Choose attribute for sorting for sorting");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :
                Collections.sort(list, new IdComparator());
                break;
            case 2 :
                Collections.sort(list, (a, b) ->
                {
                    return a.getName().compareTo(b.getName());
                });
        }

        for(Emp i : list) {
            System.out.println(i);
        }
    }
}
