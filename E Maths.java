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

