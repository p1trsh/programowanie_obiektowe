public class book {
    String title;
    String author;
    int publicationYear;

    public book(){
        this("none", "none", 0);
    }

    public book(String title, String author){
        this(title, author, 0);
    }

    public book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
