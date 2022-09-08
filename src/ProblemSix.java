public class ProblemSix {
    public static void main(String[] args) {
        int sum = 0;
        int square = 0;
        int difference;

        for (int i = 1; i <= 100; i++) {
            sum += (i * i);
        }
        for (int i = 1; i <= 100; i++) {
            square += i;
        }
        square *= square;
        difference = square - sum;
        System.out.println(difference);
    }
}
