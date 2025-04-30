                                                //File Handling

// METHODS :-  syntax =   obj.methodName();   ex:- myFile.createNewFile();
            // canRead() & canWrite() :- Returns boolean type
            // createNewFile()
            // delete()
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

public class FileH{
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

public class FileH{
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

public class FileH{
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

public class FileH{
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

public class FileH{
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

public class FileH{
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

public class FileH{
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
public class FileH{
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
public class FileH{
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

public class FileH{
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
