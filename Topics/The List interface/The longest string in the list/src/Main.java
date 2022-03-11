import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        int max = Integer.MIN_VALUE;
        String longest = null;
        for (String elem : list) {
            if (elem.length() > max) {
                max = elem.length();
                longest = elem;
            }
        }
        Collections.fill(list, longest);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}