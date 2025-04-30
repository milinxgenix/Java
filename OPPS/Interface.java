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

public class Interface{
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
public class Interface{
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

public class Interface{
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
