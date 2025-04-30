                                            // JAVA NOTES by Milinx~
/*
class Basics
{
    public static void main(String []args)
    {
        System.out.print("Hello");
        System.out.println(" world");                   //println let the next upcoming statements to be printed into next lines
        System.out.println("My First Program");

        //sout -- shortcut for system.out.println
        // print statement will be displaced on the same line while println statement will give a space of new line.
    }
};
*/



                                            //PRIMITIVE DATATYPES
/*
class Basics
{
    public static void main(String []args)
    {
        int a=10;
        System.out.println(a);

        long b;
        b=1821378974912256200L;
        System.out.println(b);

        float c=0.5f;
        System.out.println(c);

        float d=0.5F;             //same as above f&F both same only
        System.out.println(c);
    }
}
*/



                                        //CASTING
/*
public class Basics
{
    public static void main(String[] args)
    {
                    //implicit casting :- int to float (automatic)
        float f = 10.5F;
        float fint = f + 18; 
        System.out.println(fint);

                    //explicit casting :- float to int
        int i = 100;
        int intf = i + (int)18.99;  //.99 will be truncated
        System.out.println(intf);
    }
}
*/


                                            //CONSTANTS
/*                       
class Basics{
    public static void main(String[] args)
    {
        final float PI = 3.14F;                 //using the key "final" to declare it const now it's value is immutable
        //PI = 3.15F;  can't be change now
        System.out.println(PI);

    }
}
*/


                                            //OPERATORS
/*                   
class Basics{
    public static void main(String []args)
    {
        int a = 5;
        int b = 2;
        float c = (float)(a/b);
        System.out.println(c);      //won't work like this it will truncate the values after decimal place

        float d = 5;
        float e = 2;
        float f = d/e;
        System.out.println(f);
        e =+ 8;     //(e = +8)
        System.out.println(e);
        e = 2;
        e += 8;   //(e = e+8)
        System.out.println(e);
        e =- 8;   //(e = -8)
        System.out.println(e);
    }
}
*/
                                



                               //MATH class in JAVA
/*                               
public class Basics{
    public static void main(String []args)
    {
        int a = 9;
        int b = 6;
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(10,a));         //works for comparision of just 2 values
        System.out.println(Math.max(10.5,10.6));

                   //Random function:- gives any random no. b/w 0.1 to 1.0
        System.out.println(Math.random());
        System.out.println(a+Math.random());           
        System.out.println((int)(Math.random()*1000));
    }
}   
*/             




                                //taking user input :- SCANNER CLASS
/*                                
import java.util.Scanner;

public class Basics{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
           
                                        //string input

        System.out.print("Enter your name: ");    //single word
        String name = s.next();
        System.out.println("and The Name is " + name);
        
        s.nextLine();  //without using this compiler can't read the upcoming s.nextLine.

        System.out.print("Enter her name: ");
        String name2 = s.nextLine();               //more than a word (to input sentence/line) 
        System.out.println(name2);

                                    //other datatypes input

        System.out.print("Enter your age: ");
        int age = s.nextInt();
        System.out.println("your age is: " + age);

        System.out.print("Enter your mobile number: ");
        long num = s.nextLong();
        System.out.println("Mob. no. - "+num);

        System.out.print("Enter your cgpa: ");
        float cgpa = s.nextFloat();
        System.out.println("CGPA: "+cgpa);

        System.out.print("Enter your CG: ");
        double cg = s.nextDouble();
        System.out.println("CG: "+cg);

        System.out.print("Gender: ");
        //char gender = s.nextChar();    there's no such method to read character 
        char gender = s.next().charAt(0);    //use this method to read char at desired index
        System.out.println("GENDER: "+gender);
    }
}
*/
    //NOTE:-
/*
1. either use s.next() only or use s.nextLine() only everytime if u r using both then u have to use s.nextLine after s.next() like in above example then only it will read the upcoming s.nextLine...
2. using s.next() everytime won't through any error
3. using s.nextLine() everytime won't through any error
4. using s.nextLine() 1st and the s.next() also won't through any error
5. but if u r using s.next() 1st and then s.nextLine() then it won't read the s.nextLine() to make it work we have to put s.nextLine() after the 1st s.next()...
*/





                                                 // Wrapper classes

// Primitive Data type  &  their Wrapper classes
//  int = Integer
//  char = Character     //there's no char datatype but there's Character wrapper class & char array
//  double = Double
//  String  (no data type only class exist)
//  Array   (no data type only class exist)   {imports Arrays class}
//  Scanner     {imports Scanner class}

/*
import java.util.Scanner;
public class Basics{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        double d = s.nextDouble();
        Double de = s.nextDouble();                     //Double is wrapper class for primitive data type double 
        //Integer in = new Integer(s.nextInt());       //this will work but generates warning as method is depricated means no longer in use
        Integer in = s.nextInt();                      //instead use this   (wrapper class for integer)
        
        System.out.println(i);
        System.out.println(d);
        System.out.println(de);
        System.out.println(in);

//boxing & autoboxing :- 
        int n = 9;
        Integer num = new Integer(n);    //boxing
        int n2 = 10;
        Integer num2 = n2;              //auto-boxing

        int n3 = num.getValue();       //converting to int primitive type from num object of class Integer
    }
}
*/
