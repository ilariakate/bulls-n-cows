import java.util.Scanner;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        Pattern patter = Pattern.compile(s2);
        Matcher matcher = patter.matcher(s1);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        System.out.println(counter);

    }
}