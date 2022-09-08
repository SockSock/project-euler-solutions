import java.util.ArrayList;

public class ProblemFour {
    public static void main(String[] args) {
        long result;
        long first;
        long second;
        long reverseResult;
        String temp;
        ArrayList<Long> numbers = new ArrayList<>();

        for (second = 999; second >= 100; second--) {
            for (first = 999; first >= 100; first--) {
                result = first * second;
                temp = String.valueOf(result);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(temp);
                stringBuilder.reverse();
                reverseResult = Long.parseLong(String.valueOf(stringBuilder));
                if (reverseResult == result) {
                    numbers.add(reverseResult);
                }
            }
        }

        System.out.println(numbers);
    }
}
