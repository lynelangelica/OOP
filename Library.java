import java.util.*;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book buku){
        books.add(buku);
        System.out.println("Book added to library: " + buku.title);
    }

    Borrower borrower;

    public void borrowBook(Borrower borrower, Book book){
        if(books.contains(book)){
            books.remove(book);
            borrower.borrowBook(book);
            System.out.println(borrower.name + " borrowed: " + book.title);
        }
        else{
            System.out.println("Book not available in the library.");
        }
    }

    public void returnBook(Borrower borrower, Book book){
        borrower.returnBook(book);
        books.add(book);
        System.out.println(borrower.name + " returned: " + book.title);
    }

    public void displayLibraryBooks(){
        System.out.println("Books in Library:");
        //tipe data, variabel sementara, arraylist yang mau diiterasi
        for (Book book : books){
            book.displayBook();
        }
    }
}
