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