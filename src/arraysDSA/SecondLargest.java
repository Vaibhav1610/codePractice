package arraysDSA;

public class SecondLargest {

    public static int findSecondLargest(int[] a)
    {
        if(a.length==0)
        {
            return -1;
        }
        else
        {
            int largest=a[0];
            int secondLargest=a[0];
            for(int i=0;i<a.length;i++)
            {
                if(largest<a[i])
                {
                    largest=a[i];
                }
                if(secondLargest<a[i]&&largest>a[i])
                {
                    secondLargest=a[i];
                }
            }

            return secondLargest;
        }
    }

    public static void main(String[] args) {
        System.out.println(findSecondLargest(new int[]{11,121,1212,141,524,1212,524,600}));
    }
}
