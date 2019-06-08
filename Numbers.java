import java.util.*;
import java.util.regex.Pattern;

public class Numbers {
    public static void main(String[] args) {
        for (int i = 0; i < 50; ++i) System.out.println();
        Intro.taskInfo();
        ArrayList<Integer> enteredNumbers = new ArrayList<>(Sorting.userEntersNumbers());
        LinkedHashSet<Integer> sortedFinaNumbers = new LinkedHashSet<>(Sorting.sortList(enteredNumbers));

        System.out.println("Sorted list is: " + sortedFinaNumbers );
        System.out.println("\n\nConsultant Junior Java Developer\n");
    }
}
