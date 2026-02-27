1...........Sum of Array
class Solution {
    int arraySum(int arr[]) {
        // code here
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}

2...........Count Odd and Even
class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
         
        }
        return new int[]{odd,even};
        
       
    }
}

3................Largest in Array
class Solution {
    public static int largest(int[] arr) {
        // code here
        int large=arr[0];
        
        for(int i=1;i<arr.length;i++){
           if(large<arr[i]){
               large=arr[i];
           }
            
        }
        return large;
        
    }
}

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

7............Array Search(Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.)
class Solution {
    public int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
        
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
        // code here
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
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        // code here
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

11........Sieve of Eratosthenes
class Solution {
    public int[] sieve(int n) {
        // code here
        int a []=new int[n+1];
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(a[i]==0){
                for(int j=i*2;j<=n;j=j+i){
                    a[j]=1;
                }
            }
        }
        
        int count=0;
        for(int i=2;i<=n;i++){
            if(a[i]==0){
                count++;
            }
        }
        
        int index=0;
        int []result=new int[count];
        for(int i=2;i<=n;i++){
            if(a[i]==0){
                result[index]=i;
                index++;
            }
        }
        return result;
    }
}

12..................Given a range [L, R]. The task is to find the sum of all the prime numbers in the given range from L to R both inclusive.

class Solution {

    public static long primeSum(int L, int R) {

        // Step 1: Create array up to R
        int[] a = new int[R + 1];

        // Step 2: Sieve of Eratosthenes
        for (int i = 2; i * i <= R; i++) {
            if (a[i] == 0) {
                for (int j = i * i; j <= R; j += i) {
                    a[j] = 1;   // mark as not prime
                }
            }
        }

        // Step 3: Sum primes between L and R
        long sum = 0;

        for (int i = Math.max(L, 2); i <= R; i++) {
            if (a[i] == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
