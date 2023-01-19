

    // -------------------------------------------------------
	// Assignment2
	// Written by: (Diyi Lin student id40086388)
	// For COMP 248 Section  – Fall 2018
	// --------------------------------------------------------



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;//use Scanner to input
     public class Question2 {

	public static void main(String[] args) {
	//Diyi Lin 10/5/2018
    //write a program to separate and add up the digits,next find and print the summary's divisors
	//then ask the user to repeat it or not
	boolean repeat = true;//declare a boolean for repeating
	do             //do-while loop,because I need to run the program once before deciding to repeat or not
	{ Scanner key = new Scanner(System.in);//declare a Scanner to input number
 	  System.out.println(" Welcome to our Calculation Program!");
      System.out.println("-------------------------------------");
      System.out.println();                                          //welcome banner
      System.out.print("Enter a number with at most 7-digits: ");
      int num = key.nextInt();
      int nUm = num;
      int sum=0;
      while (nUm>0) {      //use while loop to calculate the summary
         int rest = nUm%10;  //   Find out the last digit.
         sum = sum + rest;   //   Add it up.
         nUm = nUm/10;       //   Make the second last become the last,when there is no more second last,which 
      }                      //means only one digital lefts, it/10 will be 0,then stop and out.
      System.out.println("Sum of the digits of "+ num +" is: "+sum);
      System.out.println("The divisors of "+sum+ " are as follows:");
      
      int i;
      for( i=1;i<=sum;i++){          //use for loop to calculate divisors
          int z=sum%i;                   //from 1 to sum,sum % the number one by one
          if(z!=0)continue;              //if the result is not 0,go back 
              System.out.print(i+" ");}  //if the result is 0,print it then go back
      
      System.out.println();
      
      System.out.print("Do you want to try another number? (yes to repeat, no to stop) ");
      
      Scanner im = new Scanner(System.in);
      String input = im.next();
	  if(input.equals("yes")) {
			  repeat = true;
			  //if input yes,no need to change the boolean,repeat
 	    }else if(input.equals("no")) {
			   repeat = false;//if input no,change the boolean,out and end
	        } 
      }
	  while (repeat == true);//condition of repeating
		  
		   
	  
	  
	  System.out.println("Thanks and Have a Great Day!");//close message
	
	
	
		File file = new File("G:/file11.txt");
		try
		{FileInputStream fis = new FileInputStream(file);
		System.out.println(fis.available());	
		int content;
		while((content = fis.read()) != -1)
		System.out.print((char)content);
		 	
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	
	  
	  
	
	
	
	
	
	
	
	
	
	
	
	}

}
