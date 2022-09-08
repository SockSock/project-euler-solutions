public class ProblemSeven {
    public static void main(String[] args) {
        int count = 1;
        int answer;
        int prime = 1;

        for (int i = 3; true; i++) {
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    prime = 0;
                    break;
                }
            }
            if (prime == 1) {
                count++;
                if (count == 10001) {
                    answer = i;
                    break;
                }
            }
            prime = 1;
        }

        System.out.println(answer);
    }
}
