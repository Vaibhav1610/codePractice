package arraysDSA;

public class SlidingWindowFixed {

    public static int maxSum(int[] a, int k)
    {
        if(k>a.length)
        {
            return -1;
        }
        else {
            int max = 0;
            int currSum = 0;
            for (int i = 0; i < k; i++) {
                currSum = currSum + a[i];
            }
            max = currSum;
            for (int i = k; i < a.length; i++) {
                currSum = currSum + a[i] - a[i - k];
                max = Math.max(max, currSum);
            }

            return max;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{1,8,30,-5,20,7},3));
    }
}
