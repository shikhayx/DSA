
//operation
// add ele o(1)
// get ele0(1)
// remove ele 0(n)
// set ele at index 0(n)
// contains 0(n)
// import java.util.*;

import java.util.*;

// class arraylist{
//     public static void main(String args[]){
//         //java collection framework
//         ArrayList<Integer> list = new ArrayList<>();

//         //add ele
//         list.add(1);  //0(1)
//         list.add(2);
//         list.add(3);
//         list.add(4);

//         System.out.println(list);

//         //get operation 0(1) 2nd index pe konsa ele hai yeh batayega
//         int ele = list.get(2);
//         System.out.println(ele);

//         //remove ele 0(n)
//         list.remove(2);
//         System.out.println(list);
       
//          //set index list.set(index,value)

//          list.set(2,10);
//          System.out.println(list);

//          //contain ele ele exist krta h ya nhi
//          System.out.println(list.contains(1));
//          System.out.println(list.contains(11));

//          for(int i=0; i<list.size();i++){
//             System.out.print(list.get(i)+" ");
//          }
//          System.out.println();

//          for(int i=list.size()-1; i>=0;i--){
//             System.out.print(list.get(i)+" ");
//          }
//          System.out.println();

//     }
// }

// output
// [1, 2, 3, 4]
// 3
// [1, 2, 4]
// [1, 2, 10]
// true
// false
// 1 2 10 
// 10 2 1 

//max number from the list
// class arraylist{
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(6);
//         list.add(8);

//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<list.size();i++){
//             // if(max<list.get(i)){
//             //     max = list.get(i);
//             // }
//             max = Math.max(max,list.get(i));
//         }
//         System.out.println("max element:"+max);
//     }
// }
// output
// max element:9


class arraylist{

    public static void swap(ArrayList<Integer> list, int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1, idx2=3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);
    }
}