//subset
// class backtracking{
//     public static void findSubsets(String str,String ans ,int i){
//         if(i==str.length()){
//             if(ans.length()==0){
//                 System.out.println("null");
//             }
//             else{
//                 System.out.println(ans);
            
//             }
//             return;
//         }

//         //yes choice
//         findSubsets(str,ans+str.charAt(i),i+1);
//         //no choice
//         findSubsets(str,ans,i+1);
//     }
//     public static void main(String args[]){
//         String str = "abc";
//         findSubsets(str,"",0);

//     }
// }
// output
// abc
// ab
// ac
// a
// bc
// b
// c
// null

//find permutation
//find and print all possible way of the string
