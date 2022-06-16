package mathematics;
import java.lang.Math.*;
//time complexity log(min(a,b))
public class GCD {
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }

    public static int gcd2(int a,int b)
    {
        int res=Math.min(a,b);
        while(res>0)
        {
            if(res%a==0 && res%b==0)
            {
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(gcd(0,1));
        System.out.println(gcd2(0,1));
    }
}
