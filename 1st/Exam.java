import java.util.Scanner;
//OVERLOADING
// class Overload{
//     int add(int a ,int b){
//        return(a + b);
//     }
//     double add(double a ,double b){
//         return(a + b);
//     }
//     int add(int a,int b,int c){
//         return(a + b +c);
//     }
   
// }

// public class Exam {
//     public static void main (String args[]){
//         Overload ol = new Overload();
//         int add = ol.add(12,4);
//         double addd = ol.add(12.45,4.35);
//         int adddd = ol.add(12,5,6);

//         System.out.println(add);
//         System.out.println(addd);
//         System.out.println(adddd);
//     }
// }

//OVERRIDING

// class Animal{
//     void speaks(){
//         System.out.println("Animal Makes a Sound.");
//     }
//     void eats(){
//         System.out.println("Animal Eats Food.");
//     }
// }

// class Dog extends Animal{
//     void speaks(){
//         System.out.println("Dog Barks..");
//     }
//     void eats(){
//         System.out.println("Dog Eats Eags..");
//     }
// }

// class Exam{
//     public static void main (String args[]){
//         Animal animal = new Animal();
//         Dog dog = new Dog();

//         System.out.println("====  Animal  ====");
//         animal.speaks();
//         animal.eats();

//         System.out.println("====  Dog  ====");
//         dog.speaks();
//         dog.eats();

//     }
// }


//POLYMORPHISM

// class Animal{
//     void speaks(){
//         System.out.println("Animal Speaks..");
//     }
//     //METHOD OVERLOADING
//     void eats(){
//         System.out.println("Animal Eats..");
//     }
//     void eats(String  a){
//         System.out.println("Animal Eats "+ a);
//     }
// }
// class Dog extends Animal{
//     @Override
//     //OVERRIDING
//     void speaks(){
//         System.out.println("Dog Barks..");
//     }
// }
// class Exam {
//     public static void main (String args[]){
//         Animal a = new Animal();
//         Dog b = new Dog();
//         a.speaks();
//         a.eats();
//         a.eats("Grass");

//         b.speaks();

//     }
// }

//INHERITANCE(SINGLE INHERITANCE)

// class Animal{
//     void speaks(){
//         System.out.println("Animal Speaks..");
//     }
// }
// class Dog extends Animal{
//     void eats(){
//         System.out.println("Meat..");
//     }
// }

// class Exam{
//     public static void main (String args[]){

//         Animal a = new Animal();
//         Dog b = new Dog();

//         a.speaks();
//         b.eats();
//     }
// }

//



//MULTILEVEL INHERITANCE


//cout is overriding you can choose diff name for each class
// class A{
//     void cout(){
//         System.out.println("Grand Parent Class.");
//     }
// }
// class B extends A{
//     void cout(){
//         System.out.println("Parent Class");
//     }
// }
// class C extends B{
//     void cout(){
//         System.out.println("Child Class");
//     }
// }

// class Exam{
//     public static void main(String args[]){
//         A a = new A();
//         B b = new B();
//         C c = new C();

//         a.cout();
//         b.cout();
//         c.cout();
//     }   
// }    

// HIERARCHICAL INHERITANCE

// class Parent{
//     void p(){
//         System.out.println("Parent Class");
//     }
// }
// class Child extends Parent{
//     void c(){
//         System.out.println("First Child Class ");
//     }
// }
// class Child_2 extends Parent{
//     void c_2(){
//         System.out.println("Second Child Class");
//     }
// }

// class Exam{
//     public static void main(String args[]){
//         Parent a = new Parent();
//         Child b = new Child();
//         Child_2 c = new Child_2();
        
//         a.p();
//         b.c();
//         c.c_2();
//     }
// }

//===============================================================
//ABSTRACT CLASS 
//===============================================================

// abstract class Animal{ //Abstract class
//     abstract void eats();//Must provide abtract before void

//     void sound(){
//         System.out.println("Animal makes a sound");
//     }
//     Animal(){//constructor called first
//         System.out.println("Animal constructor is called..");
//     }
//     int a = 12;
    
// }
// class Dog extends Animal{
//     void eats(){
//         System.out.println("Dog Barks");
//     }
//     void sound(){
//         // super.sound();//To call and print sound in abstract class
//         System.out.println("Barks..");
//     }
//     Dog(){ // constructor called first
//         System.out.println("Constructor called for Dog");
//         System.out.println(a+2);//This is only possible in Abstract 
//     }
// }
// class Exam{
//     public static void main(String args[]){
//         Animal obj1 = new Dog(); //can't create a obj of abstract class so Dog
//         obj1.sound();
//         obj1.eats();
//         System.out.println(obj1.a);//We need obj to print a in main class
        
//     }
// }


//===============================================================
//INTERFACE 
//===============================================================

// interface Animal{
//     void eats();

//     default void sound(){
//         System.out.println("Animal makes sound");
//     }
    
// }
// class Dog implements Animal{
//     public void eats(){
//         System.out.println("Dog eats..");
//     }
//     public void sound(){
//         System.out.println("Dog Barks..");
//     }
// }
// class Exam{
//     public static void main(String args[]){
//         Animal obj1 = new Dog();
//         obj1.eats();
//         obj1.sound();
//     }
// }

//MULTIPLE INHERITANCE 

// interface Fly{
//     void flyies();
//     int a = 100;//public static final variable
// }
// interface Swim{
//     void swims();
// }
// class Duck implements Fly,Swim{ //This is not possible in Abstract class
//     public void flyies(){
//         System.out.println("Duck can fly");
//     }
//     public void swims(){
//         System.out.println("Duck can swim");
//         System.out.println(a);
        
//     }
   
// }

// class Exam{
//     public static void main(String args[]){
//         Fly obj1 = new Duck();
//         Swim obj2 = new Duck();
//         obj1.flyies();
//         obj2.swims();

//         System.out.println(Fly.a);//can print a from anywhere directly without obj
//     }
// }


//==============================================================
//String
//==============================================================
// class Exam{
//     public static void main (String args[]){
//         String s1 = "Hello";
//         String s2 = s1;

//         s1 =  s1.concat("World");
//         System.out.println(s1);
//         System.out.println(s2);
      
//     }
// }



// class Exam{
//     public static void main(String args[]){
//         String s1 = new String("Hello");
//         String s2 = new String ("World");
//         System.out.println(s1);
//         System.out.println(s2);
//     }
// }

//=============================================================
//Wrapper Class
//=============================================================
// class Exam{
//     public static void main(String args[]){
//         int a ;
//         a = 234;
//         Integer b; //Integer is wrapper class ,b is reference
//         b = a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

//Autoboxing
/*WHY b == c is true?
 * When you assign b = 12; and c = 12;, Java doesn't create two different Integer objects for both b and c. Instead, it uses the cached Integer object with the value 12 that already exists in the heap.

This means that both b and c point to the exact same object in memory, and that's why the == operator checks that they refer to the same memory location and returns true.

THIS WILL ONLY BE TRUE IF VALUES RANGE FROM -128 to 127
(like when values fall within the cached range for wrapper classes)
 */
// class Exam{
//     public static void main(String args[]){
//         int a = 12;
//         Integer b = a;
//         Integer c = 12;

//         System.out.println(b == c);      //True
//         System.out.println(b.equals(c)); //True
//     }
// }

// class Exam{
//     public static void main(String args[]){
//         int a = 300;
//         Integer b = a;
//         Integer c = 300;

//         System.out.println(b == c);     //False
//         System.out.println(b.equals(c));//True
//     }
// }

//Unboxing 

// class Exam{
//     public static void main(String args[]){
//         Integer a = 12;  //Wrapper class object has 12 
//         Double z = 50.6; //Wrapper class object has 50.6

//         int b = a;  // Unboxing Wrapper class into primitive class int
//         double y = z; //// Unboxing Wrapper class into primitive class dou

//         System.out.println(b);
//         System.out.println(y);
//     }
// }

//===========================================================
//Reference Type
//===========================================================
// class Car{
//     String name;
// }
// class Exam{
//     public static void main(String args[]){
//         String s1 = "Hello"; //s1 a ref to object in heap that has Hello
//         Car obj1 = new Car();//obj1 ref to obj in heap that has Car
//         obj1.name = "Honda";
//         System.out.println(obj1.name);
//     }
// }

//Object Type
// class Book{
//     String name;
// }
// Class Toy{

// } 
// class Exam{
//     public static void main(String args[]){
//         Object box1 = new Book();
//         Object box2 = new Toy();
//         Object box3 = new Laptop();

//         Book mybook = (Book)box1;
//         mybook.name("Harry Porter");

//         Toy mytoy = (Toy)box2;

//     }
// }

//===============================================================
//Constructor
//===============================================================
//Default Constructor
// class Dog{
//     String name;
//     int age;
//     Dog(){
//         System.out.println("Dog eats");
//         name = "Pari";
//         age = 12;
//     }
//     void display(){
//         System.out.println("Name " + name + ", Age" + age);
//     }
    
// }
// class Exam{
//     public static void main(String args[]){
//         Dog obj1 = new Dog();
//         obj1.display();
//     }
// }

//Parameterized Constructor

// class Person{
//     String name;
//     int age = 23;
//     Person(String name,int age){
//         System.out.println("Name: "+name+", Age:"+age);
//     }
// }
// class Exam{
//     public static void main(String args[]){
//         Person p = new Person("paritosh",23);
//     }
// }

//Constructor Overloading

// class Person{
//     Person(){
//         System.out.println("Empty");
//     }
//     Person(int a,int b){
//         System.out.println("a="+a+" b="+b);
//     }
//     Person(int a,int b,int c){
//         System.out.println("a = "+a+" b = "+b+" c = "+c);
//     }
// }
// class Exam{
//     public static void main(String args[]){
//         Person p = new Person();
//         Person p1 = new Person(12,4);
//         Person p2 = new Person(3,4,5);
//     }
// }

//============================================================

// class Person{
//     String name;
//     int age;
//     Person(){
//         this.name = "Empty";
//         this.age = 0;
//     }
//     Person(String name){
//         this.name = name;
//     }
//     Person(String name,int age){
//         this.name = name;
//         this.age = age;
//     }
//     void display(){
//         System.out.println("Name = "+name + "  Age = " + age);
//     }

// }
// class Exam{
//     public static void main(String args[]){
//         Person p = new Person();
//         Person p1 = new Person("Rudra");
//         Person p2 = new Person("Priya",23);
//         p.display();
//         p1.display();
//         p2.display();

//     }
// }

//

//==================================================================
// Exception
// ==================================================================
// Single Catch 
// class Exam{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//         try{
//             System.out.print("->");
//             int num = sc.nextInt();
            
//             System.out.println("Result : "+(10/num));
//         }catch(ArithmeticException a){
//             System.out.println("Error Division by zero");
//         }finally{
//             System.out.println("End of Program");
//             sc.close();
//         }
//     }
// }

// Multiple Catch

// class Exam {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         try{
//             System.out.print("->");
//             int num = sc.nextInt();
//             System.out.println("Result: "+100/num);

//         }catch(ArithmeticException a){
//             System.out.println("Error:Division by zero");

//         }catch(java.util.InputMismatchException b){
//             System.out.println("Error:Invalid input");

//         }finally{
//             System.out.println("End of Program");
//             sc.close();
//         }
//     }
// }



// User Defined Exception

// class InvalidAgeException extends Exception{
//     public InvalidAgeException(String message){
//         super(message);
//     }
// }

// class Exam{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[5];

//         for(int i = 0;i < 5;++i){
//             try{
//                 System.out.print("Enter age for " +(i+1)+" person-> ");
//                 int age = sc.nextInt();

//                 if(age <= 0 || age >= 101){
//                     throw new InvalidAgeException("Invalid age "+ age);
//                 }
//                 arr[i] = age;
//             }catch(InvalidAgeException a){
//                 System.out.println(a.getMessage());
//                 i--;
//             }catch(Exception a){
//                 System.out.println("Invalid Input");
//                 sc.next();
//                 i--;
//             }
//         }
//         System.out.println("Age's are: ");
//         for(int i = 0;i < 5;++i){
//             System.out.print(arr[i]+ " ");
//         }
//         sc.close();
//     }
// }

//===========================================================================
//Multi - threading
//===========================================================================

// class Mythread extends Thread{
//     public void run(){
//         System.out.println("Thread Created");
//     }
// }
// class Exam{
//     public static void main(String args[]){
//         Mythread t1 = new Mythread();
//         t1.start();
//         t1.run();
//     }
// }

//Runnable Interface

// class Myclass implements Runnable{
//     public void run(){
//         System.out.println("Runnable implemented");
//     }
// }
// class Exam{
//     public static void main(String args[]){
//         Myclass c1 = new Myclass();
//         Thread t1 = new Thread(c1);
//         t1.start();
//     }
// }

//===============================================================
//Abstraction
//===============================================================

// abstract class Animal{
//     abstract void sound(); // abstract is essential else its not abstraction
// }
// class Dog extends Animal{
//     void sound(){
//         System.out.println("Dog woof woof");
//     }
// }
// class Exam{
//     public static void main(String args[]){
//         Animal a = new Dog();
//         a.sound();
//     }
// }

//Encapsulation

// class encap{
//     private double balance;

//     public double getbalance(){
//         return balance;
//     }
//     public void deposit(double depo){
//         this.balance = depo + balance;
//     }
// }

// class Exam{
//     public static void main(String args[]){
//         encap a = new encap();
//         a.deposit(12000);
//         a.getbalance();
//     }
// }


//---------------------------------------------------------
//Collection Framework

import java.util.ArrayList;
//LIST -Ordered Allows Duplicate elements ,indexed
   //ArrayList
   //LinkedList
   //Vector

// public class Exam{
//    public static void main(String args[]){
//       ArrayList<Integer> list = new ArrayList<>();
//       list.add(1);//This will add element at the end
//       list.add(2);
//       list.add(3);
//       list.add(4);
//       list.add(1,50);
//       System.out.println(list);
//       //Add One List to Another
//       ArrayList<Integer>newList = new ArrayList<>();
//       newList.add(200);
//       newList.add(300);
//       list.addAll(newList);
//       System.out.println(list);
      
//       //To get value at any Index
//       System.out.println(list.get(1));
      
//       //Remove elemet at that Index
//       list.remove(2);
//       System.out.println(list);
      
//       //To clear Entire List 
//       // list.clear();

//       //To Update the value of any Index
//       list.set(0,500);
//       System.out.println(list);
//       System.out.println(list.contains(500));
//    }
// }   


//----------------------------------------
//Stack
// import java.util.Stack;
// public class Exam{
//    public static void main(String args[]){
//       Stack <String> animals = new Stack<>();
//       animals.push("Lion");
//       animals.push("Tiger");
//       animals.push("Elephant");

//       System.out.println("Stack->"+animals);
//       System.out.println(animals.peek());//To look the last 
      
//       animals.pop();
//       System.out.println("Stack->"+animals);

//    }
// }
//---------------------------------------------------
//Queue
// import java.util.Queue;
// import java.util.LinkedList;
// class Exam{
//    public static void main(String args[]){
//       Queue<Integer> queue = new LinkedList<>();
//       queue.offer(12); // To add ELement in Queue
//       queue.offer(10);
//       queue.offer(15);

//       System.out.println(queue);
//       System.out.println(queue.poll());//To Remove Elements
//       System.out.println(queue);
//       System.out.println(queue.peek());//Next Element to pop

//    }
// }
//------------------------------------------------------------

//SET:
     //HashSet
     //TreeSet
     //LinkedHashSet
//No Duplicate Elements Allowed
/*Not Ordered means elements are being stored in random place
WHY? cuz Internally hashing is going on,set create hash of
each Elements and that hash if being pushed in the bag.Each Elements hash is unique,it check when adding the value if there is a duplicate hash presnt then it won't allow that value to be stored

*/
// import java.util.Set;
// import java.util.HashSet;

// public class Exam{
//    public static void main (String args[]){
//       Set<Integer> set = new HashSet<>();
//       set.add(10);
//       set.add(20);
//       set.add(30);
//       set.add(40);
//       set.add(50);
      
//       System.out.println(set);
//       set.remove(1);
//       System.out.println(set);
//       System.out.println(set.contains(22));
//       System.out.println(set.isEmpty());
//       System.out.println(set.size());
//       set.clear();
//    }
// }

//LinkedHashSet ->its is ordered everting else if same as //Hashset

// import java.util.Set;
// import java.util.LinkedHashSet;

// public class Exam{
//    public static void main (String args[]){
//       Set<Integer> set = new LinkedHashSet<>();
//       set.add(10);
//       set.add(20);
//       set.add(30);
//       set.add(40);
//       set.add(50);
      
//       System.out.println(set);
//       set.remove(1);
//       System.out.println(set);
//       System.out.println(set.contains(22));
//       System.out.println(set.isEmpty());
//       System.out.println(set.size());
//       set.clear();
//    }
// }

//Tree Set->behind the scene sorts the elements (BST)

// import java.util.Set;
// import java.util.TreeSet;

// public class Exam{
//    public static void main (String args[]){
//       Set<Integer> set = new TreeSet<>();
//       set.add(10);
//       set.add(20);
//       set.add(30);
//       set.add(40);
//       set.add(50);
      
//       System.out.println(set);
//       set.remove(10);
//       System.out.println(set);
//       System.out.println(set.contains(22));
//       System.out.println(set.isEmpty());
//       System.out.println(set.size());
//       set.clear();
//    }
// }

//------------------------------------------------------
//MAP:
    //HashMap
    //TreeMap
    //LinkedHashMap
//Maps are used to store key value pair
//Keys should be unique or else it will override
//Radomly Ordered 

// import java.util.HashMap;
// import java.util.Map;
// public class Exam{
//    public static void main(String args[]){
//       Map<String,Integer> numbers = new HashMap<>();
//       //CAN OVERRIDE VALUES IF SAME KEY IS USED
//       numbers.put("One",1);// output  One=1
//       numbers.put("Two",2);
//       numbers.put("Three",3);
//       System.out.println(numbers);
      
//       System.out.println(numbers.containsValue(3));
//       //NO OVERRIDE OF KEYS IF USED putifAbsent
//       numbers.putIfAbsent("Two",23);
//       System.out.println(numbers);

//       //TO ITERATE 
//       for(String key:numbers.keySet()){
//          System.out.println(key);
//       }
//       numbers.clear();
//    }
// }

//--------------------------------------------
//TreeMap - will sort the keys using alphabetical order 

// import java.util.TreeMap;
// import java.util.Map;
// public class Exam{
//    public static void main(String args[]){
//       Map<String,Integer> numbers = new TreeMap<>();
//       //CAN OVERRIDE VALUES IF SAME KEY IS USED
//       numbers.put("One",1);// output  One=1
//       numbers.put("Two",2);
//       numbers.put("Three",3);
//       System.out.println(numbers);
      
//       System.out.println(numbers.containsValue(3));
//       //NO OVERRIDE OF KEYS IF USED putifAbsent
//       numbers.putIfAbsent("Two",23);
//       System.out.println(numbers);
//       //TO REMOVE VALUSE
//       numbers.remove("three");
//       //TO ITERATE 
//       for(String key:numbers.keySet()){
//          System.out.println(key);
//       }
//       numbers.clear();
//    }
// }

