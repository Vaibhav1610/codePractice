package mathematics;
import java.lang.Math.*;
public class LCM {
    public static int lcmNive(int a, int b)
    {
        int res = Math.max(a,b);
        while(true)
        {
            if(res%a==0&&res%b==0)
            {
                break;
            }
            res++;
        }
        return res;
    }

    public static int lcm(int a,int b)
    {
        int gcd= GCD.gcd(a,b);
        return (a*b)/gcd;
    }

    public static void main(String[] args) {
        //System.out.println(lcmNive(0,1));
        System.out.println(lcm(0,3));
    }
}
