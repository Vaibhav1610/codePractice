package arraysDSA;
//moore's algo
public class MajorityElement {

    public static int majorityElement(int[] a)
    {
        int res=0;int count=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[res]==a[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[res]==a[i])
            {
                count++;
            }

        }

        if(count<=a.length/2)
        {
            return -1;
        }
        else
        {
            return a[res];
        }

    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{8,8,8,8,6,6,6,6}));
    }
}
