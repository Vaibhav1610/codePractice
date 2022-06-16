package bitMagic;

import mathematics.Power;

public class PowerSet {

    public static void powerSet(String s)
    {
        int len=s.length();
        long pow= Power.power(2,len);
        for(int counter=0;counter<pow;counter++)
        {
            for(int j=0;j<len;j++)
            {
                if((counter&(1<<j))!=0)
                {
                    System.out.print(s.charAt(j));
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        powerSet("abcd");
    }
}
