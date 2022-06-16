package arraysDSA;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] a)
    {
        if(a.length==0)
        {
            System.out.println("Empty Array passed");
        }
        else
        {
            int start=0;
            int end=a.length-1;
            while(start<end)
            {
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        reverseArray(new int[]{1,2,4,5});
    }
}
