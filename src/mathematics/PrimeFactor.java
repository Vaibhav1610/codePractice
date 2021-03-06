package mathematics;

public class PrimeFactor {

    public static void printPrimeFactorNaive(int n)
    {
        if(n<=1)
        {
            System.out.println("not valid input");
        }
        else
        {
            for(int i=2;i*i<=n;i++)
            {
                while(n%i==0)
                {
                    System.out.println(i+" ");
                    n=n/i;
                }
            }
            if(n>1)
            {
                System.out.println(n);
            }
        }
    }

    public static void printPrimeFactor(int n)
    {
        if(n<=1)
        {
            System.out.println("invalid input");
        }
        else
        {
            while(n%2==0)
            {
                System.out.println(2+" ");
                n=n/2;
            }
            while(n%3==0)
            {
                System.out.println(3+" ");
                n=n/3;
            }
            for(int i=5;i*i<n;i=i+6)
            {
                while(n%i==0)
                {
                    System.out.println(i+" ");
                    n=n/i;
                }
                while(n%(i+2)==0)
                {
                    System.out.println((i+2)+" ");
                    n=n/(i+2);
                }
            }
            if(n>1)
            {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        //printPrimeFactorNaive(1);
        printPrimeFactor(84);
    }
}
