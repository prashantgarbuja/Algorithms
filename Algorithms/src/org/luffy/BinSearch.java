package org.luffy;

//Java implementation of recursive Binary Search
class BinSearch
{
 // Returns index of x if it is present in arr[l..r], else return -1
 int binSearch(int arr[], int l, int r, int x)
 {
     if (r>=l)
     {
         int mid = l + (r - l)/2;

         // If the element is present at the 
         // middle itself
         if (arr[mid] == x)
            return mid;

         // If element is smaller than mid, then 
         // it can only be present in left subarray
         if (arr[mid] > x)
            return binSearch(arr, l, mid-1, x);

         // Else the element can only be present
         // in right subarray
         return binSearch(arr, mid+1, r, x);
     }

     // We reach here when element is not present
     //  in array
     return -1;
 }

 // Driver method to test above
 public static void main(String args[])
 {
     BinSearch ob = new BinSearch();
     int arr[] = {2,3,4,10,40}; //elements should be in ascending order.
     int n = arr.length;
     int x = 10; //element to search.
     int result = ob.binSearch(arr,0,n-1,x);
     if (result == -1)
         System.out.println("Element not present");
     else
         System.out.println("Element found at index "+result);
 }
}