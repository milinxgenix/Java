                                        //Array 
/*                                
class Arrays
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
class Arrays
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

public class Arrays
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
