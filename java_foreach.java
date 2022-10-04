import java.util.Arrays;
import java.util.Scanner;
public class java_foreach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
            String[] split = scanner.nextLine().split(" ");
            int n = split.length;
            int[] input = new int[n];
            try {
                for (int i = 0; i < n; ++i) {
                    int q = Integer.parseInt(split[i]);
                    input[i] = (q & 1) != 0 ? 1 : q;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            System.out.println("Результат: " + Arrays.toString(input));
        }
    }
}