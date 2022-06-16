package arraysDSA;

public class Leaders {

    public static int leader(int[] a)
    {
        int leaderElement=a[a.length-1];
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]>leaderElement)
            {
                leaderElement=a[i];
            }
        }

        return leaderElement;
    }

    public static void main(String[] args) {
        System.out.println(leader(new int[]{7,10,4,3,6,5,2}));
    }
}
