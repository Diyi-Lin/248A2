
    // -------------------------------------------------------
	// Assignment2
	// Written by: (Diyi Lin student id40086388)
	// For COMP 248 Section  – Fall 2018
	// --------------------------------------------------------



import java.util.Scanner; //use java to input data

   public class Question1 {
       public static void main(String[] args) {
	//Diyi Lin 10/5/2018
    //write a program for Concordia to sort and guide students by the ielts score they apply 
    	   
    Scanner ielts = new Scanner(System.in);//declare a Scanner 
	  System.out.println("-------****-------****-------****-------****-----****-----");
	  System.out.println("    Welcome to Concordia Language Proficiency Evaluator!  ");
	  System.out.println("                based on IELTS exam                       ");
      System.out.println("-------****-------****-------****-------****-----****-----");//welcome banner
      System.out.println();
      System.out.println("Here are the available options:");
      System.out.println("       1 – Language Proficiency Requirements for the Applicant ");
      System.out.println("       2 – Evaluation of your language proficiency            " );
      System.out.println();
      System.out.print("Please enter the digit corresponding to your case: "     );//prompting data 
    int m = ielts.nextInt();
     
      System.out.println();
    
    if  ( m==1 )
    {   ielts.close();//close Scanner
        System.out.println("- The overall score of IELTS exam of applicants needs to be equal or above 6.5 and the scores");
        System.out.println("for writing and reading skills should not be below 6.0. If your overall score is 6, and your ");
        System.out.println("reading and writing scores are at least 6, you will be eligible for conditional admission. So ");
        System.out.println("you need to take an English course in the first semester. Otherwise you have to retake the IELTS");
        System.out.println("exam.");
        System.out.println("Thanks for choosing Concordia.");}//show user the result 
     
    else
        System.out.println("Please enter your listening score: "); 
        double li = ielts.nextDouble();
        
        System.out.println("Please enter your speaking score: "); 
        double sp = ielts.nextDouble();
        
        System.out.println("Please enter your reading score: "); 
        double re = ielts.nextDouble();
       
        System.out.println("Please enter your writing score: "); //input static
        double wr = ielts.nextDouble();                          
        //double input because ielts scores have integers and decimals
        
        System.out.println();
       
        
        double overall = (li+sp+re+wr)/4;                  //calculate overall score
        int x;
        x = (int)overall;                                  //declare x to store the integer part
        double y; 
        y = (double) (overall-x);                          //declare y to store decimal part
          
           if (y<0.25) 
             overall = x;                                  //decimal part less than 0.23 become 0.0
           else
             if (y<0.75)
        	   overall = x + 0.5;                          //decimal part less than 0.75 but more than 0.23 become 0.5
             else
               overall = x + 1.0;                          //decimal part more than 0.75 become 1.0
        
        System.out.println("^ ^ ^ ^ Your overall score is: " + overall );
        System.out.println("^ ^ ^ ^ Your reading score is: "+ re);        //these three would not be affected by the following steps logically
        System.out.println("^ ^ ^ ^ Your writing score is: "+ wr);        //to make my program clearer and easier, i put them before "judgment"
        System.out.println();
        
       //decide whether student can do with its score           //i divide that last part--"judgment"--into two steps
        if (overall>=6.5)                                       //first,check its overall score                     
          if((re>=6) && (wr>=6))                                //second,check its reading score and writing score
        		System.out.println("-^-^-Congratulations: You are eligible for Admission.-^-^-");//student whose overall >=6.5 both reading and writing >=6
          else
        		System.out.println("-^-^-You are eligible for Conditional Admission.-^-^-");//student whose overall >=6.5 but either or neither reading or writing >= 6
        		
        else
        	if(overall>=6) 
        	    if ((re>=6) && (wr>=6)) 
        		   System.out.println("-^.^-You are eligible for Conditional Admission.-^.^-");//student whose overall >=6 both reading and writing >=6
        	    else
        		   System.out.println("-=-=-Sorry, you have to retake the exam.-=-=-");//student whose overall >= 6 but either or neither reading or writing >= 6
        		   
        	else
        		System.out.println("-=-=-Sorry, you have to retake the exam.-=-=-");//student whose overall <6
        	   
        
        
       
        ielts.close();//close Scanner
                    
        }
        }
   
	


