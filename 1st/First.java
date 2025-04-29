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


//WAP to store the ages of 5 people. Throw a user-defined exception if the entered age is less than 0 or more than 120.

// class InvalidAgeException extends Exception{
//     public InvalidAgeException (String message){
//         super(message);
//     }
// }

// class First{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[5];

//         for(int i = 0;i < 5;++i){
//             try{
//                 System.out.print("Enter the age "+(i+1)+"->");
//                 int age = sc.nextInt();

//                 if(age <= 0 || age>= 101){
//                     throw new InvalidAgeException("Invalid age "+ age);
//                 }
//                 arr[i] = age;

//             }catch(InvalidAgeException a){
//                 System.out.println(a.getMessage());
//                 i--;
//             }catch(Exception a){
//                 System.out.println("Invalid Input");
//                 i--;
//                 sc.next();
//             }
//         }
//         System.out.println("Age's are");
//         for(int i = 0 ;i < 5;++i){
//             System.out.println(arr[i]+"  ");
//         }
//         sc.close();
//     }
// }




//WAP to do basic addition and subtraction using static methods.

// public class First{
//     public static int add(int a ,int b){
//         return a+b;
//     }

//     public static int sub(int a ,int b){
//         return a-b;
//     }

//     public static void main(String args[]){
//         int a = 20;
//         int b = 12;

//         First obj1 = new First();

//         int sum = obj1.add(a,b);
//         int diff = obj1.sub(a,b);

//         System.out.println(sum);
//         System.out.println(diff);
//     }

// }


//Write a Java program to input a 3x3 matrix of integers, calculate its transpose, and replace all even numbers with -1 in the transposed matrix.

// class First{
//     public static void main(String args[]){
//         int arr[][]= new int[3][3];
//         int trans[][] = new int [3][3];

//         Scanner sc = new Scanner(System.in);
//         //To take input
//         for(int i = 0;i < 3;++i){
//             for(int j = 0;j < 3;++j){
//                 System.out.print("->");
//                 int num = sc.nextInt();
//                 arr[i][j] = num;
//             }
//         }

//         //Print Original Matrix
//         System.out.println("Original Matrix");
//         for(int i = 0;i < 3;++i){
//             for(int j = 0;j < 3;++j){
//                 System.out.print(arr[i][j]+"  ");
//             }
//             System.out.println();
//         }

//         //Build Transpose Matrix
//         System.out.println("Transpose Matrix");
//         for(int i = 0;i < 3;++i){ 
//             for(int j = 0;j < 3;++j){
//                 trans[j][i] = arr[i][j];
//             }
//         }

//         //Print Transpose Matrix
//         for(int i = 0;i < 3;++i){
//             for(int j = 0;j < 3;++j){
//                 System.out.print(trans[i][j]+" ");
//             }
//             System.out.println();
//         }

//         //Change Values of Transpose Matrix
//         for(int i = 0;i < 3;++i){
//             for(int j = 0;j < 3;++j){
//                 if(trans[i][j] % 2 == 0){
//                     trans[i][j] = -1;
//                 }
//             }
//         }
//         //Print Updated Matrix
//         for(int i = 0;i < 3;++i){
//             for(int j = 0;j < 3;++j){
//                 System.out.print(trans[i][j]+"  ");
//             }
//             System.out.println();
//         }

//     }
// }



//Write java codes to check whether a 123321 is palindrome or not.

// class First{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any value-> ");
//         String value = sc.next();

//         String reverse = "";

//         for(int i = value.length()-1;i >= 0;--i){
//             reverse += value.charAt(i);
//         }
//         if(reverse.equals(value)){
//             System.out.println(value +" it's a Palindrome");
//         }else{
//             System.out.println("It is Not a Palindrome");
//         }

//     }
// }



/*Write a Java program to create an abstract class named Solid that contains two integers and an empty method named printVolume(). Overload the method printVolume() to calculate the volume of:
• Cube
• Cuboid
*/

// abstract class Solid{
//     int a ;
//     int b;
    
//     abstract void printvolume();
// }

// class Cube extends Solid{

//     void printvolume(){
//         System.out.println("Volume of cube is ->"+ a*a*a);
//     }
// }

// class Cuboid extends Solid{
//     int c;

//     Cuboid(int a,int b,int c){
//         this.a = a;
//         this.b = b;
//         this.c = c;
//     }
//     void printvolume(){
//         int volume = a*b*c;
//         System.out.println("Volume of Cuboid is -> "+ volume);
//     }

// }
// class First{
//     public static void main(String args[]){
//         Cube obj1 = new Cube();
//         obj1.a = 4;
//         obj1.printvolume();

//         Cuboid obj2 = new Cuboid(4,5,6);
//         obj2.printvolume();
//     }
// }




/*
21. Write a Java program to process the string "Programming is fun and powerful!".
Perform the following operations:
    1. Convert the string to uppercase.
    2. Replace the word "powerful" with "creative".
    3. Split the sentence into words and display each word on a new line.
    4. Reverse the entire string and print it.
*/

// class First{
//     public static void main(String args[]){

//         String str = "Programming is fun and powerful!";
//         int len = str.length();

//         String to_upper = str.toUpperCase();
//         System.out.println("Original -> "+ str);
//         System.out.println("UpperCase -> "+ to_upper);



//         String rep_str = str.replace("powerful", "creative");
//         System.out.println(" Replace -> "+rep_str);



//         String word = "";
//         for(int i = 0;i < len;++i){
//             char c = str.charAt(i);

//             if(c != ' '){
//                 word += c;
//             }else{
//                 System.out.println(word);
//                 word = "";
//             }
//         }
//         if (!word.isEmpty()) {
//             System.out.println(word);
//         }
        
//         String reversed = "";

//         for(int i = len-1;i >= 0;--i){
//             reversed += str.charAt(i);
//         }
//         System.out.println(reversed);

//     }
// }



//Write a Java program to print a string in reverse order without using any pre-defined string function. For eg print FLAT as TALF.

class First{
    
}