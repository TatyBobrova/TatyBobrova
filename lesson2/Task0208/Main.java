package Task0208;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int sumP = 0;
        int sumN = 0;
        int count = 0;

        OptionalInt max = Arrays.stream(arr).max();
        System.out.println("Максимальное число "+max.getAsInt());

            for (int i: arr)
           if (i >0)
            sumP=sumP+i;
        System.out.println("Сумма положительных элементов "+sumP);

        for (int i: arr)
            if (i<0 && i % 2==0)
                sumN=sumN+i;
        System.out.println("Сумма отрицательных четных элементов "+sumN);

        for (int i: arr)
            if (i >0)
                count++;
        System.out.println("Количество положительных элементов "+count);

        for (int i: arr)
            if (i<0)
                sumN=sumN+i;
            count++;
        System.out.println("Среднее арифметическое отрицательных элементов "+sumN/count);


    }
}
