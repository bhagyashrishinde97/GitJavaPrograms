package Array;

import java.util.Arrays;

public class Anagramprogram {
    public static boolean Areanagram(String str1,String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        if(Areanagram(str1,str2))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        String str3="action";
        String str4="reaction";
        if(Areanagram(str3,str4))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

}
