public class Book {
    public String title;
    public String ISBN;
    public Author author;

    Book(String title, String ISBN, Author author){
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getISBN(){
        return ISBN;
    }

    public Author getAuthor(){
        return author;
    }

    public void displayBook(){
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Author: " + author.name);
        System.out.println("Biography: " + author.biography);
        System.out.println("------------------------");
        
    }
}