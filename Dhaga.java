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

public class Dhaga{
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

public class Dhaga{
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
public class Dhaga{
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
public class Dhaga{
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

public class Dhaga {
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
class Dhaga extends Thread{  
    public void run(){  
      System.out.println("I'm thread : "+Thread.currentThread().getName());  
      System.out.println("I'm thread :"+Thread.currentThread().getPriority());  
     
    }  
    public static void main(String args[]){  
     Dhaga t1=new Dhaga();  
     Dhaga t2= new Dhaga();  
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

public class Dhaga {
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
public class Dhaga{
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

public class Dhaga extends Thread{
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

public class Dhaga extends Thread{
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

public class Dhaga {
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
