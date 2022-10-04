import java.util.Scanner;
public class YAP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Число должно быть больше нуля");
        } else {

            int i = 0;
            int sum = 0;
            for (;i<=n; i++){
                System.out.println("индекс: "+i+" сумма: "+(sum += i));}
        }
    }
}