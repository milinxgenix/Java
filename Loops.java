                                    //if-else
/*                                    
import java.util.Scanner;
public class Loops{
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
public class Loops{
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
class Loops{
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




                                            //do while loop
/*
import java.util.Scanner;
class Loops
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
public class Loops{
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
