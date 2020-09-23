package Task0206;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if (a < 0 && a % 2 == 0)
            System.out.print("отрицательное четное число");
        if (a < 0 && a % 2 != 0 )
            System.out.print("отрицательное нечетное число");
        if (a == 0)
            System.out.print("нулевое число");
        if (a > 0  && a % 2 == 0 )
            System.out.print("положительное четное число");
        if (a > 0 && a % 2 != 0)
            System.out.print("положительное нечетное число");

    }
}
