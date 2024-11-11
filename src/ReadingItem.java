public class ReadingItem extends CISItem{
    private int wordCount;
    private String datePublished;
    private String author;
    public ReadingItem(String name, String location, String description, int price, int wordCount, String datePublished, String author){
        super(name, location, description, price);
        this.wordCount = wordCount;
        this.datePublished = datePublished;
        this.author = author;

    }

    public String getAuthor() {
        return author;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public int getWordCount() {
        return wordCount;
    }
}
