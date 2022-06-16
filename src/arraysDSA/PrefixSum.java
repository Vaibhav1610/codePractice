package arraysDSA;

public class PrefixSum {

    public static int prefixSum(int[] a,int l,int r)
    {
        int[] prefix = new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            prefix[i]=prefix[i-1]+a[i];
        }
        if(l!=0)
        {
            return prefix[r]-prefix[l-1];
        }
        else
        {
            return prefix[r];
        }

    }

    public static void main(String[] args) {
        System.out.println(prefixSum(new int[]{2,8,3,9,6,5,4},1,3));
    }
}
