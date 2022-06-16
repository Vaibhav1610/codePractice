package arraysDSA;

public class LargestElement {

    public static int findLargest(int[] a)
    {
        if(a.length==0)
        {
            return -1;
        }
        else {
            int largest = a[0];
            for (int i = 0; i < a.length; i++) {
                if (largest < a[i]) {
                    largest = a[i];
                }
            }
            return largest;
        }
    }

    public static void main(String[] args) {
       System.out.println(findLargest(new int[]{-2,-11,-2000}));
    }
}
