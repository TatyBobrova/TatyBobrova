package Task0201;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        System.out.println(lastСharacter(inputInt()));

    }

    public static int lastСharacter(int a) {
        return a%10;
    }

    public static int inputInt() {
        Scanner cs = new Scanner(System.in);
        int inputInt = cs.nextInt();
        return inputInt;

    }


}
