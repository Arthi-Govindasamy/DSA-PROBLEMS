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

5.PRINT DIVISORS OF NUMBER
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
