import java.util.Scanner;
//TO FIND SUM OF ALL EVEN AND ODD NUMBERS
// class First {
//     public static void main (String[]args){
//         Scanner input = new Scanner(System.in);
//         int num = input.nextInt();
//         int odd_sum = 0;
//         int even_sum = 0;
//         for(int i = 1;i <= num;++i){
//             if(i % 2 == 0){
//                 even_sum += i;
//             }else{
//                 odd_sum += i;
//             }
//         }
//         System.out.println("Odd Sum :"+odd_sum);
//         System.out.println("Even Sum :"+even_sum);
        
// }

//PRINT FACTORIAL
// class First{
//     public static void main (String args[]){
//         Scanner input = new Scanner(System.in);
//         int num = input.nextInt();

//         int fact = 1;
//         for(int i = num;i >= 1; --i){
//             fact *= i;
//             if(i == 1){
//                 System.out.print(i);
//             }else{
//                 System.out.print(i+"*");
//             }
//         }
//         System.out.print(" = "+fact);

//     }
// }

//PRINT FACTORAIL USING RECURSION
// class Recursion {

//     int sum = 1;
//     int fact(int num){
//         if(num <= 1){
//             return 1;
//         }else{
//             sum *= num;
//             fact(num-1);
//             return 
//         }
//         return sum;
//     }
// }

//2ND WAY
// class Recursion {

//     int fact(int num){
//         if(num <= 1){
//             return 1;
//         }else{
//             return num * fact(num - 1);
//         }
//     }
// }
// class First {
//     public static void main (String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");

//         int num = sc.nextInt();

//         Recursion obj1 = new Recursion();
        
//         int result = obj1.fact(num);

//         System.out.print(result);
//     }
// }
//FIND LARGEST AND SMALLEST NUMBER IN AN ARRAY
// class First{
//     public static void main(String args[]){
//         int arr[] = {9,5,33,1,67,4,8,90,12,46,71,23,1,0};
//         int size = arr.length;

//         int largest = arr[0];
//         int smallest = arr[0];
//         for(int i = 1;i < size;++i){
//             if(arr[i] > largest){
//                 largest = arr[i];
//             }else if(arr[i] < smallest){
//                 smallest = arr[i];
//             }
//         }
//         System.out.println("Largest = "+largest);
//         System.out.print("Smallest = "+smallest);
//     }
// }


//WAP TO FIND IF THE NUM IS PRIME OR NOT
// class First{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();


//         boolean is_prime = true;

//         if(num <= 1){
//             is_prime = false;

//         }else{
//             for(int i = 2;i < num; ++i){
//                 if(num % i == 0){
//                     is_prime  = false;
//                     break;
//                 }
//             }
//         }
    
//         if(is_prime){
//             System.out.print(num+" is a Prime Number.");
//         }else{
//             System.out.print("Not a Prime Number.");
//         }
//     }
// }

