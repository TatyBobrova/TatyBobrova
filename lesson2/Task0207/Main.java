package Task0207;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum_tax());
    }

    public static double sum_tax() {
       double moscow_tax = 4.15;
       double rostov_tax = 1.98;
      double  krasnodar_tax=2.69;
       double kirov_tax = 5;
       int input = sitycode();
       switch (input){
           case 905:
            return moscow_tax*10;
           case 194:
              return rostov_tax*10;
             case 491:
              return krasnodar_tax*10;
            case 800:
               return kirov_tax*10;
           default:
               return 1;
                      }
    }

    public static int sitycode() {
        Scanner cs = new Scanner(System.in);
        int sitycode = cs.nextInt();
        return sitycode;

    }
}

