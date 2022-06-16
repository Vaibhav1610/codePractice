package arraysDSA;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void removeDuplicate(int[] a)
    {
        int res=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[res-1])
            {
                a[res]=a[i];
                res++;
            }
        }

        for(int j=0;j<res;j++)
        {
            System.out.print(a[j]+" ");
        }
    }

    public static void main(String[] args) {
        removeDuplicate(new int[]{1,2,3,38,39,3,7,4,4,5,5,6});
    }
}
