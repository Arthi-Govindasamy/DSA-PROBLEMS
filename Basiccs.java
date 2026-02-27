................................conditional....................................

1...voting eligible(if else)
import java.util.Scanner;
class Video{
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter age");
    int age=scan.nextInt();

    if(age>=18){
        System.out.println("Eligible to vote");
        }  
    else{
        System.out.println("not eligible");
    } 
    }
}

2....largest number(if elseif else)(logical operator&&)
import java.util.Scanner;
class Video{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        
        if(a>=b&&a>=c){
            System.out.println("a is largest");
        }
        else if(b>=a&&b>=c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
 }

3.........positive or negative .if +ve find odd or even(nested if)
import java.util.Scanner;
class Video{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number");
        int num=scan.nextInt();
        
        if (num>0) {
            System.out.println("positive");
            if(num%2==0){
                System.out.println("num is even");
            }else{
                System.out.println("num is odd");
            }
            }
        else{
            System.out.println("Negative");
        }
    }
}

4....Switch case....DAy of week based on i/p  0-sun 1-mon...
import java.util.Scanner;
class Video{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number from 0 to 6");
        int day=scan.nextInt();

        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;  
            default:
                System.out.println("Enter invalid");
                break;
        }
    }
}
        
............................loops//
1...for loop
class Video{
    public static void main(String[]args){
       for(int i=0;i<=10;i++){
        System.out.println(i);
       }
    }
}

2...while loop
class Video{
     public static void main(String[]args){
     int i=1;
     while(i<=10){
        System.out.println(i);
        i++;
     }
     }
}

3...do-while
class Video{
    public static void main(String[]args){
        int i=1;
        do { 
            System.out.println(i);
            i++;
        } while (i>=10);
    }
}

................................................................Patterns....................................................

1.........
****
****
****          n=4
****
class Video{
   public static void main(String[]args){
    int n=4;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print("*"+" ");
        }
    System.out.println();
    }
   }
}

2....
1 2 3 4
1 2 3 4       n=4
1 2 3 4
1 2 3 4
class Video{
   public static void main(String[]args){
    int n=4;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print(j+" ");
        }
    System.out.println();
    }
   }
}

 3...
1            i=1
1 2          i=2
1 2 3        i=3
1 2 3 4      i=4               n=5
1 2 3 4 5    i=5



class Video{
   public static void main(String[]args){
    int n=5;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
    System.out.println();
    }
   }
}

4....

      * ** ***     n=3
   i= 1  2   3


class Video{
   public static void main(String[]args){
    int n=3;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
    System.out.print(" ");
    }
   }
}

5........
1 2 3 4
1 2 3
1 2
1            n=4 

class Video{
   public static void main(String[]args){
    int n=4;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
    System.out.println();
    }
   }
}



