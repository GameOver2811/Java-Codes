import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class BookData {

//    Data Members
    private String name;
    private String author;
    private String ISBN;

//    Getters

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getISBN() {
        return this.ISBN;
    }

//    Constructor
    public BookData(String name, String author, String ISBN) {
        this.name = name;
        this.author = author;
        this.ISBN =ISBN;
    }

}

class Books {

//    Book Collection
    private List<BookData> store;
    private HashSet<String> isbn;

//    Constructor
    public Books() {
        store = new ArrayList<>();
        isbn = new HashSet<>();
    }

//    Getter for Store
    public List<BookData> getStore() {
        return store;
    }

//    Methods to Add and Remove books from Collections
    public String add(String name, String author, String ISBN) {
        if(isbn.contains(ISBN)) {
            return "Book Already Exists";
        }
        store.add(new BookData(name, author, ISBN));
        isbn.add(ISBN);
        return "Book Added Successfully!";
    }
    public String remove(String ISBN) {
        if(!isbn.contains(ISBN)) {
            return "Invalid ISBN";
        }
        BookData bookToBeRemoved = null;
        for (BookData book : store) {
            if (book.getISBN().equals(ISBN)) {
                bookToBeRemoved = book;
                break;
            }
        }
        if (bookToBeRemoved != null) {
            store.remove(bookToBeRemoved);
            isbn.remove(ISBN);
            return "Book Removed!";
        }
        return "Book Not Found!";
    }
}
public class BookDetails {
    public static void main(String[] args) {

//        Instance for Books Class
        Books store = new Books();

//        Adding few books
        store.add("Death-Note", "Krishna", "1");
        store.add("Death-Note", "Krishna", "2");
        store.add("Death-Note", "Krishna", "3");
        store.add("Death-Note", "Krishna", "4");
        store.add("Death-Note", "Krishna", "5");

//        Print all books of Store
        List<BookData> bookStore = store.getStore();
        System.out.println("Before Deletion : ");
        for(BookData obj : bookStore) {
            System.out.println("Name : " + obj.getName()+ ", Author : "+ obj.getAuthor()+", ISBN " + obj.getISBN());
        }

//        Delete Some books
        store.remove("1");
        store.remove("3");
        store.remove("5");

        System.out.println("\n \n");
        System.out.println("After Deletion : ");
//        Again Printing all books of store
        for(BookData obj : bookStore) {
            System.out.println("Name : " + obj.getName()+ ", Author : "+ obj.getAuthor()+", ISBN " + obj.getISBN());
        }
    }
}
