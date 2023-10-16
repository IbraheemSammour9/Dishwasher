package dishwasher;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


    public class General extends Dishwasher implements Heatable{
	private static Scanner inputP;
	private static Scanner inputY;
	private static char answer;
	private int number;            //encapsulation(private & getters, setters)
	private int seconds;
	public static char startGeneral;
	public static int count = 0;
	public static boolean closed;

	public void door() {        //to make sure the door is close
		
		closed = false;
		if(closed == false) {          //change to false if you want to close the door
			System.out.println("Nice, the door is close\n");
		}
		else {
			System.out.println("Please close the door");
			System.exit(0);
		}
	}
	

	public char toSeeDetails() {
		System.out.println("\nYou want to see the details about this program? (y: yes  n: no)");
		inputP = new Scanner(System.in);  //choose program
		answer = inputP.next().charAt(0);
		return answer;
	}
	
	public char toSeeDetails(char x) {   //Method overloading
		System.out.println("\nYou want to see the details about this program? (y: yes  n: no)");
		inputP = new Scanner(System.in);  //choose program
		answer = inputP.next().charAt(0);
		return answer;
	}
	
	
	public void answerOfDetails() {
		System.out.println("answer of details");
		char choose = toSeeDetails();  //to input y or n
	    
    	if(choose == 'y') {detail = true;}           //from here
    	else if(choose == 'n'){detail = false;}
    	else {	
    	System.out.println("incorrect input..");
    	answerOfDetails();  //recursion 
	    }                                             //.....
	}
	
	
	public void chooseThisProgram() {   //input (y if the user want to choose this program..)
		System.out.println("\nEnter y if you want to choose this program.."
				+ "\notherwise enter n (choose another program)");
		inputY = new Scanner(System.in);  //Enter Y to start this program
		startGeneral = inputY.next().charAt(0);
	}
	
	
	public void startProgram (int a) { //check if the user choose current program
		System.out.println("startProgram!");  // testing...
		chooseThisProgram();
		if(startGeneral == 'y') {
			printTime(a);
		}
		else if(startGeneral == 'n') {
			System.out.println("\nchoose another program:");
		}
		else {
			System.out.println("incorrect input..");  
			startProgram(a);   //recursion
		}	
	}
	
	public void printTime (int sec) {      //print the time when the program finish process
		System.out.println("\nAfter finish, the time will be:");
		LocalTime Timer = LocalTime.now();
		Timer = Timer.plusSeconds((sec+1)*5); 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = Timer.format(formatter);
		System.out.println(formattedTime);
	}
	
	public void generalDetails(boolean d){
		
	    if(d) {                     //print details if the user input y
	    	System.out.println("General case of DishWasher");
	    }
	    else {                     //print (Ok as you like) if the user input n
	    	System.out.println("Ok as you like\n");
	    }
	}
	
	
	public void timeProcess(int prog) {    //print the process of time (*) ..loading
		if (startGeneral == 'y') {
		System.out.println("Dishwasher in progress..");
		 try {
			 	for(int i = 0 ; i < (5 * prog) ; i++) {
	            Thread.sleep(1000); // 5 seconds = (5000 milliseconds)
	            System.out.print("*");
			 	}
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
		System.out.println("\n\nFinished.\n");
		if(count != 2) {
			welcome();   //print programs again if the DishWasher don't need oil
			}
		count+=1;
		}
	}
	
	@Override
	public void heatingWater() {
		System.out.println("Heading water !");		
	}


	@Override
	public void stopHeatingWater() {
		System.out.println("Stop heating water !");		
	}
	
	//****Getter and Setters****
	
	public char getAnswer() {
		return answer;
	}
	public void setAnswer(char answer) {
		General.answer = answer;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public Scanner getInputP() {
		return inputP;
	}
	public void setInputP(Scanner inputP) {
		General.inputP = inputP;
	}
	public Scanner getInputY() {
		return inputY;
	}
	public void setInputY(Scanner inputY) {
		General.inputY = inputY;
	}
	public char getStartGeneral() {
		return startGeneral;
	}
	public void setStartGeneral(char startGeneral) {
		General.startGeneral = startGeneral;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		General.count = count;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		General.closed = closed;
	}
	}