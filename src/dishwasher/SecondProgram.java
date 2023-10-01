package dishwasher;

public class SecondProgram extends General{
	
		@Override
	    public void generalDetails(boolean d){
	    	
	    if(d) {                     //print details if the user input y
	    	System.out.println("Use the High Temp Wash option on your dishwasher to cut through tough baked-on"
	    			+ "\nfood or greasy residue on your dishes.This is accomplished by raising the main wash"
	    			+ "\ntemperature to a minimum of 130°F. This higher temperature helps improve wash and"
	    			+ "\ndry performance when paired with the use of rinse aid.\n");
	    }
	    else{                      //print (Ok as you like) if the user input n
	    	System.out.println("Ok as you like\n");
		}
	    }

	    @Override
	    public void timeProcess(int prog) {    //print the process of time (*) ..loading
			if (startGeneral == 'y') {
			System.out.println("Dishwasher (second program) in progress..");
			 try {
				 	for(int i = 0 ; i < (5 * prog) ; i++) {
		            Thread.sleep(1000); // 5 seconds = (5000 milliseconds)
		            System.out.print("*");
				 	}
		        } catch (InterruptedException e) {
		            // Handle the exception if needed
		            //e.printStackTrace();
		        }
			System.out.println("\n\nFinished.\n");
			if(count != 2) {
				welcome();   //print programs again if the DishWasher don't need oil
				}
			count+=1;
			}
		}
}