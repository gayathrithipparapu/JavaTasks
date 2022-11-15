package com.netcrcker;

import java.util.Arrays;
import java.util.Iterator;

public class Task6 {
    public static int[] even(int arr[])
    {

        Iterator <Integer>iter= Arrays.stream(arr).iterator();
        while(iter.hasNext())
        {
            if((iter.next() ) %2 != 0)
            {
                System.out.println(iter.next()+" ");
            }
        }
        return null;


    }

}
