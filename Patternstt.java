pattern 6
Write a Program which takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 4

Expected output:

****

***

**

*



Sample 2

Input:

n= 6

******

*****

****

***

**

*

class Patterntt{
    public static void main(String[]args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}


PATTERN7 
Write a Program which takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 4

Expected output:

4321

321

21

1
class Patterntt{
    public static void main(String[]args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=n-(i-1);j>=1;j--)
            {
                System.out.print(j);

            }
            
        System.out.println();
        
        }
    }
}

PATTERN8
 Write a Program that takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 4

Expected output:

*

**

***

****
class Patterntt{
    public static void main(String[]args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            
        System.out.println();
        
        }
    }
}

PATTERN14
Sample 1:

Input:

n = 8

Expected output:

1 

2 2 

3 3 3 

4 4 4 4 

5 5 5 5 5 

6 6 6 6 6 6 

7 7 7 7 7 7 7 

8 8 8 8 8 8 8 8 8 

class Patterntt{
    public static void main(String[]args){
        int n=8;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                
            }
        System.out.println();
        count++;
        }
    }
}
