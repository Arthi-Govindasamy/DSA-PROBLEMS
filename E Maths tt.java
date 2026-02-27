Write a program that gets n as input and print the number of digits in the number

Testcase 1 :

Input : 

325345

Expected output:

6

class Mathstt{
    public static void main(String[]args){
        int n=325345;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}


Given a number N, find the sum of first and last digit of N.
 

Example 1:

Input: N = 12345
Output: 6
Explanation: 1st and last digits are 1 and 5.


class Solution {
  public:
    int corner_digitSum(int n) {
        // Code here
        int fd;
        int ld=n%10;
        
        if (n < 10) 
         return n;
        while(n>0){
            fd=n%10;
            n=n/10;
        }
        
        return fd+ld;
    }
};
