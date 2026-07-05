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