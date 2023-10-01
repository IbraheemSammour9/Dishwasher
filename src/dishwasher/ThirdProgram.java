package dishwasher;

public class ThirdProgram extends General{
	
		@Override
		public void generalDetails(boolean d){
			
	    if(d) {                     //print details if the user input y
	    	System.out.println("The Heavy Cycle on your dishwasher, sometimes called the heavy duty or pots & pans"
	    			+ "\ncycle, nuses extra water and higher temperatures to tackle hard-to-clean items.This"
	    			+ "\nis best nused for heavily soiled pots, pans, casserole dishes and grimy tableware.\n");
	    }
	    else {                     //print (Ok as you like) if the user input n
	    	System.out.println("Ok as you like\n");
	    }
		}
		
		
		@Override
	    public void timeProcess(int prog) {    //print the process of time (*) ..loading
			if (startGeneral == 'y') {
			System.out.println("Dishwasher (third program) in progress..");
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