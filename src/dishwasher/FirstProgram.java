package dishwasher;

public class FirstProgram extends General{
		
		@Override
	    public void generalDetails(boolean d){ 
    
		if(d) {                      //print details if the user input y
    	System.out.println("Using more water, energy and heat for fast results, a quick wash cycle, sometimes"
    			+ "\ncalled a 1-Hour Wash, can be completed in around an hour depending on your"
    			+ "\ndishwasher model.\n");
    }
    else {                   //print (Ok as you like) if the user input n
    	System.out.println("Ok as you like\n");
    	}
		}
	    
	    @Override
	    public void timeProcess(int prog) {    //print the process of time (*) ..loading
	    	if (startGeneral == 'y') {
			System.out.println("Dishwasher (first program) in progress..");
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