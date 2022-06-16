package mathematics;

public class TrailingZeroes {
    public static int trailingZeroes(int n)
    {
        int count=0;
        for(int i=5;i<n;i=i*5)
        {
            count = count + n/i;
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println(trailingZeroes(100));

    }
}
