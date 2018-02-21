package Exc10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exc10
{
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("12");
        set.add("123");
        set.add("1234");
        removeOddLenght(set);
        System.out.println(set);
    }

    private static void removeOddLenght(HashSet<String> set)
    {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            String s =  iterator.next();
            if (s.length() % 2 != 0)
            {
                iterator.remove();
            }
        }
    }
}
