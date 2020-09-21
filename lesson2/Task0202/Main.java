package Task0202;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = (num % 10) + (num / 10) % 10 + (num / 100);
                System.out.println(sum);
    }
}
