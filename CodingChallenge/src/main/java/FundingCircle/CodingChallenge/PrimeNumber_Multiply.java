package FundingCircle.CodingChallenge;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber_Multiply {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {

		int primes = 0;
		try {
			primes = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.print("Please pass only integer value");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("Please pass 1 integer");
			return;
		}
		primes_multiplication(primes);
	}

	/**
	 * method for printing prime number multiplication grid of given size
	 * @param input
	 */
	public static void primes_multiplication(int input) {

		List<Integer> primeNumbers = new ArrayList<Integer>();

		primeNumbers = createPrimeNumList(input);

		printPrimeNumGrid(primeNumbers);

	}

	/**
	 * method for printing prime number multiplication grid of given list of prime numbers
	 * @param primeNumbers
	 */
	public static void printPrimeNumGrid(List<Integer> primeNumbers) {

		int size = primeNumbers.size();

		for (int a = 0; a < size; a++) {
			//print first row of primeNumbers List as it is without any multiplication
			if (a == 0) {
				for (int n = 0; n < primeNumbers.size(); n++) {
					System.out.print(primeNumbers.get(n) + "\t");
				}
				System.out.println("");
			} else {
				//for other rows do multiplication
				for (int b = 0; b < size; b++) {

					if (b == 0) {
						System.out.print(primeNumbers.get(a) + "\t");
					} else {

						int value = primeNumbers.get(a) * primeNumbers.get(b);
						System.out.print(value + "\t");
					}
				}
				System.out.println("");
			}
		}
	}

	/**
	 * method for creating list of prime numbers of given sizes
	 * @param input
	 * @return
	 */
	public static List<Integer> createPrimeNumList(int input) {

		List<Integer> primeNumbers = new ArrayList<Integer>();

		if (input >= 3) {
			primeNumbers.add(2);
			primeNumbers.add(3);
			int num = 4;

			//if any number is not divisible by any prime numbers smaller than itself; it is a prime number
			for (int i = 1; primeNumbers.size() != input; i++) {
				boolean isPrime = true;
				for (int x : primeNumbers) {
					if (num % x == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime == true) {
					primeNumbers.add(num);
				}
				num = num + 1;
			}

		} else if (input == 2) {
			primeNumbers.add(2);
			primeNumbers.add(3);
		}

		return primeNumbers;
	}
}
