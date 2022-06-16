package arraysDSA;

import java.util.Arrays;

public class LeftRotateByD {

    public static int[] leftRotateByD(int[] a, int d)
    {
        int[] temp  =new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=a[i];
        }
        for(int i=d;i<a.length;i++)
        {
            a[i-d]=a[i];
        }
        for(int i=0;i<d;i++)
        {
            a[a.length-d+i]=temp[i];
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRotateByD(new int[]{1,2,3,4,5},2)));
    }
}
