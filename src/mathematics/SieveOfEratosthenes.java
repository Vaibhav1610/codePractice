package mathematics;

import java.util.Arrays;

//time complexity(nloglogn)
public class SieveOfEratosthenes {
    public static void primeNumbers(int n)
    {
        boolean[] a = new boolean[n+1];
        Arrays.fill(a,true);
        for(int i=2;i<=n;i++)
        {
            if(Prime.checkPrime(i))
            {
                for(int j=i*i;j<=n;j=j+i)
                {
                    a[j]=false;
                }
            }
        }

        for(int k=2;k<=n;k++)
        {
            if(a[k])
            {
                System.out.println(k);
            }
        }
    }

    public static void main(String[] args) {
        primeNumbers(35);
    }


}
