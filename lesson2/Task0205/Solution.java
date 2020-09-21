package Task0205;

import java.util.*;

public class Solution {
public static void main(String[] args) throws Exception {
    System.out.println(min(inputInt(), inputInt(), inputInt()));

        }

public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
        }

        public static int inputInt() {
        Scanner cs = new Scanner(System.in);
        int inputInt = cs.nextInt();
        return inputInt;
        }


    }

