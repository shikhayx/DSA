//1.star pattern
// class pattern{
//     public static void main(String args[]){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//output
// *
// **
// ***
// ****

//2.inverted star
// class pattern{
//     public static void main(String agrs[]){
//          int n=4;   //number of rows
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=(n-i+1);j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// output
// ****
// ***
// **
// *

//3.half pyramid
// class pattern{
//     public static void main(String args[]){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// output
// 1
// 12
// 123
// 1234

//4.character pattern
// class pattern{
//     public static void main(String agrs[]){
//         char ch='A';
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// output
// A
// BC
// DEF
// GHIJ

//part-2
//5.hollow rectangle
// class pattern{
//     public static void main(String agrs[]){
//         int row=4;
//         int col=5;
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=col;j++){
//                 if(i==1 || i==row || j==1 || j==col){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// output
// *****
// *   *
// *   *
// *****

//6.inverted and rotated half pyramid
// class pattern{
//     public static void main(String agr[]){
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// output
//    *
//   **
//  ***
// ****

//7.inverted half-pyramid with numbers

// class pattern{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1; j<=n-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
// output
// 12345
// 1234
// 123
// 12
// 1

//8.floyds triangle

// class pattern{
//     public static void main(String agrs[]){
//         int n=4;
//         int count=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(count);
//                 count++;
//                 System.out.print(" ");
                
//             }
//             System.out.println();
//         }
//     }
// }
// output
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 

//9)0-1 triangles {i+j=even=1,i+j=odd=0}
// class pattern{
//     public static void main(String agrs[]){
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }
// output
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1

//10)butterfly pattern
