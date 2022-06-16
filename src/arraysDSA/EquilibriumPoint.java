package arraysDSA;

public class EquilibriumPoint {

    public static int equilibriumPoint(int[] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        int l_Sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(l_Sum==(sum-a[i]))
            {
                return i;
            }
            l_Sum=l_Sum+a[i];
            sum=sum-a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(equilibriumPoint(new int[]{2,-2,4}));
    }
}
