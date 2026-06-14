//ARRAY 
//dataType arrayName[] = new dataType[size]


//I/O in array
// import java.util.*;
// class pattern{
//     public static void main(String args[]){
//         int marks[]= new int[50];
         
//         Scanner sc = new Scanner(System.in);

//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();


//         System.out.println("phy"+marks[0]+ "chem " + marks[1] +"math" + marks[2]);
//     }
// }

//passing array as argument
//pass by value main no change
//pass by refernce main change

// class  array{
//     public static void update(int marks[],int nonchangeable){
//         nonchangeable=10;
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[]= {91,92,93};
//         int nonchangeable =5;
//         update(marks,nonchangeable);

//      System.out.println(nonchangeable);

//         for(int i=0;i<marks.length;i++){
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();
//     }
// }

// output
// 5
// 92 93 94 

//linear search  in array
// class array{
//     public static int linearSearch(int number[],int key){
//         for(int i=0;i<number.length;i++){
//             if(number[i] == key){
//                 return i;
//             }
//         }
//         return -1;

//     }
//     public static void main(String args[]){
//         int number[]={1,2,4,5,6,7};
//         int key=4;
//         int index=linearSearch(number,key);
//         if(index== -1){
//             System.out.println("element is not found");
//         }
//         else{
//             System.out.println("key is at index:"+index);
//         }

//     }
// }

// output
// key is at index:2

//largest and the smaleest number form the array
// class array{
//     public static void main(String args[]){
//         int number[]={1,2,4,6,7,6};
//         int largest = Integer.MIN_VALUE;
//         int smallest=Integer.MAX_VALUE;

//         for(int i=0;i<number.length;i++){
//             if(largest<number[i]){
//                 largest=number[i];
//             }
//             if(smallest>number[i]){
//                 smallest=number[i];
//             }
//         }
//         System.out.println("largest element from the array:"+largest);
//         System.out.println("smallest element from the array:"+smallest);
//     }
// }
// output
// largest element from the array:7
// smallest element from the array:1


//binary search-prerequisite=sorted array
// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//         int[] arr = {1, 3, 5, 7, 9};
//         int target = 7;

//         int index = Arrays.binarySearch(arr, target);
//         System.out.println(index);
//     }
// }

//reverse number
// class array{
//     public static void main(String args[]){
//         int number[]={1,2,5,7,8};
//         int start =0,last=number.length-1;
//         while(start<last){
//             int temp=number[last];
//             number[last]=number[start];
//             number[start]= temp;
//             start++;
//             last--;
//         }
//         for(int i=0;i<number.length;i++){
//             System.out.print(number[i]+" ");
//         }
//         System.out.println();
//     }
// }
// output
// 8 7 5 2 1 

//pairs in an array
// class array{
//     public static void main(String args[]){
//         int number[]={1,2,3,4,5};

//         for(int i=0;i<number.length;i++){
//             int curr = number[i];
//             for(int j= i+1;j<number.length;j++){
//                 System.out.print("(" +curr +","+number[j]+")");
//             }
//             System.out.println();
//         }
//     }
// }

// output
// (1,2)(1,3)(1,4)(1,5)
// (2,3)(2,4)(2,5)
// (3,4)(3,5)
// (4,5)


//printsubarray
// class array{
//     public static void main(String args[]){
//         int ts=0;
//         int number[]={1,3,5,7,9};
//         for(int i=0;i<number.length;i++){
//            int start=  i;
//             for(int j=i;j<number.length;j++){
//                 int end = j;
//                 for(int k=i;k<j;k++){
//                     System.out.print(number[k]+" ");
//                 }
//                 ts++;
//                 System.out.println();

//             }
//             System.out.println();
//         }
//         System.out.println("sum:"+ts);
//     }
// }
// output
// 1 
// 1 3 
// 1 3 5 
// 1 3 5 7 


// 3 
// 3 5 
// 3 5 7 


// 5 
// 5 7 


// 7 



//sum:15


//max subarray sum(brute force,prefix sum,kadane.s algorithm)
//brute force


//prefix sum
//prefix array find krneka formula-prefix[i]=prefix[i-1]+arr[i]
//sum of prefix array formula currsum= prefix[end]-prefix[start-1];
class array{
    public static void main(String args[]){
        int maxsum=Integer.MIN_VALUE;
        int number[]={2,4,6,8,10};
        int currsum=0;
        int prefix[]=new int[number.length];
        prefix[0]=number[0];
        for(int i=1;i<number.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                currsum=start==0 ? prefix[end] :prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        } 
        System.out.println("max sum:"+maxsum);
    }
}