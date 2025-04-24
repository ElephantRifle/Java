import java.util.Scanner;

//SINGLE EXCEPTION
class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            System.out.println("Result: " + (10 / number));
            
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero");
        }finally{
            System.out.println("End of program");
            scanner.close();
        }
    }
}

//MULTI EXCEPTION 
class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            System.out.println("Result: " + (10 / number));
            
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero");
        
        }catch(java.util.InputMismatchException e){
            System.out.println("Error: Invalid input,please enter a integer");            
        }finally{
            System.out.println("End of program");
            scanner.close();
        }
    }
}
