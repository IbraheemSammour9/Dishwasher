package testing;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import dishwasher.FirstProgram;
import dishwasher.General;
import dishwasher.SecondProgram;
import dishwasher.ThirdProgram;

import org.junit.Before;

public class testGeneral {
 
	General general;
	FirstProgram first;
	SecondProgram second;
	ThirdProgram third;
	
	@Before
	public void init() {
		general = new General();
		first = new FirstProgram();
		
	}
	
	@Test
	public void testdoor() {
		general.door();
	}
	
	@Test
	public void testmain() {
		General.main(null);
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
		general.timeProcess(1); 
	}
	
	@Test
	public void testgeneraltimeProcess() {
		general.timeProcess(4);
	}

	@Test
	public void testisClosed() {
		general.isClosed();
		}
	
	@Test
	public void testsetClosed() {
		general.setClosed(false);
	}
	}
