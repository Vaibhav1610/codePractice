package arraysDSA;

public class MinimumFlips {

    public static void flips(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[i-1])
            {
                if(a[i]!=a[0])
                {
                    System.out.print("From "+i);
                }
                else
                {
                    System.out.print(" to "+(i-1));
                    System.out.println();
                }
            }
        }
//        if(a[a.length-1]!=a[0])
//        {
//            System.out.println(a.length-1);
//        }
    }

    public static void main(String[] args) {
        flips(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,1,0,1});
    }
}
