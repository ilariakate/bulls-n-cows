import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        Integer n = Integer.valueOf(scanner.nextLine());

        List<Integer> numList = Arrays.stream(firstLine.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        numList.sort(null);
        List<Integer> resultList = new ArrayList<>();
        Integer counter = 0;
        // 1 1 3 3 5 5 6
        // n = 4
        while (resultList.isEmpty()) {
            for (Integer number : numList) {
                if (n == number - counter || n == number + counter) {
                    resultList.add(number);
                }
            }
            counter++;
        }
        System.out.println(resultList.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}