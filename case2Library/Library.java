import java.util.*;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to library: " + book.getTitle());
    }

    Borrower borrower;

    public void borrowBook(Borrower borrower, Book book){
        if(books.contains(book)){
            books.remove(book);
            borrower.borrowBook(book);
            System.out.println(borrower.name + " borrowed: " + book.getTitle());
        }
        else{
            System.out.println("Book not available in the library.");
        }
    }

    public void returnBook(Borrower borrower, Book book){
        borrower.returnBook(book);
        books.add(book);
        System.out.println(borrower.name + " returned: " + book.getTitle());
    }

    public void displayLibraryBooks(){
        System.out.println("Books in Library:");
        //tipe data, variabel sementara, arraylist yang mau diiterasi
        for (Book book : books){
            book.displayBook();
        }
    }
}
