package com.netcrcker;

import java.util.Arrays;

public class Task4 {
    public static int[] removeElements(int[] arr, int key)
    {
        // Move all other elements to beginning
        int index = 0;
        for (int i=0; i<arr.length; i++)
            if (arr[i] != key)
                arr[index++] = arr[i];

        // Create a copy of arr[]
        return Arrays.copyOf(arr, index);
    }

}
