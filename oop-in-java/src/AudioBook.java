public class AudioBook extends Book {
    private int runtime;

    AudioBook(String title, String author, float price, int runtime){
        super(title,author,price);
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "title='" + super.getTitle() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", price=$" + this.price +
                ", runtime=" + this.runtime + " minutes" +
                '}';
    }
}
