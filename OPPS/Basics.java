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
public class Basics{
    public static void main(String args[]){
        employee Milind = new employee();
        Milind.id=7;
        Milind.name="Mili";
        Milind.printdetails();
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
public class Basics{
    public static void main(String[] args){
        employee s=new employee(45,"Milind");
        employee d=new employee();
        d.get();      
    }
}
*/



/*
class Student{
    String name;
    int age;

    Student(String n, int a){           //contracter created
        this.name = n;
        this.age = a;
    }

                                        // method overloading :- either paMilieters should be diff or return should be void for 1st method and some datatype for 2nd method
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

public class Basics{
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
//to do function overloading in compile time polymorphism either pass  different paMilieters/arguments or if functions r having same type of paMilieters then they should return diff values like one should be some data type and another should be void.





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
public class Basics{
    public static void main(String args[]){
        employee Milind=new employee();
        Milind.getdetails();
        Milind.printdetails();
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
public class Basics{
    public static void main(String args[]){
        employee Milind=new employee();
        Milind.getdetails();
        Milind.printdetails();
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
        name="Mili";
        id=45;
    }
    public void printdetails(){
        System.out.println("my id is"+id);
        System.out.println("my name is"+name);
    }
}
public class Basics{
    public static void main(String args[]){
        employee Milind = new employee();     //invokes automatically 
        Milind.printdetails(); 
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
public class Basics{
    public static void main(String args[]){
        employee Milind =new employee("Mili",45);     
        Milind.printdetails();
        
    }
}
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
