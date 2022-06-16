package arraysDSA;

public class MaxSumSubArray {

    public static int maxSum(int[] a)
    {
        int res=a[0];
        int lastMax=a[0];
        for(int i=1;i<a.length;i++)
        {
            lastMax=Math.max(lastMax+a[i],a[i]);
            res=Math.max(res,lastMax);
        }

        return lastMax;
    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{-3,8,-2,4,-5,6}));
    }
}
