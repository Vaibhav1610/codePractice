package bitMagic;

public class KthBitSet {

    public static void checkSetBitOne(int n, int k)
    {
        int num=n &(1<<(k-1));
        if(num!=0)
        {
            System.out.println("Bit is Set");
        }
        else
        {
            System.out.println("Bit is Not Set");
        }
    }
    public static void checkSetBitTwo(int n, int k)
    {
        int num=(n>>(k-1))&1;
        if(num!=0)
        {
            System.out.println("Bit is Set");
        }
        else
        {
            System.out.println("Bit is Not Set");
        }
    }




    public static void main(String[] args) {
        //checkSetBitOne(10,2);
        checkSetBitTwo(10,3);
    }
}
