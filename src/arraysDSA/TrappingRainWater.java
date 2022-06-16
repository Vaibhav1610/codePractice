package arraysDSA;

public class TrappingRainWater {

    public static int trappedWater(int[] a)
    {
        int water=0;
        int[] lmax=new int[a.length];
        int[] rmax=new int[a.length];
        lmax[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            lmax[i]= Math.max(a[i],lmax[i-1]);
        }
        rmax[rmax.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
            rmax[i]=Math.max(a[i],rmax[i+1]);
        }
        for(int i=1;i<a.length-1;i++)
        {
            water=water+(Math.min(lmax[i],rmax[i])-a[i]);
        }

        return water;
    }

    public static void main(String[] args) {
        System.out.println(trappedWater(new int[]{5,0,6,2,3}));
    }
}
