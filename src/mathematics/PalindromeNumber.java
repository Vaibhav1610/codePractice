package mathematics;
//time complexity is theta(d) where d is number of digits;
public class PalindromeNumber {

    public static String checkPalindrome(int n)
    {
        int rev=0;
        int num=n;
        while(n>0)
        {
            int temp=n%10;
            n=n/10;
            rev=rev*10+temp;
        }
        if(rev==num)
        {
            return "Palindrome";
        }
        else
        {
            return "Not Palindrome";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
    }
}
