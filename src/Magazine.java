public class Magazine extends ReadingItem{
    String coverStoryTitle;
    String printDate;
    public Magazine(String name, String location, String description, int price, int wordCount, String datePublished, String author, String coverStoryTitle, String printDate){
        super(name, location, description, price, wordCount, datePublished, author);
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }

    public String getCoverStoryTitle() {
        return coverStoryTitle;
    }
    public String getPrintDate(){
        return printDate;
    }
    public String toString() {
        return "Magazine Details:\n" +
                "Name: " + getName() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Word Count: " + getWordCount() + "\n" +
                "Date Published: " + getDatePublished() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "Cover Story Title: " + getCoverStoryTitle() + "\n" +
                "Print Date: " + getPrintDate();
    }
}
