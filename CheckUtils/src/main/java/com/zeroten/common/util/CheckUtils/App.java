package com.zeroten.common.util.CheckUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


    public static boolean isAnyEmpty (String...strings) {
        if (strings == null)
            return false;
        for (int i = 0; i<strings.length ; i++) {
            if (strings[i].length() == 0 || strings[1] == null)
                return false;
        }
        return true;
    }

    public static boolean equals(String str1, String str2) {
        if (str1 == null || str2 == null)
            return false;
        int length = str1.length();
        if (str1.length() != str2.length())
            return false;
        char char1[] = str1.toCharArray();
        char char2[] = str2.toCharArray();
        for (int i = 0; i < str1.length() ; i++ ) {
            if (char1[i] == char2[i])
                continue;
            else
                return false;
        }
        return true;

    }

    public static boolean isEmpty(Object[] arr) {
        if (arr == null)
            return false;
        for (int i = 0;i<arr.length ; i++) {
            if (arr[i] == null)
                return false
        }
        return true;
    }

    public static boolean equals(Integer n1, Integer n2) {
        if (n1 == null || n2 == null)
            return false;
        if (n1 == n2)
            return true;
        return false;
    }
}
