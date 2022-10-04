import java.util.Arrays;
import java.util.Scanner;

public class even_sr_atif_high_delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");
        int n = split.length;
        Integer[] array = new Integer[n];

        int sum = 0;
        for (int i = 0; i < n; ++i) {
            int v = Integer.parseInt(split[i]);
            array[i] = v;
            sum += v;
        }
        sum /= n;

        for (int iMax = array.length - 1, i = iMax; i >= 0; --i){
            if (array[i] % 2 == 0 && array[i] > sum) {
                array[i] = null;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
