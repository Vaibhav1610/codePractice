package mathematics;

public class Power {

    public static long power(int n, int p)
    {
        long res=1;
        if(p==0)
        {
            return 1;
        }
        else
        {
            while(p>0)
            {
                if(p%2!=0)
                {
                    res=res*n;
                }
                n=n*n;
                p=p/2;
            }
            return res;

        }
    }

    public static void main(String[] args) {
        System.out.println(power(3,5));
    }
}
