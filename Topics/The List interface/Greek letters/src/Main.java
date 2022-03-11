import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<GreekLetter> letterList = new ArrayList<>();

        final int three = 3;
        final int twFour = 24;
        final int one = 1;

        letterList.add(new GreekLetter("Gamma",  three));
        letterList.add(new GreekLetter("Omega", twFour));
        letterList.add(new GreekLetter("Alpha",  one));

        for (GreekLetter list: letterList) {
            System.out.println(list.toString());
        }

    }

    static class GreekLetter {

        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }
}