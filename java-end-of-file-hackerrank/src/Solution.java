import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i=0;
        //sc.hasNext() will check whether next input is available or not, it will return true if avaiable , will return false if not 
        while(sc.hasNext()){
            System.out.println(++i+ " "+sc.nextLine());
        }
        sc.close();
    }
}


/*
 * The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.
 */