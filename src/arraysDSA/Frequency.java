package arraysDSA;

public class Frequency {

    public static void frequencies(int[] a)
    {

        int frequency=1;
        int i=1;

        while(i<a.length)
        {
           while(i<a.length&&a[i]==a[i-1])
           {
               frequency++;
               i++;
           }
           System.out.println(a[i-1]+" : "+frequency);
           i++;
           frequency=1;
        }
        if(a.length==1||a[a.length-1]!=a[a.length-2])
        {
            System.out.println(a[a.length-1]+" : "+1);
        }

    }

    public static void main(String[] args) {

        frequencies(new int[]{10,10,30,30,40,40,50});
    }
}
