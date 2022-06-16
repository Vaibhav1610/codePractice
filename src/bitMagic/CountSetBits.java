package bitMagic;

public class CountSetBits {

    public static void countSetBit(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1)==1)
            {
                count++;

            }
            n=n>>1;
        }
        System.out.println("Set bit Count: "+count);
    }
    public static  void curninghamAlgo(int n)
    {
        int count=0;
        while(n>0)
        {
            n=n&(n-1);
            count++;
        }
        System.out.println("Set bit count: "+count);
    }

    public static void main(String[] args) {
        //countSetBit(15);
        curninghamAlgo(16);
    }
}
