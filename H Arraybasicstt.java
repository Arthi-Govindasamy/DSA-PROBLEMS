4................First and Second Smallests( If the smallest and second smallest do not exist, return -1.)
import java.util.Arrays;
class Solution {
    
    int smallest(int arr[],int n,int min){
        
        
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<res&&arr[i]!=min){
                res=arr[i];
            }
        }
        return res;
    }
    
    
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int n=arr.length;
        int min1=smallest(arr,n,Integer.MAX_VALUE);
        int min2=smallest(arr,n,min1);
        
        if(min1==Integer.MAX_VALUE||min2==Integer.MAX_VALUE){
            return  new ArrayList<>(Arrays.asList(-1));
        }
        

        return new ArrayList<>(Arrays.asList(min1,min2));
        
    }
}

5...........Min and Max in Array
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min=arr[0];
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        // ArrayList<Integer>arrlist=new ArrayList<>();
        // arrlist.add(min);
        // arrlist.add(max);
        // return arrlist;
        
        
        return new ArrayList<>(Arrays.asList(min,max));
        
    }
}

6............Alternates in an Array
class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer>arrlist=new ArrayList<>();
        
        for(int i=0;i<arr.length;i=i+2){
            arrlist.add(arr[i]);
        }
        return arrlist;

    }
}
8..............Find element at a given Index
class Solution {
    public static int findElementAtIndex(int key, int[] arr) {
        // code here
        int value=0 ;
        for(int i=0;i<arr.length;i++){
            if(i==key){
                value=arr[i];
            }
        }
        return value;
        
    }
}

9.............Palindrome Array
class Solution {
    public static boolean isPerfect(int[] arr) {
        
        int n=arr.length;

        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-1-i]){
                return false;
            }
        }
        return true;
    }
}

10............Max and Min Product from 2 Arrays
class Solution {
   
    public long findMultiplication(int[] arr1, int[] arr2) {
       
        int n1=arr1.length;
        int n2=arr2.length;
        int max=arr1[0];
        int min=arr2[0];
       
        for(int i=0;i<n1;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        for( int j=0;j<n2;j++){
            if(arr2[j]<min){
                min=arr2[j];
            }
        }
        
        return(long) max*min;
    }
}
12..................Given a range [L, R]. The task is to find the sum of all the prime numbers in the given range from L to R both inclusive.

class Solution {

    public static long primeSum(int L, int R) {

        
        int[] a = new int[R + 1];


        for (int i = 2; i * i <= R; i++) {
            if (a[i] == 0) {
                for (int j = i * i; j <= R; j += i) {
                    a[j] = 1;   
                }
            }
        }

        long sum = 0;

        for (int i = Math.max(L, 2); i <= R; i++) {
            if (a[i] == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
