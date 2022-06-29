//WAP Program to check if two String are anagrams or not:

import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String s1 = scan.next();
String s2 = scan.next();
System.out.println(isAnagram(s1, s2));
}
public static boolean isAnagram(String a,String b)
    {
        if(a.length() != b.length()) {
            return false;
        }
        char[] arr1 = new char[a.length()];
        char[] arr2 = new char[a.length()];
       
        arr1 = a.toLowerCase().toCharArray();
        arr2 = b.toLowerCase().toCharArray();
       
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       
        for(int i=0; i<a.length(); i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
