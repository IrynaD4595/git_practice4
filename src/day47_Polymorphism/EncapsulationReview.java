package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;

    public EncapsulationReview(String bookTitle, String publishDate) {
        this.bookTitle = bookTitle;
        this.publishDate = publishDate;
    }

    public String getBookTitle(){
        if(bookTitle == null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public String getPublishDate(){
        return publishDate;
    }
}
