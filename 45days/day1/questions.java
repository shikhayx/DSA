// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         int n=12345;
//         int revnum=0;
//         while(n>0){
//            int lastdig=n%10;
//             revnum=revnum*10+lastdig;
//             n=n/10;
//         }
//         System.out.println(revnum);
//     }
// }

//palindrome
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=111111;
        int original=n;
        int revnum=0;
        while(n>0){
           int lastdig=n%10;
            revnum=revnum*10+lastdig;
            n=n/10;
        }
        System.out.println(revnum);
        if(original == revnum){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}

//greatest common factor

import java.util.*;
class Main {
    public static void main(String[] args) {
        int gdc=1;
       int n1=20,n2=15;
       for(int i=1;i<=Math.min(n1,n2);i++){
          if(n1%i==0 && n2%i==0){
              gdc=i;
          }
          
       }
       System.out.println(gdc);
    }
}

//armstrong
import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 253;
        int temp = n;
        int sum = 0;

        while(temp > 0){
            int digit = temp % 10;   // last digit
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if(sum == n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}


//prime or not
import java.util.*;

class Main {
    public static void main(String[] args) {
        int n=13;
        int count= 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}

//recursion form me printkrna
import java.util.*;

class Main {
    public static void printname(String name,int count,int n){
        if(count == n){
            return;
        }
        System.out.println(name);
        printname(name,count+1,n);
    }
    public static void main(String[] args) {
       int n=5;
       String name="shikha";
       printname(name,0,n);
       
    }
}
//number print
import java.util.*;

class Main {
    public static void print(int current,int n){
        if(current>n){
            return;
        }
        System.out.println(current);
        print(current+1,n);
    }
   public static void main(String args[]){
       int n=10;
       print(1,n);
   }
}
//reverse
import java.util.*;

class Main {
    public static void print(int current){
        if(current<1){
            return;
        }
        System.out.println(current);
        print(current-1);
    }
   public static void main(String args[]){
       int n=10;
       print(n);
   }
}

//print sum of n natural number using recusion
import java.util.*;

class Main {
    public static int sum(int n){
       if(n==1){
           return 1;
       } 
       return n+sum(n-1);
    }
   public static void main(String args[]){
       int n=10;
      System.out.println( sum(n));
   }
}

//factorial number
import java.util.*;

class Main {
    public static int fact(int n){
       if(n==1){
           return 1;
       } 
       return n*fact(n-1);
    }
   public static void main(String args[]){
       int n=5;
      System.out.println(fact(n));
   }
}

//reverse an array
import java.util.*;

class Main {
    public static void reversearr(int arr[]){
        int p1=0;
        int p2=arr.length-1;
        while(p1<p2){
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
    }
   public static void main(String args[]){
       int arr[] ={5,4,3,2,1};
       reversearr(arr);
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      }
   }
   
}

//sorting

//selection sorting
//[64, 25, 12, 22, 11]

// Find the smallest element (11) and swap it with the first element.
// → [11, 25, 12, 22, 64]
class Main {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minidx=i;
            
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            
            }
             int temp=arr[minidx];
                arr[minidx]=arr[i];
                arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,6,4,3,1};
        selectionSort(arr);
        
    }
}

//bubble sort
//5 > 4 → swap → [4, 5, 3, 2, 1]


//insertion sort
// Array: [5, 4, 3, 2, 1]

// 4 ko 5 se compare karo → 4 chota hai → insert
// [4, 5, 3, 2, 1]
// 3 ko 5 aur 4 se compare karo → insert
// [3, 4, 5, 2, 1]
// 2 ko sahi position par insert karo
// [2, 3, 4, 5, 1]
// 1 ko insert karo
// [1, 2, 3, 4, 5]

