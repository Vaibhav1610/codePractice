package bitMagic;

public class OddOccuringValue {

    public static void oddOccuring(int[] a)
    {
        int res=0;
        for(int i=0;i<a.length;i++)
        {
            res=res^a[i];
        }
        if(res==0)
        {
            System.out.println("No Odd Occurring Term found");
        }
        else
        {
            System.out.println("Value of Odd Occuring term is: "+res);
        }
    }

    public static void main(String[] args) {
        oddOccuring(new int[]{4,3,4,4,4,5,5,3,4});
    }
}
