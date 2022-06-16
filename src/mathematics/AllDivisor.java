package mathematics;

public class AllDivisor {
    public static void divisorsNaive(int n)
    {
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
                if(n/i!=i)
                {
                    System.out.println((n/i)+" ");
                }
            }

        }
    }
    public static void divisors(int n)
    {
        int i;
        for(i=1;i*i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");

            }

        }
        for(;i>=1;i--)
        {
            if(n%i==0)
            {
                System.out.println((n/i)+" ");
            }
        }
    }

    public static void main(String[] args) {
        divisorsNaive(25);
        //divisors(25);
    }
}
