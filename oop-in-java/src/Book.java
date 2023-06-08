public class Book {
    private String title;
    private String author;
    float price; // here the access modifier is default means package-private; defaultMethod() is accessible in another class of the same package:


    // Default Constructor
    Book(){
        this.title = "";
        this.author = "";
        this.price = 0;
    }

    // Parameterized Constructor
    Book(String title, String author, float price){
        setBook(title,author,price);
    }

    // setter functions
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setBook(String title, String author, float price){
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    // getter functions
    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + this.title + '\'' +
                ", author='" + this.author + '\'' +
                ", price=$" + this.price +
                '}';
    }
}
