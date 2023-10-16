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
		general.timeProcess(1);
	}

	@Test
	public void testisClosed() {
		general.isClosed();
		}
	
	@Test
	public void testsetClosed() {
		general.setClosed(false);
	}
	
	@Test
	public void testAnswer() {
		general.setAnswer('y');
		assertEquals('y',general.getAnswer());
	}
	
	
	@Test
	public void testNumber() {
		general.setNumber(1);
		assertEquals(1,general.getNumber());
	}
	

	
	@Test
	public void testgetSeconds() {
		general.setSeconds(1);
		assertEquals(1,general.getSeconds());
	}
	
	@Test
	public void testgetInputP() {
		general.setInputP(null);
		assertEquals(null,general.getInputP());
	}
	
	@Test
	public void testgetInputY() {
		general.setInputY(null);
		assertEquals(null,general.getInputY());
	}
	
	@Test
	public void testgetStartGeneralY() {
		general.setStartGeneral('y');
		assertEquals('y',general.getStartGeneral());
	}
	
	@Test
	public void testgetStartGeneralN() {
		general.setStartGeneral('n');
		assertEquals('n',general.getStartGeneral());
	}
	
	@Test
	public void testgetCount() {
		general.setCount(0);
		assertEquals(0,general.getCount());
		} 
	
	@Test
	public void testheatingWater() {
		general.heatingWater();
	}
	
	@Test
	public void teststopHeatingWater() {
		general.stopHeatingWater();
	}
	} 
