package arraysDSA;

public class Stock {

    public static int overallProfit(int[] a)
    {
        int profit=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>a[i-1])
            {
                profit=profit+(a[i]-a[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(overallProfit(new int[]{10,20,30}));
    }
}
