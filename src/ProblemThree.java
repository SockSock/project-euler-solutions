public class ProblemThree {

    public static void main(String[] args) {
        long main = 600851475143L;

        for (long i = 1L; i <= main; i++) {
            if (main % i == 0L && !(i % 2L == 0L)) {
                System.out.println(i);
                main /= i;
            }
        }
    }
}
