//find the largest element

class Main {
    public static int selectionSort(int arr[]){
        int n=arr.length;
      int max=arr[0];
      for(int i=1;i<n;i++){
          if(arr[i]>max){
              max=arr[i];
          }
      }
      return max;
    }
    public static void main(String[] args) {
        int arr[]={2,6,4,3,1};
        int large=selectionSort(arr);
        System.out.println(large);
        
    }
}

//is array is sorted or not
class Main {
    public static boolean selectionSort(int arr[]){
     int n=arr.length;
     for(int i=1;i<n;i++){
         if(arr[i]<arr[i-1]){
             return false;
         }
     }
       return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        boolean large=selectionSort(arr);
        System.out.println(large);
        
    }
}

//remove duplicate element
class Main {
    public static int removeDuplicate(int arr[]){
        if(arr.length==0){
            return 0;
        }
        int i =0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4};
        int k=removeDuplicate(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//rotate one element
class Main {
    public static void rotateOnele(int arr[]){
      int temp =arr[0];
      for(int i=1;i<arr.length;i++){
          arr[i-1]=arr[i];
      }
      
      arr[arr.length-1]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4};
        rotateOnele(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//Rotate array by K elements
import java.util.*;
class Main{
    public static void reversearray(int arr[],int start,int end){
     while(start<end){
            int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
     }
    }
    public static int[] rotatearray(int arr[],int k,String direction){
        int n=arr.length;
        if(n==0 || k==0){
            return arr;
        }
        k=k%n;
        
        if(direction.equals("right")){
            reversearray(arr,0,n-1);
            
            reversearray(arr,0,k-1);
            
            reversearray(arr,k,n-1);
        }
        
        else if(direction.equals("left")){
            reversearray(arr,0,k-1);
            
            reversearray(arr,k,n-1);
            
            reversearray(arr,0,n-1);
        }
        return arr;
    }
    public static void main(String arg[]){
        int arr[]={1,2,3,4,5,6,7};
        int k=2;
        String direction= "left";
        int b[]=rotatearray(arr,k,direction);
        for(int i=0;i<b.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//Move all Zeros to the end of the array
class Main{
    public static void movezero(int arr[]){
        int j=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,0,0,4,5,6,7};
        movezero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//linear search in array
class Main{
    public static int  linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int key=2;
        int idx=linearsearch(arr,key);
        System.out.print("index of the element: "+idx);
    }
}

//Find the number that appears once, and the other numbers twice
class Main {
    public static void getSingleElement(int arr[]){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.print(xor);
    }
    public static void main(String[] args) {
      int arr[]={4,1,1,2,2,3,3};
      getSingleElement(arr);
    }
}

//Length of the longest subarray with zero Sum
import java.util.*;
class Main{
    public static void largestsubarray(int arr[]){
        int n=arr.length;
        int maxLength=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currsum=0;
                for(int b=i;b<=j;b++){
                    currsum=currsum+arr[b];
                }
                if(currsum==0){
                    maxLength=Math.max(maxLength,j-i+1);
                }
            }
        }
        System.out.print(maxLength);
    }
    public static void main(String agr[]){
        int arr[]={9, -3, 3, -1, 6, -5};
        
        largestsubarray(arr);
    }
}

//dutch national flag algorithm
import java.util.*;

class Main{
    public static void DNFA(int arr[]){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            
            else if(arr[mid]==1){
               mid++;
            }
            else{
                 int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                mid++;
            }
            
        }
    }
    public static void main(String arg[]){
        int arr[]={1,0,0,1,2,2};
       DNFA(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}


//Find the Majority Element that occurs more than N/2 times
class Main {
    public static int majorityElement(int arr[]){
        int n=arr.length;
        int cnt=0,el=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                el=arr[i];
            }
            else if(el==arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        
        int cnt1=0;
        for(int i=0;i<n;i++){
          if(arr[i]==el){
              cnt1++;
          }
        }
        
         if(cnt1>=(n/2)){
                return el;
            }
            return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,5,4,6,5,5,5,7};
        int res=majorityElement(arr);
        System.out.print(res);
    }
}

// Kadane's Algorithm : Maximum Subarray Sum in an Array
// Problem Statement: Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
// A subarray is a contiguous non-empty sequence of elements within an array.

import java.util.*;
class Main{
    public static long kadanes(int arr[]){
        long max=Long.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={2, 3, 5, -2, 7, -4};
        long res=kadanes(arr);
        System.out.print(res);
    }
}

//Stock Buy And Sell
class Main{
    public static int maxprofit(int profits[]){
        int minprice=profits[0];
        int maxprofit=0;
        for(int i=1;i<profits.length;i++){
            if(profits[i]<minprice){
                minprice=profits[i];
            }
            int profit=profits[i]-minprice;
            
            if(profit>maxprofit){
                maxprofit=profit;
            }
            
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int profits[]={4,1,2,4,6};
        int res=maxprofit(profits);
        System.out.println(res);
    }
}

//Rearrange Array Elements by Sign
class main{
    public static int[] rearrangesign(int arr[]){
        int n=arr.length;
        int posidx=0;
        int nevidx=1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[posidx]=arr[i];
                posidx+=2;
            }
            else{
                ans[nevidx]=arr[i];
                nevidx+=2;
            }
        }
        return ans;
    }
    public static void main(String arg[]){
        int arr[]={2,6,-3,7,-3};
        int res[]=rearrangesign(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}

//next_permutation : find next lexicographically greater permutation
class Main{
    public static void nextpermutation(int arr[]){
        int n= arr.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
            if(pivot==-1){
                reverse(arr,0,n-1);
                return;
            }
            
            for(int i=n-1;i>pivot;i--){
                if(arr[i]>arr[pivot]){
                    swap(arr,i,pivot);
                    break;
                }
            }
            reverse(arr,pivot+1,n-1);
        
    }
    public static void reverse(int arr[],int start,int end){
       while(start<end){
            swap(arr,start,end);
        start++;
        end--;
       }
    }
    public static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
    }
    public static void main(String arg[]){
        int arr[]={1,3,2};
        nextpermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//Leaders in an Array
//Input:
//  arr = [10, 22, 12, 3, 0, 6]  
// Output:
//  22 12 6  

import java.util.*;
class Main{
    public static void main(String arg[]){
        int arr[]={10, 22, 12, 3, 0, 6};
        ArrayList<Integer> leader=new ArrayList<>();
        int max=arr[arr.length-1];
        leader.add(max);
        
        for(int i=arr.length-2;i>=0;i--){
          if(arr[i]>max){
                leader.add(arr[i]);
            max=arr[i];
          }
        }
        
        Collections.reverse(leader);
        
        
        for(int i=0;i<leader.size();i++){
            System.out.print(leader.get(i)+" ");
        }
    }
}

// Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
// Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
