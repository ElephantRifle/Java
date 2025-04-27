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

class Exam{
    public static void main(String args[]){
        Integer a = 12;  //Wrapper class object has 12 
        Double z = 50.6; //Wrapper class object has 50.6

        int b = a;  // Unboxing Wrapper class into primitive class int
        double y = z; //// Unboxing Wrapper class into primitive class dou

        System.out.println(b);
        System.out.println(y);
    }
}