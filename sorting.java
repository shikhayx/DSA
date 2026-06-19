//bubble sort
//fisrt element ko next element se comparing then swap it occur in many iteration
// class sorting{
//     public static void main(String args[]){
//         int arr[]={2,4,1,3,6};
//         for(int i =0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                if(arr[j]>arr[j+1]){      //for descending (arr[j]>arr[j+1])
//                  int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//                }
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }

//0(n^2)

//selection sort
//isme pure array me sbse smallest element nikle k side aise krke sort krna
// class sorting{
//     public static void main(String args[]){
//         int arr[]= {1,2,4,5,2};
//         for(int i=0;i<arr.length-1;i++){
//             int minpos=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[minpos]>arr[j]){
//                     minpos=j;
//                 }
                
//             }
//              int temp=arr[minpos];
//         arr[minpos]=arr[i];
//         arr[i]=temp;

//         }
       
//          for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
//     }
   
// }

//o(n^2)

//insertion sort
//ek sorted part or ek unsorted part element are inserted in between of sorted part bytaking the element from first element unsorted part

// class sorting{
//     public static void main(String args[]){
//         int arr[]={2,1,3,2,4,3};
//         for(int i=1;i<arr.length-1;i++){
//             int curr=arr[i];
//             int prev=i-1;
//             while(prev>=0 &&arr[prev]>curr){
//                 arr[prev] = arr[prev];
//                 prev--;
//             }
//             arr[prev+1] = arr[curr];
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//inbuilt sort
// import java.util.Arrays;
// class sorting{
//     public static void main(String args[]){
//         int arr[]={2,4,3,1};
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
// System.out.println();
//     }
// }

//counting sort
// class sorting{
//     public static void main(String args[]){
//         int arr[]={1,5,4,3,2};
//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             largest=Math.max(largest,arr[i]);
//         }
//         int count[]=new int[largest+1];
//         for(int i=0;i<arr.length;i++){
//             count[arr[i]]++;
//         }

//         //sorting
//         int j = 0;
//         for(int i=0;i<count.length;i++){
//             while(count[i]>0){
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }

//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");

//         }
//         System.out.println();

//     }
// }



//divide and conquer
//merge sort
//0(nlogn)
// space 0(n)
// class sorting{
//     public static void mergeSort(int arr[],int si,int ei){
//         if(si>=ei){
//             return;
//         }
//         int mid=si+(ei-si)/2;
//         mersort(arr,si,mid);
//         mergeSort(arr,mid+1,ei);
//     }

//     public static void merge(int arr[],int si,int mid,int ei){
//         int temp[] = new int[ei-si+1];
//         int i =si;
//         int j = mid+1;
//         int k =0;

//         while(i<=mid && j<=ei){
//             if(arr[i] < arr[j]){
//                 temp[k] = arr[j];
//                 i++;
//             }else{
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         while(i<= mid){
//             temp[k++] = arr[j];
//         }
//         while(j<=ei){
//             temp[k++] = arr[j++];
//         }

//         for(k=0; i=si;k<temp.length;k++,i++){
//             arr[i]= temp[k];
//         }
//     }
//     public static void main(String args[]){
//         int arr[]={1,4,3,6};
//         mersort(arr,0,arr.length-1)
//     }
// }


//quick sort
//o(nlogn)-average
//worst-o(n2)
//space-o(1)
//quick sort
//last ele ko pivot assume kro pivot ko 1 ele se compare if greater than whi rehne do if less swap with second ele

// class sorting{
//     public static void quickSort(int arr[],int si,int ei){
//         if(si>=ei){
//             return;
//         }
//         int pIdx = partition(arr,si,ei);
//         quickSort(arr,si,pIdx-1);
//         quickSort(arr,pIdx+1,ei);
//     }
//     public static int partition(int arr[],int si,int ei){
//         int pivot = arr[ei];
//         int i = si-1;
//         for(int j =si ;j<ei;j++){
//             if(arr[j]<= pivot){
//                 i++;
//                 //swap
//                 int temp = arr[j];
//                 arr[j]= arr[i];
//                 arr[i]=temp;
//             }
            
//         }
//         i++;
//             int temp=pivot;
//             arr[ei]=arr[i];
//             arr[i]=temp;
//             return i;
//     }

//     public static void main(String args[]){
//         int arr[]={3,5,8,7,4};
//         quickSort(arr,0,arr.length-1);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }


//sorted and roated array
// class sorting {
//     public static int search(int arr[], int tar, int si, int ei) {

//         if (si > ei) {
//             return -1;
//         }

//         int mid = si + (ei - si) / 2;

//         if (arr[mid] == tar) {
//             return mid;
//         }

//         // Left sorted
//         if (arr[si] <= arr[mid]) {

//             if (arr[si] <= tar && tar <= arr[mid]) {
//                 return search(arr, tar, si, mid - 1);
//             } else {
//                 return search(arr, tar, mid + 1, ei);
//             }

//         }
//         // Right sorted
//         else {

//             if (arr[mid] <= tar && tar <= arr[ei]) {
//                 return search(arr, tar, mid + 1, ei);
//             } else {
//                 return search(arr, tar, si, mid - 1);
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 0, 3, 4, 5};
//         int tar = 0;

//         int tarIdx = search(arr, tar, 0, arr.length - 1);
//         System.out.println(tarIdx);
//     }
// }


