package Task0209;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

        int n = arr.length;
        int temp;
        for (int i = 0; i < n/2; i++) {
            temp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = temp;
        }
            for (int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
        }
    }
}
