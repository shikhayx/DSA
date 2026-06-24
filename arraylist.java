
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


// class arraylist{

//     public static void swap(ArrayList<Integer> list, int idx1,int idx2){
//         int temp = list.get(idx1);
//         list.set(idx1,list.get(idx2));
//         list.set(idx2,temp);
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);

//         int idx1 = 1, idx2=3;
//         System.out.println(list);
//         swap(list,idx1,idx2);
//         System.out.println(list);
//     }
// }

//inbuilt sorting
// class arraylist{
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(6);
//         list.add(5);
//         list.add(4);
//         Collections.sort(list);
//         System.out.println(list);
//         Collections.sort(list,Collections.reverseOrder());
//         System.out.println(list);
//     }
// }


//nexted arraylist

// class arraylist{
//     public static void main(String agrs[]){
//         ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1); list.add(2);
//         mainlist.add(list);

//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(3); list2.add(4);
//         mainlist.add(list2);

//         for(int i=0;i<mainlist.size();i++){
//             ArrayList<Integer> currList = mainlist.get(i);
//             for(int j=0;j<currList.size();j++){
//                 System.out.print(currList.get(j)+" ");

//             }
//             System.out.println();
//         }
//         System.out.println(mainlist);
//     }
// }
// output
// 1 2 
// 3 4 
// [[1, 2], [3, 4]]

// class arraylist{
//     public static void main(String args[]){
//          ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
//          ArrayList<Integer> list1 = new ArrayList<>();
//          ArrayList<Integer> list2 = new ArrayList<>();
//          ArrayList<Integer> list3 = new ArrayList<>();

//          for(int i=1;i<=5;i++){
//             list1.add(i*1);
//             list2.add(i*2);
//             list3.add(i*3);
//          }
//          mainlist.add(list1);
//          mainlist.add(list2);
//          mainlist.add(list3);

//          System.out.println(mainlist);
                  
//     }
// }

// [[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]

class arraylist{
    public static void storeWater(ArrayList)
    public static void main(System args[]){
        ArrayList<Integer> height = new ArrayList<>();
         list.add(1);
        list.add(6);
        list.add(5);
        list.add(4);
    }
}
