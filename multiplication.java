//this program take input as a number and print the number table from 1 to 10
import java.util.Scanner;

public class Main  //class main
{
  
	public static void main(String[] args) 
	{
    
		Scanner input = new Scanner(System.in);
    
		System.out.println("enter number");
   
		int a = input.nextInt();
 //enter the number whose multiple is going to be printed   
		for(int i=1;i<=10;i++)
   //for loop which runs and print the multiple of the number and the loop exits if the value of variable i greater than 10
		{
      
			int c = a*i;
  //here the entered number will be multiplied from number 1 to 10 as for loop goes from 1 to 10    
			System.out.println("\n"+c);
    //the multiplication table of the entered number will be printed as for loop goes 
		}
  
	  }  

}
