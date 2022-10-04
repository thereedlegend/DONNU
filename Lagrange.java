import java.util.Locale;
import java.util.Scanner;

public class Lagrange {

    private  static double[] INPUT =
            {2, 2.15, 0.83, 2.40, 0.5, 1,76};

    private final static double[] OUTPUT;

    static {
        int n = INPUT.length;
        OUTPUT = new double[n];

        for (int i = 0; i < n; ++i) {
            OUTPUT[i] = fun(INPUT[i]);
        }

    }

    public static void main(String[] args) {
        double x,y,lagr;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        x = scanner.nextDouble();

        y = fun(x);
        lagr = lagrange(INPUT, OUTPUT, x);

        System.out.println("Лагранж: " + lagr);

        System.out.println("Погрешность вычисления: " + Math.abs(y - lagr));
    }

    private static double fun(double x) {
        return Math.cos(x);
    }

    private static double lagrange(double[] arrX, double[] arrY, double x) {
        double r = 0;
        int n = arrX.length;
        for (int i = 0; i < n; i++) {
            double p = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    p *= ((x - arrX[j]) / (arrX[i] - arrX[j]));
                }
            }
            r += p * arrY[i];
        }
        return r;
    }
}

