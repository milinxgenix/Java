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
public class Inheritance{
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
        super(y);             // if we had written super() then it would have called the first constructor of base class & corresponding contructor of derived class
        System.err.println("i am the constructor of derived1 class");
        System.out.println(a);
    }
}
public class Inheritance{
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
		System.out.println("Maximum Speed: " + super.maxSpeed); 
	} 
} 

class Inheritance { 
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

class Inheritance { 
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

public class Inheritance{
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



                                            //Access Modifiers
/* 
 * public :- within Class, Inherited Class, Same Package, World (imported package)
 * Protected :- within Class, Inherited Class, Same Package, World (if imported package & extends subclass)
 * Default :- within Class, Same Package
 * Private :- within Class
*/
