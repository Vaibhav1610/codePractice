package bitMagic;

public class TwoOddOccuringNumber {

    public static void twoOddOcurring(int[] a)
    {
        int XOR=0;
        int res1=0;
        int res2=0;
        for(int i=0;i<a.length;i++)
        {
            XOR=XOR^a[i];
        }
        int val=XOR & ~(XOR-1);
        for(int i=0;i<a.length;i++)
        {
            if((a[i]&val)!=0)
            {
                res1=res1^a[i];
            }
            else
            {
                res2=res2^a[i];
            }
        }

        System.out.println("Two Odd Occuring numbers are : "+res1+" and "+res2);
    }

    public static void main(String[] args) {
        twoOddOcurring(new int[]{2,2,2,2,4,4,4,4,2,5,6});
    }
}
