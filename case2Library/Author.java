public class Author {
    public String name;
    public String biography;

    Author(String author, String biography){
        this.name = author;
        this.biography = biography; 
    }

    public String getAuthorName(){
        return name;
    }

    public String getAuthorBio(){
        return biography;
    }
}
