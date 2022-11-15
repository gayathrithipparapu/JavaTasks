package com.netcrcker;
import java.util.Arrays;
import static com.netcrcker.Task4.removeElements;
import static com.netcrcker.Task5.charCount;
import static com.netcrcker.Task6.even;
import static com.netcrcker.Task7.firstUniqueChar;
public class Main {
    public static void main(String[] args) {

        double [] arr=new double[15];
        /*TASK 1*/
        double sum = 0;
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Math.random()*15;
            sum += arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
            System.out.println(arr[i]);
        }
        double mean = (double) sum / arr.length;
        System.out.println();
        System.out.println(max);
        System.out.println(min);
        System.out.println(mean);

        /*TASK 2*/
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < arr[i])
                {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }

        /*TASK 3*/

        for(int i=2;i<=200;i++)
        {
            int flag = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1) {
                System.out.println(i);
            }

        }
        /*Task 4*/
        int n=6;
        int[] arr1 = new int[]{ 1,2,3,4,5,6,6,8,9,10 };
        arr1 = removeElements(arr1, n);
        System.out.println(Arrays.toString(arr1));

        /*Task 5*/
        String str = "Abhii";
        charCount(str);

        /*Task 6*/
        int[] arr2 = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        System.out.println(even(arr2));

        /* Task 7*/
        String s="Abhii";
        System.out.println(firstUniqueChar(s));
    }
}
