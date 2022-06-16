package arraysDSA;

public class SlidingWindowWithGivenSum {

    public static boolean isSumExists(int[] a, int sum)
    {
        int start=0;
        int currSum=a[0];
        for(int i=1;i<a.length;i++)
        {
            while(currSum>sum && start<i-1)
            {
                currSum=currSum-a[start];
                start++;
            }
            if(currSum==sum)
            {
                return true;
            }
            if(i<a.length)
            {
                currSum=currSum+a[i];
            }
        }

        return (currSum==sum);
    }

    public static void main(String[] args) {
        System.out.println(isSumExists(new int[]{1,4,20,3,10,5},20));
    }
}
