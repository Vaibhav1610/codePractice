package mathematics;

//time complexity is theta(d) where d is number of digits;

public class CountDigits {
    public static int countDigits(int n)
    {
        int count=0;

            while(n>0)
            {
                n=n/10;
                count++;
            }
            return count;



    }
    public static void main(String[] args) {

        System.out.println(countDigits(1154546465));
    }
}
