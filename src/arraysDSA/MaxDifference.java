package arraysDSA;

public class MaxDifference {

    public static int maxDiff(int[] a)
    {
        int diff=a[0]-a[1];
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(diff<(a[i]-min))
            {
                diff=a[i]-min;
            }
            else if(min>a[i])
            {
                min=a[i];
            }
        }

        return diff;
    }

    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{2,3,10,6,4,8,1}));
    }
}
