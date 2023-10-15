package dishwasher;

import java.util.Scanner;

public class Dishwasher {
	static Scanner input = null;
	public static boolean detail;
	public static void welcome() {
		 
		System.out.println("Choose a program:   1 for Quick Wash Cycle (5  seconds)"
				+ "\n\t\t    2 for High Temp Cycle  (10 seconds)"
				+ "\n\t\t    3 for Heavy Cycle      (15 seconds)");
	}
	
	 
	
	///////////////////////////////// main //////////////////////////////////

	public static void main(String[] args) {
		
		System.out.println("WELCOME TO Dishwasher PROGRAM..\n");
    	General general = new General();
    	General first = new FirstProgram();     //polymorphic object
		General second = new SecondProgram();   
		General third = new ThirdProgram();
		
		general.door();  //check if the door (open , closed)
		welcome();     //print choose a program..
		while(General.count < 3) {  

		try {      //print incorrect if the user input any non integer number  
		input = new Scanner(System.in);  //choose program (1-3)
	    int answerNum = input.nextInt();
	    
	    if (answerNum < 4 && answerNum >0) {
	    	general.answerOfDetails();    //if the user want to see details or not
				switch(answerNum){
					case 1:
						first.generalDetails(detail);      //print details of the first program
						first.startProgram(answerNum); //print the finish time if the use input y...
						first.timeProcess(answerNum);  //start process and print * ..
					    break;
					    
					case 2:
						second.generalDetails(detail);   //print details of the second program
						second.startProgram(answerNum);
						second.timeProcess(answerNum);
						break;
						
					case 3:
						third.generalDetails(detail);    //print details of the third program
						third.startProgram(answerNum);
						third.timeProcess(answerNum);
						break;
					}
	    }
	    else {
	    	System.out.println("incorrect input, choose program from 1 to 3");
	    }
	   
	    }catch(java.util.InputMismatchException e) {    //catch non integer number
	    	System.out.println("incorrect input, choose program from 1 to 3");
	    }
		if(General.count == 3) {
			System.out.println("The Dishwasher needs oil !"); //The Dishwasher needs oil
		}
	}
	}
}