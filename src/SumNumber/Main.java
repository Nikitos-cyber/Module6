package SumNumber;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Введите число: ");
        long n = 0;
        do {
            while (!scanner.hasNextLong()) {
                System.out.println("Введите целое число...");
                scanner.nextLine();
            }
            n = scanner.nextLong();
            if(n <= 100){
                System.out.println("Число должно быть больше 100..");
                continue;
            }
            break;
        } while (true);
        long i = (long) (100 + n) * (n - 100 + 1) / 2;
        System.out.println(i);
    }
}
