import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class RegularExpressionExample {
    public static void main(String[] args) {
        String input = "Hello, 123 ddw  452 World!";
        // String input = "Hello, World!";

        try{


            // Define a pattern
            String patternString = ".*\\d+.*"; // Matches one or more digits
            Pattern pattern = Pattern.compile(patternString);

            // Create a Matcher instance
            Matcher matcher = pattern.matcher(input);

            // Perform matching operations
            if (matcher.find()) {
                String matchedDigits = matcher.group(); // Get the matched digits
                System.out.println("Matched Digits: " + matchedDigits);
            } else {
                System.out.println("No match found.");
            }

            pattern = Pattern.compile("[wW]3[Ss]chools"); // to resolve case sensitivity
            pattern = Pattern.compile(".*[wW]3[Ss]chools.*", Pattern.CASE_INSENSITIVE); // another way, more effective
            matcher = pattern.matcher("Visit W3Schools!");
            boolean matchFound = matcher.find();
            // String matchFound = matcher.group(); // the must be executed after matcher.find(). else it will generate java.lang.illegalStateException
            if (matchFound) {
                System.out.println("Match found");
                System.out.println("found:"+matcher.group());
            } else {
                System.out.println("Match not found");
            }
        }
        catch (PatternSyntaxException e){
            System.out.println("Invalid regex pattern: "+e.getMessage());
        }
        catch (IllegalStateException e) {
            // Handle IllegalStateException
            System.out.println("Illegal state: " + e.getMessage());
        }
        catch (Exception e) {
            // Handle IllegalStateException
            System.out.println("Excption: " + e.getMessage());
        }


        // Additional example using String's matches() method
        input = "nnnnn sdasdf ";
        String pattern = ".*n{2}.*";
        if (input.matches(pattern)) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found.");
        }


    }



}
