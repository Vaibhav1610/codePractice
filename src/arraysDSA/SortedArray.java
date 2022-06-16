package arraysDSA;

public class SortedArray {

    public static boolean isSorted(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<a[i-1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1,2,2,2,5}));
    }
}
