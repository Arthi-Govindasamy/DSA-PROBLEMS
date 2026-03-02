..........................odd or even'
import java.util.Scanner;
class Maths{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter num");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}

.............................last digit
class Maths{
    public static void main(String[]args){
    int n=234567;
    int ld=n%10;
    System.out.println(ld);
    }
}

..............................FIRST DIGIT
class Maths{
    public static void main(String[]args){
    int n=234567;
    int ld=0;
    while(n>0){
        ld=n%10;
        n=n/10;
    }
    System.out.println(ld);
    }
}

.............................Prints the digits of a number by traversing the number.
class Maths{
    public static void main(String[]args){
    int n=234567;
    
    while(n>0){
        int ld=n%10;
        System.out.print(ld);
        n=n/10;
    }
    }
}

countings ----------------use COUNTER
 ..................................count digits in a number
class Maths{
    public static void main(String[]args){
    int n=12345;
    int count=0;

    while(n>0){
        count++;
        n=n/10;
    }
    System.out.println(count);
    }
}

..............................odd digits counts and even
class Maths{
    public static void main(String[]args){
    int n=12345;
    int count=0;
    while(n>0){
        int ld=n%10;
        if(ld%2!=0){ //ld%2==0(even)
          count++;
        }
        n=n/10;
    }
    System.out.println(count);
    }
}

...............................Finds the power of A power B and then finds the kth digit of the number
 class KthDigitWithPower {
    public static void main(String[] args) {
       int A = 3, B=3, k=1;
      // Built-in pow function to find A power B
       long power=(long)Math.pow(A,B);
        long i=1;
        
        while(power>0){
            long ans=power%10;
          // 
            if(k==i){
                return ans;
            }
            i++;
            power=power/10;
        }
        return 0;
       
    }
}



// In online compilers use the below code

class Main {
    public static void main(String[] args) {
       int A = 3, B=3, k=1;
       long power=(long)Math.pow(A,B);
        long i=1;
        
        while(power>0){
            long ans=power%10;
            if(k==i){
                System.out.println(ans);
                break;
            }
            i++;
            power=power/10;
        }
        
       
    }
}   

