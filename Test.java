                                            // JAVA NOTES by Milinx~

/*
class Test
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
class Test
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



                                            //Non-primitive Datatypes
                            
                                //Strings
/*
class Test{
    public static void main(String []args)
    {
        String a= "MILIND";
        System.out.println(a);

        String b = new String("kumar");
        System.out.println(b);

        String c = a+" "+b;         //here space is used as string
        System.out.println(c);



                                    //METHODS in string

        System.out.println(c.length());            //length of string
        System.out.println(c.charAt(4));          //position
                    
                            //replace method replaces the character in new string but don't changes the original string
        String d = a.replace('D','x'); 
        System.out.println(a);
        System.out.println(d);
        System.out.println(a.replace('D','x'));

                               //substring
        System.out.println(c.substring(0,4));


                        // STRING MANIPULATION
        String name = "   Saharsh Ojha     ";

        String t=name.trim();        //remove white spaces from ending & begining    we can also use  strip() instead of trim()
        System.out.println(t);      // stripleading() :- begining space remove    striptrailing() :- end space remove

        String l= name.toLowerCase();
        System.out.println(l);

        String u=name.toUpperCase();
        System.out.println(u);

        
        //TO REPLACE A CHARACTER OR CHARACTERS

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rsh","pqr"));
        


        // TO CHECK THE STARTING AND ENDING CHARACTER

        boolean m= name.startsWith("S");  
        boolean n= name.endsWith(" ");  
        
        System.out.println(m);
        System.out.println(n);


        char q = name.charAt(8);
        System.out.println(q);

        int r = name.indexOf("a");
        System.out.println(r);
        
    }
}
*/



                                //convert string into character array and store it
/*                      
import java.util.Scanner;

public class Test{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        //System.out.println(a);

        // Convert the string to an array of characters
        char[] b = a.toCharArray();

        // int count = 0;
        // for(int i=0; i<10; i++)
        // {                                         //same thing is done using for-in loop below
        //     System.out.println(b[i]);
        //     count++;
        // }
        // System.out.println(count);
        
       int count = 0;
        // Print the array elements
        for (char c : b) 
        {
            System.out.println(c);
            count++;
        }
        System.out.println(count);


}
}
*/


                                //convert string into character array without storing
/* 
import java.util.Scanner;

public class mili
{
    public static void main(String[] args)
    {
        String str = "abcd";
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) 
        {
            arr[i] = str.charAt(i);
        }   
    }
}
*/



                                //taking string as an input and converting it into integer array as no of elements in array not available
/*
import java.util.Scanner;

class mili{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter space-separated numbers: ");
        String input = s.nextLine();
        int target = s.nextInt();

        String str[] = input.split(" ");             // converting string into string array having each elements as characters not string

        int[] numbers = new int[str.length];         
        for (int i = 0; i < str.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);      // converted/parsed each element of string array to integer and stored in new array 
        }

        for(int i=0; i<numbers.length-1; i++)
        {
            for(int j=i+1; j<numbers.length; j++)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    System.out.println("["+i+","+j+"]");
                }
            }        
        }
    }   
}
*/



                                            //String Builder & String Buffer

//Normal String Operations :- immutable
/*                                    
public class Test{
    public static void main(String[] args){
        String name = "Milind";
        name = "kumar " + name;
        System.out.println("hello! "+name); 

        String s1 = "milind";
        String s2 = "milind";

        System.out.println(s1==s2);
    }
}
*/


//String Buffer :- Mutable
/*
public class Test{
    public static void main(String[] args){
        StringBuffer sbb = new StringBuffer();
        StringBuffer sb = new StringBuffer("Milind");

        System.out.println(sbb.capacity());         //give default capacity of 16 buffers
        System.out.println(sb.capacity());

        System.out.println(sbb.length());
        System.out.println(sb.length());

        //sb.prepend("Kumar ");                    //Doesn't work
        sb.append(" Singh");
        sb.insert(0, "Kumar ");                 //insert at desired index
        sb.deleteCharAt(2);
        //sb.setLength(10);                     //will decrease the string buffer to length of 10 
        //sb.ensureCapacity(50);                //will set minimum capacity of 50
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        
    }
}
*/



//String Builder :- Mutable
/*
import java.util.*;
public class Test{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Milind");
        System.out.println(sb);

        //char at index i
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(5, 'x');           //for character literal use ('') for string use ("")
        System.out.println(sb);

        //insert
        sb.insert(6,"genix");           //with add at 6th index means after 5th index(last word)
        System.out.println(sb);

        //delete
        sb.deleteCharAt(6);
        System.out.println(sb);
        sb.delete(6,100);
        System.out.println(sb);

        //append
        sb.append(' ');
        sb.append('K');
        System.out.println(sb);

        //Reverse
        sb.reverse();
        System.out.println(sb);
    }
}
*/


                                        //Reversing String without String Builder
/*                                 
public class Test{
    public static void main(String[] args){
        String str = "hello";
        char arr[] = new char[str.length()];
        //arr = str.split();    //won't work for lettters/ char array this we can use to split into words to form string array
        arr = str.toCharArray();
        for(int i=(str.length()-1); i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
*/



                                        //Reversing String using String builder(without using function)
/*
import java.util.*;                            
public class Test{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Milind");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i; //6-1-0=5 => M will go at index 5 means at last

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}
*/




                                //Array 
/*                                
class Test
{
    public static void main(String []args)
    {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95; 

        System.out.println(marks);    //won't print the array have to use loops to print array 
        
        for(int i=0; i<3; i++)
        {
            System.out.println(marks[i]);
        }
    }
}
*/


                                //Boolean Array
/* 
class Test
{
    public static void main(String []args)
    {
        boolean[] marks = new boolean[3];
        System.out.println(marks[0]);         //gives false as false denotes 0 and uninitialised value in java are saved as null/0
        
    }
} 
*/         



                                    //Properties of Array
/*                                  
import java.util.Arrays;

public class Test
{
    public static void main(String []args)
    {
        int[] marks = new int[5];
        marks[0]= 97;
        marks[1]= 98;
        marks[2]= 62;
    


                            //length
        System.out.println("the length of marks is: " + marks.length);       //here length is not a function it's a property so use "marks.length" not "length()"

                            //sorting
        Arrays.sort(marks);                    //here sort is function of java in java.util.Arrays package...
        for(int i=0; i<5; i++)
        {
            System.out.println(marks[i]);
        }


        //no need to use "new" keyword when u know the elements
        int[] num = {1,2,3,4};
        for(int j=0; j<4; j++)
        {
            System.out.println(num[j]);
        }

        //2D arrays
        int[][] scores = {{100,18,7},    //1st stud scores of 3 matches (row 1)
                          {1,10,11}};   //2nd std scores of 3 matches (row 2)
        System.out.println("score of 1st player's 1st match is: " + scores[0][0]);   //row-column order
        System.out.println("score of 2nd player's 1st match is: " + scores[1][0]);
        System.out.println("score of 1st player's 2nd match is: " + scores[0][1]);
        System.out.println("score of 2nd player's 2nd match is: " + scores[1][1]);
        System.out.println("score of 1st player's 3rd match is: " + scores[0][2]);
        System.out.println("score of 2nd player's 3rd match is: " + scores[1][2]);


        // int [][] grade = {{10,12},{20,22}};
        // for(int k=0; k<2; k++)
        // {
        //     for(int m=0; k<2; m++)
        //     {
        //         System.out.println(grade[k][m]);
        //     }
        // }

    } 
}
*/



                                    //Casting
/*
public class Test
{
    public static void main(String[] args)
    {
                    //implicit casting :- float to int(automatic)
        float f = 10.5F;
        float fint = f + 18; 
        System.out.println(fint);

                    //explicit casting :- int to float
        int i = 100;
        int intf = i + (int)18.99;  //.99 will be truncated
        System.out.println(intf);
    }
}
*/


                       //constants
/*                       
class Test{
    public static void main(String[] args)
    {
        final float PI = 3.14F;      //using the key "final" to declare it const now it's value is immutable
        //PI = 3.15F;  can't be change now
        System.out.println(PI);

    }
}
*/


                   //operators
/*                   
class Test{
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
public class Test{
    public static void main(String []args)
    {
        int a = 9;
        int b = 6;
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(10,a));    //works for comparision of just 2 values
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

public class Test{
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
public class Test{
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



                                    //if-else
/*                                    
import java.util.Scanner;
public class Test{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ur age: ");
        int age = s.nextInt();
        if(age >= 18)
        {
            System.out.println("U can drive");
        }
        else if(age>12)
        {
            System.out.println("u can learn scooty");
        }
        else
        {
            System.out.println("get lost mf");
        }
    }
}         
*/                           



                                        //USING SWITCH CASE
/*
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int age=scn.nextInt();
        switch(age){
            case 18:
            System.err.println("eligible to vote");     //print the text in red color in some compiler apps
            break;
            case 4:
            System.out.println("you are a baby");
            break;
            default:
            System.out.println("not eligible");
        } 
    }
}
*/



                               //boolean
/*
class Test{
    public static void main(String[] args)
    {
        boolean isAdult = true;           //change it to false and see output result
        if(isAdult)
        {
            System.out.println("is adult");
        }
        else{
            System.out.println("is not adult");
        }
    }
}
*/
/* 
class Test{
    public static void main(String[] args)
    {
        boolean isAdult = true;           //change it to false and see output result
        if(!isAdult)
        {
            System.out.println("is adult");
        }
        else{
            System.out.println("is not adult");
        }
    }
}
*/



                                            //do while loop
/*
import java.util.Scanner;
class Test
{
    public static void main(String []args)
    {
        int num;
        do{
            System.out.print("enter the num: ");
            Scanner s = new Scanner(System.in);
            num = s.nextInt();
            System.out.println("the num u entered is: " + num);
        }while(num>=0);
        System.out.println("THE END");      //at the moment u enter any neg num it will display the num and get out of loop and print THE END
    }
}
*/

                   // doing above activity via while loop
/*
import java.util.Scanner;
public class Test{
    public static void main(String []args)
    {
        int num=0;
        while(num>=0)
        {
            if(num>=0)
            {
                System.out.print("enter the num: ");
                Scanner s = new Scanner(System.in);
                num = s.nextInt();
                System.out.println("the num u entered is: "+num);
            }
            else
            {
                System.out.println("neg numb can't be displayed...");
            }
        }
        System.out.println("THE END");
    }
}   
//doubt it should not print negative inputs 
*/



                                                    //FUNCTIONS IN JAVA
                                                    //RECURSION IN JAVA 

                    //factorial by recursion
/*
import java.util.Scanner;
public class Test{

    public static int sum(int x,int y){
        return x+y;
    }

    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int c=sum(4,6);
        System.out.println(c);
        int d=sc.nextInt();
        System.out.println(factorial(d));

    }  
}
*/

                                     //factorial by traverse
/*
import java.lang.*;
import java.util.Scanner;

public class mili{

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args)
    {
        System.out.print("enter the number: ");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int rem,n;
        n = num;
        int sum=0;

        while(n > 0)
        {
            rem = n%10;
            sum = sum + factorial(rem);
            n = n/10;  
        }
        
        if(sum == num)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }
    }
}
*/



                                //passing array as a argument of a function
/*                             
import java.io.*;

class Test{ 
	public static void function1(int[] array) { 
		System.out.println("The first element is: " + array[0]); 
	} 

	public static void function2(int[][] array) { 
		System.out.println("The first element is: " + array[0][0]); 
	} 

public static void main(String[] args) { 

		// creating a 1D and a 2D array 
		int[] oneDimensionalArray = { 1, 2, 3, 4, 5 }; 
		int[][] twoDimensionalArray = { { 10, 20, 30 }, 
										{ 40, 50, 60 }, 
										{ 70, 80, 90 } }; 
		
		// passing the 1D array to function 1 
		function1(oneDimensionalArray); 
		
		// passing the 2D array to function 2 
		function2(twoDimensionalArray); 
	} 
}
*/



                                       // Q :- Counting the occurance of letters in a word
/*
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char arr[] = str.toCharArray();
    
        for(int i=0; i<str.length(); i++){
            int count = 0;
            int flag = 0;
            for(int j=0; j<str.length(); j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            for(int k=i-1; k>=0; k--){
                if(arr[i]==arr[k]){
                    flag++;
                }
            }

            if(flag==0){
                System.out.println(arr[i] + " is occuring "+ count + " times.");
            }
        }
    }
}
*/




                                                                //oops in java
/*
class Student{
    String name;
    int age;

    Student(String n, int a){           //contracter created
        this.name = n;
        this.age = a;
    }

                                        // method overloading :- either parameters should be diff or return should be void for 1st method and some datatype for 2nd method
    public void getInfo(String name){
        System.out.println("Name is: "+ this.name);
    }

    public void getInfo(int age){
        System.out.println("Age is: "+ this.age);
    }

    public void getInfo(String name, int age){
        System.out.println("Name is: "+ this.name);
        System.out.println("Age is: "+ this.age);
    }
}

public class Test{
    public static void main(String[] args){
        Student s = new Student("Milind", 22);

        s.getInfo(28);        //will print age = 22 only not the input given
        s.getInfo(s.age);
        System.out.println();

        s.getInfo(s.name);
        s.getInfo("abhishek");  //will print name = "milind" only not the input given
        System.out.println();

        // s.getInfo(s.age, s.name);   This won't work
        s.getInfo(s.name, s.age);
    }
}
*/
//to do function overloading in compile time polymorphism either pass  different parameters/arguments or if functions r having same type of parameters then they should return diff values like one should be some data type and another should be void.



               




                                            //OBJECT ORIENTED PROGRAMMING
/*
class employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("my id is"+id);
        System.out.println("my name is"+name);

    }
}
public class Test{
    public static void main(String args[]){
        employee saharsh = new employee();
        saharsh.id=7;
        saharsh.name="ram";
        saharsh.printdetails();
    }
}
*/


/*
import java.util.Scanner;
class employee{
    int id;
    String name;
    Scanner sc=new Scanner(System.in);

    employee(int x,String y){
        id=x;
        name=y;
        System.out.println(id);
        System.out.println(name);
    }
    public employee(){

    };
    public void get(){
        id =sc.nextInt();
        name=sc.next();
        System.out.println(id);
        System.out.println(name);
    }  
}
public class Test{
    public static void main(String[] args){
        employee s=new employee(45,"saharsh");
        employee d=new employee();
        d.get();      
    }
}
*/



                                    // TAKING INPUTS INSIDE THE FUNCTION OF A CLASS 
/*
import java.util.Scanner;
class employee{  
    int id;
    String name;
    Scanner s=new Scanner(System.in);
    public void getdetails(){
        name=s.next();
        id=s.nextInt();
    }
    public void printdetails(){
        System.out.println("my id is"+id);
        System.out.println("my name is"+name);
    }
}
public class Test{
    public static void main(String args[]){
        employee saharsh=new employee();
        saharsh.getdetails();
        saharsh.printdetails();
    }
}
*/



                                                // DECLARING ACCESS MODIFIERS
/*                                                
import java.util.Scanner;
class employee{
    private int id;
    private String name;
    Scanner s=new Scanner(System.in);
    public void getdetails(){
        name=s.next();
        id=s.nextInt();
    }
    public void printdetails(){
        System.out.println("my id is"+id);
        System.out.println("my name is"+name);
    }
}
public class Test{
    public static void main(String args[]){
        employee saharsh=new employee();
        saharsh.getdetails();
        saharsh.printdetails();
    }
}
*/


/*
import java.util.Scanner;
class employee{
    private int id;
    private String name;
    Scanner s = new Scanner(System.in);

    public employee(){                 //constructor with no arguments
        name="ram";
        id=45;
    }
    public void printdetails(){
        System.out.println("my id is"+id);
        System.out.println("my name is"+name);
    }
}
public class first{
    public static void main(String args[]){
        employee saharsh = new employee();     //invokes automatically 
        saharsh.printdetails(); 
    }
}
*/


/*
import java.util.Scanner;
class employee{
    private int id;
    private String name;
    Scanner s=new Scanner(System.in);
    public employee(String x,int y){
        name=x;
        id=y;
    }
    public void printdetails(){
        System.out.println("my id is"+id);
        System.out.println("my name is"+name);

    }
}
public class Test{
    public static void main(String args[]){
        employee saharsh =new employee("ram",45);     
        saharsh.printdetails();
        
    }
}
*/



                                        //INHERITANCE IN JAVA
/*
class base1{
    base1(){
        System.out.println("i am a constructor of base1");
    } 
}
class derived1 extends base1{
    derived1(){
        System.err.println("i am the constructor of derived1 class");
    }
}
public class Test{
    public static void main(String args[]){
        derived1 d=new derived1();                    //constructors evokes automatically 
    }
}
*/



                                        //USE OF SUPER KEYWORD

                                    //Super keyword in contructor
/*             
class base1{
    int a;
    base1(){
        a=45;
        System.out.println("i am the first constructor of base1");
        System.err.println(a);
    }
    base1(int x){
        a=x;
        
        System.out.println("i am the second constructor of base1");
        System.out.println(a);
    }
}
class derived1 extends base1{
    derived1(int y){
        super(y);             // if we had write super() then it would have called the first constructor of base class & corresponding contructor of derived class
        System.err.println("i am the constructor of derived1 class");
        System.out.println(a);
    }
}
public class Test{
    public static void main(String args[]){
        base1 b1= new base1();
        base1 b2= new base1(6);

        derived1 d1=new derived1(25);
        
    }
}
*/


                        // super keyword in data types
/* 
// Base class vehicle 
class Vehicle { 
	int maxSpeed = 120; 
} 

class Car extends Vehicle { 
	int maxSpeed = 180; 

	void display() 
	{ 
		// print maxSpeed of base class (vehicle) 
		System.out.println("Maximum Speed: "
						+ super.maxSpeed); 
	} 
} 

class Test { 
	public static void main(String[] args) 
	{ 
		Car small = new Car(); 
		small.display(); 
	} 
}
*/


                        // super keyword in methods/functions
/*
// superclass Person 
class Person { 
	void message() 
	{ 
		System.out.println("This is person class\n"); 
	} 
} 

class Student extends Person { 
	void message() 
	{ 
		System.out.println("This is student class"); 
	} 
	// Note that display() is only in Student class 
	void display() 
	{ 
		// will invoke or call current class message() method 
		message(); 

		// will invoke or call parent class message() method 
		super.message(); 
	} 
} 

class Test { 
	public static void main(String args[]) 
	{ 
		Student s = new Student(); 

		// calling display() of Student 
		s.display(); 
	} 
}
*/





                                            //METHOD OVERRIDING
/*
class base1{
    
    void METH1(){
        System.out.println("i am the METHOD1 of base1");
    }
    void METH2(){
        
        System.out.println("i am the METHOD2 of base1");
    }
}

class derived1 extends base1{
    @Override                       //written just to show that this method is overridden 
    void METH1(){
        System.err.println("i am the METHOD1 of derived1 class");
    }
}

public class Test{
    public static void main(String args[]){
        base1 b= new base1();
        b.METH1();
        b.METH2();
System.out.println();
System.out.println();
        derived1 d=new derived1();
        d.METH1();
        d.METH2();        
    }
}
*/




                                            // ABSTRACT CLASS AND INTERFACE
/*
abstract class parent{
    parent(){
        System.out.println("i am a constructor of parent");
    }
    public void greet(){
        System.err.println("hello");
    }
    abstract public void greet1();
    abstract public void greet2();

   
}
class children extends parent{
    @Override
    public void greet1(){
        System.out.println("good morning");
    }
    @Override
    public void greet2(){
        System.out.println("good afternoon");
    }
}
//we have to override all the functions in the class that are derived  from abstract class 

public class Test{
    public static void main(String args[]){
        children ch = new children();
        //we can not make the object of abstract class
        ch.greet1();
        ch.greet2();
        ch.greet();
        
    }
}
*/



                                            //INTERFACE IN JAVA
/*
interface bicycle{
    void applybrake();
    void speedup();
}
interface horncycle{
    void blow1();
    void blow2();
}
class avoncycle implements horncycle,bicycle{
    public void applybrake(){
        System.out.println("breaking bad");
    }
    public void speedup(){
        System.out.println("speeding up");
    }
    public void blow1(){
        System.out.println("popopopo");
    }
    public void blow2(){
        System.out.println("pepepepe");
    }
    void blow(){
        System.err.println("blow");
    }
}
                    //we have to override all the functions in the class that are derived from interface
public class Test{
    public static void main(String args[]){
        avoncycle a=new avoncycle();
        a.blow1();
        a.blow2();
        a.applybrake();
        a.speedup();
        a.blow(); 
    }

}
*/




                        
                                                    // INHERITANCE IN INTERFACES
/*
interface sample{
    void meth1();
    void meth2();
    default public void method1(){                             //Using "DEFAULT METHODS" in INTERFACES we dont have to use to explain that method in class !
        System.out.println("i am the default method");
    }

}
interface childsample extends sample{          //interface can inherit another inteface using EXTENDS
    void meth3();
    void meth4();
    default public void method2(){
        System.out.println("i am the default method");
    }

}
class mysample implements childsample{
    //we have to define all methods of interface in the class
    public void meth1(){
        System.out.println("i am meth1");
    }
    public void meth2(){
        System.out.println("i am meth2");
    }
    public void meth3(){
        System.out.println("i am meth3");
    }
    public void meth4(){
        System.out.println("i am meth4");
    }
}

public class Test{
    public static void main(String args[]){
        mysample s = new mysample();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
        s.method1();
        s.method2();
    }
}
*/


        //Note :-
/*
    *class extends class
    *class extends abstract class
    *interface extends interface
    *class implements interface
*/






                                                // DYNAMIC MESSAGE DISPATCH
/*
    * CONSIDER A FOLLOWING INHERITANCE HEIRARRCHY
    * BASE HAVING METHOD1,METHOD2
    * DERIVED HAVING METHOD2(overridden),METHOD3
    * Scenario1 
    * base object=new derived();
    * object.method2();              //this will allowed
    * object.method3();             //this will not allowed
    * Scenario2
    * derived object=new base();    //NOT ALLOWED
*/



                                            //dynamic method dispatch
/*
class phone{
    public void greet(){
        System.out.println("gm");
    }
    public void on(){
        System.out.println("turning on phone");
    }
 }
 class smartphone extends phone{
    public void music(){
        System.out.println("play");
    }
    public void on(){
        System.out.println("turning on smartphone");
    }
 }
 public class Test{
    public static void main(String[] args){
        phone e=new smartphone();
        //jo object bna h wo smartphone ka bna h
        //phone to reference h
        //smartphone t=new phone(); not allowed
        e.on();
        //e.music();  not allowed
        e.greet();
 
    }
 }
*/




                                        //POLYMORPHISM USING INTERFACE
/*
    * CONSIDER A SCENARIO WHERE THERE ARE FOUR INTERFACE CELLPHONE,GPS,MEDIAPLAYER,CAMERA AND A CLASS SMARTPHONE THAT IMPLEMENTS ALL FOUR INTERFACE
    * GPS G = NEW SMARTPHONE();             - THIS CAN ONLY USE GPS METHODS
    * SMARTPHONE S = NEW SMARTPHONE();      - THIS CAN USE ALL METHODS
*/



                                            //polymorphism using interface
/*
interface camera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("gm");
    }
    default void record4kvideo(){
        greet();
        System.out.println("recording...4k.");
    }
 }
 interface wifi{
    String[] getnetwork();
    void connecttonetwork(String network);
 }
 class mycellphone{
    void callnumber(int phone){
        System.out.println("calling");
    }
    void pickcall(int phone){
        System.out.println("connecting");
    }
 }
 class smartphone extends mycellphone implements wifi,camera{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void recordvideo(){
        System.out.println("recording video");
    }
 //    public void record4kvideo(){
 //        System.out.println("4krecording");
 //    }
    public String[] getnetwork(){
        System.out.println("getting list of network");
        String[] networklist={"bsnl","jio","docomo"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("connectiong to"+network);
    }
 }
 public class Test{
    public static void main(String[] args){
        camera cam=new smartphone();  //this is a smartphone use it is as a camera
        //cam.getnetwork();     not allowed
        cam.record4kvideo();
        smartphone m=new smartphone();
        m.recordvideo();
        m.takesnap();
        m.callnumber(9430649);
 
    }
 }
*/






                                // 3 properties of abtract & inteface(apna cllg java oops one shot)
// ABSTRACT :-
/*
    * An abstract class must be declared with an abstract key 
    * It can have abstract and non abstract method (abstract methods can't have own defnition and must be defined in base class)
    * It can't be instantiated (can't make object of abstract class)
    * It can have contructors and static methods also
    * It can have final method which will force the subclass not to change the body of the method
*/

// INTERFACE :-
/*
    * All fields in interfaces are PUBLIC, STATIC & FINAL by default
    * All methods are PUBLIC & ABSTRACT by default
    * A class that implements an interface must implement all the methods declared in the interface
    * interfaces support the functionality of multiple inheritance
*/




                                        //Static keyword
/*                                      
class Student{
    String name;
    static String school;
}

public class Test{
    public static void main(String args[]) {
        Student.school = "HR-IPS";           //no need to make obj for static data types as they are same for whole class and will be declared through class name
        Student s1 = new Student();
        s1.name = "milind";
        System.out.println(s1.name);
        System.out.println(s1.school);
        System.out.println(Student.school);
    }
}
*/



                                            //Packages in JAVA
//SEE CODE WITH HARRY JAVA PLAYLIST 63,64,65,68 VID



                                            //Access Modifiers
/* 
 * public :- within Class, Inherited Class, Same Package, World (imported package)
 * Protected :- within Class, Inherited Class, Same Package, World (if imported package & extends subclass)
 * Default :- within Class, Same Package
 * Private :- within Class
*/



                                                    // MULTI-THREADING
        //Creating thread by extending Thread
/*    
import java.util.*;
class MyThread1 extends Thread{
    public void run(){
        int i=0;
        int count = 0;
        while(i<10){
            System.out.println("1st");
            count++;
            i++;
        }
        System.out.println(count);        
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        int count = 0;
        while(i<10){
            System.out.println("2nd");
            count++;
            i++;
        }
        System.out.println(count); 
    }
}

public class Test{
    public static void main(String[] args){
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();
        mt1.start();                        //use built-in START method of threads rather than Userdefined RUN method of mythread class made above
        mt2.start();                        //both START methods will be executed concurrently
    }
}
*/


        //Creating Threads by Runnable Interface

/*              //SYNTAX
class t1 implements Runnable{
       @Override
       public void run(){
       System.out.println("Thread is running");
          }
}

public class Test{
    public static void main(String[] args) {
          t1 obj1 = new t1(); 
         Thread t = new Thread(obj1); 
         t.start();
    }
}
*/

/*              //EXAMPLE
class MyThreadRunnable1 implements Runnable{
    public void run(){
        for(int i=0; i<15; i++){
            System.out.println("I am a thread 1 not a threat 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        for(int i=0; i<15; i++){
            System.out.println("I am a thread 2 not a threat 2");
        }
    }
}
public class Test{
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
*/



                                    //The Thread class 
// Below are the commonly used constructors of the thread class: 
// 1. Thread ( ) 
// 2. Thread (string) 
// 3. Thread (Runnable r)                      :- this is done by implementing a runnable interface
// 4. Thread (Runnable r, String name) 



                                    //Constructor :- Thread(String)
/*
class MyThr extends Thread{
    public MyThr(String name){          //Constructor used to give name to ur thread
        super(name);                    //Super keyword is used as we have extended & inherited the name constructor of Thread class
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
public class Test{
    public static void main(String[] args) {
    MyThr t1 = new MyThr("Harry");
    MyThr t2 = new MyThr("Ram Candr");
    t1.start();
    t2.start();
    System.out.println("The id of the thread t is " + t1.getId());              //Built-in Method of Thread Class to get ID
    System.out.println("The name of the thread t is " + t1.getName());
    System.out.println("The id of the thread t is " + t2.getId());
    System.out.println("The name of the thread t is " + t2.getName());
    }
}
*/


                                        //Constructor :- Thread (Runnable r, String name) 
/* 
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");           //Thread.currentThread() :- method in Java that returns a reference to the currently executing thread
        //System.out.println(this.getName() + " is running.");                           //this also works in same way but here it's not working
    }
}

public class Test {
    public static void main(String[] args) {
        // Creating a Runnable object
        Runnable task = new MyRunnable();

        // Creating a thread with a Runnable and giving it a name
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
*/



//ThreadGroup class :- use to group similar thread class together 



                                                //PRIORITIES IN THREAD
/*                            
1. setPriority():- public final void setPriority(int x)   // x is the priority [1,10] that is to be set for the thread.
2. getPriority():- t1.getPriority() // Will return the priortity of the t1 thread.
*/

//EXAMPLE 1:-
/*
class Test extends Thread{  
    public void run(){  
      System.out.println("I'm thread : "+Thread.currentThread().getName());  
      System.out.println("I'm thread :"+Thread.currentThread().getPriority());  
     
    }  
    public static void main(String args[]){  
     Test t1=new Test();  
     Test t2= new Test();  
     t1.setPriority(Thread.MIN_PRIORITY);  // setting priority of t1 thread to MIN_PRIORITY (1)
     t2.setPriority(Thread.MAX_PRIORITY);  // setting priority of t2 thread to MAX_PRIORITY (10)
     t1.start();  
     t2.start();  
      
    }  
}   
*/


//EXAMPLE 2:-
/*
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;

        while(i<100){
            System.out.println("Thank you: " + this.getName());         //here "this" keyword is working
            i++;
        }

    }
}

public class Test {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Harry1 (NOT IMP)");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
*/



                                        //Java Thread Methods

//Join() method :     //will finish the execution of 1st thread and the execute the next thread
/*
    1. public final void join()
    2. public final void join(long millis)  :- You can also specify the time for which you need to wait for the execution of a particular thread by using the Join() method.
*/                                        


//Sleep() Method :
/*
import java.io.*;
import java.lang.Thread;
public class Test{
    public static void main(String[] args)
    {
        try {
            for (int i = 1; i <=5; i++) {
                Thread.sleep(2000);                 //will print outputs at certain delays gaps
                System.out.println(i);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
*/


//Interrupt() method :   done using Sleep()
/*
     Public void interrupt()
*/

//Case 1: Interrupting a thread that doesn’t stop working :
/*
class CWH1 extends Thread{
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.println("Child Thread");
                Thread.sleep(4000);                      // Child thread is put to sleep for 4000ms. As soon as child thread goes to sleep main thread interrupts it. And, InterruptedException is generated which is handled by the catch block.
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Child Thread Interrupted");
        }
	System.out.println("Thread is running");
    }
}

public class Test extends Thread{
    public static void main(String[] args) {
         CWH1 t= new CWH1();
         t.start();
         t.interrupt();
        System.out.println("Main Thread");

    }
}
*/

//Case 2: Interrupting a thread that works normally :
/*
class CWH1 extends Thread{
    public void run(){
        for (int i=0;i<10;++i){
            System.out.println(i);
        }
    }
}

public class Test extends Thread{
    public static void main(String[] args) {
         CWH1 t= new CWH1();
         t.start();
         t.interrupt();
        System.out.println("Main Thread");

    }
}
*/



/*
class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(true){
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);                          //will pause this for 455 milli secs
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{

    public void run(){
        while(true){
            System.out.println("My Thank you: ");
        }
    }
}

public class Test {
    public static void main(String[] args){
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        t2.start();

    }
}
*/






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
public class Test{
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
public class Test{
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

public class Test{
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

public class Test{
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

public class Test{
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

public class Test{
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
public class Test{
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





                                                //CAT Q on EXCEPTION HANDLING
/*
import java.util.Scanner;
public class Test{

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
public class Test{
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




                                                //File Handling

// METHODS :-  syntax =   obj.methodName();   ex:- myFile.createNewFile();
            // canRead() & canWrite() :- Returns boolean type
            // createNewFile()
            // celete()
            // exists() :- Returns boolean type that file exists or not
            // length()
            // getName()
            // getAbsolutePath()
            // MKdir() :- to create a directory
            // list() :- to get list of files in a directory
            // read()
            // write()
            // writeObject() :- 
            // renameTo()  :-    File f = new File("firstfilename");     File f2 = new File("secondfilename");     f.renameTo(f2);

// Classes :- syntax =>   ClassName obj = new ClassName("filename");   ex:- File myFile = new File("milifile.txt");
            // File :- super class to all file classes
            // FileReader
            // FileWriter
            // FileInputStream :- Read data in byte form
            // FileOutputStream :- write data into file in byte form
            // BufferedInputStream :- perform read operation in buffer(temp memory) instead of database
            // BufferedOutputStream :- perform write operation in buffer(temp memory) instead of database
            // PrintWriter :- 
            // DataOutputStream :- 
            // ObjectOutputStream :- copying object to file during Serialization-Deserialization
/* All Reading class obj just read the data from existing files but writting class objects create as well as write both*/ 



/*     
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {

        // Code to create a new file
        File myFile = new File("milifile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }


        // Code to write to a file
        try {
            FileWriter myFileWriter = new FileWriter("milifile.txt");
            myFileWriter.write("This is our first file from this java course\nOkay now bye");
            myFileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading a file
        //File myFile = new File("milifile.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        

        //Deleting a file
        //File myFile = new File("milifile.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
*/



//All Reading class obj just read the data from existing files but writting class objects create as well as write both so we don't need to create new file object before writing onto it but we must create a file object before reading.
/*
import java.io.*;
import java.util.Scanner;

public class Test{
    public static void main(String args[]) throws IOException{
        Scanner s = new Scanner(System.in);

        FileWriter myFileWriter = new FileWriter("password.txt");
        myFileWriter.write(s.next());
        myFileWriter.close();

        File f = new File("password.txt");
        //f.createNewFile();   //no need
        Scanner sc = new Scanner(f);
        String line = sc.next();
        System.out.println(line);
    }
}
*/



                                            // Q on file handling
/*
import java.util.Scanner;
import java.io.*;

public class Test{
    public static void main(String[] args) throws IOException{
        
        Scanner s = new Scanner(System.in);
        
        File myFile = new File("password.txt");
            myFile.createNewFile();
        
        FileWriter myFileWriter = new FileWriter("password.txt");
            myFileWriter.write(s.next());
            myFileWriter.close();

            Scanner sc = new Scanner(myFile);
            String line = sc.next();

        File myFile2 = new File("evaluation.txt");
        
        FileWriter myFileWriter2 = new FileWriter("evaluation.txt");
        
        if(line.length() <= 3){
                myFileWriter2.write("Weak");
            }
        
        if(line.length() >= 4 && line.length()<=7){
                myFileWriter2.write("Medium");
        }

        if(line.length() >= 8){
                myFileWriter2.write("Strong");
            }
        myFileWriter2.close();
        
            Scanner sch = new Scanner(myFile2);
            String line2 = sch.next();
            System.out.print(line2);
            sch.close();
    }
}   
*/



                                        //Q on file handling :- very important concept  
/*                          //  Write hmesha as a String hi hoga but read kisi v data type format mei kr skte h 
import java.util.Scanner;
import java.io.*;

public class Test{
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
// Creating 1st file        
        File myFile = new File("data.txt");
        myFile.createNewFile();
// Writing to 1st file       
        FileWriter mfilew = new FileWriter("data.txt");
        mfilew.write(s.next());      //only strings can be written over a file
        mfilew.close();
// Reading 1st file        
        Scanner sc = new Scanner(myFile);
        String m = sc.next();             
        sc.close();
// parsing the readed string we wrote in file        
        Double g = Double.parseDouble(m);
        Double n = (g * 5.0)/18.0;
// creating 2nd file
        File myFile2 = new File("converted.txt");
        myFile2.createNewFile();
// Writing to 2nd file         
        FileWriter mfilew2 = new FileWriter("converted.txt");
        mfilew2.write(n.toString());
        mfilew2.close();
// Reading 2nd file        
        Scanner sch = new Scanner(myFile2);
        Double k = sch.nextDouble();          //here we read the string value as a double value 
        System.out.println(k + "m/s");
        sch.close();
    }
}
*/
 


                                        //Q on File Handling :- very tough
/*
// You are using Java
import java.util.Scanner;
import java.io.*;

public class Test{
    public static void main(String[] args) throws IOException{
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();                             //taking num of element of array
        
        int arr[] = new int[n];                         //create dynamic array
        
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();                       //taking user input as array element
        }
        
        String arr2[] = new String[n];                  //create string array
        
        for(int i=0; i<n; i++){
            arr2[i] = String.valueOf(arr[i]);           //convert the given integer inputs into string so that they could be inserted into file
        }
        
//create 1st file        
        File myFile = new File("student.txt");
        myFile.createNewFile();
        
// write/store array of scores into file         
        FileWriter mfilew = new FileWriter("student.txt");
        for(int i=0; i<n; i++){
            mfilew.write(arr2[i]+" ");
        }
        mfilew.close();
        
// read 1st file
        Scanner sc = new Scanner(myFile);
        String str = sc.nextLine();               //string stored in file have space in between so use sc.nextLine()
        String str2[] = str.split(" ");
        sc.close();
        
        int sum = 0;
        
        for(int i=0; i<n; i++){
             sum = sum + Integer.parseInt(str2[i]);
        }
        float avg = (float)sum/n;
        
// creating 2nd file
        File myFile2 = new File("performance.txt");
        myFile2.createNewFile();
        
// write into 2nd file
        FileWriter mfilew2 = new FileWriter("performance.txt");
        mfilew2.write("Total Score: "+String.valueOf(sum) + "\n");
        mfilew2.write("Average: "+String.format("%.1f",avg));
        mfilew2.close();
        
// read from 2nd file
        Scanner sch = new Scanner(myFile2);
        while(sch.hasNextLine()){
            String line = sch.nextLine();
            System.out.println(line);
        }
        sch.close();
    } 
}
*/



                                        //Q on file handling :- similar to above 
/*
import java.util.*;
import java.io.*;

public class Test{
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Double arr[] = new Double[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextDouble();
        }
        s.close();
        
        File myfile = new File("prices.txt");
        myfile.createNewFile();
        
        FileWriter wri = new FileWriter(myfile);
        for(int i=0; i<n; i++){
            wri.write(arr[i].toString());
            wri.write(" ");
        }
        wri.close();
        
        Scanner sc = new Scanner(myfile);
        String str = sc.nextLine();
        String strarr[] = str.split(" ");
        Double arr2[] = new Double[n];
        for(int i=0; i<n; i++){
            arr2[i] = Double.parseDouble(strarr[i]);
        }
        sc.close();
        
        for(int i=0; i<n; i++){
            arr2[i] = arr2[i] + 1.1;
        }

        
        File myfile2 = new File("tax.txt");
        myfile2.createNewFile();
        
        FileWriter wrt = new FileWriter(myfile2);
        for(int i=0; i<n; i++){
            wrt.write(String.format("%.2f",arr2[i]) + " ");
        }
        wrt.close();
        
        Scanner sch = new Scanner(myfile2);
        String str2 = sch.nextLine();
        System.out.print(str2);
        sch.close();
    }
}
*/



                                    // Input/OutputStream  :- copy one file data to another 
/*
import java.io.*;

public class Test{
    public static void main(String[] args) throws IOException{
        File f = new File("mili.txt");   //need to create new file obj before reading it
        f.createNewFile();

        FileInputStream r = new FileInputStream("mili.txt");            //read bytes & character both but File reader/writer reads only character
        FileOutputStream w = new FileOutputStream("kumar.txt");

//.read() reads character by character and returns into integer(returns ASCii values)
        int i;
        while((i=r.read()) != -1)       //run loop upto when whole content of file is not read    
        {
            w.write((char)i);           //only characters can be written  (converting back ASCii values to characters)
        }
    }
//verify output by seeing files and contents from folder section       copy data from pre existing file as u can't write here as userinput as there's no scanner class imported 
}
*/


                                            //DataInputStream
/*                                            
import java.io.*;
public class Test{
    public static void main(String[] args) throws IOException{
        DataInputStream d = new DataInputStream(System.in);
        String s = d.readLine();     //depricated method:-  will work but give warning
        System.out.println(s);
        //int i = d.readInt();        not working
        //System.out.println(i);
    }
}
*/


                                            //Buffered Reader
/* 
import java.io.BufferedReader;       //Buffered reader is a class under io package
import java.io.InputStreamReader;
import java.io.IOException;
public class Test{
    public static void main(String[] args) throws IOException{

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader B = new BufferedReader(in);                //need to pass an object of InputStream

        int num = Integer.parseInt(B.readLine());               //buffer reader returns in String format so parse it into integer
        String s = B.readLine();
        System.out.println(num);
        System.out.println(s);
        B.close();
    }
}
*/



                                            // Serialization--DeSerialization

// To copy the whole object we use Serialization-DeSerialization like using copy method in oops we can just copy single datatype of a class from one obj to another at a time.
// So to make exact copy of an obj(whole obj) means to copy all the data types of one obj to another we first copy the obj into a file (read obj to a file) and then write the content of that file into another obj.
// Serialization :- Copying an Obj to a file i.e writing an obj to a file,  done using "ObjectOutputStream class" & ".writeObject() method".
// De-Serialization :- Copying an file content(An obj written to a file) to a object i.e Reading a file to an obj,  done using "ObjectInputStream class" & ".readObject() method".
// Obj will always be written onto a file or will be read from a file in BYTE form only.
// Serialization is a mechanism of converting the state of obj into a byte stream it is used when we need to persist an obj (to save obj somewhere like in file,memory or database)
// Serialization ==> obj to ByteStream into a file ==> ObjectOutputStream class ==> write.Object() method
// Serialization ==> we first need to create object of FileOutputStream class and then pass that obj into ObjectOutputStream
// De-Serialization ==> ByteStream to obj from a file ==> ObjectInputStream class ==> read.Object() method
// De-Serialization ==> we first need to create object of FileInputStream class  and then pass that obj into ObjectInputStream

/*
import java.io.*;
class Student implements Serializable{          //creating a class
    public int roll;
    public String name;
} 

public class Test{
    public static void main(String[] args) throws Exception{                         //can't just include IOException only as other exceptions are also occuring that need to be catched
        Student s1 = new Student();
        s1.roll = 5;
        s1.name = "milind";

//Serialization
        FileOutputStream fos = new FileOutputStream("mili.txt");        //creating a obj to write into a file (OutputStream/Filewriter first creates a new file and then write on it)
        ObjectOutputStream oos = new ObjectOutputStream(fos);           //passing the obj of FileStream 
        oos.writeObject(s1);                                            //things will be written in byte form
        oos.close();
        fos.close();  

//De-serialization                                                      //it throws IOException & ClassNotFoundException both
        FileInputStream fis = new FileInputStream("mili.txt");          //creating an obj to read a file (InputStream / Scanner(file) don't creates any file it just reads the existing file)
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s2 = (Student)ois.readObject();                         //data from file is read into 2nd object of Student class but need to be typecasted into Student class as it's read as BYTE form
        ois.close();
        fis.close();

        System.out.println(s2.roll);                                    //printing Student data to verify whether it's got copied or not 
        System.out.println(s2.name); 
    }
}
*/




                                                    //Collection Frameworks 
//Both ArrayList and linkedList uses almost similar methods 
//approaching certain element in arraylist is easier as compared to linkedlist with help of index
// addition and subtraction of element is easier in linkedlist with help of nodes but in array list all elements need to be shifted
// The ArrayList's capacity is increased when it reaches its limit, which can lead to some wasted memory. 
// ArrayDeque: ArrayDeque, on the other hand, is implemented as a double-ended queue. 
// ArrayDeque uses a block-based storage system, which typically results in more efficient memory usage compared to ArrayList.
// ArrayDeque implements Deque interface by which we can add or remove elements from both the ends which makes arraydeque more faster than arraylist.
// Collection class methods :- Collections.sort(ArrayList_Name), Collections.reverseOrder(ArrayList_Name), Collections.reverse(ArrayList_Name)
// class Gen<T extends Comparable <T>>   use this extention to use Collections.sort()
// Collections.frequency(ArrayList_Name , element) :- to find number of times the element occured in arraylist
//  Priority Queue gets inserted in Sorted way



                                                        //LINKEDLIST
/*
import java.util.*;
public class Test{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();     //we can't give initial capacity to linked list
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(0, l2);
        l1.addLast(676);                                    //only works in linkedlist
        l1.addFirst(788);                                   //only works in linkedlist
        System.out.println(l1.contains(27));                //RETURNS BOOLEAN VALUE
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

        //l1.clear();
        
        l1.set(1, 566);                     //unlike add method it doesn't add but replace the old element with new one
        
        for(int i=0; i<l1.size(); i++){             //intead of length we use size in arraylist
            System.out.print(l1.get(i));            //can't use l1[i] as we do in arrays we have to use get method
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("linked list is: " + l1);       //it can be printed without loop also
    }
}
*/


                                                    //ARRAYLIST
/*
import java.util.*;
public class Test extends Thread{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>(4);        //we can give initial capacity to arraylist
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5,5);     // inserts 5 at the 5th index in l1

        
        System.out.println("Array list before : "+ l1);

        l1.remove(0);
        System.out.println("ArrayList after removing the value at index 0 :" + l1);

        System.out.println("L1 list contains 7 : " + l1.contains(7));         //boolean return true or false
        System.out.println("L1 list contains 4 : " + l1.contains(4));

        ArrayList<Integer> l2 = new ArrayList<>();              //either we can leave inital capacity as empty or can give some value also and on substequent addition it shift it's capacity        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);


        System.out.println("L1 Array list : "+ l1);
        System.out.println("L2 Array list : " +l2);
        l1.addAll(l2);                                              //will add at last 
        System.out.println("L1 Array list after merging: "+ l1);
        System.out.println("L2 Array list : " +l2);
 
        l1.addAll(0,l2);        //You can add the elements of l2 at the starting of l1 by typing index as 0

        System.out.println("L1 Array list : "+ l1);
        System.out.println("The first occurrence of 3 in l1 is at index : " + l1.indexOf(3));
        System.out.println("The last occurrence of 3 in l1 is at index : " + l1.lastIndexOf(3));
    }
}
*/


                                                //Q on ArrayList mixed with generics
/*
import java.util.*;
class Gen<T>{
    ArrayList<T> arr;
    
    Gen(ArrayList<T> arr){
        this.arr = arr;
    }
    
    public ArrayList<T> rev(){
        Collections.reverse(arr);
        return arr;
    }
}
public class Test{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        ArrayList<Integer> arrM = new ArrayList<>();
        for(int i=0; i<n; i++){
            arrM.add(s.nextInt());
        }
        System.out.println(arrM);
        
        Gen<Integer> g = new Gen<>(arrM);
        //g.rev();
        //System.out.println(arrM);
        System.out.println(g.rev());
    }
}
*/


                                                //DeQueue
/* 
import java.util.*;
public class Test extends Thread{
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
//Insertion at front :
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println(ad1);
//Insertion At End:
        ad1.addLast(5);
        ad1.offerLast(10);
        System.out.println(ad1);
//Accessing an element from the head of the deque array:
        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());
//Accessing the last element: 
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());
//Removing the first element:
        ad1.pollFirst(); 
        ad1.removeFirst(); 
        System.out.println(ad1);
//Removing the last element: 
        ad1.pollLast(); 
        ad1.removeLast(); 
        System.out.println(ad1);
    }
}
*/


                                        //Q on Priority Queue mixed with generic class
/* 
    class sort<T>{
    Queue<T> mon;
    int n;
    public sort(Queue<T> mon,int n){
        this.mon=mon;
        this.n=n;
    }
    public void get(){
        System.out.printf("[");
        for(int i=0;i<n;i++){
        System.out.printf("%.2f",mon.poll());
        if(i<n-1){
            System.out.printf(", ");
        }
        }
        System.out.printf("]");
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Double> vars =new PriorityQueue<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            vars.offer(sc.nextDouble());
        }
        sort<Double> varsa=new sort<>(vars,n);
        varsa.get();
    }
}
*/
                                            //HashSet(uses hashing techniques to easy searching)
/*
import java.util.*;
public class Test extends Thread{
    public static void main(String[] args) {
        HashSet<Integer> myHashSet0 = new HashSet<>();                //if it's empty default initial capacity would be 16 and load factor would be 0.75
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);         //HashSet(int capacity, float loadFactor)  here loadfactor is float so added 'f' 
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);                                          // This element will be ignored as set takes unique elements only 

        
        System.out.println("The size of myHashSet is : " + myHashSet.size());
        System.out.println("myHashSet before removing any element : " + myHashSet);
        System.out.println(myHashSet.isEmpty());
        myHashSet.remove(3); //deletes 3 from the hashset (not index 3 but element 3 will be deleted)
        System.out.println("myHashSet after removing a element : " + myHashSet);
        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println("myHashSet after clearing : " + myHashSet);


        HashSet<Integer> myHashSet1 = new HashSet<>();
        System.out.println(myHashSet1.isEmpty());
    }
}
*/



                                        //HashSet Vs HashMap

// Java program to demonstrate working of HashSet
/*
import java.util.HashSet;               // Importing HashSet class from java.util package

public class Test{
	public static void main(String[] args)
	{

		HashSet<String> hs = new HashSet<String>();
		// Adding elements to the HashSet
		hs.add("geeks");
		hs.add("practice");
		hs.add("contribute");
		

		System.out.println(
			"Before adding duplicate values \n\n" + hs);

		// Addition of duplicate elements
		hs.add("geeks");
		hs.add("practice");

		System.out.println(
			"\nAfter adding duplicate values \n\n" + hs);

		// Addition of null values
		hs.add(null);
		hs.add(null);

		// Displaying HashSet elements
		System.out.println("\nAfter adding null values \n\n"
						+ hs);
	}
}
*/


// Java program to demonstrate working of HashMap
/*  
import java.util.HashMap;                   // Importing HashMap class from java.util package
public class Test{
	public static void main(String[] args)
	{
		            // This is how to declare HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Adding elements to HashMap
		hm.put(12, "geeks");
		hm.put(2, "practice");
		hm.put(7, "contribute");

		System.out.println("\nHashMap object output :\n\n" + hm);

		// store data with duplicate key
		hm.put(7, "geeks");                              
		hm.put(12, "contribute");

		System.out.println("\nAfter inserting duplicate key :\n\n" + hm);

        		// store data with duplicate key
		hm.put(8, "geeks");
		hm.put(12, "contribute");

		System.out.println("\nAfter inserting duplicate key :\n\n" + hm);
	}
}
*/



                                                            //Q on hashmap :- METHOD => hashmap_name.get(key) = value
/*
import java.util.*;
class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Integer> vars=new LinkedHashMap<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String p=sc.nextLine();
            int q=sc.nextInt();
            sc.nextLine();
            vars.put(p,q);
        }
        System.out.println(vars);
        String x=sc.nextLine();
        int y=sc.nextInt();
        vars.put(x,y);
        System.out.println(vars);
    }
}
*/


                                                                //Q on hashmap :- taking inputs & convert to hashmap
/*
import java.util.*;
class Test{
    public static void main(String[] args) throws NumberFormatException{
        Scanner sc=new Scanner(System.in);
        HashMap<String,Double> vars=new HashMap<>();
        int temp=1;
         double total=0.0;
        while(true){
            String a=sc.nextLine();
            if(a.toLowerCase().contains("done")){
                break;
            }
            if(!a.contains(":")){
                System.out.println("Invalid format");
                temp=0;
                break;
            }
            String [] arr=a.split(":");
            String x=arr[0];
            String y=arr[1];
            try{
            double m=Double.parseDouble(y);
            vars.put(x,m);
            }
            catch(NumberFormatException r){
                System.out.println("Invalid input");
                temp=0;
                break;
            }
        }
        if(temp==1){
            String s="";
            double max=Double.MIN_VALUE;
        for(Map.Entry<String,Double> f : vars.entrySet()){
            if(f.getValue()>max){
                max=f.getValue();
                s=f.getKey();
            }
        }
          System.out.println(s);
        }
    }
}
*/

                                                        //JAVA Generics
//        Without Java Generics :  will throw warning
/*
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {

        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);                            //Integer value
        myArrayList.add("Harry Bhai!");                 //String value
        myArrayList.add(20.4);                          //Double value
        System.out.println(myArrayList);

                    //int x = myArrayList.get(0);       //will through error need to be typecasted 
        int x = (int) myArrayList.get(0);       //b=object typecasted into integer
        System.out.println(x);

    }
}
*/


//        With Java Generics :    will throw error as it's already declared as <integer> and we r giving string input
/*
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList();
        myArrayList.add(10);                    //Integer value
        myArrayList.add("Harry Bhai!");         //String value
        myArrayList.add(20.4);                  //Double value
        System.out.println(myArrayList);

    }
}
*/


//        With Java Generics :    No need to typecast as we declare <datatype> at beginning only 
/*
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        
        myArrayList.add(40);


    }
}
*/



                                                //Creating Generic class
/* 
import java.util.ArrayList;
import java.util.Scanner;


class MyGeneric<T1, T2>{                                //created MyGeneric class and passed T1 & T2 class as argument to it

    //Assining data types to MyGeneric class
    int val;
    private T1 t1;             //t1 variable of T1 datatype
    private T2 t2;                                      

    public MyGeneric(int val, T1 t1, T2 t2) {           //created constructor of that class
        this.val = val;
        this.t1 = t1;
        this.t2= t2;
    }

                        //As T1 & T2 r private so Creating function to get & set data types of Mygeneric class
    public int getVal() {       
        return val;
    }

    public void setVal(int val) {       //this function will return a value of integer
        this.val = val;
    }

    public T1 getT1() {            //this function will return a value of T1 datatype
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {            //this function will return a value of T2 datatype
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

}
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
//        ArrayList<int> arrayList = new ArrayList(); -- this will produce an error
//        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);
//        arrayList.add(new Scanner(System.in));            //without creating scanner class obj we can use like this...

        int a = (int) arrayList.get(0);
        System.out.println(a);


        MyGeneric<String, Integer> g1 = new MyGeneric(23, "MyString is my string ", 45);

        // could be done if T1 & T2 were public
            //System.out.println(g1.t1);
            //System.out.println(g1.t2);

        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}
*/



                                        //Q on Generic class
/*
import java.util.*;
class Area<T extends Number>{
    private T length;
    private T width;

    public Area(T length, T width){
        this.length = length;
        this.width = width;
    }
    
    public double CalPer(){
        return (length.doubleValue() + width.doubleValue());
    }
        
}
public class Test{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int width = s.nextInt();
        
        Area<Integer> A = new Area<>(length, width);    //as Area<Integer> means T = Integer 
        System.out.println((int)A.CalPer());    
    }
}
*/



                                            //More Built-in packages & classes
//Date & Time  :- java.time package milli sec is stored in long variable data type
/*
public class Test {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);       //getting the count of milli secs from 1 jan 1970 then converting to secs to hrs to days to years passed till now by dividing by 1000 then  3600 then 24 then 365
    }
}
*/



//Date Class :- no need to create it's built-in so import it from java.util
/*
import java.util.Date;
public class Test{
    public static void main(String[] args) {
    //to get current date & times
        Date d = new Date();                    //creating obj for built-in class Date
        System.out.println(d);                  //gives date & time both
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear()); 

    //Passing own milli seconds as argument :- will give years, date & time covered in given milli secs counting from 1 jan 1970
        
        Date d1= new Date(1621709639111l);                  //have to put 'l' at last as millisec is stored in 'long' variable datatype    
        System.out.println("The date calculated form miliseconds is : " + d1);

    //comparing 2 dates
        Date d2= new Date(2021,12, 24);             //both dates are different      FORMAT :- (yr,month,day)
        System.out.println(d2.compareTo(d));        //returns 0 if dates r equal else return 1
        System.out.println("The number of milliseonds passed since Jan 1, 1970 :" +d2.getTime());      
    }
}
*/


//calander class :- Abstract class
/*
import java.util.*;
public class Test extends Thread{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());                                    //getCalendarType() returns the type of the calendar
        System.out.println("Current year is :"+ c.get(Calendar.YEAR));
        System.out.println("Current month is :"+ c.get(Calendar.MONTH));            //The indexing for month field ranges from [0,11]
        System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
        System.out.println("Current second is :"+ c.get(Calendar.SECOND));

        System.out.println("Current date is : " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ c.getTime());
        c.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ c.getTime());

        System.out.println(c.getWeeksInWeekYear());

        System.out.println(" The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR))
    }
}
*/


//GregorianCalander Class :- concrete subclass of Calander class
/* 
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Test {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        Calendar c = Calendar.getInstance();                        //The calendar class is an abstract class. So, the instance of this class can not be instantiated. Therefore, we need to use the static method Calendar.getInstance() to initialize the object of the Calendar class :
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("Calendar : " + cal.getTime());
        System.out.println("The hashcode for this calendar is : "+ cal.hashCode());

        System.out.println(cal.isLeapYear(2018));
        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.isLeapYear(2021));

        System.out.println("Date before rolling : " + cal.getTime());
        cal.roll(Calendar.MONTH, true);
        cal.roll(Calendar.DATE, false);
        cal.roll(Calendar.YEAR, true);
        System.out.println("Date after rolling : " + cal.getTime());

    //TimeZone
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
*/


//java.time API  String
/* 
import java.time.*;
public class Test extends Thread{
    public static void main(String[] args) {

//abstract ZoneId getZone() : This methods returns the time zone being used to create date and time objects.
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());
        System.out.println();

//abstract Instant instant() : This methods returns the current instant of the clocks
        Clock cl2 = Clock.systemUTC();
        System.out.println(cl2.instant());
        System.out.println();

//boolean isNegative() : This method is used to check if the duration is negative
        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00' 
        System.out.println(d1.isNegative());                                                                                                                                 
        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'                                                                                             
        System.out.println(d2.isNegative());
        System.out.println();

//isZero() : This method is used to check if the duration is zero. Returns boolean value
        Duration d3 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
        System.out.println(d3.isZero());
        Duration d4 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
        System.out.println(d4.isZero());
        System.out.println();

//LocalDate class :
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println();


//compareTo() : This method compares the equality of the two dates. Returns boolean value.
        LocalDate d5 = LocalDate.parse("2021-05-27");
        LocalDate d6= LocalDate.parse("2021-05-26");
        LocalDate d7= LocalDate.parse("2021-05-26");
        System.out.println(d6.equals(d5));
        System.out.println(d7.equals(d6));
        System.out.println();

//withYear(int Year) : This method returns a copy of the LocaleDate but alters the year with the value of year passed as argument.
        LocalDate d10 = LocalDate.parse("2021-05-27");
        System.out.println(d10.withYear(2001));
        System.out.println();

//LocalTime class :   This class helps us to represent the time without the dates.      Instances of LocalTime class are mutable.
        LocalTime t = LocalTime.now();
        System.out.println(t);
        System.out.println();

//LocalTime plusHours(long hoursToAdd)
        System.out.println("Time before : "  + t);
        LocalTime t1= t.plusHours(5);
        System.out.println("Time after adding 5 hours : " + t1);
        System.out.println();

//LocalTime minusMinutes(long minutesToSubtract)
        LocalTime t2= t.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + t2);

    }
}
*/



// Date-Time Formatter in JAVA :-  public String format(DateTimeFormatter formatter)
/*
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test extends Thread{
            public static void main(String[] args) {

                LocalDateTime dt = LocalDateTime.now();
                System.out.println("The current date is : " + dt)
                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");   // This is the format
                String myDate = dt.format(df);                                      // Creating date string using date and format
                System.out.println("Date after formattin : "+ myDate);
                
                DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
                String myDate3 = dt.format(df3);                                    // Creating date string using date and format
                System.out.println("Date after formattin : "+ myDate3)
                DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;            // Formatting the date in the ISO format
                String myDate2 = dt.format(df2);                                     // Creating date string using date and format
                System.out.println("Date in ISO format : "+ myDate2)
                DateTimeFormatter df4 = DateTimeFormatter.ISO_WEEK_DATE;
                String myDate4 = dt.format(df4); 
                System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate4)
                DateTimeFormatter df5 = DateTimeFormatter.ISO_ORDINAL_DATE;
                String myDate5 = dt.format(df5);
                System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate5);
            }
}
*/




                                            //Working with ASCII values :- System.in.read()
/*                             
import java.io.*;
public class Test{
    public static void main(String[] args) throws IOException{
        System.out.println('A');
        System.out.println("a");
        System.out.println('1');
        System.out.println("a");

    //Finding Ascii value :- 
    //1st method:-
        System.out.print("Enter any character or integer: ");
        int n = System.in.read();                                  // will read and returns ASCII value of any character/integer
        System.out.println("Ascii value of n is: " + n);        
        System.out.println(n-48);                                  // (ASCII value of a No.) - 48 = No.

    //2nd method :-  can't take user input as scanner doesn't work with characters
        char c = 'b';
        char c2 = '4';
        System.out.println((int)c);
        System.out.println((int)c2);

    System.out.println();

    //Finding char/number from Ascii value
        int n2 = 86;
        int n3 = 6;
        System.out.print("character at this Ascii value is: ");
        System.out.println((char)n2);                             //will give character value at n2


        // ASCII value - 48 = Integer at that ASCII value
        // (char)ASCII value = character at that ASCII value
        // int n = System.in.read.(); == ASCII value of any char/integer
    }
}
*/


                                                    //Q on ASCII value mixed with file handling
/*
import java.util.*;
import java.io.*;
public class Test{
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        
        char[] strArr = str.toCharArray();
        
        //Encyption :- converting each char to ASCII value then adding 1 to it and converting back to Character and storing into same character array
        for(int i=0; i<str.length(); i++){
            strArr[i] = (char)((int)strArr[i] + 1);
        }
        
        String str2 = String.valueOf(strArr);   //converting back char array to string


        File f = new File("encrypted_data.txt");
        f.createNewFile();
        
        FileWriter fw = new FileWriter("encrypted_data.txt");
        fw.write(str2);
        fw.close();
        
        Scanner sc = new Scanner(f);
        String str3 = sc.next();
        sc.close();
        
        //Decryption 
        char[] strArr2 = str3.toCharArray();
        
        for(int i=0; i<str3.length(); i++){
            strArr2[i] = (char)((int)strArr2[i] - 1);
        }
        String str4 = String.valueOf(strArr2);
        
        System.out.println("Encrypted Message: "+str2);
        System.out.println("Decrypted Message: "+str4);
    }
}
*/




                                                //Anonymous Class :- helps to create obj of interface directly
//By implementing Interface:-
/*
import java.util.*;

@FunctionalInterface
interface Animal{
    void bark();
}

class Dog implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
}

class Test{
    public static void main(String[] args) {
        Dog Bruno = new Dog();
        Bruno.bark();
          }
}
*/


//Using Anonymous class method :- no need to make an extra class to implement the interface
/* 
import java.util.*;

@FunctionalInterface
interface Animal{
    void bark();
}

class Test{
    public static void main(String[] args) {
        Animal Bruno = new Animal() {
            @Override
            public void bark() {
                System.out.println("Dog barks!");
            }
        };
        Bruno.bark();
    }
}
*/



                                                        //Types of Anonymous class
// 1. Extending an abstract class :-
/*
import java.util.*;
abstract class Vehicle{
    abstract void drive();
}

class Test{
    public static void main(String[] args) {
        Vehicle car = new Vehicle() {
            @Override
            void drive() {
                System.out.println("I'm driving a car.");
            }
        };
        car.drive();
        }
}
*/



// 2. Implementing an Interface :-
/*
import java.util.*;
abstract class Vehicle{
    abstract void drive();
}

class Test{
    public static void main(String[] args) {
        Vehicle car = new Vehicle() {
            @Override
            void drive() {
                System.out.println("I'm driving a car.");
            }
        };
        car.drive();
        }
}
*/



                                                        //Lambda Expression
/*                                                        
import java.util.*;
@FunctionalInterface
interface LambaExp{
    void meth1(int a, int b);
}

class Test{
    public static void main(String[] args) {

        LambaExp obj =(b,c)->{
            System.out.println("The value of b and c is : "+ b + "," + c);
        };
        obj.meth1(5,10);
    }
}
*/



/*
import java.util.*;
interface lambdaa{
    void meth1(String a, int b);
}

class Test{
    public static void main(String[] args){
        lambdaa obj =(k,m)->{
            System.out.println(k +" is "+ m +" years old.");
        };
        obj.meth1("Kumar Milind", 22);
    }
}
*/