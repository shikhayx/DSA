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