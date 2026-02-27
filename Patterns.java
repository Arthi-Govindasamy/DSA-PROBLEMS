................................................................Patterns[6]...................................................

1.........
****
****
****          n=4
****
class Patterns{
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
class Patterns{
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



class Patterns{
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


class Patterns{
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

pattern 9
Example 1:

Input: 5
Output:
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*
class Solution {

    void printTriangle(int n) {
        // code here
        //int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
        System.out.println();
        }
        
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print("*"+" ");
            }
        System.out.println(); 
        }
        
        
    }
}

pattern 10
Example 1:

Input: 5
Output:
    *
   ***  
  *****
 *******
********* */
class Solution {

    void Patterns(int n) {
        // code here
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
            }
        
    }
}
    

11........
                                  i        space      star
# # # # # # #                     1                
   # # # # #                      2
    # # #                         3
      #               n=4         4

class Patterns{
   public static void main(String[]args){
    int n=4;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=(i-1);j++){
         System.out.print(" ");
      }
      for(int j=1;j<=(2*n)-(2*i-1);j++){
         System.out.print("*"+" ");
      }
    System.out.println();
    }
    
   }
}

pattern12

pattern10+11

class Patterns{
   public static void main(String[]args){
    int n=4;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
           }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*"+" ");
         } 
        System.out.println();
       }
    for(int i=1;i<=n-1;i++){
      for(int j=1;j<=i;j++){
         System.out.print("  ");
      }
      for(int j=1;j<=(2*(n-1))-(2*i-1);j++){
         System.out.print("*"+" ");
      }
    System.out.println();
    }
    
   }
}

pattern 13

1
2 3
4 5 6
7 8 9 10    n=4 
class Patterns{
   public static void main(String[]args){
    int n=4;
    int count=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
    System.out.println();
    }
   }
}
