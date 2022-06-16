package arraysDSA;

public class Consecutive1s {

    public static int allOnes(int[] a)
    {
        int count=0;
        int ones=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                count=0;
            }
            else
            {
                count++;
                if(ones<count)
                {
                    ones=count;
                }
            }
        }
        return ones;
    }

    public static void main(String[] args) {
        System.out.println(allOnes(new int[]{1,1,1,1,1,1,1}));
    }
}
