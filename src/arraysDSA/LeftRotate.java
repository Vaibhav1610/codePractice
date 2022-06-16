package arraysDSA;

import java.util.Arrays;

public class LeftRotate {

    public static int[] leftRotate(int[] a)
    {
        int temp=a[0];
        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;

        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRotate(new int[]{1,2,3,4,5})));
    }
}
