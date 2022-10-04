import java.util.Arrays;
import java.util.Scanner;

public class removed_integer_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split(" ");
        int n = split.length;
        Integer[] array = new Integer[n];

            for (int i = 0; i < n; ++i) {
                array[i] = Integer.parseInt(split[i]);
            }
            for (int iMax = array.length - 1, i = iMax; i >= 0; --i) {
                if (array[i] % 2 == 0) {
                    array[i] = null;
                    break;
                }
            }

            System.out.println(Arrays.toString(array));

        }
    }
