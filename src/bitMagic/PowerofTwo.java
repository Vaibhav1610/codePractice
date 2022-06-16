package bitMagic;

public class PowerofTwo {

    public static void powerOfTwo(int n)
    {
        int num=n;
        if(n==0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            n=n&(n-1);
            if(n==0)
            {
                System.out.println(num+" is a power of 2");
            }
            else
            {
                System.out.println(num +" not a power of 2");
            }
        }
    }

    public static void main(String[] args) {
        powerOfTwo(100);
    }
}
