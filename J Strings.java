1.........Reverse a String
class Solution {
    public static String reverseString(String s) {
        // code here
        char[]arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}

2...........Palindrome String
class Solution {
    boolean isPalindrome(String s) {
        // code here
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
                
            }
            i++;
            j--;
        }
        return true;
    }
}

3...........rotateString
class Solution {
    public boolean rotateString(String s, String goal) {
        int len=s.length();
        for(int i=1;i<=len;i++){
            String rotated=s.substring(i)+s.substring(0,i);
            if(rotated.equals(goal)){
                return true;
            }
        }
        return false;
    }
}

4...............longestCommonPrefix
import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        int n=arr.length-1;
        String first=arr[0];
        String last=arr[n];
         
        int index=-1;
        for(int i=0;i<Math.min(last.length(),first.length());i++){
            if(last.charAt(i)!=first.charAt(i)){
                break;
            }
            index=i;
        }
        if(index==-1){
            return"";
        }else{
            return first.substring(0,index+1);
        }
    }
}

5...............Anagram
if (s1.length() != s2.length()) {
            return false;
        }

        // Frequency array to store character counts
        int[] freq = new int[258];

        // Count frequencies for s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        // Decrease frequencies for s2
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int i = 0; i < 258; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
