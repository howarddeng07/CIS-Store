public class Book extends ReadingItem{
    private String isbn;
    private String edition;
    private String title;

    public Book(String name, String location, String description, int price, int wordCount, String datePublished, String author, String isbn, String edition, String title){
        super(name, location, description, price, wordCount, datePublished, author);
        this.isbn = isbn;
        this.edition = edition;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEdition() {
        return edition;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Book Details:\n" +
                "Name: " + getName() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Word Count: " + getWordCount() + "\n" +
                "Date Published: " + getDatePublished() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "ISBN: " + isbn + "\n" +
                "Edition: " + edition + "\n" +
                "Title: " + title;
    }
}
