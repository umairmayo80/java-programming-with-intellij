import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class User {

    // properties
    private String name;
    private LocalDate birthDay;

    private ArrayList<Book> books = new ArrayList<Book>();


    //methods
    // Default Constructor
    User(){
        this.name = "";
        this.birthDay = LocalDate.parse("1900-01-01");
        this.books = null;
    }

    // Parameterized Constructor
    User(String name, String bd){
        this.name = name;
        this.birthDay = LocalDate.parse(bd);
    }

    // Setter
    public void setName(String name){
        this.name = name;
    }

    public void setBirthDay(String birthDay){
        this.birthDay = LocalDate.parse(birthDay);
    }

    public void setUser(String name, String bd){
        this.name = name;
        this.birthDay = LocalDate.parse(bd);
    }


    // getter functions
    public String getName(){
        return this.name;
    }

    public String getBirthDay(){
        return this.birthDay.toString();
    }

    public String getBorrowedBooks(){
        return this.books.toString();
    }


    // other methods for functionalities
    public void borrow(Book book){
        this.books.add(book);
    }
    public int age() {
        return Period.between(this.birthDay, LocalDate.now()).getYears();
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + this.name + '\'' +
                ", birthDay=" + this.birthDay +
                ", books borrowed:" + this.books +
                '}';
    }
}


