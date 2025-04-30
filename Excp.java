                                        //EXCEPTION HANDLING :- to handle RUN-TIME errors

// Following are few commonly occurring exceptions in java:
// 1) Null pointer exception
// 2) Arithmetic Exception                 :- exception class => "ArithmeticException"               {built-in exception type}
// 3) Array Index out of Bound exception   :- exception class => "ArrayIndexOutOfBoundsException"    {built-in exception type}
// 4) Illegal Argument Exception
// 5) Number Format Exception
// 6) IO exception :- input output exception used in file handling
// 7) other exceptions                     :- exception class => "Exception"                         {built-in exception type}




                                                //TRY-CATCH
/*
import java.util.Scanner;
public class Excp{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = 6000;
        int b = s.nextInt();      //if we give zero it will fall to catch else it will fall to try...

// Without Try:
    // int c = a / b;
    // System.out.println("The result is " + c);


// With Try:
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {                                                //exception is a class and we have passed 'e' object of exception class to catch method
            System.out.print("We failed to divide. Reason:- ");
            System.out.println(e);                                         //'e'  object of exception class stores the detail of exception/run-time error
        }
        System.out.println("End of the program");
    }
}
*/




                                        //Handling Specific Exceptions with TRY-CATCH
/*
import java.util.Scanner;
public class Excp{
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/number);
        }
        catch (ArithmeticException e){                                          //when divided by 0
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){                               //wrong index number entered
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){                                                //this covers all exceptions like bina specific exception diye sirf issi ke help se saare exceptions ko catch kiya ja skta h...
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}
*/



                                        //Nested TRY-CATCH
    //Using Boolean we will take user input and run the code in cycle until no exception found...
/*                    
import java.util.Scanner;

public class Excp{
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            int d = sc.nextInt();
            try {
                System.out.println("value at desired index: " + marks[ind]);
                try {
                    System.out.println("division: " + marks[ind]/d);
                    flag = false;                     //loop will be terminated when boolean get false means only when if both try get passed means when no exception catched
                } 
                catch (ArithmeticException e) {
                    System.out.print("ArithmeticException occured! --> ");
                    System.out.println(e);
                    System.out.println("Exception in level 2");
                }
            }
             
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 1");
            }

            catch (Exception e) {
                System.out.println("Other Exception");
                System.out.println(e);
            }
        }
        System.out.println("Thanks for using this program");
    }
}
*/



                                    //User Defined Exception Class:- String toString(),    void printStackTrace(),   String getMessage()
/*
import java.util.Scanner;

class MyException extends Exception{                            //Making own exception class by inheriting built-in exception class
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am getMessage()";         //will call getMessage of super(parent exception class) so if we will give any message to print in "throw new ArithmeticException();" then it will print that message else will give null
        //return "I am getMessage()";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}

public class Excp{
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try{
                //throw new MyException();                                  //check outputs of this by uncommenting it will run functions made above in myException class
                //throw new MyException("This is an exception");            // NOT WORKING USE CONSTRUCTOR METHOD INSTEAD (see Q solved below somewhere in notes)
                //throw new ArithmeticException();                          // if we don't give any message in this then "NULL" will be returned

                throw new ArithmeticException("This is an exception");       //will run functions(getMessage & toString) of ArithmeticException class which is builtin 
            }
            catch (Exception e){
                System.out.println(e.getMessage());     //will just print the message given or else give null if no message given
                System.out.println(e.toString());       //firstly will give the name of exception class and then print message
                System.out.println(e);                  //will give toString() method output
                e.printStackTrace();                    //firstly will give toString() output and then will give "at which line the error/exception caused"
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
*/



                            // Q :- Making Constructor in Exception class, will be used instead of getMessage()
/*                                         
import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

public class Excp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        try{
            if(str.length()<5){
                throw new InvalidUsernameException("Invalid Username: Username must be at least 5 characters long");
            }
            int flag=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    flag=1;
                }
            }
            if(flag==1){
                throw new InvalidUsernameException("Invalid Username: Username cannot contain spaces");
            }
        }
        catch(InvalidUsernameException e){
            System.out.println(e.getMessage());
        }
    }
}
*/




                                                    //THROW & THROWS
/*
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class Excp{
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        // Made By Harry
        int result = a/b;
        return result;
    }

    
    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
        try{
//            int c = divide(6, 0);
//            System.out.println(c);
            double ar = area(-2);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
*/                        



                                                //Finally Block
/*
public class Excp{
    public static int greet(){
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);

        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        try{
            System.out.println(50/3);
        }
        finally {
            System.out.println("Yes this is finally");
        }
    }
}
*/





                                                //Q on EXCEPTION HANDLING
/*
import java.util.Scanner;
public class Excp{

                // public static void validate(int n) throws IllegalArgumentException{
                //     if(n<0){
                //         throw new IllegalArgumentException();
                //     }
                // }

                // public static void IndexCheck(int n, int m) throws ArrayIndexOutOfBoundsException{
                //     if(m>n || m<0){
                //         throw new ArrayIndexOutOfBoundsException();
                //     }
                // }                


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        try{
            int n = s.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("Array size must be positive.");
            }

            try{
                int[] arr = new int[n];

                for(int i=0; i<n; i++){
                    arr[i] = s.nextInt();
                }

                int m = s.nextInt();
                if(m>n || m<0){
                    try{
                        throw new ArrayIndexOutOfBoundsException();
                        //throw new ArrayIndexOutOfBoundsException("Array Index Out Of Bound.");     //to use getMessage()
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Array Index Out Of Bound.");
                        //System.out.println(e.getMessage);                                       //to be used when we have passed some message as argument in above exception
                    }
                }
                else{
                    System.out.println("ANS:" + arr[m]);
                }
            }
            catch(Exception e){
                System.out.println("Invalid Array Elements");
            }   
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
*/


 

                                        // Q on Exception Handling 
/*
// You are using Java
import java.util.Scanner;
class InputMismatchException extends Exception{
    public String getMessage(){
        return super.getMessage();
    }
}
public class Excp{
    public static void isArmstrongNumber(int n){
        int temp1 = n;
        int temp2 = n;
        int count = 0;
        double sum = 0;
        while(temp1 != 0){
            count++;
            temp1 = temp1/10;
        }
        while(temp2 != 0){
            int r = temp2 % 10;
            sum = sum + Math.pow(r,count);
            temp2 = temp2/10;
        }
        if(sum==n){
            System.out.println(n+ " is Armstrong number.");
        }
        else{
            System.out.println(n+ " is not Armstrong number.");
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            int num = sc.nextInt();
            throw new InputMismatchException("Error: Input must be a valid integer.");
            try{
                if(num<0){
                    throw new IllegalArgumentException();
                }
                isArmstrongNumber(num);
            }
            catch(IllegalArgumentException e){
                System.out.println("Error: Input number must be non-negative");
            }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            //System.out.println("Error: Input must be a valid integer.");
        }
    }
}
*/
