package arraysDSA;

public class LongestEvenOddSubArray {

    public static int longestSum(int[] a)
    {
        int res=1;
        int curr=1;
        for(int i=1;i<a.length;i++)
        {
            if((a[i]%2==0 && a[i-1]%2!=0) || (a[i]%2!=0 && a[i-1]%2==0))
            {
                curr++;
                res=Math.max(res,curr);
            }
            else
            {
                curr=1;
            }
        }

        return curr;
    }

    public static void main(String[] args) {
        System.out.println(longestSum(new int[]{5,10,20,6,3,8}));
    }
}
