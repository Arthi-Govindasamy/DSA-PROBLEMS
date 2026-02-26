..........................Basics(PROBLEM SET1)..........
1......Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.

import java.util.Scanner;

class Basics{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter int,string,char");
        
        int num=scan.nextInt();
        String string=scan.next();
        char chart=scan.next().charAt(0);

        System.out.println(num);
        System.out.println();
        System.out.println(string);
        System.out.println();
        System.out.println(chart);
    }
}

2.......Write a program to check whether a triangle can be formed with the given values for the angles
import java.util.Scanner;
class Basics{
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter 3 angles");

    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    
    if(a+b+c>=180){
        System.out.println("triangle can be formed");
    }else{
        System.out.println("triangle can not be formed");
    }
    }
}

3....Given mark of student, Print the Grade
import java.util.Scanner;
class Basics{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
       System.out.println("Enter mark");
        int mark=scan.nextInt();

            if(mark>=90){
                System.out.println("Grade A");
            }
            else if(mark>=80){
                System.out.println("Grade B");
            }
            else if(mark>=60){
                System.out.println("Grade C");
            }    
            else if(mark>=35){
                 System.out.println("Grade D");
            }
            else{
                System.out.println("Fail");
            }
    
    }
}


4........program using switch case which takes a value and prints the respective Size.
import java.util.Scanner;
class Basics{
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter size");
    int size=scan.nextInt();
    switch(size){
        case 29:
            System.out.println("Small");
            break;
        case 30:
            System.out.println("Medium");
            break;
        case 38:
            System.out.println("Large");
            break;
        case 42:
            System.out.println("XLarge");
            break;
        default:
            System.out.println("invalid");
            break;
    }
    }
}

.....................loops.........(PROBLEM SET2)
1.Write a program which takes two values x and y. Prints x for y number of times
import java.util.Scanner;
class Basics{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter x ");
        int x=scan.nextInt();
        System.out.println("enter y ");
        int y=scan.nextInt();
       
        int i=1;
        while(i<=y){
            System.out.println(x);
            System.out.println();
            i++;
        }
    }  
}

2....Write a program to take x and print multiples of x till 1000.
import java.util.Scanner;
class Basics{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter x ");
        int x=scan.nextInt();

        for(int i=x;i<=1000;i=i+x){
            System.out.println(i);
            System.out.println();
            
        }

    }
}
orrrrr
import java.util.Scanner;
class Basics{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter x ");
        int x=scan.nextInt();

        for(int i=1;i*x<=1000;i++){
            System.out.println(i);
            
        }

    }
}

3....Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.
import java.util.Scanner;
class Basics{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter firstname ");
        String x=scan.nextLine();
        System.out.println("enter secondname ");
        String y=scan.nextLine();
        System.out.println("enter n ");
        int n=scan.nextInt();
        
        int i=1;
        while (i<=n) {
            System.out.println(x+y);
            System.out.println();
            i++;
        }

   }
}
