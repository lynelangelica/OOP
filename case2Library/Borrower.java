import java.util.*;

public class Borrower {
    public ArrayList<Book> borrowedBooks = new ArrayList<>();

    public String name;

    Borrower(String name){
        this.name = name;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }

    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }

    public void displayBorrowedBooks(){
        System.out.println(name + "'s Borrowed Books:");
        for(Book book : borrowedBooks){
            book.displayBook();
        }
    }
}
