import java.util.LinkedHashSet;
import java.util.*;
import java.util.regex.Pattern;

public class Sorting {
    public static ArrayList<Integer> userEntersNumbers() {

        ArrayList<Integer> enteredNumbers = new ArrayList<>();
        Pattern stopEntered = Pattern.compile("[sS][Tt][oO][pP]");
        Scanner userInput = new Scanner(System.in);
        boolean isItOver = false;
        while (!isItOver) {
            System.out.println("Enter a number: ");
            if (userInput.hasNextInt()) {
                enteredNumbers.add(userInput.nextInt());
                System.out.println("List has been updated: " + enteredNumbers);
            } else if (userInput.hasNext(stopEntered)) {
                isItOver = true;
                System.out.println("\nOk exiting...\n ");
                System.out.println("Your entered list is: " + enteredNumbers);
            } else {
                System.out.print("Not accepting garbage. ");
                userInput.next();
            }
        }
        return enteredNumbers;
    }

    public static LinkedHashSet<Integer> sortList(ArrayList<Integer> userEntersNumbers) {

        Collections.sort(userEntersNumbers);
        LinkedHashSet<Integer> sortedFinaNumbers = new LinkedHashSet<>(userEntersNumbers);
            return  sortedFinaNumbers;
    }
}

