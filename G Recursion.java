....................................................RECURSION......................................
1.............Print 1 To N Without Loop
class Solution {
    public void printNos(int n) {
        // Code here
        if(n==0){
            return;
        }
        else
            printNos(n-1);
            System.out.print(n+" ");
    }
}

2....................Nth Fibonacci Number


class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else
            return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
}

3.............SumOfN NUMBERS

class SumOfN {
// Sum of N natural numbers
static int sumOfN(int n){
    if(n==0){
        return 0;
    }
    return n+ sumOfN(n-1);
}
    public static void main(String[] args) {
        System.out.println(sumOfN(5));
    }
}

4.............Countzeros
 static int countzero(int n){
        if(n%10==n){
            if(n%10==0){
                return 1;
            } 
            return 0;
         }
        if(n%10==0){
            return 1+countzero(n/10);
        } else {
            return countzero(n/10);
        } 
    }
    public static void main(String[] args) {
        System.out.println(countzero(300403));
    }
}

5.......CountDigits
class CountDigits {

static int countDigits(int n){
    if(n==0){
        return 0;
    }
    return 1 + countDigits(n/10);
}


    public static void main(String[] args) {
        System.out.println(sumOfDigits(300403));
    }
}

6...SUM OF DIGITS

class SumOfDigits {
// Sum of digit of a number recursively
static int sumOfDigits(int n){
    if(n==0){
        return 0;
    }
    return (n%10) + sumOfDigits(n/10);
}

    public static void main(String[] args) {
        System.out.println(sumOfDigits(300403));
    }
}

************************************************RECURSION ON ARRAYS**************
1.....TO PRINT ALL VALUES IN ARRAY
2.....To search an element
3.....sum of array
4.....check sorted array or not
5.....print divisors of number
    class DivisorsRecursion {

    static void printDivisors(int n, int i) {

       
        if (i > Math.sqrt(n)) {
            return;
        }

        if (n % i == 0) {

            System.out.print(i + " ");

            if (i != n / i) {
                System.out.print(n / i + " ");
            }
        }

        
        printDivisors(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 12;
        printDivisors(n, 1);
    }
}

6...POWER OF A NUMBER
class PowerOfN {
    static int func(int n, int m){
    if(m==0){
        return 1;
    }
    return n * func(n,m-1);
}
    public static void main(String[] args) {
        System.out.println(func(3,3));
    }
}
