package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import dishwasher.General;
import org.junit.Before;

public class testGeneral {

	General general;
	
	@Before
	public void init() {
		general = new General();
	}
	
	
	@Test
	public void testdoor() {
		general.door();
	}
	
	@Test
	public void testanswerOfDetails() {
		general.answerOfDetails();
	}
	
	
	@Test
	public void testchooseThisProgram() {
		general.chooseThisProgram();
	} 
	
	
	@Test
	public void testtoSeeDetails() {
        assertEquals('y' , general.toSeeDetails());
	}
	
	
	@Test
	public void testtoSeeDetailsoverloading() {
		assertEquals('y' , general.toSeeDetails('y'));
	}
		
	
	@Test
	public void teststartProgram() {
		general.startProgram(1);
	}
	
	
	@Test
	public void testgeneralDetailsFalse() {
		general.generalDetails(false);
	}
	
	@Test
	public void testgeneralDetailsTrue() {
		general.generalDetails(true);
	}
	
	@Test
	public void testtimeProcess() {
		general.chooseThisProgram();
		general.timeProcess(1);      // test the first program of dishwasher
	}
	
	}
