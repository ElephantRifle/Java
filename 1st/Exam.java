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

//