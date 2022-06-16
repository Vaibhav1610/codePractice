package arraysDSA;

import java.util.Arrays;
//time complexity O(n)
public class MoveZeroes {

    public static void moveZeroes(int[] a)
    {

        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                int temp=a[i];
                a[i]=a[count];
                a[count]=temp;
                count++;

            }

        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{1,2,0,0,5,2,0});
    }
}
