package Task0210;
import java.util.*;

public class Main {

   /* public static void main (String[] args){

        int[] arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] arrzero = new int[arr.length];
        int count = 0;

        for (int value : arr) {
            if (value != 0) {
                arrzero[count] = value;
                count ++;
            }
        }

        for (int i = count; i < arr.length; i++) {
            arrzero[i] = 0;
        }

        System.out.println(Arrays.toString(arrzero));
    }
}
*/

    public static void main (String[] args){
        int[] arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int n= arr.length;
        ZeroEnd(arr,n);
        for (int i=0; i<n; i++)

            System.out.print(arr[i]+" ");
    }


    static void ZeroEnd(int arr[], int n) {

        int count = 0;
        for (int i = 0; i < n; i++)

            if (arr[i] != 0)

                arr[count++] = arr[i];
        while (count < n)

            arr[count++] = 0;
        ;


    }
}
