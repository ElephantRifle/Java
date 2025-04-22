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

class Animal{
    void speaks(){
        System.out.println("Animal Makes a Sound.");
    }
    void eats(){
        System.out.println("Animal Eats Food.");
    }
}

class Dog extends Animal{
    void speaks(){
        System.out.println("Dog Barks..");
    }
    void eats(){
        System.out.println("Dog Eats Eags..");
    }
}

class Exam{
    public static void main (String args[]){
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println("====  Animal  ====");
        animal.speaks();
        animal.eats();

        System.out.println("====  Dog  ====");
        dog.speaks();
        dog.eats();

    }
}