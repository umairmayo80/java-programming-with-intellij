import java.util.Scanner; //Scanner class taking input

public class UserInput {
    public static void main(String[] args){
        String string = "Your name:";
        Scanner scanner = new Scanner(System.in); // to read input from the console

        System.out.print("What is your name?");
        String name = scanner.nextLine(); //read line from the input buffer


        System.out.println(string+name);

        System.out.printf("Hi %s, wish you good luck learning Java!",name);
        System.out.print("What is your age?");
        int age = scanner.nextInt();

        // put additional scanner.nextLine to clean the input buffer that i,e the '\n' character left by the .nextInt()
        scanner.nextLine();


        System.out.print("Your favourite programming language?");
        String favorite_lng = scanner.nextLine();
        System.out.printf("%d is a great age to learn %s.",age, favorite_lng);


        // Another way to take integer input
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Again age using Integer.parseInt:"+age);



        //close the Scanner scanner object to avoid memory leaks
        scanner.close();



    }
}
