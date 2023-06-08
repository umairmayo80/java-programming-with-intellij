import java.time.LocalDate;

public class OOPExample {
    public static void main(String[] args){
        User youngerUser = new User("Umair","2000-01-31");
        User user1 = new User("name", "2001-01-01");

//        youngerUser.name = "Umair"; // Cannot access the private members directly
//        youngerUser.birthDay = LocalDate.parse("2000-01-31"); // Cannot access the private members directly

        System.out.println(youngerUser.toString());

        System.out.printf("%s birthday is %s and he is %d years old.\n",youngerUser.getName(),youngerUser.getBirthDay(),youngerUser.age());


        Book book1 = new Book("Umair", "Programming fundamentals",100);
//        book1.author = "Umair"; //Cannot access the private members directly
//        book1.title = "Programming Fundamentals"; // Cannot access the private members directly

        book1.price = 120; // Default members are accessible with-in the classes of the same package

        System.out.println(book1);

        youngerUser.borrow(book1);
        System.out.println(youngerUser);


        AudioBook audioBook = new AudioBook("ABC","Ali",200,430);
        System.out.println(audioBook);

        CarClass car1 = new CarClass("toyota","ty1",12000);
        System.out.println(car1);

    }
}
