package FundingCircle.CodingChallenge;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class PrimeNumber_Multiply_Test {

	private final ByteArrayOutputStream outContentExpected = new ByteArrayOutputStream();
	private final ByteArrayOutputStream outContentOutput = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}

	@Test
	public void testMain(){

		String[] input = {"3"};
		System.setOut(new PrintStream(outContentOutput));
		PrimeNumber_Multiply.main(input);
		System.setOut(new PrintStream(outContentExpected));
		System.out.print("2	3	5	");
		System.out.println("");
		System.out.print("3	9	15	");
		System.out.println("");
		System.out.print("5	15	25	");
		System.out.println("");

		assertEquals(outContentOutput.toString(), outContentExpected.toString());

	}

	@Test
	public void testMainForInput2(){

		String[] input = {"2"};
		System.setOut(new PrintStream(outContentOutput));
		PrimeNumber_Multiply.main(input);
		System.setOut(new PrintStream(outContentExpected));
		System.out.print("2	3	");
		System.out.println("");
		System.out.print("3	9	");
		System.out.println("");

		assertEquals(outContentOutput.toString(), outContentExpected.toString());

	}

	@Test
	public void testMainForInputChar(){

		String[] input = {"someInput"};
		System.setOut(new PrintStream(outContentOutput));
		PrimeNumber_Multiply.main(input);

		assertEquals("Please pass only integer value", outContentOutput.toString());

	}

	@Test
	public void testMainForNoInput(){

		String[] input = {};
		System.setOut(new PrintStream(outContentOutput));
		PrimeNumber_Multiply.main(input);

		assertEquals("Please pass 1 integer", outContentOutput.toString());

	}

//	@Ignore
//	public void testCreatePrimeNumList() {
//
//		List<Integer> actualPrimeNumbers = new ArrayList<Integer>();
//		actualPrimeNumbers = PrimeNumber_Multiply.createPrimeNumList(4);
//
//		List<Integer> expectedPrimeNumbers = new ArrayList<Integer>();
//		expectedPrimeNumbers.add(2);
//		expectedPrimeNumbers.add(3);
//		expectedPrimeNumbers.add(5);
//		expectedPrimeNumbers.add(7);
//
//		assertTrue( actualPrimeNumbers.equals(expectedPrimeNumbers) );
//	}
//
//	@Ignore
//	public void testCreatePrimeNumListForInput2() {
//
//		List<Integer> actualPrimeNumbers = new ArrayList<Integer>();
//		actualPrimeNumbers = PrimeNumber_Multiply.createPrimeNumList(2);
//
//		List<Integer> expectedPrimeNumbers = new ArrayList<Integer>();
//		expectedPrimeNumbers.add(2);
//		expectedPrimeNumbers.add(3);
//
//		assertTrue( actualPrimeNumbers.equals(expectedPrimeNumbers) );
//	}
//
//	@Ignore
//	public void testPrimes_multiplication() {
//
//		System.setOut(new PrintStream(outContentOutput));
//		PrimeNumber_Multiply.primes_multiplication(3);
//		System.setOut(new PrintStream(outContentExpected));
//		System.out.print("2	3	5	");
//		System.out.println("");
//		System.out.print("3	9	15	");
//		System.out.println("");
//		System.out.print("5	15	25	");
//		System.out.println("");
//
//		assertEquals("Testing Primes_multiplication method", outContentOutput.toString(), outContentExpected.toString());
//
//	}

}
