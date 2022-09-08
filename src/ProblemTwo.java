public class ProblemTwo {

    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 1;
        int value;
        int total = 0;

        while (secondNumber < 4000000) {
            value = firstNumber + secondNumber;

            if (value % 2 == 0) {
                total += value;
            }

            firstNumber = secondNumber;
            secondNumber = value;
        }

        System.out.println(total);
    }
}
