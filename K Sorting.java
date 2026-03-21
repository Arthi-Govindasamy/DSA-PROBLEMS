...............................Bubble Sort
class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  
                }
            }
        }
    
    }
}

.............................INSERTION Sort
class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while( j>=0&&arr[j]>key){
                arr[j+1]=arr[j];//right shift
                j--;
            }
            arr[j+1]=key;
        }
    }
}

......................MERGE SORT
case1.MERGE 2 SORTED ARRAYS(STORE IN NEW VARIABLE)
import java.util.Arrays;

class Solution {
    public static void mergeArrays(int[] arr, int m, int[] brr, int n) {
        
        int[] crr = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr[i] <= brr[j]) {
                crr[k] = arr[i];
                i++;
            } else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            crr[k] = arr[i];
            i++;
            k++;
        }

        while (j < n) {
            crr[k] = brr[j];
            j++;
            k++;
        }

        // copy temp array to arr
        for (int x = 0; x < m + n; x++) {
            arr[x] = crr[x];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] brr = {2,5,6};

        int m = 3;
        int n = 3;

        mergeArrays(arr, m, brr, n);
    }
}

case 2:Merge nums1 and nums2 into a single array sorted i The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=m-1;
       int j=n-1;
       int k=m+n-1;
       
       while(i>=0&&j>=0){
        if(nums1[i]>nums2[j]){
            nums1[k]=nums1[i];
            i--;
        }else{
            nums1[k]=nums2[j];
            j--;
        }
        k--;
       }

       while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
       }
    }
}

https://leetcode.com/problems/merge-sorted-array/
class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int[] num3 = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (num1[i] < num2[j]) {
                num3[k++] = num1[i++];
            } else {
                num3[k++] = num2[j++];
            }
        }

        while (i < m) {
            num3[k++] = num1[i++];
        }

        while (j < n) {
            num3[k++] = num2[j++];
        }

        for (int x = 0; x < m + n; x++) {
            num1[x] = num3[x];
        }
    }
}

case3:full merge sort:recursion+merging

import java.util.Arrays;

public class MergeSorting {
  public static void mSort(int[] arr, int start, int mid, int end){
      int cl = arr.length;
      int [] crr = new int[cl];
      int i=start, j=mid, k=start;

      while(i<mid && j<end){
          if(arr[i] < arr[j]){
              crr[k] = arr[i];
              i++;
              k++;
          }
          else{
              crr[k] = arr[j];
              j++;
              k++;
          }
      }

      while(i<mid){
          crr[k] = arr[i];
          i++;
          k++;
      }

      while(j<end){
          crr[k] = arr[j];
          j++;
          k++;
      }

      for(int itr=start; itr<end;itr++){
          arr[itr] = crr[itr];
      }
  }

  public static void mergeSort(int[] arr, int start, int end){

      if(end-start == 1)
          return;

      int mid = (start+end)/2;
      mergeSort(arr, start, mid);
      mergeSort(arr,mid, end);
      mSort(arr,start, mid, end);
  }

  public static void main(String[] args) {
      int [] arr = {1,5,3,0,9,6};
      mergeSort(arr,0,arr.length);
      System.out.println(Arrays.toString(arr));
  }
}

