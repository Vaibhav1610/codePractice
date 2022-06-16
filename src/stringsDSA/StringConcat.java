package stringsDSA;

import java.util.HashSet;
import java.util.Set;

public class StringConcat {

    public static int maxLength(String[] s)
    {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length;i++)
        {
            sb=sb.append(s[i]);
        }
        String s2 = sb.toString();

        Set<Character> charSet = new HashSet<Character>();
        for(int j=0;j<s2.length();j++)
        {
            charSet.add(s2.charAt(j));
        }

        for(char c:charSet)
        {
            System.out.println(c);
        }

        return charSet.size();
    }

    public static void main(String[] args) {
        System.out.println(maxLength(new String[]{"un","iq","ue"}));
    }
}
